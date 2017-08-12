/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4RestaUm;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main {
    /*
    O problema "Resta Um" descreve a seguinte situação: Um grupo de soldados está cercado e não há esperança de vitória, porém existe somente um
    cavalo disponível para escapar e buscar por reforços. Para determinar qual soldado deve escapar para encontrar ajuda, eles formam um círculo
    e sorteiam um número de um chapéu. Começando por um soldado sorteado aleatoriamente, uma contagem é realizada até o número sorteado. Quando a
    contagem terminar, o soldado  em que a contagem parou é removido do círculo, um novo número é sorteado e a contagem recomeça no soldado 
    seguinte ao que foi eliminado. A cada rodada, portanto, o círculo diminui em um, até que sobre apenas um soldado, sendo o escolhido para a
    tarefa. Utilizando um vetor de tamanho 10, sorteie números entre ‐9 e 9 a cada consulta ao chapéu e simule o processo, imprimindo o número do
    soldado eliminado a cada rodada e o número do soldado escolhido ao final. Valores negativos fazem a contagem andar para a esquerda, enquanto 
    valores positivos andam para a direita. Considere que 0 é um valor inválido e realize um novo sorteio neste caso. Represente os soldados na 
    ,estrutura de dados como um tipo capaz de armazenar um identificar único para cada individuo. 
    */
    public static void main(String[] args)
    {
        VetorSoldado soldados = new VetorSoldado(10);
        
        soldados.adicionar(new Soldado(1));
        soldados.adicionar(new Soldado(2));
        soldados.adicionar(new Soldado(3));
        soldados.adicionar(new Soldado(4));
        soldados.adicionar(new Soldado(5));
        soldados.adicionar(new Soldado(6));
        soldados.adicionar(new Soldado(7));
        soldados.adicionar(new Soldado(8));
        soldados.adicionar(new Soldado(9));
        soldados.adicionar(new Soldado(10));
        
        soldados.restaUm();
    }   
}