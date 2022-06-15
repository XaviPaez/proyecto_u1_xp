package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral general;
	@Autowired
	private ProfesorGeneral general1;
	@Autowired
	private ProfesorMateria materia;
		
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Ejemplo singleton");
		
		this.general.setNombre("Xavier");
		this.general.setApellido("Paez");
		
		System.out.println(this.general.toString());
		System.out.println("------");
		
		System.out.println(this.general1.toString());
		this.general1.setNombre("Pepito");
		
		System.out.println("------");
		System.out.println(this.general.toString());
	
		System.out.println("------");
		System.out.println(this.general1.toString());
		
		System.out.println("Ejemplo prototype");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");
		System.out.println(this.materia);
		System.out.println("-----");
		System.out.println(this.materia);
		
		System.out.println("---------");
		Matricula matricula=new Matricula();
		matricula.setEstudiante(new Estudiante());
		List<Materia> materias=new ArrayList<>();
		matricula.setMateria(new ArrayList<Materia>());
		matricula.setNumero("123");
		this.iMatriculaService.ingresarMatricula(matricula);
		
		
	}

}
