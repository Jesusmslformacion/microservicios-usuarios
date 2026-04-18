package com.jesus.microservicios.app.usuarios.microservicios_usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.entity.Alumno;
import com.jesus.microservicios.app.usuarios.microservicios_usuarios.services.AlumnoService;
import com.jesus.microservicios.commons.commons_microservicios.controllers.CommonController;

@RestController // Controlador del tipo REST 
@RequestMapping("/api/alumnos")
public class AlumnoController extends CommonController<Alumno, AlumnoService>{

    @PutMapping("/{id}") // EDITAR
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        Optional<Alumno> o = service.findById(id);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
            
        }

        Alumno alumnoDb = o.get();
        alumnoDb.setNombre(alumno.getNombre());
        alumnoDb.setApellido(alumno.getApellido());
        alumnoDb.setEmail(alumno.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb));
    }


}
