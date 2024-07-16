package com.hiramwoki.ForoHub_HiramAcevedo.dto;

import com.hiramwoki.ForoHub_HiramAcevedo.model.StatusTopico;
import com.hiramwoki.ForoHub_HiramAcevedo.model.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id,
                                 String titulo,
                                 String mensaje,
                                 LocalDateTime fechaCreacion,
                                 StatusTopico status,
                                 String autor,
                                 String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion(), topico.getStatus(),
                topico.getAutor(), topico.getCurso());
    }
}
