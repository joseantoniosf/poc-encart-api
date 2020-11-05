package br.com.pagseguro.encarteiramento.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class OrdemServico {

    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime dataAbertura = LocalDateTime.now();
    private LocalDateTime dataFinalizacao;
    @Enumerated(EnumType.STRING)
    private StatusEnum status = StatusEnum.ABERTA;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "ordemServico")
    List<Comentario> comentario;






}
