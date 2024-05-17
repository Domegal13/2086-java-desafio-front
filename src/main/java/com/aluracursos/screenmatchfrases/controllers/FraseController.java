package com.aluracursos.screenmatchfrases.controllers;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrases(){

        return service.obtenerFraseAleatoria();
    }

}
