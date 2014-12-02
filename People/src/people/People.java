/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;
import person.Person;
import exception.WrongAgeValueException;


/**
 *
 * @author Андрей
 */
public class People {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Person FirstPeople = new Person("Poul", 31);
        Person SecondPeople = new Person("Harisson", 41);
        Person ThirdPeople = new Person("Vanessa", 21);
        //ThirdPeople.showData();
        }
        catch (WrongAgeValueException e) {
            System.out.println("Gotcha! " +e.getMessage());
        }
    }
    
}
