package br.bootcampJavaPoo;

import java.time.LocalDate;

import br.bootcampJavaPoo.dominio.Bootcamp;
import br.bootcampJavaPoo.dominio.Curso;
import br.bootcampJavaPoo.dominio.Dev;
import br.bootcampJavaPoo.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java Collections");
		curso1.setDescricao("Desenvolvendo Coleções em Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java Poo");
		curso2.setDescricao("Paradigmas Orientado a Objetos");
		curso2.setCargaHoraria(4);
		
		Mentoria ment1 = new Mentoria();
		ment1.setTitulo("Desenvolvendo Aplicações Rest com Spring Boot");
		ment1.setDescricao("Criando Projeto Bootcamp na Prática");
		ment1.setData(LocalDate.now());
		
		Bootcamp bc = new Bootcamp();
		bc.setNome("Dev Java Avanade");
		bc.setDescricao("Descrição Dev Java Avanade");
		bc.getConteudos().add(curso1);
		bc.getConteudos().add(curso2);
		bc.getConteudos().add(ment1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Rodrigo Fernandes");
		dev1.inscreverBootcamp(bc);
		System.out.println("Conteúdos Inscritos de "+dev1.getNome() + " : " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos de "+dev1.getNome() + " : " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de "+dev1.getNome() + " : " + dev1.getConteudosConcluidos());
		System.out.println(dev1.getNome() + " possui " + dev1.calcularTotalXP() + " de XP");
		System.out.println("-----------");
		Dev dev2 = new Dev();
		dev2.setNome("Camila Figueiredo");
		dev2.inscreverBootcamp(bc);
		System.out.println("Conteúdos Inscritos de "+dev2.getNome() + " : " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("--");
		System.out.println("Conteúdos Inscritos de "+dev2.getNome() + " : " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de "+dev2.getNome() + " : " + dev2.getConteudosConcluidos());
		System.out.println(dev2.getNome() + " possui " + dev2.calcularTotalXP() + " de XP");
		
		
		
		

	}

}
