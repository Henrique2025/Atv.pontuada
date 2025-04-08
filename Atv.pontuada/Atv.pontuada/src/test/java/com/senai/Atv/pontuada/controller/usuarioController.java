package com.senai.Atv.pontuada.controller;

import com.sun.net.httpserver.HttpHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController

public class usuarioController {
    public usuarioController(UsuarioService usuarioService) {
        this UsuarioService = usuarioController;
    }

    @GetMapping
    public usuarioController List<Usuario> listarTodos() {
        return UsuarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<String> salvar() ;
        return ResponseEntity.status(HttpStatus);
    }

    @PutMapping
    public ResponseEntity<Usuario> atulizar(@Validated @RequestBody Usuario usuario) {
    usuarioService.atualizar(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @DeleteMapping ("/{id}")
    public RequestMapping <Usuario> excluir(@Validated RequestBody Usuario usuario) {
    usuarioService.excluir(id);
        return ResponseEntity.noContent().build("Usuario excluido com sucesso!");
    }
}
