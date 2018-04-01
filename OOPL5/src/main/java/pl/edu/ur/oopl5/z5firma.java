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
public class z5firma {

    public z5firma(int j) {
        this.j = j;
    }
    private int j;
    private String wiekstring;
    public String[][] dane = new String[100][4];
    Scanner scanner = new Scanner(System.in);
    
    void dodajPracownika() {
        for (int i = 0; i < j; i++) {
            z5pracownik pracownik = new z5pracownik();
            System.out.println("---------------------------------"); 
            System.out.println("Podaj dane pracownika nr. " + (i+1));                    
            System.out.print("Imię: ");
            pracownik.imie=scanner.next();
            dane[i][0]=pracownik.imie;
            System.out.print("Nazwisko: ");
            pracownik.nazwisko=scanner.next();
            dane[i][1]=pracownik.nazwisko;
            System.out.print("Wiek: ");
            pracownik.wiek=scanner.nextInt();
            wiekstring=Integer.toString(pracownik.wiek);
            dane[i][2]=wiekstring;
            System.out.print("Stanowisko: ");
            pracownik.stanowisko=scanner.next();
            dane[i][3]=pracownik.stanowisko;
        }
    }
    
    void wyswietlPracownikow() {
        for (int i = 0; i < j; i++) {
            System.out.println("---------------------------------"); 
            System.out.println("Pracownik nr. " + (i+1));                    
            System.out.println("Imię: " + dane[i][0]);
            System.out.println("Nazwisko: " + dane[i][1]);
            System.out.println("Wiek: " + dane[i][2]);
            System.out.println("Stanowisko: " + dane[i][3]);
        }
    }
}
