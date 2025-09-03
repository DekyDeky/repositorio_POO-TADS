/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int AnoFabricacao) {
        this.anoFabricacao = AnoFabricacao;
    }
    
    public Carro(String m, int a){
        this.setMarca(m);
        this.setAnoFabricacao(a);
    }
    
    public Carro(String m, String mod){
        this.setMarca(m);
        this.setModelo(mod);
    }
    
    public Carro(String m, String mod, int a){
        this.setMarca(m);
        this.setModelo(mod);
        this.setAnoFabricacao(a);
    }
    
    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
    }
}
