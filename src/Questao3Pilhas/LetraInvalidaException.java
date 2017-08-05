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
public class LetraInvalidaException extends Exception {

    /**
     * Creates a new instance of <code>LetraInvaidaException</code> without
     * detail message.
     */
    public LetraInvalidaException() {
        super("Letra inválida!");
    }

    /**
     * Constructs an instance of <code>LetraInvaidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LetraInvalidaException(String msg) {
        super(msg);
    }
}
