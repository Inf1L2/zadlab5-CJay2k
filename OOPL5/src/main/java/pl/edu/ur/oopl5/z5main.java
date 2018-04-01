/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author cjay
 */
public class z5main {
    public static void main(String[] args) {
        int c,j;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("---------------------------------"); 
            System.out.println("MENU");
            System.out.println("1. Wprowadź pracowników");
            System.out.println("2. Wyświetl pracowników");
            System.out.println("0. Wyjdź");
            System.out.print("Co chcesz zrobić?: ");
            c=scanner.nextInt();
            z5firma ilu;
            

            switch (c) {
                case 1:
                    System.out.print("Ilu pracowników chcesz wprowadzić?: ");
                    j=scanner.nextInt();
                    ilu = new z5firma(j);
                    ilu.dodajPracownika();
                    
                break;

                case 2:
                    System.out.print("Ilu pracowników chcesz wyświetlić?: ");
                    j=scanner.nextInt();
                    ilu = new z5firma(j);
                    ilu.wyswietlPracownikow();
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

