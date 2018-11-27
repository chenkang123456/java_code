/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaytime.java;

import java.util.Scanner;
public class DisplayTimeJava {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");
        int seconds=input.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds+" seconds is "+ minutes + " minutes and " + remainingSeconds+" seconds ");
    }
    
}
