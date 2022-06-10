package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void insertarRetiro(Retiro d);

	public void actualizar(Retiro d);

	public Retiro buscar(String numero);

	public void eliminar(String identidicador);
}
