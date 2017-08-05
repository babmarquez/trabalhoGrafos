/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Pilhas;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 * @param <T>
 */
public class PilhaVetor<T> implements Pilha<T>
{
    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite)
    {
        this.info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public T[] getInfo()
    {
        return info;
    }

    public void setInfo(T[] info)
    {
        this.info = info;
    }

    public int getLimite()
    {
        return limite;
    }

    public void setLimite(int limite)
    {
        this.limite = limite;
    }

    public int getTamanho()
    {
        return tamanho;
    }

    public void setTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }           
    
    @Override
    public void push(T info)
    {
        if (limite == tamanho)
            throw new PilhaCheiaException("Capacidade esgotada da pilha");
        
        this.info[tamanho] = info;
        tamanho ++;
    }

    @Override
    public T pop()
    { 
        if (estaVazia())
            throw new PilhaVaziaException("Pilha está vazia");
        
        this.info[tamanho] = null;
        this.tamanho--;
        
        return info[tamanho];
    }

    @Override
    public T peek()
    {
        if (estaVazia())
            throw new PilhaVaziaException("Pilha está vazia");
        
        return info[tamanho-1];
    }

    @Override
    public boolean estaVazia()
    {
        return tamanho == 0;
    }

    @Override
    public void liberar()
    {
        T[] novo = (T[]) new Object[limite];
        this.info = novo;
        this.tamanho = 0;
    }

    @Override
    public String toString()
    {
        String result = "";
        for (int i = tamanho-1; i >= 0; i--) {
            result += info[i] + ",";
        }
        
        result = (result.charAt(result.length()-1) == ',') ? result.substring(0, result.length()-1) : result;
        
        return result;
    }
}