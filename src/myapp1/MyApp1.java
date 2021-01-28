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
        for (int row = 0; row <3 ; row++)
        {
               for (int col = 0; col <3 ; col++)
                {
                    System.out.print(theSquare[row][col] + " ");
                }
                    System.out.println();
                                
        }
    }
    public static boolean checkRows(int [][] theSquare){
        var row1 = theSquare[0][0] + theSquare[0][1] + theSquare[0][2];
        var row2 = theSquare[1][0] + theSquare[1][1] + theSquare[1][2];
        var row3 = theSquare[2][0] + theSquare[2][1] + theSquare[2][2];
        
        if(row1 == 15 && row2 == 15 && row3 == 15)
            
        {
            return true;
        }
            else;
        {
            return false;
        }
    }        
  
    public static boolean checkCols(int [][] theSquare){
        var col1 = theSquare[0][0] + theSquare[0][1] + theSquare[0][2];
        var col2 = theSquare[1][0] + theSquare[1][1] + theSquare[1][2];
        var col3 = theSquare[2][0] + theSquare[2][1] + theSquare[2][2];
        
        if(col1 == 15 && col2 == 15 && col3 == 15)
            
        {
            return true;
        }
            else;
        {
            return false;
        }
    }        
    
    public static boolean checkDiags(int [][] theSquare){
        var diag1 = theSquare[0][0] + theSquare[1][1] + theSquare[2][2];
        var diag2 = theSquare[0][2] + theSquare[1][1] + theSquare[2][0];

        
        if(diag1 == 15 && diag2 == 15)
            
        {
            return true;
        }
            else;
        {
            return false;
        }
    } 
    
    public static boolean checkSquare(int [][] theSquare){
           
        if(checkRows(theSquare) && checkCols(theSquare) && checkDiags(theSquare))
        {
            System.out.println("Well done! This is a Magic Square!");
        }
        else
        {
            System.out.println("Getting there but not quite a Magic Square")
        }
            
    }
    
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
    

