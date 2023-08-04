package com.Teo.InventarioInicial.configuration.security.service;

import com.pragma.usuariomicroservice.adapters.jpa.mysql.entity.UsuarioEntity;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.entity.UsuarioPrincipal;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    IUsuarioRepository usuarioRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UsuarioEntity usuarioEntity = usuarioRepository.findUsuarioEntityByCorreo(email).get();
        return UsuarioPrincipal.build(usuarioEntity);
    }
}
