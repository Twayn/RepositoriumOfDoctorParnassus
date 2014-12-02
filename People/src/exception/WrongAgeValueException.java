/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Андрей
 */
public class WrongAgeValueException extends Exception {
    
  public WrongAgeValueException() {}
  public WrongAgeValueException(String msg) {
    super(msg);
  }
}
    

