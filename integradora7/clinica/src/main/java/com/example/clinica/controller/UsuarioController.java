package com.example.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.model.Usuario;
import com.example.clinica.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping
    public Usuario salvar(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "senha") String senha,
            @RequestParam(value = "nivelAcesso") String nivelAcesso) {
        return usuarioService.salvar(new Usuario(id, nome, email, senha, nivelAcesso));
    }

    @GetMapping("/buscar")
    public List<Usuario> buscarTodos() {
        return usuarioService.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id) {
        return usuarioService.excluir(id);
    }
}
