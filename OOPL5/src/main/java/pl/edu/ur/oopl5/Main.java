package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,x,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkość stosu: ");
        n=scanner.nextInt();
        z3stos stos = new z3stos(n);
        
        do{
            System.out.println("------------------------------------------");
            System.out.println("MENU");
            System.out.println("1. Dołóż wartość na stos");
            System.out.println("2. Zdejmij wartość ze stosu");
            System.out.println("3. Wyświetl wartość na szczycie stosu");
            System.out.println("0. Wyjdź");
            System.out.print("Co chcesz zrobić?: ");
            c=scanner.nextInt();

            switch (c) {
                case 1:
                    if (!stos.isFull()){
                        System.out.print("Podaj liczbę którą chcesz położyć na stosie: ");
                        x=scanner.nextInt();
                        stos.push(x);
                    } else {
                        System.out.println("Stos jest pełny, nic więcej sie nie zmieści.");
                    }
                break;

                case 2:
                    if (!stos.isEmpty()){
                        System.out.println(stos.pop() + " zostało zostało zdjęte ze stosu!");
                    } else {
                        System.out.println("Stos jest pusty, nie ma nic więcej do zdjęcia");
                    }
                break;

                case 3:
                    stos.top();
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
