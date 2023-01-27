package com.copacabana.copacabana.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Aldemar Reynaga
 * @since 03/11/2020
 */
@Getter
@Setter
public class ExceptionResponse {
    private String code;
    private String message;
    private String details;

    public ExceptionResponse(String pCode, String pMessage, String pDetails) {
        super();
        this.code = pCode;
        this.message = pMessage;
        this.details = pDetails;
    }
}
