/*
 *
 */
package com.ricardopessi.projecteulerjava.problems;

import java.util.Arrays;

/**
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * Easy enough.
 * FINAL TIME: 0.536 s
 * @author Ricardo
 */
public class Problem001 {
    
    public static void problem001 () {
        
        //First, we create an array with numbers until 1000
        int[] array = new int[1001];
        
        //Fill it with 0s
        Arrays.fill(array,0);
        
        //Check the 3s and 5s
        for ( int i = 1 ; i < 1000 ; i++ ) {
            if ( i % 3 == 0 ) array[i] = 1;
            if ( i % 5 == 0 ) array[i] = 1;
        }
        
        //Sum it up
        int total = 0;
        for ( int i = 1 ; i < 1000 ; i++ ) 
            if ( array[i] == 1 ) total += i;
        
        //Finally, print
        System.out.println(total);
        
    }
    
}
