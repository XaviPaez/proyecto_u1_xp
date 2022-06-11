package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public void actualizarTransferencia(Transferencia t);
	
	public Transferencia buscarTransferencia(String identidicador);
	
	public void eliminarTransferencia(String identificador);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
