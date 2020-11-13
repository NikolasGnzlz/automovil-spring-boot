package com.automovil.automovilspringboot.service;

import com.automovil.automovilspringboot.dtos.OpcionDTO;
import com.automovil.automovilspringboot.entities.Opcion;
import com.automovil.automovilspringboot.repositories.OpcionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class OpcionService {
    @Autowired
    OpcionRepository opcionRepository;


    public List<OpcionDTO> findAllOpciones() {
        List<Opcion> opcion = opcionRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<OpcionDTO> listaOpcs = new ArrayList<>();
        for (Opcion opcions: opcion ) {
            OpcionDTO opDTO = modelMapper.map(opcions,OpcionDTO.class);
            listaOpcs.add(opDTO);

        }
        return listaOpcs;
    }

    public OpcionDTO findOpcionById(Integer id) {
       Opcion opcion = opcionRepository.getOne(id);
        ModelMapper modelMapper = new ModelMapper();
        OpcionDTO opDTO = modelMapper.map(opcion, OpcionDTO.class);
        return opDTO;
    }


    public OpcionDTO updateOpcion(OpcionDTO opciondto) {
        Optional<Opcion> opcionOriginal = opcionRepository.findById(opciondto.getId());
        Opcion opcionEntity = opcionOriginal.get();
        opcionEntity.setDescripcion(opciondto.getDescripcion());
        opcionEntity.setPrecio(opciondto.getPrecio());
        opcionRepository.save(opcionEntity);

        ModelMapper modelMapper = new ModelMapper();
        OpcionDTO opDTO = modelMapper.map(opcionEntity, OpcionDTO.class);


        return  opDTO;
    }

    public OpcionDTO saveOpcion(OpcionDTO opciondto) {

        Opcion opcionEntity = new Opcion();
        opcionEntity.setDescripcion(opciondto.getDescripcion());
        opcionEntity.setPrecio(opciondto.getPrecio());
        opcionRepository.save(opcionEntity);

        ModelMapper modelMapper = new ModelMapper();
        OpcionDTO opDTO = modelMapper.map(opcionEntity, OpcionDTO.class);


        return  opDTO;
    }


    public String deleteOpcion(Integer id) {

        if (opcionRepository.findById(id).isPresent()){
            opcionRepository.deleteById(id);
            return "Opcion eliminada correctamente";
        }
        return "Error la Opcion no existe";
    }


//HACER CONVERSON ENTITY Y DTO

}
