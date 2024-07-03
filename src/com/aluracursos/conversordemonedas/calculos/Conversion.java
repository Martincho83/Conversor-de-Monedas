package com.aluracursos.conversordemonedas.calculos;

import com.aluracursos.conversordemonedas.modelos.Moneda;
import com.aluracursos.conversordemonedas.modelos.RespuestaDeApi;

public class Conversion {

    public String calcularValorDeMoneda(String monedaBase, String monedaDestino, double valorAConvertir){
        double valorDeCambio;
        double valorTotal;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            RespuestaDeApi consulta = new RespuestaDeApi();
            Moneda moneda = consulta.buscaMoneda(monedaBase);
            valorDeCambio = moneda.conversion_rates().get(monedaDestino);
            valorTotal = valorAConvertir * valorDeCambio;
            stringBuilder.append("1 [" + monedaBase + "] equivale a: " + valorDeCambio + " [" + monedaDestino + "]\n")
                    .append("El valor " + valorAConvertir + " [" + monedaBase + "] " +
                            "corresponde al valor final de =>>> " + valorTotal + " [" + monedaDestino + "]");
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda. " + e);
        }
    }

    public String elegirOpcionConversionDeMoneda(int opcion, double valorAConvertir) {
        String resultado = "";
        switch (opcion) {
            case 1:
                resultado = this.calcularValorDeMoneda("USD", "ARS", valorAConvertir);
                break;
            case 2:
                resultado = this.calcularValorDeMoneda("ARS", "USD", valorAConvertir);
                break;
            case 3:
                resultado = this.calcularValorDeMoneda("USD", "BRL", valorAConvertir);
                break;
            case 4:
                resultado = this.calcularValorDeMoneda("BRL", "USD", valorAConvertir);
                break;
            case 5:
                resultado = this.calcularValorDeMoneda("USD", "COP", valorAConvertir);
                break;
            case 6:
                resultado = this.calcularValorDeMoneda("COP", "USD", valorAConvertir);
                break;
            default:
                resultado = "Opción no válida";
                break;
        }
        return resultado;
    }
}