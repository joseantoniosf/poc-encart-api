package br.com.pagseguro.encarteiramento.domain.exception;

public class NegocioException extends RuntimeException {

    public NegocioException(String msg) {
        super(msg);
    }

}
