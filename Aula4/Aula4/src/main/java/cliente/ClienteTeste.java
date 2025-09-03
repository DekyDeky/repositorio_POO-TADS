/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author Aluno
 */

public class ClienteTeste {
    public static void main(String[] args) {
        //Instanciar um objeto de Cliente
        Cliente meuCliente = new Cliente("Deky", "111.111.111-11", "(42) 11111-1111");
        meuCliente.imprimir();
        
        meuCliente.setTelefone("(42) 22222-2222");
        
        meuCliente.imprimir();
    }
}
