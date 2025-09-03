/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAtividades;

/**
 *
 * @author Aluno
 */
public class Estoque {
    private String nomeProduto;
    private double valor;
    private int quantidade;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque() {
    }

    public Estoque(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public void imprimir(){
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Quantidade: " + quantidade);
    }
    
    public boolean verificarDisponibilidade(int quant){
        return this.quantidade >= quant;
    }
    
    public void removerProdutos(int quant){
        
        if (this.verificarDisponibilidade(quant)){
            this.quantidade = (quantidade - quant);    
        } else {
            System.out.println(nomeProduto + " não possui estoque o suficiente!");
        }
        
    }
}
