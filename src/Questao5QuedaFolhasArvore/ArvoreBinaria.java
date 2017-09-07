/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao5QuedaFolhasArvore;


/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 * @param <T>
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;
    private Lista<PilhaFolhas> pilhaFolhas;
    private int pos;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    public boolean estaVazia(){
        return (raiz == null);
    }
    
    public boolean pertence(T info){
        return pertence(info, this.raiz);
    }
    
    private boolean pertence(T info, NoArvoreBinaria<T> no){
        if (no == null)
            return false;
        else
            return ((no.getInfo().equals(info)) ||
                    pertence(info, no.getEsquerda()) ||
                    pertence(info, no.getDireita()));
    }
    
    @Override
    public String toString(){        
        pilhaFolhas = new Lista<>();
        
        //adiciona a posiçao 0 que e a raiz
        pos = 0;
        empilhaFolhas(pos, raiz);
        
        arvorePre(this.raiz);
        
        return pilhaFolhas.toString();
    }
        
    private void arvorePre(NoArvoreBinaria<T> no){
        //o temp armazena o contador da posiçao pois com
        int temp;
        
        if (no.getEsquerda() != null){
            temp = pos--;
            empilhaFolhas(pos, no.getEsquerda());
            arvorePre(no.getEsquerda());
            pos = temp;
        }
        
        if (no.getDireita() != null){
            temp = pos++;
            empilhaFolhas(pos, no.getDireita());
            arvorePre(no.getDireita());
            pos = temp;
        }
    }
    
    public void empilhaFolhas(int pos, NoArvoreBinaria<T> no){
        //verifica se ja possui um objeto com essa posiçao
        if (pilhaFolhas.pertence(pos)){            
            //apenas adiciona ao hashset o no com a mesma posicao
            pilhaFolhas.buscar(pos).getFolhas().add(no);
        }else{
            //cria uma nova pilha de folhas com a posicaos
            PilhaFolhas novaPilha = new PilhaFolhas();
            novaPilha.setIndex(pos);
            novaPilha.getFolhas().add(no);
            pilhaFolhas.inserir(novaPilha);
        }
    }
    
}
