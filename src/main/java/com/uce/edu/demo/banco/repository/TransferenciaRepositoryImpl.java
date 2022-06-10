package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository

public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	
	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia a la base de datos "+ t);
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado la transferencia: "+ t);
	}

	@Override
	public Transferencia buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la trasferencia: "+ numero);
		Transferencia transferencia=new Transferencia();
		transferencia.setFechaTransferencia(LocalDateTime.now());
		return transferencia;

	}

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la transferencia: "+ identidicador);
	}

	
	
}
