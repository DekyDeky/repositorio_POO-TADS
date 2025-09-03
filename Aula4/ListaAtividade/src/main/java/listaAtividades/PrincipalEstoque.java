/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAtividades;

/**
 *
 * @author Aluno
 */
public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque banana = new Estoque("Banana", 1.50, 10);
        
        banana.imprimir();
        
        banana.removerProdutos(12);
        
        banana.imprimir();
        
        banana.removerProdutos(5);
        
        banana.imprimir();
    }
}
