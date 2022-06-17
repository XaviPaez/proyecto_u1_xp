package com.uce.edu.demo.equipo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.equipo.modelo.Entrenador;
import com.uce.edu.demo.equipo.modelo.Jugador;
import com.uce.edu.demo.equipo.repository.IFichajeRepository;
@Service
public class FichajeServiceImpl implements IFichajeService {

	@Autowired
	private Jugador jugador;
	@Autowired
	private Entrenador entrenador;
	@Autowired
	private IFichajeRepository fichajeRepository;
	
	
	@Override
	public void ingresarFichaje(Jugador j) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Singelton "+ this.entrenador);
		System.out.println("DI desde Prototype "+ this.jugador);
		this.fichajeRepository.crearFichaje(j);
		
	}

}
