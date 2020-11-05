package foursyndromes;

import java.util.Scanner;


public class FourSyndromes {

    
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        String number = scan.next();
        
        int count = number.length();
        
        if(count == 10){
            int d1 = number.charAt(0) - '0';
            int d2 = number.charAt(1) - '0';
            int d3 = number.charAt(2) - '0';
            int d4 = number.charAt(3) - '0';
            int d5 = number.charAt(4) - '0';
            int d6 = number.charAt(5) - '0';
            int d7 = number.charAt(6) - '0';
            int d8 = number.charAt(7) - '0';
            int d9 = number.charAt(8) - '0';
            int d10 = number.charAt(9) - '0';
            
            int s1 = (d1+d2+d3+d4+d5+d6+d7+d8+d9+d10) % 11;
            int s2 = (d1+2*d2+3*d3+4*d4+5*d5+6*d6+7*d7+8*d8+9*d9+10*d10) % 11;
            int s3 = (d1+4*d2+9*d3+5*d4+3*d5+3*d6+5*d7+9*d8+4*d9+d10) % 11;
            int s4 = (d1+8*d2+5*d3+9*d4+4*d5+7*d6+2*d7+6*d8+3*d9+10*d10) % 11;
            
            System.out.print(s1);
            System.out.print(s2);
            System.out.print(s3);
            System.out.print(s4);   
        }
        else{
            System.out.println("10 digits only");
        }
    }
}
