/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4RestaUm;

import java.util.Random;

/**
 *
 * @author Barbara
 */
public class VetorSoldado {
    private final int INTERVALO_DE_NUMEROS_INICIO = -9;
    private final int INTERVALO_DE_NUMEROS_FIM = 9;
    
    private Soldado[] info;
    private int limite;
    private int tamanho;
    private int posicaoAtual;

    public VetorSoldado(int limite) {
        this.info = new Soldado[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Soldado[] info) {
        this.info = info;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void remover(int posicao) {
        //Deve conseguir remover o valor da posição
        if (posicao == tamanho) {
            info[posicao] = null;
        } else {
            for (int i = posicao; i < tamanho; i++) {
                info[i] = info[i + 1];
            }
            info[tamanho] = null;
        }

        tamanho--;
    }

    public void liberar() {
        Soldado[] novo = new Soldado[limite];
        this.info = novo;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            result += info[i] + ",";
        }

        result = (result.charAt(result.length() - 1) == ',') ? result.substring(0, result.length() - 1) : result;

        return result;
    }

    public int NumeroSorteado() {
        Random random = new Random(INTERVALO_DE_NUMEROS_INICIO);
        int numero = random.nextInt(INTERVALO_DE_NUMEROS_FIM);
        
        return numero;
    }

    public int RetornarPosicaoRemover() {
        return 0;
    }

    public Soldado restaUm() {
        //Sorteia um soldado
        posicaoAtual = NumeroSorteado();
        //Enquanto tiver mais de um
        //Sorteia um número
        //Contabiliza esse número
        //Remove o cara
        //Retorna o vencedor
        return info[0];
    }
}
