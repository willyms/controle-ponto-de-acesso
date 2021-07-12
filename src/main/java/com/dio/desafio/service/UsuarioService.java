package com.dio.desafio.service;


import com.dio.desafio.model.*;
import com.dio.desafio.repositorio.*;
import lombok.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepositorio usuariorepositorio;

    public Usuario save(Usuario usuario){
        return usuariorepositorio.save(usuario);
    }

    public Usuario update(Usuario usuario){
        return usuariorepositorio.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuariorepositorio.findAll();
    }

    public Optional<Usuario> getById(Long idUsuario) {
        return usuariorepositorio.findById(idUsuario);
    }

    public void delete(Long idUsuario) {
        usuariorepositorio.deleteById(idUsuario);
    }
}
