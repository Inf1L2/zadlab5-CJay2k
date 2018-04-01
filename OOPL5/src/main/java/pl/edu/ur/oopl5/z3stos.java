/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Adrian Hrycaj
 */
public class z3stos {
    private int n , x;
    private int wskaznik=-1;
    int[] stos;
    
    public z3stos(int n) {
        this.n = n; 
        stos = new int[this.n];
    }
    
    boolean isFull(){
        if(wskaznik > this.n-2){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean isEmpty(){
        if(wskaznik < 0 ){
            return true;
        }
        else{
            return false;

        }
    }
    
    void push(int x){
            wskaznik = wskaznik+1;   
            stos[wskaznik] = x;
            System.out.println(x + " zostało położone na stosie!");
    }
    
    int pop(){
            x = stos[wskaznik];
            wskaznik = wskaznik-1;   
            return x;
    }
    
    void top() {
        if(!isEmpty()){
            System.out.println(stos[wskaznik]);
        } else {
            System.out.println("Stos jest pusty!");
        }
    }
}
