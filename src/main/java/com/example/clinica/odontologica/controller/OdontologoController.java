package com.example.clinica.odontologica.controller;

import com.example.clinica.odontologica.model.Odontologo;
import com.example.clinica.odontologica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class OdontologoController {
    private OdontologoService odontologoService;

   // [controllador] -> [servicio]
    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @PostMapping("/odontologo")
    public Odontologo crear (@RequestBody Odontologo odontologo){
        return this.odontologoService.crear(odontologo);
    }

    @GetMapping("/odontologo/{matricula}")
    public Odontologo obtenerOdontologo(@PathVariable("matricula") Integer matricula) {
        return this.odontologoService.obtenerOdontologo(matricula);
    }

}
