/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.tarea2;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Prueba {
    public static void main(String[] args) {
        int op1 = 0, op2= 0;
        Scanner op = new Scanner(System.in); 
        System.out.println("Selecciona 1 sumar, 2 multiplicar, 3 restar, 4 dividir");
        int opciondada = op.nextInt();
        System.out.println("Dame el operador 1");
        op1 = op.nextInt();
        System.out.println("Dame el operador 2");
        op2 = op.nextInt();
        Calculadora c = new Calculadora();
        switch(opciondada){
            case 1:
                System.out.println(c.suma(op1,op2));
                break;
            case 2:
                System.out.println(c.multiplicar(op1, op2));
                break;
            case 3:
                c.restar(op1, op2);
                break;
            case 4:
                c.dividir(op1, op2);
        }
    }
}
