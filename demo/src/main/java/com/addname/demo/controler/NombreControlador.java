package com.addname.demo.controler;

import com.addname.demo.modelo.Nombre;
import com.addname.demo.repositorio.NombreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseStatus(HttpStatus.OK)
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class NombreControlador {

    @Autowired
    private NombreRepositorio repositorio;

    @GetMapping("/nombres")
    public List<Nombre> listarLosNombres(){
        return repositorio.findAll();
    }
//metodo para guardar un nombre

 @PostMapping("/nombres")
 @CrossOrigin(origins = "http://localhost:4200")
 public  Nombre addname(@RequestBody Nombre nombre){
     return  repositorio.save(nombre);
 }}
