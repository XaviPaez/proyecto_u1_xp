package com.uce.edu.demo.evento;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Boleteria3 {

	//3) DI por set y get
	
	private LocalDateTime fechaEvento;

	private Asistente asistente;
	private Evento evento;
	
	public String reservar(LocalDateTime fechaEvento, String nombre, String lugar, String ciudad, String codigo, String nombreAsistente,
			int edadAsistente, int cedulaAsistente) {

		this.evento.setNombre(nombre);
		this.evento.setLugar(lugar);
		this.evento.setCodigo(codigo);
		this.evento.setCiudad(ciudad);

		this.asistente.setNombre(nombreAsistente);
		this.asistente.setEdad(edadAsistente);
		this.asistente.setCedula(cedulaAsistente);

		// Seteamos los atributos de la cita medica

		this.fechaEvento = fechaEvento;

		// Se inserta la cita en la base de datos
		return "Evento 3";
	}

	public LocalDateTime getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(LocalDateTime fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Asistente getAsistente() {
		return asistente;
	}
	@Autowired
	public void setAsistente(Asistente asistente) {
		this.asistente = asistente;
	}

	public Evento getEvento() {
		return evento;
	}
	@Autowired
	public void setEvento(Evento evento) {
		this.evento = evento;
	}


	
	
}
