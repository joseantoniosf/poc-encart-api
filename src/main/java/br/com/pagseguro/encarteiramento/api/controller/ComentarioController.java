package br.com.pagseguro.encarteiramento.api.controller;

import br.com.pagseguro.encarteiramento.domain.model.Comentario;
import br.com.pagseguro.encarteiramento.domain.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens-servico/{ordemServicoId}/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping
    public List<Comentario> listar(@PathVariable Long ordemServicoId) {
        return comentarioRepository.findByOrdemServicoId(ordemServicoId);
    }

    @PostMapping
    public Comentario criar(@PathVariable Long ordemServicoId, @RequestBody Comentario) {

    }

}
