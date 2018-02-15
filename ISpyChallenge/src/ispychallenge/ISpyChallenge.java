/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispychallenge;

/**
 *
 * @author Admin
 */
public class ISpyChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = sumOfMultiple3or5();
        System.out.println("The sum of all multiples of 3 and 5 below 10 is " + sum);
    }
    
    public static int sumOfMultiple3or5() {
        int sum = 0;
        for(int i = 1; i < 1000; i++) {
            if (checkMultiple(i)) {
                sum+=i;
            }
        }
        return sum;
    }
    
    public static boolean checkMultiple(int num) {
        if (num%3 == 0 || num%5 == 0)
            return true;
        else
            return false;
    }
}
