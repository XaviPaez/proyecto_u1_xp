package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void realizarRetiro(String numeroCta,BigDecimal monto);
	
	public void actualizarRetiro(Retiro r);
	
	public Retiro buscarRetiro(String identidicador);
	
	public void eliminarRetiro(String identificador);
	
}
