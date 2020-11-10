package br.com.pagseguro.encarteiramento.domain.repository;

import br.com.pagseguro.encarteiramento.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
}
