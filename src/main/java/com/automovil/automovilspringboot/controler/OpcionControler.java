package com.automovil.automovilspringboot.controler;

import com.automovil.automovilspringboot.dtos.OpcionDTO;

import com.automovil.automovilspringboot.service.OpcionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OpcionControler {

    @Autowired
    OpcionService opcionService;

    @RequestMapping("/")
    public String verHome(Model model){
        List<OpcionDTO> lista = opcionService.findAllOpciones();
        model.addAttribute("lista", lista);
        return "index";
    }

    @RequestMapping(value = "/opciones", method = RequestMethod.GET, produces = "application/json")
    public List<OpcionDTO> getOpciones(){
        return opcionService.findAllOpciones();
    }//funcionando



    @RequestMapping(value = "/opcion/{id}",method = RequestMethod.GET, produces = "application/json")
    public OpcionDTO getOpcionesPorId(@PathVariable Integer id) {
        return opcionService.findOpcionById(id);//funcionando
    }


    @RequestMapping(value = "/opcion", method = RequestMethod.POST, produces = "application/json")
    public OpcionDTO insertar(@RequestBody OpcionDTO opcionDTO) {
        return opcionService.saveOpcion(opcionDTO);//funcionando
    }


    @RequestMapping(value = "/opcion/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String delete(@PathVariable Integer id) {
        return opcionService.deleteOpcion(id);//funcionando
    }



    @RequestMapping(value = "/opcion", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public OpcionDTO update(OpcionDTO opciondto) {
        return opcionService.updateOpcion(opciondto);//funcionando
    }



}
