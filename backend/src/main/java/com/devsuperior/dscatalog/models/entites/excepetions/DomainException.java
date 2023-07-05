package com.devsuperior.dscatalog.models.entites.excepetions;

public class DomainException extends RuntimeException {


    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
