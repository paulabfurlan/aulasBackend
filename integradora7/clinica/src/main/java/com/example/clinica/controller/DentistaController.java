package com.example.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.clinica.model.Dentista;
import com.example.clinica.service.impl.DentistaServiceImpl;

@RestController
@RequestMapping("/dentista")
public class DentistaController {
    @Autowired
    private DentistaServiceImpl dentistaService;

    @GetMapping
    public Dentista salvar(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "nome") String nome,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "numMatricula") Integer numMatricula,
            @RequestParam(value = "atendeConvenio") Boolean atendeConvenio) {
        return dentistaService.salvar(new Dentista(id, nome, email, numMatricula, atendeConvenio));
    }

    @GetMapping("/buscar")
    public List<Dentista> buscarTodos() {
        return dentistaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id) {
        return dentistaService.excluir(id);
    }
}
