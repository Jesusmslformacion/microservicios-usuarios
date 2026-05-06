package com.jesus.microservicios.app.usuarios.microservicios_usuarios.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.repository.AlumnoRepository;
import com.jesus.microservicios.commons.alumnos.commons_alumnos.models.entity.Alumno;
import com.jesus.microservicios.commons.commons_microservicios.services.CommonServiceImpl;


@Service
public class AlumnoServiceImpl extends CommonServiceImpl <Alumno, AlumnoRepository> implements AlumnoService{

    @Override
    @Transactional(readOnly = true)
    public List<Alumno> findByNombreOrApellido(String term) {
        return repository.findByNombreOrApellido(term);
    }

}
    
