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
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMatriculaService iMatriculaService;
	@Autowired
	private IMateriaService iMateriaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println();

		Estudiante e = new Estudiante();
		e.setNombre("Xavier");
		e.setApellido("Paez");
		e.setCedula("1753553641");
		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("0953553641");
		this.estudianteService.ingresarEstudiante(e1);

		System.out.println(
				"****************************************************************************************************");

		Materia m = new Materia();
		
		m.setNombre("Programacion Avanzada II");
		m.setSemestre("Sexto");
		this.iMateriaService.ingresarMateria(m);
		m.setNombre("Inteligencia Artificial");
		this.iMateriaService.actualizarMateria(m);
		this.iMateriaService.buscarPorNombre("Programacion Avanzada");
		this.iMateriaService.borrarMateria("Inteligencia Artificial");

		System.out.println(
				"****************************************************************************************************");

		Matricula matricula = new Matricula();
		List<Materia> materia = new ArrayList<Materia>();
		materia.add(m);
		
		matricula.setNumero("154U");
		matricula.setEstudiante(e);
		matricula.setMateria(materia);
		this.iMatriculaService.ingresarMatricula(matricula);
		matricula.setEstudiante(e1);
		this.iMatriculaService.actualizarMatricula(matricula);
		this.iMatriculaService.buscarPorNombre("154U");
		this.iMatriculaService.borrarMatrcula("154U");

	}

}
