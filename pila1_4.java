package PILAS1_4;

import java.util.Scanner;

public class pila1_4 {
   // pila1_4 PROCE = new pila1_4();
    // public static void aletorio() {
    //}
    // public static void mostrar() {
    //  public static void eliminar() {   
    //  }
    //  public static void agregar() {  
    //  }
    // public static void ordenar(){
    // }

    public static void main(String[] args) {
          int limp =26, limp1= 0;
    char I[] = new char[26];
    char letras = 'A';
     char term;
        Scanner pila = new Scanner(System.in);
        int opc;

        do {
            System.out.println();
            System.out.println("\t MENU DE 1.4");
            System.out.println("\t 1.- llenar aletoriamente  el abecedario");
            System.out.println("\t 2.- mostrar");
            System.out.println("\t 3.- eliminar");
            System.out.println("\t 4.- agregar");
            System.out.println("\t 5.- ordenar");
            System.out.println("\t 6.- salir");
            switch (opc = pila.nextInt()) {
                case 1:
                    for (int i = 0; i < limp; i++) {
                        I[i] = (char) (Math.random() * limp + 'A');
                        for (int j = 0; j < i; j++) {
                            if (I[j] == I[i]) {
                                i--;
                            }
                        }
                    }
                    for (int k = 0; k < 26; k++) {
                        limp1++;
                        letras++;
                    }
                    break;
                case 2:
                    for (int i = limp1 - 1; i >= 0; i--) {
                        System.out.print(I[i] + " ");
                    }

                    break;
                case 3:
                    if (limp1 != 0) {
                        System.out.println("dato eliminado ");
                        limp1--;
                    } else {
                        System.out.println("pila vacia");
                    }
                    break;
                case 4:
                    if (limp1 < 26) {
                        System.out.println("Ingresa un valor: ");
                        letras = pila.next().charAt(0);
                        I[limp1] = letras;
                        letras++;
                        limp1++;
                    } else {
                        System.out.println("Pila vacia");
                    }
                    break;
                case 5:
                    for (int i = 0; i < limp; i++) {
                        for (int j=0;j<(limp-1);j++) {
                            if (I[j] > I[j+1]) {
                               term = I[j];
                                I[j] = I[j + 1];
                                I[j + 1] = term;
                            }
                        }
                    }
                    for (int i = 0; i<limp; i++) {

                    }
                    break;
                case 6:
                    System.out.println(":3 fin ");

                    break;
                default:
                    System.out.println("Incorrecta opcion");
            }
        } while (opc != 6);
    }
}
