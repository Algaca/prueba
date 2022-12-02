package com.example.APIG25.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.APIG25.Modelos.UsuarioModelo;
import com.example.APIG25.Servicios.UsuarioServicio;

@RestController
//http://localhost:8080/usuario
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio servicio;

    //http://localhost:8080/usuario/guardar
    @PostMapping("/guardar")
    public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario){
        return servicio.guardarUsuario(usuario);
    }

    //http://localhost:8080/usuario/consultar
    @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
        return servicio.consultarUsuario();
    }

    //http://localhost:8080/usuario/consultardocumento/12345
    @GetMapping("/consultardocumento/{documento}")
    public Optional<UsuarioModelo> consultaDocumento(@PathVariable("documento") Long documento){
        return servicio.buscarPorDocumento(documento);
    }

    //http://localhost:8080/usuario/eliminar
    @DeleteMapping("/eliminar/{documento}")
    public Boolean eliminarUsuariBoolean(@PathVariable("documento") long documento){
        return servicio.eliminarUsuario(documento);
    }

    //http://localhost:8080/usuario/buscarxapellido
    @GetMapping("/buscarXapellido/{apellido}")
    public ArrayList<UsuarioModelo> buscarXapellido(@PathVariable("apellido") String apellido){
        return servicio.buscarXapellido(apellido);
    }

    //http://localhost:8080/usuario/buscarxnombre
    @GetMapping("buscarXnombre/{nombre}")
    public ArrayList<UsuarioModelo> buscarXnombre(@PathVariable("nombre") String nombre){
        return servicio.buscarXnombres(nombre);
    }

    //http:localhost:8080/usuario/buscarXcorreo
    @GetMapping("buscarXcorreo/{correo}")
    public UsuarioModelo buscarXcorreo(@PathVariable("correo") String correo){
        return servicio.buscarXcorreo(correo);
    }




}
