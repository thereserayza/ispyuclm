/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge_2;

import java.io.*;
/**
 *
 * @author Admin
 */
public class ISpyChallenge_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Word: ");
        String line = input.readLine();
        String line2 = line.replaceAll("\\s", "");
        String line3 = line2.replaceAll(",", "");
        String line4 = line3.toLowerCase();
        if (palindrome(line4)) {
            System.out.println(line + " is a palindrome");
        } else {
            System.out.println(line + " is not a palindrome");
        }
    }
    
    public static boolean palindrome(String word){
        char[] reverse = word.toCharArray();
        boolean flag = false;
        for (int i = 0; i < word.length()/2; i++) {
            if (reverse[i] == reverse[word.length()-1-i]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}
