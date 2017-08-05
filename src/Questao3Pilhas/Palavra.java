/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Pilhas;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
    
    //Verifica se a palavra é válida
    public boolean verificaPalavra() throws LetraInvalidaException
    {
        PilhaVetor pilhaLetras = new PilhaVetor(palavra.length());
        //pega a string e coloca pra upper
        palavra = palavra.toUpperCase();
        boolean possuiSeparador = false;
        //lê uma letra, verificando se ela é válida
        for(char letra : palavra.toCharArray())
        {
            validaLetra(letra);
            
            //se for um C, indica que tem um separador
            if(verificaSeparador(letra)){
                possuiSeparador = true;
            }
            else if(!possuiSeparador){
                //se é A ou B e não encontrou o C ainda, adiciona na pilha
                pilhaLetras.push(letra);
            } else {
                //senão, vai removendo da pilha e comparando
                if (!pilhaLetras.estaVazia()){
                    char novaLetra = (char)pilhaLetras.pop();
                    if(novaLetra != letra){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        return possuiSeparador && pilhaLetras.estaVazia();
    }
    
    ///Verifica se a letra é uma das letras aceitáveis
    private void validaLetra(char letra) throws LetraInvalidaException{
        if(letra != 'A' && letra != 'B' && letra != 'C'){
            throw new LetraInvalidaException();
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
