package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescricao("descricao do java agora");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso ();
		curso.setTitulo("javascrip");
		curso.setDescricao(" descricao js");
		curso.setCargaHoraria(4);
		
		
		Mentoria mentoria =new Mentoria ();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao ment");
		mentoria.setData(LocalDate.now());

		System.out.println(curso );
		System.out.println(curso2 );
		System.out.println(mentoria );
	}

}
