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
public class z5firma {

    private String wiekstring;
    public String[][] dane = new String[100][4];
    Scanner scanner = new Scanner(System.in);

    
    
    String[][] dodajPracownika(int i, String[][] dane) {
        if(i<100){
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
            i++;
        }
        else{
            System.out.println("Lista pracowników jest pełna");
        }
        return dane;
    }

    
    
    void wyswietlPracownikow(int i, String[][] dane) {
        if(i>0){
            for (int j = 0; j < i; j++) {
                System.out.println("---------------------------------"); 
                System.out.println("Pracownik nr. " + (j+1));                    
                System.out.println("Imię: " + dane[j][0]);
                System.out.println("Nazwisko: " + dane[j][1]);
                System.out.println("Wiek: " + dane[j][2]);
                System.out.println("Stanowisko: " + dane[j][3]);
                
            }
        }
        else{
            System.out.println("Brak pracowników do wyświetlenia");
        }
    }
}
