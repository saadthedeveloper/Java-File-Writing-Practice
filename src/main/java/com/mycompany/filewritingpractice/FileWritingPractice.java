/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filewritingpractice;
import java.io.*;
import java.util.Scanner;

public class FileWritingPractice {

    public static void main(String[] args) throws IOException 
    {
        Scanner keyboard = new Scanner(System.in);
        
        String nameOfFriends;
        int numberOfFriends;
        String fileName;
        
        System.out.println("Enter the number of friends: ");
        numberOfFriends = keyboard.nextInt();
        
        keyboard.nextLine();
                
        
        System.out.println("Enter the file name: ");
        fileName = keyboard.nextLine();
         
        PrintWriter outputFile = new PrintWriter(fileName);
        
        for(int i = 1; i <= numberOfFriends; i++)
        {
            System.out.println("Enter the name of friend" + i + " : ");
            nameOfFriends = keyboard.nextLine();
            
            outputFile.println(nameOfFriends);
            
        }
       
       outputFile.close();
       System.out.println("Data written to the file.");
        
    }
}
