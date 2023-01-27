package com.copacabana.copacabana.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: Aldemar Reynaga
 * @since 03/11/2020
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    @Getter
    private String code;

    public UnauthorizedException(String pCode) {
        super("Bad request -> personalizar el mensaje");
        this.code = pCode;
    }

    public UnauthorizedException(String pCode, String pMessage) {
        super(pMessage);
        this.code = pCode;
    }
}
