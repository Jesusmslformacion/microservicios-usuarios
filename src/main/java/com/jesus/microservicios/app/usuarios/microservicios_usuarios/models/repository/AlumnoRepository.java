package com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jesus.microservicios.app.usuarios.microservicios_usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository <Alumno, Long> {


}
