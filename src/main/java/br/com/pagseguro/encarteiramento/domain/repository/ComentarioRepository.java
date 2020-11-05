package br.com.pagseguro.encarteiramento.domain.repository;

import br.com.pagseguro.encarteiramento.domain.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    List<Comentario> findByOrdemServicoId(Long ordemServicoId);

}
