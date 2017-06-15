/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.iteration.excersize;
import java.util.Arrays;

/**
 *
 * @author havelr
 */
public class ArraysAndIterationExcersize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int nbrs[] = {64, 49,33,18,7,2};

    int rslt[] = new int[(nbrs.length)];

    int sum = 0;

    for (int i = 0; i <= nbrs.length-2;i++)

    {

        rslt[i] = nbrs[i]%nbrs[i+1];

        sum = sum + nbrs[i+1];

        if (i==nbrs.length-2)

            rslt[i+1] = sum;

    }

    System.out.println(Arrays.toString(rslt));
    

    int nbrs2[] = {64, 49,33,18,7,2};

    int rslt2[] = new int[(nbrs.length)];

    int sum2 = 0;

for (int i = 0; i <= nbrs2.length-2;i++)

{

rslt2[i] = nbrs2[i]%nbrs2[i+1];

sum2 = sum2 + nbrs[i+1];

if (i==nbrs2.length-1)

    rslt2[i+1] = sum2;

}

 System.out.println(Arrays.toString(rslt2));

    }
}
