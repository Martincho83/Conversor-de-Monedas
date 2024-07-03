package com.aluracursos.conversordemonedas.principal;

import java.util.Scanner;

import com.aluracursos.conversordemonedas.calculos.Conversion;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        Conversion conversion = new Conversion();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("******************************************\n")
                .append("Sea bienvenido/a al conversor de monedas\n")
                .append("1) Dolar =>> Peso argentino\n")
                .append("2) Peso argentino =>> Dolar\n")
                .append("3) Dolar =>> Real brasileño\n")
                .append("4) Real brasileño =>> Dolar\n")
                .append("5) Dolar =>> Peso colombiano\n")
                .append("6) Peso colombiano =>> Dolar\n")
                .append("7) Salir\n")
                .append("Elija una opción válida: \n")
                .append("******************************************\n");

        while (opcion != 7) {
            try {
                System.out.println(stringBuilder.toString());
                opcion = lectura.nextInt();
                lectura.nextLine();
                if (opcion < 7) {
                    System.out.println("Ingrese el valor que desea convertir: ");
                    double valor = lectura.nextDouble();
                    lectura.nextLine();
                    System.out.println(conversion.elegirOpcionConversionDeMoneda(opcion, valor));
                } else if (opcion > 7) {
                    System.out.println("Opción no válida");
                } else {
                    System.out.println("Finalizó la ejecución del programa!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                lectura.next();  // Limpiar la entrada inválida
            }
        }
        lectura.close();
    }
}
