package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void insertarRetiro(Retiro d);

	public void actualizar(Retiro d);

	public Retiro buscar(String numero);

	public void eliminar(String identidicador);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
