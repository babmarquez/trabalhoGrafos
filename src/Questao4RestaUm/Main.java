/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4RestaUm;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {
    
    public static void main(String[] args)
    {
        VetorSoldado soldados = new VetorSoldado(10);
        
        soldados.adicionar(new Soldado(1));
        soldados.adicionar(new Soldado(2));
        soldados.adicionar(new Soldado(3));
        soldados.adicionar(new Soldado(4));
        soldados.adicionar(new Soldado(5));
        soldados.adicionar(new Soldado(6));
        soldados.adicionar(new Soldado(7));
        soldados.adicionar(new Soldado(8));
        soldados.adicionar(new Soldado(9));
        soldados.adicionar(new Soldado(10));
        
        soldados.restaUm();
    }   
}