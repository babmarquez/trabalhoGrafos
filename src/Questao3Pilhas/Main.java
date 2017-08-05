/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Pilhas;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {

    public static void main(String[] args) throws LetraInvalidaException
    {
        Palavra palavra = new Palavra("ABABABCBABABA");
        
        boolean valida = palavra.verificaPalavra();
        System.out.println(valida ? "Aceita" : "Negada");
    }   
}