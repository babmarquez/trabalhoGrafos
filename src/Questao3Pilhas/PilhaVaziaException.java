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
public class PilhaVaziaException extends RuntimeException
{
    public PilhaVaziaException() {
        
    }

    public PilhaVaziaException(String message) {
        super(message);
    }
}