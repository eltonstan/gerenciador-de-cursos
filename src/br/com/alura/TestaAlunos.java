package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior, set nao aceita repeticao

        System.out.println(alunos);    
        
        System.out.println(alunos.contains("Paulo Silveira"));
        System.out.println(alunos.contains("Nico Steppat"));
    }
}