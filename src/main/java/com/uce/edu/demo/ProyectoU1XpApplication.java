package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.equipo.modelo.Entrenador;
import com.uce.edu.demo.equipo.modelo.Jugador;
import com.uce.edu.demo.equipo.service.IFichajeService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	/*
	 * @Autowired private ProfesorGeneral general;
	 * 
	 * @Autowired private ProfesorGeneral general1;
	 * 
	 * @Autowired private ProfesorMateria materia;
	 * 
	 * @Autowired private IMatriculaService iMatriculaService;
	 */
	
	@Autowired
	private Entrenador entrenador;
	@Autowired
	private Entrenador entrenador2;
	@Autowired
	private Jugador jugador;
	@Autowired
	private Jugador jugador2;
	@Autowired 
	private IFichajeService fichajeService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println("Ejemplo singleton");
		 * 
		 * this.general.setNombre("Xavier"); this.general.setApellido("Paez");
		 * 
		 * System.out.println(this.general.toString()); System.out.println("------");
		 * 
		 * System.out.println(this.general1.toString());
		 * this.general1.setNombre("Pepito");
		 * 
		 * System.out.println("------"); System.out.println(this.general.toString());
		 * 
		 * System.out.println("------"); System.out.println(this.general1.toString());
		 * 
		 * System.out.println("Ejemplo prototype"); this.materia.setNombre("Daniel");
		 * this.materia.setApellido("Teran"); System.out.println(this.materia);
		 * System.out.println("-----"); System.out.println(this.materia);
		 * 
		 * System.out.println("---------"); Matricula matricula=new Matricula();
		 * matricula.setEstudiante(new Estudiante()); List<Materia> materias=new
		 * ArrayList<>(); matricula.setMateria(new ArrayList<Materia>());
		 * matricula.setNumero("123");
		 * this.iMatriculaService.ingresarMatricula(matricula);
		 */
		System.out.println("-----------------");
		System.out.println("Ejemplo Singleton");
		
		this.entrenador.setNombre("Luis");
		this.entrenador.setApellido("Zubeldia");
		this.entrenador.setNacionalidad("Argentino");
		this.entrenador.setEdad(41);
		
		System.out.println(this.entrenador);
		this.entrenador2.setApellido("Repetto");
		System.out.println(this.entrenador2);

		System.out.println("-----------------");
		System.out.println("Ejemplo Prototype");
		
		this.jugador.setNombre("Claudio");
		this.jugador.setApellido("Bieler");
		this.jugador.setNacionalidad("Argentino");
		this.jugador.setEdad(38);
		
		System.out.println(this.jugador);
		this.jugador2.setApellido("Hoyos");
		System.out.println(this.jugador2);
		
		System.out.println("-----------------");
		
		Jugador j=new Jugador();
		j.setNombre("Franklin");
		j.setApellido("Salas");
		j.setNacionalidad("Ecuatoriana");
		j.setEdad(45);
		this.fichajeService.ingresarFichaje(j);
	}

}
