package com.pragma.usuariomicroservice.domain.usecase;

import com.pragma.usuariomicroservice.adapters.http.dto.RolNombre;
import com.pragma.usuariomicroservice.adapters.http.exceptions.UsuarioExcepcionRolNoExiste;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.entity.RolEntity;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.mapper.RolEntityMapper;
import com.pragma.usuariomicroservice.adapters.jpa.mysql.repository.IRolRepository;
import com.pragma.usuariomicroservice.configuration.Constants;
import com.pragma.usuariomicroservice.domain.api.IUsuarioServicePort;
import com.pragma.usuariomicroservice.domain.model.Rol;
import com.pragma.usuariomicroservice.domain.model.Usuario;
import com.pragma.usuariomicroservice.domain.spi.IUsuarioPersistencePort;
import com.pragma.usuariomicroservice.domain.usecase.validaciones.ValidacionesGenerales;
import com.pragma.usuariomicroservice.domain.usecase.validaciones.ValidacionesUsuario;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UsuarioUseCase implements IUsuarioServicePort {

    private final IUsuarioPersistencePort usuarioPersistencePort;
    private final IRolRepository rolRepository;
    private final RolEntityMapper rolEntityMapper;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort, IRolRepository rolRepository, RolEntityMapper rolEntityMapper) {
        this.usuarioPersistencePort = usuarioPersistencePort;
        this.rolRepository = rolRepository;
        this.rolEntityMapper = rolEntityMapper;
    }

    @Override
    public void guardarUser(Usuario usuario, RolNombre rol) {
        Set<Rol> roles = new HashSet<>();
        ValidacionesGenerales.validarFechaNacimientoFormato(usuario.getFechaNacimiento());
        ValidacionesUsuario.validarEdad(usuario.getFechaNacimiento());

        //TODO ESTO SE DEBE DE CAMBIAR CUANDO ESTEN LOS DEMAS MICROFUNCIONAND
        // ValidacionesUsuario.validarPasswordEncritado(usuario.getPassword());



        Long rolActual= validarRol(rol);
        Optional<RolEntity> rolEntity = rolRepository.findById(rolActual);
        if(rolEntity.isPresent()){
            Rol rols = rolEntityMapper.rolEntityToRol(rolEntity.get());
            roles.add(rols);
            usuario.setRoles(roles);
        }
        this.usuarioPersistencePort.guardarUsuario(usuario);
    };


    public  Long  validarRol(RolNombre Rol){

            if(Rol.equals(RolNombre.R_ADMINISTRADOR) ||  Rol.equals(RolNombre.R_PROPIETARIO) || Rol.equals(RolNombre.R_CLIENTE)|| Rol.equals(RolNombre.R_EMPLEADO) ){
                switch(Rol){

                    case R_PROPIETARIO:
                        return Constants.PROPIETARIO_ROL_ID;
                    case R_ADMINISTRADOR:
                        return Constants.ADMINISTRADOR_ROL_ID;
                    case R_CLIENTE:
                        return Constants.CLIENTE_ROL_ID;
                    case R_EMPLEADO:
                        return Constants.EMPLEADO_ROL_ID;
                    default:
                        return 0L;
                }
            }else{
                throw new UsuarioExcepcionRolNoExiste("El rol no existe");
            }
    }


    @Override
    public void deleteUsuario(Usuario usuario) {
        this.usuarioPersistencePort.deleteUsuario(usuario);
    }

    @Override
    public Usuario getUsuario(Long id) {
         return this.usuarioPersistencePort.getUsuario(id);
    }


    @Override
    public Usuario findUsuarioEntityByCorreo(String email) {


      return  this.usuarioPersistencePort.findUsuarioEntityByCorreo(email);
    }
}
