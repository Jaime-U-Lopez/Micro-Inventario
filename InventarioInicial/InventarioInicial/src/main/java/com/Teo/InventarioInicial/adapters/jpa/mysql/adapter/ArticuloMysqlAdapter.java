package com.Teo.InventarioInicial.adapters.jpa.mysql.adapter;




import com.Teo.InventarioInicial.domain.model.Articulo;
import com.Teo.InventarioInicial.domain.spi.IArticuloPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ArticuloMysqlAdapter implements IArticuloPersistencePort {
    @Override
    public void save(Articulo articulo) {

    }

    @Override
    public void delete(Articulo articulo) {

    }

    @Override
    public Articulo getArticulo(Long id) {
        return null;
    }

    @Override
    public List<Articulo> getAllArticulo() {
        return null;
    }
    // private final IUsuarioRepository usuarioRepository;
    //private final UsuarioEntityMapper usuarioEntityMapper;





}
