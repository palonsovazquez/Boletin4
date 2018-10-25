/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Peticiones {

    public static Scanner sca = new Scanner(System.in);

    public static Double pedirNumeroDouble(String nombreDato) {
        Double res;
        do {
            System.out.print("Introduzca " + nombreDato + ": ");
            res = comprobarNumDouble(sca.nextLine());
            System.out.println();
        } while (res == null);  // pedira el dato hasta que e introduzca un numero valido.
        return res;

    }

    public static Double comprobarNumDouble(String numero) {
        Double x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Double.parseDouble(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }

    public static Integer pedirNumeroInteger(String nombreDato) {
        Integer res;
        do {
            System.out.print("Introduzca " + nombreDato + ": ");
            res = comprobarNumInteger(sca.nextLine());
            System.out.println();
        } while (res == null);  // pedira el dato hasta que e introduzca un numero valido.
        return res;

    }

    public static Integer comprobarNumInteger(String numero) {
        Integer x;
        try {   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            x = null;

        }

        return x;

    }
}
