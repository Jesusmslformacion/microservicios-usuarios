package com.jesus.microservicios.app.usuarios.microservicios_usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.entity.Alumno;
import com.jesus.microservicios.app.usuarios.microservicios_usuarios.services.AlumnoService;

@RestController // Controlador del tipo REST 
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ver(@PathVariable Long id) {
        Optional<Alumno> o = service.findById(id);
        if (o.isEmpty()) {
            ResponseEntity.notFound().build();
            
        }
        return ResponseEntity.ok(o.get());
    }
}
