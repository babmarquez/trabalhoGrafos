/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao1LinksLista;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        
        lista.inserir("www.oi.com");
        lista.inserir("www.tchau.com");
        lista.inserir("www.alou.com");
        
        System.out.println("________________ EXIBE A LISTA ___________________");
        lista.exibir();
        System.out.println(lista.buscar("www.tchau.com").getInfo());
        System.out.println(lista.buscar("www.oi.com").getInfo());
        System.out.println(lista.buscar("oi").getInfo());
        System.out.println(lista.buscar("alo").getInfo());
        System.out.println("___________________________________");
    }
}
