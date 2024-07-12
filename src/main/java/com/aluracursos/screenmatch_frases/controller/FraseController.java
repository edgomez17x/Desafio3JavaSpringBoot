package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.model.FraseDTO;
import com.aluracursos.screenmatch_frases.servicio.FraseServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseServicio fraseServicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return fraseServicio.obtenerFraseAleatoria();
    }
}
