/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;

import java.util.*; 
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import com.mycompany.maven.Resizing;

/**
 *
 * @author РђРЅРґСЂРµР№
 */
public class imgResize {
    public static void main(String[] args) {
    int width;
    int height;
    String input;
    String output;
    Scanner sc = new Scanner(System.in);
    
    System.out.println ("This is a programm for resizing images");
    System.out.println ("Write path to source file (Example 'D:\\\\image.jpg')");
    input = sc.nextLine();
    System.out.println ("Write path to new file (Example 'D:\\\\resized.png')");
    output = sc.nextLine();
    System.out.println ("Input width of new image");
    width = sc.nextInt();
    System.out.println ("Input width of new image");
    height = sc.nextInt();
      
      
      BufferedImage img = null;
      try {
      img = ImageIO.read(new File(input));
      Resizing r1 = new Resizing(img, width, height);
      img = r1.Resize();
      File outputfile = new File(output);
      ImageIO.write(img, "png", outputfile);
      } 
      catch (IOException e) {
       System.out.println(e);
      }
      
    
    }
}
