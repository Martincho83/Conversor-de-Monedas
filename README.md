# ONEAllura Conversor de Monedas

## Descripción

Este programa en Java permite a los usuarios realizar conversiones de moneda utilizando una API pública de tasas de cambio, ExchangeRate-API. El programa ofrece un menú interactivo con las siguientes opciones de conversión de monedas:

- Dólar (USD) => Peso argentino (ARS)
- Peso argentino (ARS) => Dólar (USD)
- Dólar (USD) => Real brasileño (BRL)
- Real brasileño (BRL) => Dólar (USD)
- Dólar (USD) => Peso colombiano (COP)
- Peso colombiano (COP) => Dólar (USD)
- Salir

## Requisitos

- Java 8 o superior
- Conexión a Internet

## Uso

1. Clonar el repositorio
    ```sh
    git clone https://github.com/Martincho83/Conversor-de-Monedas.git
    cd ONEAllura-Conversor-de-Monedas
    ```

2. Compilar el proyecto
    ```sh
    javac -d out -sourcepath src src/com/aluracursos/conversordemonedas/principal/Main.java
    ```

3. Ejecutar el programa
    ```sh
    java -cp out com.aluracursos.conversordemonedas.principal.Main
    ```

## Funcionamiento

Al ejecutar el programa, se mostrará un menú con las opciones disponibles. El usuario debe ingresar el número correspondiente a la opción deseada y, a continuación, la cantidad a convertir. El programa realizará la conversión utilizando las tasas de cambio obtenidas de la API y mostrará el resultado.

### Ejemplo de Uso

```plaintext
******************************************
Sea bienvenido/a al conversor de monedas
1) Dolar =>> Peso argentino
2) Peso argentino =>> Dolar
3) Dolar =>> Real brasileño
4) Real brasileño =>> Dolar
5) Dolar =>> Peso colombiano
6) Peso colombiano =>> Dolar
7) Salir
Elija una opcion valida: 1
******************************************

Ingrese el valor que desea convertir: 100
1 [USD] equivale a: 914.50 [ARS]
El valor 100.0 [USD] corresponde al valor final de =>>> 91450.0 [ARS]
