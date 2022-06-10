package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public void actualizar(Deposito d);

	public Deposito buscar(String numero);

	public void eliminar(String identidicador);

	
}
