/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 *
 * @author Андрей
 */
public class Resizing {
    private BufferedImage img;
    private int width;
    private int height;
    
    public Resizing (BufferedImage img, int width, int height){
    this.height = height;
    this.width = width;
    this.img = img;
    }
    public BufferedImage Resize () {
    BufferedImage thumbnail =
    Scalr.resize(img, Scalr.Method.SPEED, Scalr.Mode.FIT_EXACT, width, height, Scalr.OP_ANTIALIAS);
    return thumbnail;
    }
  
    
}
