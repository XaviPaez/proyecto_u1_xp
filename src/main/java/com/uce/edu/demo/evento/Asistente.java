package com.uce.edu.demo.evento;

import org.springframework.stereotype.Component;

@Component
public class Asistente {


	private String nombre;
	private int edad;
	private int cedula;
	
	//SET Y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	
	
	
}
