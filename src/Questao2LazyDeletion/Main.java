/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao2LazyDeletion;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        
        lista.inserir(0);
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.inserir(6);
        
        lista.exibir();
        
        lista.retirar(1);
        lista.retirar(2);
        lista.retirar(4);
        lista.retirar(0);
        
        System.out.println("______________________");
        lista.exibir();
    }
}