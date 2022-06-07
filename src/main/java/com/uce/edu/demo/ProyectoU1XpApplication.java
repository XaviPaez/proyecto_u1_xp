package com.uce.edu.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e=new Estudiante();
		e.setNombre("Xavier");
		e.setApellido("Paez");
		e.setCedula("1753553641");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1=new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("0953553641");
		this.estudianteService.ingresarEstudiante(e1);
		
		//Usar los 3 metodos restantes
		e.setCedula("1564896476");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("0943344567");
	}

}
