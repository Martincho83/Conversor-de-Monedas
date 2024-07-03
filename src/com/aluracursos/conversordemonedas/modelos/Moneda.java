package com.aluracursos.conversordemonedas.modelos;

import java.util.Map;

public record Moneda(Map<String, Double> conversion_rates) {
}
