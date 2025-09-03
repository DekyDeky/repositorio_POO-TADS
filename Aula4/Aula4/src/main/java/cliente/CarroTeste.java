/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author Aluno
 */
public class CarroTeste {
    public static void main(String[] args) {
        Carro novoCarro = new Carro("Carro", 2000);
        Carro novoCarro1 = new Carro("Moto", "Bis");
        Carro novoCarro2 = new Carro("Onibus", "Volvo", 2025);
        novoCarro.imprimir();
        novoCarro1.imprimir();
        novoCarro2.imprimir();
    }
}
