/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAtividades;

/**
 *
 * @author Aluno
 */
public final class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;
    
    //Métodos getters e setters
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        if(dia > 0 && dia <= 31)
            this.dia = dia;
        else {
            System.out.println("Dia inválido. Definido como 1.");
            this.dia = 1;
        }  
    }
    
    public int getMes(){       
        return mes;
    }
    
    public void setMes(int mes){
        if(mes > 0 && mes <= 12) this.mes = mes;
        else {
            System.out.println("Mês inválido. Definido como 1.");
            this.dia = 1;
        }
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int converterStrInt(String strMes){
        
        return switch (strMes) {
            case "Janeiro" -> 1;
            case "Fevereiro" -> 2;
            case "Março" -> 3;
            case "Abril" -> 4;
            case "Maio" -> 5;
            case "Junho" -> 6;
            case "Julho" -> 7;
            case "Agosto" -> 8;
            case "Setembro" -> 9;
            case "Outubro" -> 10;
            case "Novembro" -> 11;
            case "Dezembro" -> 12;
            default -> throw new IllegalArgumentException("Mês inválido: " + strMes);
        };
        
    }

    public String converterIntStr(int mes){
        return switch(mes){
                case 1 -> "Janeiro";
                case 2 -> "Fevereiro";
                case 3 -> "Março";
                case 4 -> "Abril";
                case 5 -> "Maio";
                case 6 -> "Junho";
                case 7 -> "Julho";
                case 8 -> "Agosto";
                case 9 -> "Setembro";
                case 10 -> "Outubro";
                case 11 -> "Novembro";
                case 12 -> "Dezembro";
                default -> throw new IllegalArgumentException("Mês inválido: " + mes);
        };
    }
    
    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Data(int dia, String strMes, int ano) {
        this.setDia(dia);
        this.setMes(this.converterStrInt(strMes));
        this.setAno(ano);
    }

    public Data(int dia, int ano) {
        this.setDia(dia);
        this.setAno(ano);
    }
    
    // Método imprimir
    public void imprimir() {

         if(mes == 0){
             System.out.printf("%03d %03d", dia, ano);
         } else {
            System.out.printf("%02d/%02d/%02d\n", dia, mes, ano);  //%02 adiciona 0 na frente caso seja uma unidade.        
            System.out.printf("%02d de %s  de %03d\n", dia, this.converterIntStr(mes), ano);
         }   
    }
    
}