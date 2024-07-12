package com.aluracursos.screenmatch_frases.servicio;

import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.model.FraseDTO;
import com.aluracursos.screenmatch_frases.repositorio.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServicio {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obtenerFraseAleatoria() {
        return convertirFrase(fraseRepository.obtenerFraseAleatoria());
    }

    private FraseDTO convertirFrase(Frase frase){
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
