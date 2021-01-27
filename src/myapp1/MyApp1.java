/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyApp1 {

    /**
     * @param args the command line arguments
     */
    
    public static void printSquare(int [][] theSquare)
    {
        for (int )
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] magicSquare = { {0,0,0},{0,0,0},{0,0,0} };
        int theRow = 0;
        int theCol = 0;
        int theDigit = 0;
        Scanner userInput = new Scanner(System.in);
        boolean stop = false;
        
            //Main Loop
            do {
                printSquare(magicSquare);
                System.out.print("please enter the row to place the number");
                theRow = userInput.nextInt();
                System.out.print("please enter the column to place the number");
                theCol = userInput.nextInt();
                System.out.print("please enter the number");
                theDigit = userInput.nextInt();
                
                magicSquare[theRow][theCol] = theDigit;
                stop = checkSquare(magicSquare);
            }
            while (!stop);
            
        printSquare(magicSquare);
            
        }
    
    }
    
}
