import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    
    Picture arch = new Picture("arch.jpg");
    arch.show();
	//Uncomment the following code to test the zeroBlue method.
	
    arch.zeroBlue(); 
    arch.show();
	

    //Uncomment the following code to test your keepOnlyBlue method.
    /*
    Picture arch2 = new Picture("arch.jpg");
    System.out.println("Keep only blue: ");
    arch2.keepOnlyBlue();// using new method
    arch2.show();
    */

    //Uncomment the following code to test your switchColors method.
    /*
    Picture arch3 = new Picture("arch.jpg");
    System.out.println("Switch colors: ");
    arch3.switchColors();// using new method
    arch3.show();
	*/
	//Uncomment the following code to test your negate method.
    /*
    Picture arch4 = new Picture("arch.jpg");
    System.out.println("Negate colors: ");
    arch4.negate();// using new method
    arch4.show();
    */
	//Uncomment the following code to test your grayscale method.
    /*
    Picture arch5 = new Picture("arch.jpg");
    System.out.println("Grayscale colors: ");
    arch5.grayscale();// using new method
    arch5.show();
	*/
	//Uncomment the following code to test your mirrorVertical method.
    /*
    Picture arch6 = new Picture("arch.jpg");
    System.out.println("Mirror Vertical: ");
    arch6.mirrorVertical();// using new method
    arch6.show();	
*/
	//Uncomment the following code to test your mirrorVerticalRightToLeft method.
    /*
    Picture arch7 = new Picture("arch.jpg");
    System.out.println("Mirror Vertical Right to Left: ");
    arch7.mirrorVerticalRightToLeft();// using new method
    arch7.show();	
*/
	//Uncomment the following code to test your mirrorHorizontal method.
    /*
    Picture arch8 = new Picture("arch.jpg");
    System.out.println("Mirror Horizontal: ");
    arch8.mirrorHorizontal();// using new method
    arch8.show();
*/
	//Uncomment the following code to test your mirrorHorizontal method.
    /*
    Picture arch9 = new Picture("arch.jpg");
    System.out.println("Mirror Horizontal: ");
    arch9.mirrorHorizontalBotToTop();// using new method
    arch9.show();	
	*/
	
	//Uncomment the following code to test your mirrorDiagonal method.
    // Challenge: Create a method that create a mirror image diagnoally across the image
	/*
    Picture arch10 = new Picture("arch.jpg");
    System.out.println("Mirror Diagnoal: ");
    arch10.mirrorDiagonal();// using new method
    arch10.show();	
	*/
	

      }
} 
