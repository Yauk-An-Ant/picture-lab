package picture;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods //////////////////////////////////////
     
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setBlue(0);
       }
    }
  }  

  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();

    for (Pixel[] rowArray : pixels)
     {
       for (Pixel p: rowArray)
       {
              p.setRed(0);
              p.setGreen(0);
       }
    }
  } 

  public void SwitchColors() {
    Pixel[][] pixels = this.getPixels2D();

    for(Pixel[] rowArray : pixels) {
      for(Pixel p: rowArray) {
        p.setRed(p.getGreen());
        p.setGreen(p.getRed());
        p.setBlue(p.getRed());
      }
    }
  }

  public void Negate() {
    Pixel[][] pixels = this.getPixels2D();

    for(Pixel[] rowArray : pixels) {
      for(Pixel p: rowArray) {
        p.setRed(255 - p.getRed());
        p.setGreen(255 - p.getGreen());
        p.setBlue(255 - p.getBlue());
      }
    }
  }

  public void Grayscale() {
    Pixel[][] pixels = this.getPixels2D();

    for(Pixel[] rowArray : pixels) {
      for(Pixel p: rowArray) {
        int avg = (int)((p.getRed() + p.getGreen() + p.getBlue())/3);
        p.setRed(avg);
        p.setGreen(avg);
        p.setBlue(avg);
      }
    }
  }
 
  public void mirrorVertical() {
      Pixel[][] pixels = this.getPixels2D();
    
      for(int i = 0; i < pixels.length/2; i++) {
        for(int j = 0; j < pixels[i].length; j++) {
          pixels[i][j].setRed(pixels[pixels.length-i][j].getRed());
          pixels[i][j].setGreen(pixels[pixels.length-i][j].getGreen());
          pixels[i][j].setBlue(pixels[pixels.length-i][j].getBlue());
        }
      }
  }

  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
  
    for(int i = 0; i < pixels.length; i++) {
      for(int j = 0; j < pixels[i].length/2; j++) {
        pixels[i][j].setRed(pixels[i][pixels[i].length-j].getRed());
        pixels[i][j].setGreen(pixels[i][pixels[i].length-j].getGreen());
        pixels[i][j].setBlue(pixels[i][pixels[i].length-j].getBlue());
      }
    }
}

  
} // this } is the end of class Picture, put all new methods before this
 