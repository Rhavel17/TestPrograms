/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.iteration.excersize;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author havelr
 */
public class TempWithClasses {
    public static void main(String args[]) {
        TempWithClasses2 c2 = new TempWithClasses2();
        int chosenNumber = 0;
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("-----------------------------------");
            System.out.println("|         Choose A Method         |");
            System.out.println("|        1. Format Address        |");
            System.out.println("|        2. Hex Validation        |");
            System.out.println("|        3. Diagonal Match        |");
            System.out.println("|        4. Binary  Search        |");
            System.out.println("|        5.  Swap   Sides         |");
            System.out.println("|        7.     Quit              |");
            System.out.println("-----------------------------------");

            
            
            Scanner myScanner = new Scanner(System.in);
            int caseNumber = myScanner.nextInt();

            
            switch(caseNumber) { // 1) Format Address 2) Hex Valid. 
                case 7:
                    isTrue = false;
                    break;
                case 1: 
                    //Format Address
                    System.out.println("Format Address\n");
                    String[] addressArray = {"HillsboroughNJ088441499", "OaklandCA19856", "HILLSBOROUGHNJ088441499", "New YorkNY718", "OAKLANDCA19856"};
                    System.out.println(Arrays.toString(addressArray));
                    c2.formatAddrIndustrial(addressArray);
                    System.out.println(Arrays.toString(addressArray));
                    break;
                case 2:
                    //Hex Validation
                    System.out.println("Hex Validation\n");
                    String hexValues[][] = {{"Af012", "34fgH", "1234567"},{"ghikl", "34f00", "fdeAB56k"},{"Af02k", "34fbe", "f0034AB"}};
                    String tempString = "";
                    for(int index = 0; index < hexValues.length; index++) {
                    for(int j = 0; j < hexValues[0].length; j++) {
                        tempString += String.format(" %s,", hexValues[index][j]);
                    } //End for
                    tempString += String.format("\n");
                    } //End for
                    System.out.println(tempString);
                    c2.hexValidation(hexValues);
                    break;
                case 3:
                    //Diagonal Match
                    System.out.println("Diagonal Match\n");
                    int[][] myArray = {{3,5,5,6},{3,9,4,5},{7,6,2,1},{3,4,8,7}};
                    int[][] mySecondArray = {{1,12,53,64,2},{8,23,53,2,9},{23,423,3,45,3},{2,43,789,7,4},{2,3,1,2,5}};
                    int[][] myThirdArray = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
                    System.out.println(c2.diagMatch(myArray));
                    break;
                case 4:
                    //Binary Search
                    System.out.println("Binary Search\n");
                    int[] intArray = new int[50000000]; //5,000,000
                    for(int index = 0; index < intArray.length; index++) {
                        intArray[index] = index;
                    } //End for
                    int output = c2.binarySearch(intArray, 4999999);
                    System.out.println("Index = " + output);
                    break;
                case 5:
                    //Swap Sides
                    int[] anArray = {12,15,18,100,45,34,32,18,5,12};
                    int[] anArray2 = {1,2,3,4,5,6,7};
                    int[] anArray3 = {1};
                    int[] anArray4 = {10,11,12,13,14,15,16,17,9,1,2,3,4,5,6,7,8};
                    int[] anArray5 = {1,2,3,4,5,6,7,8,9,10};
                    System.out.println(Arrays.toString(anArray5));
                    c2.SwapSides(anArray5);
                    System.out.println(Arrays.toString(anArray5));
                    break;
            } //End switch
            
        } //End while loop
    } //End method main
} //End class TempWithClasses
