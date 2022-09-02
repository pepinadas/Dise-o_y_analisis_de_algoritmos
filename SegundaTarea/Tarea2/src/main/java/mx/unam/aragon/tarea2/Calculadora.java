/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.tarea2;

/**
 *
 * @author Personal
 */
class Calculadora {
    public int suma (int a, int b) {
        return a + b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public void restar (int a, int b) {
        var c = (a-b);
        System.out.println("" + c);
    }
    public void dividir (int a, int b) {
        var c = (a/b);
        System.out.println("" + c);
    }
}
