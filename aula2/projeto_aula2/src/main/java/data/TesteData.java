/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Aluno
 */
public class TesteData {
    public static void main(String[] args) {
        // Instanciar um obj da classe data
        data hoje = new data();
            
        // Definir o dia, mês e ano
        hoje.setDia(19);
        hoje.setMes(8);
        hoje.setAno(2025);
                
        // Mostrar a data
        hoje.imprimir();
    }
}
