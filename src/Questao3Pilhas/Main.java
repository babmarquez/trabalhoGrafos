/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Pilhas;

/**
 *
 * @author Barbara
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.print("palavra aceita");
    }
    
    private boolean verificaPalavra(String palavra){
        //pega a string e coloca pra upper
        //lê uma letra, verificando se ela é válida
        //se é A ou B, adiciona na pilha
        //se for um C sai do loop de inserção e começa o de remoção
        //lê uma letra, faz pop e compara, verificando se é A ou B
        
        return true;
    }
    
    ///Verifica se a letra é uma das letras aceitáveis
    private boolean verificaLetraValida(char letra){
        switch(letra){
            case 'A':
            case 'B':
            case 'C':
                return true;
            default:
                return false;
        }
    }
    
    ///Verifica se a letra é o separador
    private boolean verificaSeparador(char letra){
        switch(letra){
            case 'C':
                return true;
            default:
                return false;
        }
    }
    
}
