package com.example.sprinvMvc.services;

import com.example.sprinvMvc.dominio.Usuario;

public class UsuarioService {
    public Usuario crearUsuario(){
        Usuario usuario = new Usuario("Diego", 25);
        return usuario;
    }
}
