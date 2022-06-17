package com.uce.edu.demo.equipo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.equipo.modelo.Jugador;
@Repository
public class FichajeRepositoryImpl implements IFichajeRepository {

	@Override
	public void crearFichaje(Jugador j) {
		// TODO Auto-generated method stub
		System.out.println("Se ha fichado al jugador: "+ j);
	}

}
