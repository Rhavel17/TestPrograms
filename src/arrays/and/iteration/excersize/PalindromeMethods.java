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
public class PalindromeMethods {
    int start;
    int stop;
    int origStart;
    public PalindromeMethods(int n, int m) {
        origStart = n;
        start = origStart;
        stop = m;
    } //End of constructor
    public PalindromeMethods() {
        origStart = 0;
        start = origStart;
        stop = 5000;
    } //End of constructor
    public int defaultPalindrome() {
        String n1;
        boolean m = true;
        int counter = 0;
        
        while (start <= stop) {
            m = true;
            n1 = Integer.toString(start);
            for(int i = 0; i < n1.length(); i++) {
                if(n1.charAt(i) != n1.charAt(n1.length()-i-1)) {
                    m = false;
                    i = n1.length();
                } //End of if
                counter++;
            } //End of for
            
            /*
            if(m) 
                System.out.println(n1);
            */
            start++;
        } //End of while
        start = origStart;
        return counter;
    } //End of method
    
    public int optimizedPalindrome() {
        boolean m = true;
        int counter = 0;
        String n1;
        
        while (start <= stop) {
            m = true;
            n1 = Integer.toString(start);
            for(int i = 0; i < (n1.length()/2); i++) {
                if(n1.charAt(i) != n1.charAt(n1.length()-i-1)) {
                    m = false;
                    i = n1.length();
                } //End of if
                counter++;

            } //End of for
            /*
            if(m) 
                System.out.println(n1);
            */
            start++;
        } //End of while
        start = origStart;
        return counter;
    } //End of method
    public int superOptimizedPalindrome() {
        int counter = 0;
        String n1;
        String reverse;
        String newN1;
        String newN2;
        while (start <= stop) {

            n1 = Integer.toString(start);
            if(n1.length() % 2 != 0) {
                newN1 = n1.substring(0, (n1.length()/2));
                newN2 = n1.substring(((n1.length()/2) + 1),n1.length());
                reverse = new StringBuilder(newN2).reverse().toString();
            } //End of if
            else {
                newN1 = n1.substring(0, (n1.length()/2));
                newN2 = n1.substring(n1.length()/2, n1.length());
                reverse = new StringBuilder(newN2).reverse().toString();
            } //End of else
           if(newN1.equals(reverse)) {
               //System.out.println(n1);
           } //End of if
           counter++;
           start++;
        } //End of while
        start = origStart;
        return counter;
    } //End of method
   public int superDuperOptimizedPalindrome() {
       String n1;
       String n2;
       int counter = 0;
       while(start <= stop) {
           n1 = Integer.toString(start);
           n2 = new StringBuilder(n1).reverse().toString();
           if(n1.equals(n2)) {
               //System.out.println(start);
           } //End of if
           start++;
           counter++;
       } //End of method
       start = origStart;
       return counter;
   } //End of method
} //End of class
