package br.com.pagseguro.encarteiramento.api.exceptionhander;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Problema {

    private LocalDateTime dataHora;
    private String mensagemUsuario;
    private String mensagemDesenvolvedor;

    public Problema(String mensagemUsuario, String mensagemDesenvolvedor) {
        this.dataHora = LocalDateTime.now();
        this.mensagemUsuario = mensagemUsuario;
        this.mensagemDesenvolvedor = mensagemDesenvolvedor;
    }
}
