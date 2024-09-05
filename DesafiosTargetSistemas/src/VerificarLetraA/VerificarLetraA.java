
package VerificarLetraA;

import java.util.Scanner;


public class VerificarLetraA {
 
    public static int countLetterA(String input) {
        int count = 0;

        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (lowerCaseInput.charAt(i) == 'a') {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe uma string: ");
        String input = sc.nextLine();
        
        int count = countLetterA(input);
        
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        
        sc.close();
    }
}