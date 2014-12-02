/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Map;

/**
 *
 * @author Андрей
 */


public class MapPrintStream extends PrintStream   {
    MapPrintStream(File os) throws FileNotFoundException
    {
        super(os);
    }
    
    public void print(Map map){
        super.print(map);
    }
}
    
    

