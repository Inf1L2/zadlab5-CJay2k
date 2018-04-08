/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Adrian Hrycaj
 */
public class z6liczba {
    private char[] charArray;
    public int[] intArray;
    Scanner scanner = new Scanner(System.in);
    
    void wprowadzLiczbe(String x, int[] intArray){
        charArray = x.toCharArray();
        intArray = new int[charArray.length];
        
        for(int i = 0; i < charArray.length; i++){
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        
        System.out.println(Arrays.toString(charArray));
        
        System.out.println(Arrays.toString(intArray));
        setIntArray(intArray);
    }

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }
    
    
    void wyswietlLiczbe(){
        /*System.out.println("Liczba to: ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i]);
        }
        */
        System.out.println(Arrays.toString(getIntArray()));
    }
}
