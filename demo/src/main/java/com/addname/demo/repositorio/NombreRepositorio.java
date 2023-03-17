package com.addname.demo.repositorio;

import com.addname.demo.modelo.Nombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NombreRepositorio extends JpaRepository<Nombre,Long>{
}
