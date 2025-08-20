/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores.pacote2;

import modificadores.pacote1.modificadores;

/**
 *
 * @author Aluno
 */
public class Teste2 {
    public static void main(String[] args) {
        // Instanciar um objeto da classe modificadores
        modificadores objMod = new modificadores();
        
        // Exibir os valores dos atributos
        // System.out.println("Sem modificador: " + objMod.semModificador);
        // System.out.println("Privado: " + objMod.privado);
        // System.out.println("Protegido: " + objMod.protegido);
        System.out.println("Publico: " + objMod.publico);
        
    }
}
