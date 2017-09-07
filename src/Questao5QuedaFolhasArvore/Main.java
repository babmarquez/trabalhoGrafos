/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao5QuedaFolhasArvore;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> teste = new ArvoreBinaria<>();
        
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1);
        
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no1, no2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, null);
        
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7, null, no6);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5, no7, no3);
                      
        teste.setRaiz(no5);
        
        System.out.println(teste.toString());    
    }

}
