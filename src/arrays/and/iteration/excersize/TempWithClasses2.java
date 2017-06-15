/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.iteration.excersize;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Character;

/**
 *
 * @author havelr
 */
public class TempWithClasses2 {
    int a1[] = {2,3,4,5};
//    public TempWithClasses2(int m) {
//    int a1[] = {2,3,4,5};
//    for (int i = 0; i < a1.length; i++) {
//        a1[i] *= m;
//    } //End of for
//    } //End of constructor
    
    public void updt(int m) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] *= m;
        } //End of for
    } //End of method updt
    
    public String toString() {
        String msg = " The instance variable a1 contains ";
        msg += Arrays.toString(a1);
        return msg;
    } //End of method toString
    public void formatAddr(String[] myArray) {
        for(int index = 0; index < myArray.length; index++) {
            StringBuffer tempString = new StringBuffer(myArray[index]);
            int zipLength = 0;
            int originalLength = tempString.length();
            int ifCounter = 0;
            for(int i = 0; i+1 < originalLength; i++) {
                if(ifCounter == 0 & (int) tempString.charAt(i) < 91 & (int) tempString.charAt(i) >= 65 & (int) tempString.charAt(i+1) < 91 & (int) tempString.charAt(i+1) >= 65) {
                    tempString.insert(i+2, " ");
                    tempString.insert(i, " ");
                    tempString.insert(i, ",");
                    zipLength = tempString.length() - 3 - (i+2);
                    ifCounter += 1;
                } //End if
            } //End for
            if(zipLength == 5) {
                tempString.insert((tempString.length() - 5), "-");
            } //End if
            if(zipLength == 9) {
                tempString.insert((tempString.length() - 4), "-");
            } //End if
            myArray[index] = tempString.toString();
        } //End for
    } //End formatAddr 
    public int binarySearch(int[] myArray, int desiredValue) {
        int index = 0;
        int counter = 0;
        int[] tempArray = Arrays.copyOfRange(myArray, 0, myArray.length);
        //System.out.printf("desiredValue = %d\n", desiredValue);
        if(desiredValue == tempArray[tempArray.length/2])
            index = myArray.length/2;
        else {
            
            while(tempArray.length >= 2) {
                //System.out.printf("index = %d\n", index);
                //System.out.printf("tempArray = %s\n", Arrays.toString(tempArray));
                counter += 1;
                if(desiredValue <= tempArray[tempArray.length/2 -1]) {
                    tempArray = Arrays.copyOfRange(tempArray, 0, tempArray.length/2);
                    //System.out.printf("Changed tempArray = %s\n\n", Arrays.toString(tempArray));
                } //End nested if statement within while
                //if(desiredValue > tempArray[tempArray.length/2 - 1]) {
                else {
                    index += tempArray.length/2;
                    tempArray = Arrays.copyOfRange(tempArray, tempArray.length/2, tempArray.length);
                    //System.out.printf("Changed index = %d\n", index);
                    //System.out.printf("Changed tempArray = %s\n\n", Arrays.toString(tempArray));
                } //End nested else statement within while
            } //End nested while statement           
        } //End else statement within else statement
        
        if(desiredValue != tempArray[0])
                index = -1;
        //System.out.printf("Counter = %d\n", counter);      //Prints out counter
        return index;
    } //End binarySearch 
    public void SwapSides(int[] myArray) {
        if(myArray.length%2==0) {
            int tempElement;
            tempElement = myArray[myArray.length/2-1];
            myArray[myArray.length/2-1] = myArray[myArray.length/2];
            myArray[myArray.length/2] = tempElement;
        } //End tempif
            //for(int i = 0, j = myArray.length/2 + 1; j < myArray.length; i++, j++) {
              //  tempElement = myArray[i];
                //myArray[i] = myArray[j];
                //myArray[j] = tempElement;
            //} //End for
        //} //End if
        //else {
            int tempElement;
            for(int i = 0, j = myArray.length/2 + 1; j < myArray.length; i++, j++) {
                tempElement = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = tempElement;
            } //End for
        //} //End else
    } //End SwapSides
    public void formatAddrIndustrial(String[] myArray) {
        for(int index = 0; index < myArray.length; index++) {
            StringBuffer tempString = new StringBuffer(myArray[index]);
            int zipLength = 0;
            int ifCounter = 0;
            for(int i = tempString.length()-1; i > 0; i--) {
                if((int) tempString.charAt(i)> 47 & (int) tempString.charAt(i) < 58) {
                    zipLength += 1;
                } //End if
                if(ifCounter == 0 & Character.isUpperCase(tempString.charAt(i)) & Character.isUpperCase(tempString.charAt(i-1))) {
                    ifCounter += 1;
                    tempString.insert(i+1," ");
                    tempString.insert(i-1," ");
                    tempString.insert(i-1,",");
                } //End if
            } //End nested for
            if(zipLength == 9) {
                tempString.insert((tempString.length() - 4), "-");
            } //End if
            myArray[index] = tempString.toString();
        } //End for
    } //End formatAddrIndustrial
    public String[] hexValidation(String[][]  myArray) {
        ArrayList<String> elementLocation = new ArrayList<String>();
        String keyString = " 0 1 2 3 4 5 6 7 8 9 A B C D E F a b c d e f ";
        String tempString;
        String outputString = "";
        for(int colIndex = 0; colIndex < myArray.length; colIndex++) {

            for(int rowIndex = 0; rowIndex < myArray[colIndex].length; rowIndex++) {
                boolean isCorrect = false;
                for(int index = 0; index < myArray[colIndex][rowIndex].length(); index++) { 
                    CharSequence myChar = " " + myArray[colIndex][rowIndex].charAt(index) + " "; //swapped row and col
                    if(!keyString.contains(myChar)) {
                        isCorrect = true;
                    } //End if
                } //End nested for
                if(isCorrect) {
                    tempString = "["+ colIndex + "," + rowIndex + "]";
                    elementLocation.add(tempString);
                    outputString += String.format("Ïnvalid Hex Value %s in Row %d Col %d\n", myArray[colIndex][rowIndex], colIndex, rowIndex);
                } //End nested if
            } //End rowIndex for
        } //End colIndex for
        Object[] finalArray = elementLocation.toArray();
        String[] finalStringArray = Arrays.copyOf(finalArray, finalArray.length, String[].class);
        System.out.println(outputString);
        return finalStringArray;
    } //End hexValidation
    public String diagMatch(int[][] myArray) {
        String finalString = "";
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int[] rowSums = new int[myArray.length];
        int[] colSums = new int[myArray[0].length]; //Works for all cols b/c its a square array
        int tempRowSum = 0;
        int tempColSum = 0;
        boolean hasMatch = false;
        for(int index = 0; index < myArray.length; index++) {   //Outputs String of 2d Array
            for(int j = 0; j < myArray[0].length; j++) {
                finalString += String.format("%4s,", myArray[index][j]);
            } //End for
            finalString += String.format("\n");
            
        } //End for
        for(int i = 0, j = myArray.length-1; j >= 0 & i < myArray.length; i++, j--) {
            leftDiagonal += myArray[i][i];
            rightDiagonal += myArray[i][j];
        } //End leftDiagonal and righDiagonal for
        for(int index = 0; index < myArray.length; index++) {
            tempRowSum = 0;
            tempColSum = 0;
            for(int j = 0; j < myArray[0].length; j++) {
                tempRowSum += myArray[index][j];
                tempColSum += myArray[j][index];
            } //End nested for
            colSums[index] = tempColSum;
            rowSums[index] = tempRowSum;
//            if(leftDiagonal == tempRowSum) {
//                finalString += String.format("\nleftDiagonal equals Row %d = %d", index + 1, tempRowSum);
//            } //End nested if
//            if(rightDiagonal == tempRowSum) {
//                finalString += String.format("\nrightDiagonal equals Row %d = %d", index + 1, tempRowSum);
//            } //End nested if
//            if(leftDiagonal == tempColSum) {
//                finalString += String.format("\nleftDiagonal equals Col %d = %d", index + 1, tempColSum);
//            } //End nested if
//            if(rightDiagonal == tempColSum) {
//                finalString += String.format("\nrightDiagonal equals Col %d = %d", index + 1, tempColSum);
//            } //End nested if
        } //End for
        for(int index = 0; index < rowSums.length; index++) {  //Don't need to check for length of colSums since they are same length
            if(leftDiagonal == rowSums[index]) {
                finalString += String.format("leftDiagonal equals Row %d = %d\n", index + 1, rowSums[index]);
                hasMatch = true;
            } //End leftDiag if
            if(rightDiagonal == rowSums[index]) {
                finalString += String.format("rightDiagonal equals Row %d = %d\n", index + 1, rowSums[index]);
                hasMatch = true;
            } //End rightDiag if
            
            
        } //End for
        for(int index = 0; index < colSums.length; index++) {
            if(leftDiagonal == colSums[index]) {
                finalString += String.format("leftDiagonal equals Col %d = %d\n", index + 1, colSums[index]);
                hasMatch = true;
            } //End leftDiag if
            if(rightDiagonal == colSums[index]) {
                finalString += String.format("rightDiagonal equals Col %d = %d\n", index + 1, colSums[index]);
                hasMatch = true;
            } //End rightDiag if
        } //End for
        if(!hasMatch) {
            finalString += String.format("No Matches Found:\n");
            finalString += String.format("Left Diagonal Sum = %d\n", leftDiagonal);
            finalString += String.format("Right Diagonal Sum = %d\n", rightDiagonal);
        } //End if
        for(int index = 0; index < rowSums.length & !hasMatch; index++) {
            finalString += String.format("Row %d Sum = %d\n", index + 1, rowSums[index]);
        } //End for
        for(int index = 0; index < colSums.length & !hasMatch; index++) {
            finalString += String.format("Col %d Sum = %d\n", index + 1, colSums[index]);
        } //End for
        return finalString;
    } //End diagMatch
    public int giveExample(int myNumber) {
        if(myNumber == 17)
            return 0;
        return -1;
    } //End giveExample
} //End class TempWithClasses2
