
package practical5;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;


public class Practical5 {
        
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException { 
        //getting user input
        System.out.println("Enter hash");
        Scanner scan = new Scanner(System.in);
        String hash = scan.nextLine();
                
        //character array to store alphanumeric characters in order to generate the passwords
        char[] alphaNumeric = new char[] {'0', '1', '2', '3', '4', '5','6','7','8','9','a', 'b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
                                'w', 'x', 'y', 'z'};
        
        //in order to loop through all lengths from 1 - 6
        //calling the recursive function for 6 different lengths
        //so that it loops until all combinations including 6 length ones are generated
        Practical5.allCombinations(hash, 1, alphaNumeric,"");
        Practical5.allCombinations(hash, 2, alphaNumeric,"");
        Practical5.allCombinations(hash, 3, alphaNumeric,"");
        Practical5.allCombinations(hash, 4, alphaNumeric,"");
        Practical5.allCombinations(hash, 5, alphaNumeric,"");
        Practical5.allCombinations(hash, 6, alphaNumeric,"");
    }
        
    public static void allCombinations(String hash, int passwordLength, char[] alphaNumeric, String newCombination) throws NoSuchAlgorithmException {
        
        //checking if user input hash is equal to generated strings hash
        //if we find a match, the program stops and outputs the found password
        if(hash.equals(Practical5.sha1Converter(newCombination).toLowerCase())){
            System.out.println("Heres your password: " + newCombination);
            System.exit(0);
        }
        
        else if(newCombination.length() == passwordLength) {
            System.out.println(newCombination);

        } else {
            //generating string one by one using a recursive function
            //generates string based on password length
            for(int i = 0; i < alphaNumeric.length; i++) {
                String firstCombination = newCombination;
                newCombination += alphaNumeric[i];
                allCombinations(hash,passwordLength,alphaNumeric,newCombination);
                newCombination = firstCombination;
            }
        }
    }
        //this method converts a string to sha-1 hash code
        static String sha1Converter(String input) throws NoSuchAlgorithmException {
            String sha1 = null;
                try {
                    MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
                    msdDigest.update(input.getBytes("UTF-8"));
                    sha1 = DatatypeConverter.printHexBinary(msdDigest.digest());
                
                }catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                    System.out.println(e);
                }
            return sha1;
        }
} 
