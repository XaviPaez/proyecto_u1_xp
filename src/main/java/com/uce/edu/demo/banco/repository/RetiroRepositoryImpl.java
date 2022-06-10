package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;


@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el retiro: " + d);
	}

	@Override
	public void actualizar(Retiro d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: " + d);

	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busca el retiro: "+ numero);
		Retiro retiro=new Retiro();
		retiro.setNumeroCuenta(numero);
		return retiro;
	
	}

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: "+ identidicador);
	}

}
