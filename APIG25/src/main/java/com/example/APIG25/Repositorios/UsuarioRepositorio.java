package com.example.APIG25.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.APIG25.Modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends MongoRepository <UsuarioModelo, Long> {
    ArrayList<UsuarioModelo> findByApellido(String apellido);
    ArrayList<UsuarioModelo> findByNombre(String nombre);
    UsuarioModelo findByCorreo(String correo);


}

