/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import exception.WrongAgeValueException;
/**
 *
 * @author Андрей
 */
public class Person {
    private Integer age;
    private String name;
    
    public Person (){
    }
    public Person (String name, Integer age) throws WrongAgeValueException  {
       setAge(age);
       setName(name);    
    }
    
    public void setAge (Integer age) throws WrongAgeValueException {
                if ((age>=21)&&(age<120)){
                this.age = age;
                }
                    else {
                    throw new WrongAgeValueException("Age must be between 21 and 120 years");  
                    }
 
    }
  
    public void showData ()
    {
        System.out.println("Имя: " +name);
        System.out.println("Возраст: " +age);
    }
    
    public int getAge () {
        return this.age;
    }
      public void setName (String name) {
        this.name = name;
    }
}
