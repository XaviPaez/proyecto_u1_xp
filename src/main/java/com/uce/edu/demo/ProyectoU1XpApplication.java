package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.evento.Boleteria;
import com.uce.edu.demo.evento.Boleteria2;
import com.uce.edu.demo.evento.Boleteria3;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {
	
//1)@Autowired
//	private CitaMedica cita;
	
	@Autowired
	private CitaMedica2 cita;
	
	@Autowired
	private Boleteria boleteria;
	@Autowired
	private Boleteria2 boleteria2;
	@Autowired
	private Boleteria3 boleteria3;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto Spring Framework");
		
		String respuesta=this.cita.agendar(LocalDateTime.now(), "Xavier", "Paez", 22, "Quito", "Sebastian", 23);
		//System.out.println(respuesta);
		
		System.out.println("******************************************************");
		
		String evento=this.boleteria.reservar(LocalDateTime.now(), "LIGAVSINDEPENDIENTE", "Cotocollao", "Quito", "U21", "Xavier", 22, 179837492);
		System.out.println("DI por atributos");
		System.out.println(evento);
		
		
		String evento2=this.boleteria2.reservar(LocalDateTime.now(), "LIGAVSINDEPENDIENTE", "Cotocollao", "Quito", "U21", "Xavier", 22, 179837492);
		System.out.println("DI por constructor");
		System.out.println(evento2);
		
		
		String evento3=this.boleteria3.reservar(LocalDateTime.now(), "LIGAVSINDEPENDIENTE", "Cotocollao", "Quito", "U21", "Xavier", 22, 179837492);
		System.out.println("DI por SET");
		System.out.println(evento3);
	}

}
