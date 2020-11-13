package com.automovil.automovilspringboot.controler;


import com.automovil.automovilspringboot.dtos.ModeloDTO;
import com.automovil.automovilspringboot.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModeloControler {

    @Autowired
    ModeloService modeloService;

    @RequestMapping(value = "/modelos", method = RequestMethod.GET, produces = "application/json")
    public List<ModeloDTO> getModelos() {			return modeloService.findAllModelos();		}//funcionando


    @RequestMapping(value = "/modelo/{id}",method = RequestMethod.GET, produces = "application/json")
    public ModeloDTO getModeloPorId(@PathVariable Integer id) {
        return modeloService.findModeloById(id);//funcionando
    }


    @RequestMapping(value = "/modelo", method = RequestMethod.POST, produces = "application/json")
    public ModeloDTO insertar(@RequestBody ModeloDTO modeloDTO) {
        return modeloService.saveModelo(modeloDTO);//funcionando
    }


    @RequestMapping(value = "/modelo/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String delete(@PathVariable Integer id) {
        return modeloService.deleteModelo(id);//funcionando
    }



    @RequestMapping(value = "/modelo", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ModeloDTO update(ModeloDTO modelodto) {
        return modeloService.updateModelo(modelodto);//funcionando
    }




}
