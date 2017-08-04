/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Pilhas;

/**
 *
 * @author Barbara
 */
public class LetraInvaidaException extends Exception {

    /**
     * Creates a new instance of <code>LetraInvaidaException</code> without
     * detail message.
     */
    public LetraInvaidaException() {
        super("Letra inválida!");
    }

    /**
     * Constructs an instance of <code>LetraInvaidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public LetraInvaidaException(String msg) {
        super(msg);
    }
}
