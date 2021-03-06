package br.com.pagseguro.encarteiramento.domain.repository;

import br.com.pagseguro.encarteiramento.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
