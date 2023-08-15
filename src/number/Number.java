/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Udit
 */
public class Number {

    /**
     * @param args the command line arguments
     */
       public void guess()
    {
        Scanner ob= new Scanner(System.in);
        String play ="Yes";
        while (play.equals("Yes"))
        {
            JFrame f = new JFrame();
            Random ran = new Random();
            int num=ran.nextInt(100);
            int guess = -1;
            int tries =0;
            while(guess!=num)
            {
               String s1 = JOptionPane.showInputDialog("Guess a number between 1 to 100" );
               guess = Integer.parseInt(s1);
               tries++;
            if(guess==num)
            {
                 int a=JOptionPane.showConfirmDialog(f,"Awesome! You Guessed the correct number \n It only took you "+tries+" guesses \n Would You like to play again?");  
                 if(a==JOptionPane.YES_OPTION)
                     play="Yes";
                 else
                     play="No";
            }
            else if(guess>num)
            {
                JOptionPane.showMessageDialog(f,"Your Guess is too High, try Again");
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(f,"Your Guess is too Low, try Again");
                
            }
            }
            
        }
        
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        Number ob = new Number();
        ob.guess();
    }
    
}
