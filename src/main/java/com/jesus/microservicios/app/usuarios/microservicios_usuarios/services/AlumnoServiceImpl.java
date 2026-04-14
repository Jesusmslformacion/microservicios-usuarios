package com.jesus.microservicios.app.usuarios.microservicios_usuarios.services;


import org.springframework.stereotype.Service;

import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.entity.Alumno;
import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.repository.AlumnoRepository;
import com.jesus.microservicios.commons.commons_microservicios.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl <Alumno, AlumnoRepository> implements AlumnoService{


}
