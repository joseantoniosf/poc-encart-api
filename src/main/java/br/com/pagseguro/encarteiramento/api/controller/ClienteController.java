package br.com.pagseguro.encarteiramento.api.controller;

import br.com.pagseguro.encarteiramento.domain.dto.ClienteDto;
import br.com.pagseguro.encarteiramento.domain.model.Cliente;
import br.com.pagseguro.encarteiramento.domain.repository.ClienteRepository;
import br.com.pagseguro.encarteiramento.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto insert(@Valid @RequestBody ClienteDto clienteParam){ return clienteService.save(clienteParam);}

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> findById (@PathVariable Long id){
        ClienteDto cliente = clienteService.findById(id);
        if(cliente == null){
            return ResponseEntity.notFound().build();
        }
        return  ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable @NotNull Long id) {
        Boolean apagou = clienteService.deleteById(id);
        if (apagou.equals(Boolean.FALSE)) {
            return ResponseEntity.ok(Boolean.FALSE);
        }
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @PutMapping
    public ClienteDto update (@RequestBody ClienteDto clienteParam){ return  clienteService.update(clienteParam);}
}
