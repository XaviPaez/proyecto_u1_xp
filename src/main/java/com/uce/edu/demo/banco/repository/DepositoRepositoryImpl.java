package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el deposito: "+ d);
	}

	@Override
	public Deposito buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busca el deposito: "+ numero);
		Deposito deposito=new Deposito();
		deposito.setNumeroCuentaDestino(numero);
		return deposito;
	}
	

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el deposito: "+ identidicador);
	}

}