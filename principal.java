package ConversorDeMonedas;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner escritura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("**************************************\n" +
                    "Sea Bienvenido/a al conversor de monedas\n" +
                    " \n" +
                    "1) Dolar ==> Peso argentino\n" +
                    "2) Peso argentino ==> Dolar\n" +
                    "3) Dolar ==> Real brasileño\n" +
                    "4) Real brasileño ==> Dolar\n" +
                    "5) Dolar ==> Soles peruamos\n" +
                    "6) Soles peruanos ==> Dolar\n" +
                    "7) Salir\n" +
                    "Elija una opcion validada:\n" +
                    "**************************************");
            opcion = Integer.parseInt(escritura.nextLine());

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                double cantidad = Double.parseDouble(escritura.nextLine());

                switch (opcion) {
                    case 1 ->
                            System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversor.dolarAPesoArgentino(cantidad) + " [ARS]");
                    case 2 ->
                            System.out.println("El valor de " + cantidad + " [ARS] corresponde al valor final de =>> " + conversor.pesoArgentinoADolar(cantidad) + "[USD]");
                    case 3 ->
                            System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversor.dolarABrasil(cantidad) + "[BRL]");
                    case 4 ->
                            System.out.println("El valor de " + cantidad + " [BRL] corresponde al valor final de =>> " + conversor.brasilADolar(cantidad) + "[USD]");
                    case 5 ->
                            System.out.println("El valor de " + cantidad + " [USD] corresponde al valor final de =>> " + conversor.dolarAPen(cantidad) + "[SOL]");
                    case 6 ->
                            System.out.println("El valor de " + cantidad + " [SOL] corresponde al valor final de =>> " + conversor.penADolar(cantidad) + "[USD]");
                }
            } else if (opcion != 7) {
                System.out.println("Opción no válida. Intente de nuevo.\n");
            } else if (opcion == 7) {
                System.out.println("Ha salido del conversor");
            }
        }
    }
}


