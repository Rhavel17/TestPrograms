/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.iteration.excersize;

/**
 *
 * @author havelr
 */
public class PalindromeMain {
    public static void main(String args[]) {
        PalindromeMethods myPalindrome = new PalindromeMethods(0,25000000);
        //System.out.printf("For Range %d to %d:\nTotal Comparison (Inefficient) = " + "%d\nTotal Comparison (Optimized) = %d\n", myPalindrome.start, myPalindrome.stop, myPalindrome.defaultPalindrome(), myPalindrome.optimizedPalindrome());
        System.out.printf("Counter (Super Duper) = %d\n", myPalindrome.superDuperOptimizedPalindrome());
        //System.out.printf("Counter (superOptimizedPalindrome) = %d\n", myPalindrome.superOptimizedPalindrome());
        //System.out.printf("Counter (optimizedPalindrome) = %d\n", myPalindrome.optimizedPalindrome());
        //System.out.printf("Counter (defaultPalindrome) = %d\n", myPalindrome.defaultPalindrome());
        
    }
}
