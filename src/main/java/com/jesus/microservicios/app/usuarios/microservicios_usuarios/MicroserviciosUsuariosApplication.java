package com.jesus.microservicios.app.usuarios.microservicios_usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.jesus.microservicios.commons.alumnos.commons_alumnos.models.entity"})
public class MicroserviciosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosUsuariosApplication.class, args);
	}

}
