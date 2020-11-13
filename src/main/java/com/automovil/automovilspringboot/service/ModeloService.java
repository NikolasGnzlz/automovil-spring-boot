package com.automovil.automovilspringboot.service;

import com.automovil.automovilspringboot.dtos.ModeloDTO;
import com.automovil.automovilspringboot.entities.Modelo;
import com.automovil.automovilspringboot.repositories.ModeloRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ModeloService {
    @Autowired
    ModeloRepository modeloRepository;


    public List<ModeloDTO> findAllModelos() {
        List<Modelo> modelo = modeloRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<ModeloDTO> listaModelos = new ArrayList<>();
        for (Modelo models: modelo ) {
            ModeloDTO mDTO = modelMapper.map(models,ModeloDTO.class);
            listaModelos.add(mDTO);

        }
        return listaModelos;
    }

    public ModeloDTO findModeloById(Integer id) {
        Modelo modelo = modeloRepository.getOne(id);
        ModelMapper modelMapper = new ModelMapper();
        ModeloDTO mDTO = modelMapper.map(modelo, ModeloDTO.class);
        return mDTO;
    }


    public ModeloDTO updateModelo(ModeloDTO modelodto) {
        Optional<Modelo> modeloOriginal = modeloRepository.findById(modelodto.getId());
        Modelo modeloEntity = modeloOriginal.get();
        modeloEntity.setNombre(modelodto.getNombre());
        modeloEntity.setPrecio(modelodto.getPrecio());
        modeloRepository.save(modeloEntity);

        ModelMapper modelMapper = new ModelMapper();
        ModeloDTO mDTO = modelMapper.map(modeloEntity, ModeloDTO.class);

        return  mDTO;
    }

    public ModeloDTO saveModelo(ModeloDTO modelodto) {

        Modelo modeloEntity = new Modelo();
        modeloEntity.setNombre(modelodto.getNombre());
        modeloEntity.setPrecio(modelodto.getPrecio());
        modeloRepository.save(modeloEntity);

        ModelMapper modelMapper = new ModelMapper();
        ModeloDTO mDTO = modelMapper.map(modeloEntity, ModeloDTO.class);

        return  mDTO;
    }


    public String deleteModelo(Integer id) {

        if (modeloRepository.findById(id).isPresent()){
            modeloRepository.deleteById(id);
            return "Modelo eliminado correctamente";
        }
        return "Error el Modelo no existe";
    }



}
