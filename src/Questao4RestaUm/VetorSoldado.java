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
    private final int NUMEROS_RANDOM = 10;
    
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

    public boolean estaCheio() {
        return tamanho == info.length;
    }
    
    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void adicionar(Soldado soldado) {
        if(estaCheio()){
            System.err.println("Vetor está cheio");
        }
        else {
            info[tamanho] = soldado;
            tamanho++;
        }
    }

    public void remover(int posicao) {
        //Deve conseguir remover o valor da posição
        if (posicao == tamanho) {
            info[posicao] = null;
        } else {
            for (; posicao < tamanho-1; posicao++) {
                info[posicao] = info[posicao + 1];
            }
            info[tamanho-1] = null;
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
    
    private void ImprimirLista(){
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println("[" + i + "] - " + info[i].getIdentificador());
        }
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
        System.out.println("Soldado que restou: " + info[0].getIdentificador());
    }
    
    private int NumeroSorteado() {
        Random random = new Random();
        int numero = random.nextInt(NUMEROS_RANDOM);
        
        //Se o número for 0, sorteia de novo
        if (numero == 0)
            return NumeroSorteado();
        
        return numero;
    }
    
    private boolean ENegativo(){
        return new Random().nextInt(2) == 0;
    }

    private void RemoverSoldadoSorteado(int numSorteado) {
        if(ENegativo()) {
            posicaoAtual = PercorrerAEsquerda(numSorteado);
        }
        else {
            posicaoAtual = PercorrerADireita(numSorteado);
        }
        System.out.println("Número sorteado:" + numSorteado + " - Posição removida: "+posicaoAtual+" - Soldado removido: " + info[posicaoAtual].getIdentificador());
        remover(posicaoAtual);
        ImprimirLista();
        //Compara se removeu a última posição do vetor
        if (posicaoAtual > tamanho){
            posicaoAtual = 0;
        }
    }
    
    private int PercorrerAEsquerda(int numSorteado){
        int posicao = this.posicaoAtual;
        
        for (int quantidade = 0; quantidade <= numSorteado; quantidade++) {
            if (posicao == 0){
                posicao= this.tamanho-1;
            } else {
                posicao--;
            }
        }
        
        return posicao;
    }
    
    private int PercorrerADireita(int numSorteado){
        int posicao = this.posicaoAtual;
        
        for (int quantidade = 0; quantidade <= numSorteado; quantidade++) {
            if (posicao == this.tamanho-1){
                posicao= 0;
            } else {
                posicao++;
            }
        }
        
        return posicao;
    }
}
