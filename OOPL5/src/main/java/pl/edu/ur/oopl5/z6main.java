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
public class z6main {
    public static void main(String[] args) {
        int c;
        String x;
    
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("---------------------------------"); 
            System.out.println("MENU");
            System.out.println("1. Wprowadź liczbę");
            System.out.println("2. Wyświetl wyświetl liczbę");
            System.out.println("3. xd");
            System.out.println("0. Wyjdź");
            System.out.print("Co chcesz zrobić?: ");
            c=scanner.nextInt();
            z6liczba liczba = new z6liczba();
            switch (c) {
                case 1:                    
                    System.out.print("Podaj liczbe: ");
                    x = scanner.next();
                    liczba.wprowadzLiczbe(x, liczba.intArray);
                break;

                case 2:
                    /* if(y!=null){
                        liczba.wyswietlLiczbe(liczba.intArray);
                    }
                    else{
                        System.out.println("Brak liczby do wyswietlenia");
                    }
                    
                    */
                    
                    liczba.wyswietlLiczbe();
                    
                break;

                case 3:
                    System.out.println("");
                break;
                
                case 0:
                    System.out.println("Pa");
                break;
                
                default:
                    System.out.println("Wybrano złą opcję");
            }   
        }while(c!=0); 
    }
}
