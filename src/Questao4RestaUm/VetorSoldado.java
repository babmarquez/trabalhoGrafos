/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4RestaUm;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Barbara
 */
public class VetorSoldado {
    private Object[] info;
    private int limite;
    private int tamanho;

    public VetorSoldado(int limite)
    {
        this.info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public Object[] getInfo()
    {
        return info;
    }

    public void setInfo(Object[] info)
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

    public boolean estaVazio()
    {
        return tamanho == 0;
    }
    
    

    public void liberar()
    {
        Object[] novo = new Object[limite];
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