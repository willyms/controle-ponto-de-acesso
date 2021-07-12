package com.dio.desafio.repositorio;


import com.dio.desafio.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CategoriaUsuarioRepositorio extends JpaRepository<CategoriaUsuario, Long> {
}