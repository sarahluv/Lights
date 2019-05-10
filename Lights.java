/*******************************************************************************
Name: Sarah Redmon
Date: 2/13/19
Instructor: Ms. Tucker
Class: Lights
Purpose: To simulate a Simon Lights experience
*******************************************************************************
*/
import javax.swing.JFrame;
import javax.swing.*;

public class Lights
{
   public static void main (String[] args) {
      /*------------------------------------------------------------------------------
      Creates and displays the GUI of the program
      ------------------------------------------------------------------------------
      */
      JFrame frame = new JFrame ("Lights");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new LightsPanel());

      frame.pack();
      frame.setVisible(true);
    }
}