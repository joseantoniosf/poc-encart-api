package br.com.pagseguro.encarteiramento.api.controller;

import br.com.pagseguro.encarteiramento.domain.exception.NegocioException;
import br.com.pagseguro.encarteiramento.domain.model.Comentario;
import br.com.pagseguro.encarteiramento.domain.model.OrdemServico;
import br.com.pagseguro.encarteiramento.domain.repository.ComentarioRepository;
import br.com.pagseguro.encarteiramento.domain.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordens-servico/{ordemServicoId}/comentarios")
public class ComentarioController {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping
    public ResponseEntity<List<Comentario>> listar(@PathVariable Long ordemServicoId) {
        Optional<OrdemServico> os = ordemServicoRepository.findById(ordemServicoId);

        if (os.isPresent()) {
            return ResponseEntity.ok(os.get().getComentarios());
        }

        return ResponseEntity.notFound().build();
    }
/*
    @GetMapping("/{comentarioId}")
    public ResponseEntity<Comentario> buscar(@PathVariable Long ordemServicoId,
                                             @PathVariable Long comentarioId) {
        Optional<Comentario> comentario = comentarioRepository.findByOrdemServicoIdEqualsAndComentarioIdEquals(
                ordemServicoId, comentarioId);

        if (comentario.isPresent()) {
            return ResponseEntity.ok(comentario.get());
        }

        return ResponseEntity.notFound().build();
    }*/

/*    @PostMapping
    public Comentario criar(@PathVariable Long ordemServicoId, @RequestBody Comentario) {
        return null;
    }*/

}
