package br.com.pagseguro.encarteiramento.domain.repository;

import br.com.pagseguro.encarteiramento.domain.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
