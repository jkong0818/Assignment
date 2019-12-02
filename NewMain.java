/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import static com.mycompany.assignment1.ConsecutivesString.ConsecutivesString;
import java.util.Scanner;

/**
 *
 * @author jkong
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Please enter a string: ");
        String input = in.nextLine();
        
        int s = ConsecutivesString(input);
        
        System.out.println("Given S=" + input + ", the function should return " + s);

    }
    
}
