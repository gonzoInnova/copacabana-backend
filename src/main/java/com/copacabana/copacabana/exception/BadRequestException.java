package com.copacabana.copacabana.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: Aldemar Reynaga
 * @since 03/11/2020
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    @Getter
    private String code;

    public BadRequestException(String pCode) {
        super("Bad request -> personalizar el mensaje");
        this.code = pCode;
    }

    public BadRequestException(String pCode, String pMessage) {
        super(pMessage);
        this.code = pCode;
    }
}
