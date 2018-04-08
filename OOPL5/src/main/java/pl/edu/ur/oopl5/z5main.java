/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Adrian Hrycaj
 */
public class z5main {
    public static void main(String[] args) {
        int c,i=0;
        z5firma firma = new z5firma();
        Scanner scanner = new Scanner(System.in);
        do{
            String[][] x = firma.dane;
            System.out.println("---------------------------------"); 
            System.out.println("MENU");
            System.out.println("1. Wprowadź pracowników");
            System.out.println("2. Wyświetl pracowników");
            System.out.println("0. Wyjdź");
            System.out.print("Co chcesz zrobić?: ");
            c=scanner.nextInt();

            switch (c) {
                case 1:                    
                    firma.dodajPracownika(i, x);
                    if(i<100){
                        i++;
                    }
                break;

                case 2:
                    
                    firma.wyswietlPracownikow(i, x);
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

