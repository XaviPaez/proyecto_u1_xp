package com.uce.edu.demo.equipo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Entrenador {

	private String nombre;
	private String apellido;
	private String nacionalidad;
	private int edad;

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + "]";
	}

	// SET Y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
