import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();
        ej8();
        ej9();
    }

    public static void ej1() {
        System.out.println("Ejercicio 1 | 1-10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void ej2() {
        System.out.println("Ejercicio 2 | 10-1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void ej3() {
        System.out.println("Ejercicio 3 | Suma 1-10");
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
        System.out.println(suma);
    }

    public static void ej4() {
        System.out.println("Ejercicio 4 | 1-20  2 en 2");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public static void ej5() {
        System.out.println("Ejercicio 5 | Factorial 9");
        int factorial = 1;
        for (int i = 1; i <= 9; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void ej6() {
        System.out.println("Ejercicio 6 | Tabla del 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }

    public static void ej7() {
        System.out.println("Ejercicio 7 | ");
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
    public static void ej8() {
        System.out.println("Ejercicio 8 | Dado");
        for (int i = 1; i <= 6; i++) {
            int dado = (int) (Math.random() * 6) + 1;
            System.out.println(dado);
        }
    }
    public static void ej9(){
        System.out.println("Ejercicio 9 | Array texto");
        String[] array = {"Caballo", "Ornitorrinco", "Nutria", "Foca", "Cangrejo"};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Cadena " + (i+1) + ": " + array[i]);
        }
    }
}





