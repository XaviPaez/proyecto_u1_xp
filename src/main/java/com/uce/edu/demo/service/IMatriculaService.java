package com.uce.edu.demo.service;


import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresarMatricula(Matricula m);

	public Matricula buscarPorNombre(String nombre);

	public void actualizarMatricula(Matricula e);

	public void borrarMatrcula(String nombre);
	
}
