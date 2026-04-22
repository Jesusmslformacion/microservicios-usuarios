package com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jesus.microservicios.commons.alumnos.commons_alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository <Alumno, Long> {


}
