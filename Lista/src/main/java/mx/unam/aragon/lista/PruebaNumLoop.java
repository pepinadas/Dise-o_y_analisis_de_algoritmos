/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.lista;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PruebaNumLoop {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num= op.nextInt();
        CrearLista cl= new CrearLista();
        cl.imprimirNumero(num);
    }
}
