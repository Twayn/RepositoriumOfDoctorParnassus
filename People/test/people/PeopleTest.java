/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import exception.WrongAgeValueException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import person.Person;

/**
 *
 * @author Андрей
 */
public class PeopleTest {
    
    public int PeopleTest(int a) {
        if ((a>=21)&&(a<120)) return 1;
        else
        return 0;   
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test (expected = WrongAgeValueException.class)
    public void ageTest1() throws WrongAgeValueException {
        System.out.println("Person test (Age<21)");
       
        Person FirstPeople = new Person("Dan", 31);
        Person SecondPeople = new Person("Helen", 41);
        Person ThirdPeople = new Person("Bess", 18);

        //fail("The test case is a prototype.");
    }
    
      @Test (expected = WrongAgeValueException.class)
      public void ageTest2() throws WrongAgeValueException {
        System.out.println("Person test (Age>120)");
       
        Person FirstPeople = new Person("Buck", 125);
        Person SecondPeople = new Person("Sandra", 41);
        Person ThirdPeople = new Person("Kevin", 49);
       
        //fail("The test case is a prototype.");
    }
      
        @Test 
        public void ageTest3() throws WrongAgeValueException {
        System.out.println("Person test (Correct age)");
       
        Person FirstPeople = new Person("Joe", 28);
        Person SecondPeople = new Person("L'il Bil", 41);
        Person ThirdPeople = new Person("Brandon", 49);
        Person FourthPeople = new Person("Sasha", 61);
        Person FifthPeople = new Person("Bob", 90);
        Person SixthPeople = new Person("Abigail", 55);
        
        //fail("The test case is a prototype.");
    }
    
}
