package com.automovil.automovilspringboot.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class testControler {

    @GetMapping(path = {"/saludar"})
    public String saludar(){
        return "index";
    }
/*Automóvil:

Alta
Baja
Modificación
Consulta de Automóviles ( listado )
Consulta de Precio por automóvil


Modelo:
Alta
Baja
Modificación
Consulta.
Listado

Opciones:
Alta
Baja
Modificación
Consulta.
Listado


*/
}
