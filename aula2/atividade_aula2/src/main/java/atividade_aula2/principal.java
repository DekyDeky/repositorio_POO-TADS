/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_aula2;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class principal {
      
    static Scanner entrada = new Scanner(System.in);
    
    static void cadastrar(pessoa novaPessoa){        
        
        System.out.println("\n\n\n");
       
        System.out.print("Insira um nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Insira o peso (kg): ");
        double peso = entrada.nextDouble();
        
        System.out.print("Insira a altura (m): ");
        double altura = entrada.nextDouble();
        
        novaPessoa.setNome(nome);
        novaPessoa.setPeso(peso);
        novaPessoa.setAltura(altura);
        
        System.out.println("\nPessoa cadastrada com sucesso!");
        System.out.print("Pressione enter para continuar...");
        entrada.nextLine();
        System.out.println("\n\n\n");
    }
    
    public static void main(String[] args) {
        
        pessoa novaPessoa = new pessoa();
        
        boolean continuar = true;
        
        while(continuar){
            System.out.println("========================");
            System.out.println("    Cadastra Pessoa");
            System.out.println("1. Cadastrar");
            System.out.println("2. Imprimir");
            System.out.println("0. Sair");
            System.out.println("========================\n\n");
            
            System.out.print("Opcao: ");
            String opcao = entrada.nextLine();
            
            switch (opcao) {
                case "1" -> cadastrar(novaPessoa);
                case "2" -> {
                    
                    System.out.println("\n\n\n");
                    
                    if(novaPessoa.getNome() == null){
                        novaPessoa.setNome("Indefinido");
                    }
                    
                    novaPessoa.imprimir();
                    
                    System.out.print("Pressione enter para continuar...");
                    entrada.nextLine();
                }
                case "0" -> {
                    System.out.println("Adeus!");
                    System.out.print("Pressione enter para continuar...");
                    entrada.nextLine();
                    continuar = false;
                }
                default -> {
                    System.out.println("Entrada invalida, selecione uma opcao valida!");
                    System.out.print("Pressione enter para continuar...");
                    entrada.nextLine();
                }
            }
            
           
        }

    }
}
