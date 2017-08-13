/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao5QuedaFolhasArvore;


/**
 *
 * @author anaFidelis
 * @param <T>
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

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
        return arvorePre(this.raiz);
    }
        
    private String arvorePre(NoArvoreBinaria<T> no){
        /*String result = "<"+
                ((no == null)? "" : no.getInfo() + 
                                    (arvorePre(no.getEsquerda()))+
                                    (arvorePre(no.getDireita())))+                
               ">";*/
        
        /*String result = ((no == null)? "" : 
                                    (no.getEsquerda() != null ? "-"+(arvorePre(no.getEsquerda()))+" " : "")+
                                     no.getInfo()+
                                    (no.getDireita() != null ? "+"+(arvorePre(no.getDireita() ))+" " : "") );*/
        
        String result = ((no == null)? "" : 
                                    (arvorePre(no.getEsquerda()))+
                                     no.getInfo()+
                                    (arvorePre(no.getDireita() )));
        
         
        return result; 
    }
}
