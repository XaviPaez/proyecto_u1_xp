package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui deberia star el SQL a la base
		List<Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("1257");
		
		
		listaConsultada.add(trans1);
		return listaConsultada;
	}

	
	
}
