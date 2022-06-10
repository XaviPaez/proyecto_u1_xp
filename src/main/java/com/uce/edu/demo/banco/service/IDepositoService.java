package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizarDeposito(String numeroCtaDestino,BigDecimal monto);
	
	public void actualizarDeposito(Deposito d);
	
	public Deposito buscarDeposito(String identidicador);
	
	public void eliminarDeposito(String identificador);
	
}
