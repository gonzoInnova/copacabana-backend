package com.copacabana.copacabana.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: Aldemar Reynaga
 * @since 03/11/2020
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    @Getter
    private String code;

    public NotFoundException(Long pId, String pEntity, String pCode) {
        super("No se encontró resultados para la consulta de " + pEntity + " con el Id: " + pId);
        this.code = pCode;
    }

    public NotFoundException(String pCode, String pMessage) {
        super(pMessage);
        this.code = pCode;
    }
}
