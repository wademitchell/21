/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robandwade.cit260.twentyone.exceptions;

/**
 *
 * @author RFord
 */
public class PlayerException extends Exception {


    public PlayerException() {
    }

    
    public PlayerException(String msg) {
        super(msg);
    }
    public PlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerException(Throwable cause) {
        super(cause);
    }    
}
