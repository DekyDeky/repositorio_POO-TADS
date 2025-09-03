/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaAtividades;

/**
 *
 * @author Aluno
 */
public class PrincipalData {
    public static void main(String[] args) {
        Data dataDecimal = new Data(2, 9, 2025);
        Data dataStr = new Data(29, "Setembro", 2025);
        Data diasAno = new Data(200, 2025);
        
        dataDecimal.imprimir();
        dataStr.imprimir();
        diasAno.imprimir();
    }
    
    
    
}
    