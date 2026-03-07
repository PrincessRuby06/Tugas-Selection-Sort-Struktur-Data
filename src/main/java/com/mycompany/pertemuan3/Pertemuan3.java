/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan3;

/**
 *
 * @author RUBY
 */
public class Pertemuan3 {

    public static void main(String[] args) {
           int []x ={20,15,90,13,26};
        
        System.out.print("Awal : [");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]);
            if(i < x.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]\n");
        
        for (int j = 0; j < x.length - 1; j++){
            int select = x[j];
            int min = 999999;
            int index  = j;
            
        for (int i = j; i < x.length; i++){
            if (x[i] < min){
                min = x[i];
                index = i;
            }
        } 
        if (x[j]>x[index]){
            int temp = 0 ;
            temp = x[j];
            x[j] = x[index];
            x[index] = temp;
        }
        System.out.print("Iterasi " + (j+1) + " : [ ");
        for(int i = 0 ; i < x.length; i++){
            System.out.print(x[i]+" ");
            if(i <x.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
      }
    }
}
