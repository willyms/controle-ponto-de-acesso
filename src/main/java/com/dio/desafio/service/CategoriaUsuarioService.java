package com.dio.desafio.service;

import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CategoriaUsuarioService {

    private final CategoriaUsuarioRepositorio categoriaUsuariorepositorio;

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){
        return categoriaUsuariorepositorio.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaUsuariorepositorio.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuariorepositorio.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idCategoriaUsuario) {
        return categoriaUsuariorepositorio.findById(idCategoriaUsuario);
    }

    public void delete(Long idCategoriaUsuario) {
        categoriaUsuariorepositorio.deleteById(idCategoriaUsuario);
    }
}
