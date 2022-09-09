/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.lista;

/**
 *
 * @author Personal
 */
public class CrearLista {
    public void imprimirNumero(int x){
        int aux= x;
        if(x==0){
            System.out.println(" ");
        }else{
            System.out.println("numero"+ x); 
            imprimirNumero(x-1);
        }
    }
}