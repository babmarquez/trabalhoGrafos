/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5QuedaFolhasArvore;

import java.util.Arrays;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 * @param <T>
 */
public class Lista<T> {    
    public static final int TAMANHO_VETOR = 10;
    
    private T[] info;
    private int tamanho;

    public Lista() {
        info = (T[]) new Object[TAMANHO_VETOR];
        tamanho = 0;
    }

    public void inserir(T valor){
        if (tamanho == info.length)
            redimensionar();
        
        info[tamanho] = valor;
        tamanho++;
    }
    
    public int buscar(T valor){
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor))
                return i;
        }
        
        return -1;
    }
    
    public T buscar(int index){
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(index))
                return info[i];
        }
        
        return null;
    }
    
    public boolean pertence(int index){
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(index))
                return true;
        }
        
        return false;
    }
    
    public void retirar(T valor){
        int pos = buscar(valor);
        
        for (int i = pos; i < tamanho; i++) {
            if (i+1 <= TAMANHO_VETOR)
                info[i] = info[i+1];
        }    
        
        tamanho--;
    }
    
    public T obterElemento(int pos){
        return info[pos];
    }
    
    public boolean estaVazia(){
        return (tamanho >= 0);        
    }
            
    public void liberar(){
        /*for (int i = 0; i < tamanho; i++) {
            info[i] = null;
        }*/
        info = (T[]) new Object[TAMANHO_VETOR];
        tamanho = 0;        
    }
    
    @Override
    public boolean equals(Object objeto){
        if (this == objeto)
            return true;
        if (objeto == null)
            return false;
        if (getClass() != objeto.getClass())
            return false;
        
        Lista<T> other = (Lista<T>) objeto;
        
        if (this.getTamanho() != other.getTamanho())
            return false;
        
        for (int i = 0; i < this.getTamanho(); i++) {
            if (!this.info[i].equals(other.info[i]))
                return false;
        }
        
        return true;
    }

    @Override
    public String toString(){
        String result = "";
        
        for (int i = 1; i < tamanho; i++) {             
            if (info[i] != null)
                result += info[i].toString() +  " ";
            //a raiz fica na posiçao 0 sempre, mas ela deve ser mostrada no meio
            if (i == (tamanho / 2))
                result += info[0].toString() +  " ";            
        }
        
        result = result.substring(0, result.length()-1);
        
        return result;
    }
    
    public void redimensionar(){
        T[] novo;
       
        novo = (T[]) new Object[this.tamanho * 2];
       
        //System.arraycopy(this.info, 0, novo, 0, this.tamanho);
        for (int i = 0; i < this.tamanho; i++) {
            novo[i] = this.info[i];
        }
        
        this.info = novo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Arrays.deepHashCode(this.info);
        hash = 67 * hash + this.tamanho;
        return hash;
    }

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
        
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
