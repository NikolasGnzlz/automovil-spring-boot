package com.automovil.automovilspringboot;

import com.automovil.automovilspringboot.dtos.AutomovilDTO;
import com.automovil.automovilspringboot.dtos.OpcionDTO;
import com.automovil.automovilspringboot.entities.Automovil;
import com.automovil.automovilspringboot.entities.Opcion;
import org.modelmapper.ModelMapper;

public class ModelmapperAplicacion {

    public static void main (String[] args) {simpleModelMappinDemo(); }

        private static void  simpleModelMappinDemo() {
            Opcion test = new Opcion();
            test.setId(1);
            test.setDescripcion("pico");
            test.setPrecio(20);


            OpcionDTO opcionDTO = new OpcionDTO();


            ModelMapper modelMapper = new ModelMapper();

            modelMapper.map(test, opcionDTO);

            System.out.println("testing autoMapper"+ opcionDTO.getId());
            System.out.println("testing autoMapper"+ opcionDTO.getDescripcion());
            System.out.println("testing autoMapper"+ opcionDTO.getPrecio());






        }






}//CIERRA MODEL MAPER
