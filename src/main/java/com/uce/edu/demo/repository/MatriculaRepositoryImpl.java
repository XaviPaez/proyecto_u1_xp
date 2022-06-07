package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;


@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula: "+ m);
	}

	@Override
	public Matricula buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: "+ nombre);
		Matricula m=new Matricula();

		return m;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: "+ m);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula: "+ nombre);
	}

}
