package com.automovil.automovilspringboot.service;

import com.automovil.automovilspringboot.dtos.AutomovilDTO;
import com.automovil.automovilspringboot.entities.Automovil;
import com.automovil.automovilspringboot.repositories.AutomovilRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutomovilService {

    @Autowired
    AutomovilRepository automovilRepository;

    public List<AutomovilDTO> findAllAutos() {
        List<Automovil> automovil = automovilRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List<AutomovilDTO> listaAutos = new ArrayList<>();
        for (Automovil auts: automovil ) {
            AutomovilDTO aDTO = modelMapper.map(auts, AutomovilDTO.class);
            listaAutos.add(aDTO);

        }
        return listaAutos;
    }

    public AutomovilDTO findAutoById(Integer id) {
        Automovil automovil = automovilRepository.getOne(id);
        ModelMapper modelMapper = new ModelMapper();
        AutomovilDTO aDTO = modelMapper.map(automovil, AutomovilDTO.class);
        return aDTO;
    }


    public AutomovilDTO updateAuto(AutomovilDTO automovildto) {
        Optional<Automovil> autoOriginal = automovilRepository.findById(automovildto.getId());
        Automovil autoEntity = autoOriginal.get();
        autoEntity.setModelo(automovildto.getModelo());
        autoEntity.setCantOpciones(automovildto.getCantOpciones());
        autoEntity.setPrecioTotal(automovildto.getPrecioTotal());
        automovilRepository.save(autoEntity);

        ModelMapper modelMapper = new ModelMapper();
        AutomovilDTO aDTO = modelMapper.map(autoEntity, AutomovilDTO.class);

        return  aDTO;
    }

    public AutomovilDTO saveAuto(AutomovilDTO automovildto) {

        Automovil autoEntity = new Automovil();
        autoEntity.setModelo(automovildto.getModelo());
        autoEntity.setCantOpciones(automovildto.getCantOpciones());
        autoEntity.setPrecioTotal(automovildto.getPrecioTotal());
        automovilRepository.save(autoEntity);

        ModelMapper modelMapper = new ModelMapper();
        AutomovilDTO aDTO = modelMapper.map(autoEntity, AutomovilDTO.class);

        return  aDTO;
    }


    public String deleteAuto(Integer id) {

        if (automovilRepository.findById(id).isPresent()){
            automovilRepository.deleteById(id);
            return "Auto eliminado correctamente";
        }
        return "Error el Auto no existe";
    }

}
