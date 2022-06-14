package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;


@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(c);
	}

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminar(identidicador);
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		//BigDecimal interes=saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		return null;
	}

}
