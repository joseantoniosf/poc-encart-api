package br.com.pagseguro.encarteiramento.domain.repository;

import br.com.pagseguro.encarteiramento.domain.model.Comentario;
import br.com.pagseguro.encarteiramento.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    List<Comentario> findByOrdemServico(OrdemServico ordemServico);
    //Optional<Comentario> findByOrdemServicoIdEqualsAndComentarioIdEquals(Long ordemServicoId, Long comentarioId);

}
