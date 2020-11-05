/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingdigits;

import java.util.Scanner;

public class CheckingDigits {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a 6 digit number");
        String number = scan.next();
        
        int count = number.length();
        
        if(count == 6){
            int d1 = number.charAt(0) - '0';
            int d2 = number.charAt(1) - '0';
            int d3 = number.charAt(2) - '0';
            int d4 = number.charAt(3) - '0';
            int d5 = number.charAt(4) - '0';
            int d6 = number.charAt(5) - '0';
            
            int d7 = (4*d1+10*d2+9*d3+2*d4+d5+7*d6) % 11;
            int d8 = (7*d1+8*d2+7*d3+d4+9*d5+6*d6) % 11;
            int d9 = (9*d1+d2+7*d3+8*d4+7*d5+7*d6) % 11;
            int d10 = (d1+2*d2+9*d3+10*d4+4*d5+d6) % 11;
            
            if(d7 == 10 || d8 == 10 || d9 == 10 || d10 == 10){
                System.out.println("Unusable number");
            }
            else{
                System.out.print(d1);
                System.out.print(d2);
                System.out.print(d3);
                System.out.print(d4);
                System.out.print(d5);
                System.out.print(d6);
                System.out.print(d7);
                System.out.print(d8);
                System.out.print(d9);
                System.out.print(d10);
                System.out.println();
            } 
        }
        else{
            System.out.println("6 digits only");
        }
    }
}
