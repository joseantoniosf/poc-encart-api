package br.com.pagseguro.encarteiramento.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ClienteDto {

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

}
