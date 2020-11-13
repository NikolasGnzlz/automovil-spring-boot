package com.automovil.automovilspringboot.controler;

import com.automovil.automovilspringboot.dtos.AutomovilDTO;
import com.automovil.automovilspringboot.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutomovilControler {
    	@Autowired
        AutomovilService automovilService;

     @RequestMapping(value = "/autos", method = RequestMethod.GET, produces = "application/json")
    public List<AutomovilDTO> getAutos() {
         return automovilService.findAllAutos();
     }//funcionando


    @RequestMapping(value = "/auto/{id}",method = RequestMethod.GET, produces = "application/json")
    public AutomovilDTO getAutoPorId(@PathVariable Integer id) {
        return automovilService.findAutoById(id);
    }//funcionando

    @RequestMapping(value = "/auto", method = RequestMethod.POST, produces = "application/json")
    public AutomovilDTO insertar(AutomovilDTO automovildto) {
        return automovilService.saveAuto(automovildto);//funcionando
    }

    @RequestMapping(value = "/auto/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String delete(@PathVariable Integer id) {
        return automovilService.deleteAuto(id);//funcionando
    }

    @RequestMapping(value = "/auto", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public AutomovilDTO update(AutomovilDTO automovildto) {
        return automovilService.updateAuto(automovildto);//funcionando
    }





}
