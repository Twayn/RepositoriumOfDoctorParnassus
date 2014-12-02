/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;
import javaapplication6.MapPrintStream;
/**
 *
 * @author Андрей
 */
public class JavaApplication6Test {
      File file1 = new File("D:\\file2.txt");
        double x = 3.141;
        CharSequence m1 = "First Sequence";
        char a = 'Z';
        CharSequence m2 = "Second Sequence";
        String str = "Test String";
        String actuals; 
        String expected = "First SequenceZondIt's time to Test String showIt's time to Test String show in GB3.141";
        String mapExpected = "{1=Один, 2=Два, 3=Три, 4=Четыре, 5=Пять}";
        
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class JavaApplication6.
     */
    @Test
    public void printStreamTest() {
        System.out.println("PrintStreamTest");
        try {
        PrintStream stream = new PrintStream(file1);
        stream.append(m1);
        stream.append(a);
        stream.append(m2,3,6);
        stream.format("It's time to %s show", str);
        stream.format(Locale.UK, "It's time to %s show in GB" , str);
        stream.println(x);
        
	BufferedReader inp = new BufferedReader(new FileReader(file1)); 
        actuals = inp.readLine();
        System.out.println(actuals);
        System.out.println(expected);
        assertEquals(expected, actuals);
        }
        
        catch (FileNotFoundException e)
        {
         System.out.println(e);
        }
        catch (IOException e1)
        {
        System.out.println(e1);
        }
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void mapPrintStreamTest() {
        Map map = new HashMap();
        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");
        map.put(4,"Четыре");
        map.put(5,"Пять");
        try {
         MapPrintStream out = new MapPrintStream(file1);   
         out.print(map);
         BufferedReader inp = new BufferedReader(new FileReader(file1)); 
         actuals = inp.readLine();
         System.out.println("----------------------------------------");
         System.out.println(actuals);
         System.out.println(mapExpected);
         assertEquals(mapExpected, actuals);
         
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (IOException e1) {
        System.out.println(e1);
        }
        
    }
    	

    
}
