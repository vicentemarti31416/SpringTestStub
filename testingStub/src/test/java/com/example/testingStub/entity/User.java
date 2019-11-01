package com.example.testingStub.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String nombre;

	public User(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
