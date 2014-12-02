/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;



/**
 *
 * @author Андрей
 */
public class PrintStreamTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file1 = new File("D:\\file1.txt");
        double x = 3.141;
        CharSequence m1 = "First Sequence";
        char a = 'Z';
        CharSequence m2 = "Second Sequence";
        String str = "Test String";
        
        try
        {
        PrintStream stream = new PrintStream(file1);
        stream.append(m1);
        stream.append(a);
        stream.append(m2,3,6);
        stream.format("It's time to %s show", str);
        stream.format(Locale.UK, "It's time to %s show in GB" , str);
        stream.println(x);
        //String s; 
	//BufferedReader inp = new BufferedReader(new FileReader(file1)); 
        // s = inp.readLine();
        //System.out.println(s);
		
        
       
      
        }
        catch (FileNotFoundException e){
        System.out.println(e);
        }   
        //catch (IOException e1)
        //{
        //System.out.println(e1);
        //}
    }
    
}
