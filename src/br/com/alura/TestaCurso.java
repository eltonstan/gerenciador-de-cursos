package br.com.alura;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		// tentando adicionar da maneira "antiga". nao permite pq o get retorna um Collections.unmodifiableList
		// a forma que estruturamos somente o curso pode adicionar aulas usando o metodo que criamos adiciona
		// o codigo abaixo lanca exception se for descomentado
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		System.out.println(javaColecoes.getAulas());
	}
	
}