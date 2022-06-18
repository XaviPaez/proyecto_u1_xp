package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorrofuturo")
public class CuentaAhorroFuturoServiceImpl implements ICuentaBancariaService{

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal interes = new BigDecimal(360).multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		interes = interes.add(saldo.divide(new BigDecimal(10)));
		System.out.println("Cuenta ahorro futuro");
		return interes;
	}

	
}