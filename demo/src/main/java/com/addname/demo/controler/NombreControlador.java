package com.addname.demo.controler;

import com.addname.demo.modelo.Nombre;
import com.addname.demo.repositorio.NombreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class NombreControlador {

    @Autowired
    private NombreRepositorio repositorio;

    @GetMapping("/nombres")
    public List<Nombre> listarLosNombres(){
        return repositorio.findAll();
    }

}
