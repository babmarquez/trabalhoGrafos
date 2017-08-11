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

    public void restaUm() {
        //Sorteia um soldado
        posicaoAtual = NumeroSorteado();
        //Enquanto tiver mais de um
        while (tamanho > 1){
            //Sorteia um número
            int numSorteado = NumeroSorteado();
            //Remove o cara
            RemoverSoldadoSorteado(numSorteado);
        }
        //Retorna o vencedor
        System.out.println(String.format("Soldado que restou: {0}", info[0].getIdentificador()));
    }
    
    private int NumeroSorteado() {
        Random random = new Random(INTERVALO_DE_NUMEROS_INICIO);
        int numero = random.nextInt(INTERVALO_DE_NUMEROS_FIM);
        
        //Se o número for 0, sorteia de novo
        if (numero == 0)
            return NumeroSorteado();
        
        return numero;
    }

    private void RemoverSoldadoSorteado(int numSorteado) {
        if(numSorteado > 0) {
            posicaoAtual = PercorrerADireita(numSorteado);
        }
        else {
            posicaoAtual = PercorrerAEsquerda(numSorteado);
        }
        System.out.println(String.format("Número sorteado: {0} - Soldado removido: {1}",numSorteado, info[posicaoAtual]));
        remover(posicaoAtual);
        //Compara se removeu a última posição do vetor
        if (posicaoAtual > tamanho){
            posicaoAtual = 0;
        }
    }
    
    private int PercorrerAEsquerda(int numSorteado){
        
    }
    
    private int PercorrerADireita(int numSorteado){
        
    }
}
