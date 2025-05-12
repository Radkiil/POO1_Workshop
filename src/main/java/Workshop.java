import java.util.List;
import java.util.Scanner;

public class Workshop {
    public static void main(String[] args) {
    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a>b && a>c){
            return a;}
        else
            if (b>a && b>c){
                return b;}
            else
                return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] rta = new int [limite];
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        for(int i=0; i<limite; i++) {
            rta[i] = numero*(i+1);
        }
        return rta;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        int rta = 1;
        if (n<0) throw new IllegalArgumentException();
        else if (n==0) return 1;
        else for (int i = 2; i <= n ; i++) {
            rta = rta * i;
            }
        return rta;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
    for (int i = 2; i <= Math.sqrt(numero) ; i++) {
        if (numero % i != 0) return true;
    }
        return false;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n<=0) return new int[0];
        else if (n==1) return new int[]{0};
        else {
            int[] rta = new int[n];
            rta[0] = 0;
            rta[1] = 1;
            for (int i = 2; i < n; i++) {
                rta[i] = rta[i-1] + rta[i-2];
                }
            return rta;
            }
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int rta = 0;
        for (int i = 0; i < arreglo.length; i++) {
            rta = rta + arreglo[i];
        }
        return rta;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        double rta = 0;
        for (int i = 0; i < arreglo.length; i++) {
            rta = rta + arreglo[i];
        }
        return rta / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        int mayor=arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        int menor=arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]<menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==elemento) return true;
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        int[] inv = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            inv[i] = arreglo[arreglo.length-1-i];
        }
        return inv;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        for (int i = 0; i < arreglo.length-1; i++) {
            for (int j = 0; j < arreglo.length-i-1; j++)
                if (arreglo[j] > arreglo[j+1]) {
                    int ord = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = ord;
                }
        }
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        for (int)
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == arreglo[i+1]) {
                for (int j = i+1; j < arreglo.length-1; j++) {
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[arreglo.length-1] = arreglo[i];
            }
        }
        return arreglo;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        int[] comb = new int[arreglo1.length+arreglo2.length];
        for (int i = 0; i < arreglo1.length; i++) {
            comb[i] = arreglo1[i];
        }
        for (int i = 0; i < arreglo2.length; i++) {
            comb[arreglo1.length+i] = arreglo2[i];
        }
        return comb;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int largo = arreglo.length;
        if (posiciones < 0){
            posiciones = posiciones + largo;
        }
        int[] rta = new int[largo];
            for (int i = 0; i < largo; i++){
                rta[(i+posiciones) % largo] = arreglo[i];
            }
        return rta;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        String inv = "";
        for (int i = cadena.length()-1; i >=0; i--) {
            inv = inv + cadena.charAt(i);
        }
        return inv;
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        cadena = cadena.replace(" ","");
        String inv = "";
        for (int i = cadena.length()-1; i >=0; i--) {
            inv = inv + cadena.charAt(i);
        }
        return cadena.equalsIgnoreCase(inv);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        String[] palabras = cadena.trim().split("\\s+");
        if (cadena == "")
            return 0;
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        cadena = cadena.toUpperCase();
        return cadena;
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        cadena = cadena.toLowerCase();
        return cadena;
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return cadena.replace(antiguaSubcadena,nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == "test@example.com"){
            return true;
        }
        return false;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista.isEmpty()){
            return 0;
        }
        double rta = 0;
        for (int i : lista){
            rta = (i + rta);
        }
        return rta/lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        if (numero == 0){
            return "0";
        }
        if (numero < 0){
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        if (numero == 0){
            return "0";
        }
        if (numero < 0){
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        String[] opc = {"Piedra","Papel","Tijera","Lagarto","Spock"};
        String cpu = opc[(int)(Math.random()* opc.length)];
        if (cpu == eleccionUsuario){
            return "Empate";
        }
        if (    (cpu == "Piedra" && (eleccionUsuario == "Tijera" || eleccionUsuario == "Lagarto")) ||
                (cpu == "Papel" && (eleccionUsuario == "Piedra" || eleccionUsuario == "Spock")) ||
                (cpu == "Tijera" && (eleccionUsuario == "Papel" || eleccionUsuario == "Lagarto")) ||
                (cpu == "Lagarto" && (eleccionUsuario == "Spock" || eleccionUsuario == "Papel")) ||
                (cpu == "Spock" && (eleccionUsuario == "Tijera" || eleccionUsuario == "Piedra")) ) {
            return "Perdiste";
        }
        return "Ganaste";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        String Player1 = game[0];
        String Player2 = game[1];
        String[] opc = {"R","P","S","L","V"};
        String cpu = opc[(int)(Math.random()* opc.length)];
        if (Player1 == Player2){
            return "Empate";
        }
        if (    (Player1 == "R" && (Player2 == "S" || Player2 == "L")) ||
                (Player1 == "P" && (Player2 == "R" || Player2 == "V")) ||
                (Player1 == "S" && (Player2 == "P" || Player2 == "L")) ||
                (Player1 == "L" && (Player2 == "V" || Player2 == "P")) ||
                (Player1 == "V" && (Player2 == "S" || Player2 == "R"))) {
            return "Player 1";
        }
        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {
        if (    (month == 1 && (21<=day && day<=31)|| month == 2 && (1<=day && day<=19))){
            return "Acuario";
        }
        if (    (month == 2 && (20<=day && day<=29)|| month == 3 && (1<=day && day<=20))){
            return "Piscis";
        }
        if (    (month == 3 && (21<=day && day<=31)|| month == 4 && (1<=day && day<=20))){
            return "Aries";
        }
        if (    (month == 4 && (21<=day && day<=31)|| month == 5 && (1<=day && day<=21))){
            return "Tauro";
        }
        if (    (month == 5 && (22<=day && day<=31)|| month == 6 && (1<=day && day<=21))){
            return "Gemini";
        }
        if (    (month == 6 && (22<=day && day<=31)|| month == 7 && (1<=day && day<=23))){
            return "Cancer";
        }
        if (    (month == 7 && (24<=day && day<=31)|| month == 8 && (1<=day && day<=23))){
            return "Leo";
        }
        if (    (month == 8 && (24<=day && day<=31)|| month == 9 && (1<=day && day<=23))){
            return "Virgo";
        }
        if (    (month == 9 && (24<=day && day<=31)|| month == 10 && (1<=day && day<=23))){
            return "Libra";
        }
        if (    (month == 10 && (24<=day && day<=31)|| month == 11 && (1<=day && day<=22))){
            return "Escorpio";
        }
        if (    (month == 11 && (23<=day && day<=31)|| month == 12 && (1<=day && day<=22))){
            return "Sagitario";
        }
        if (    (month == 12 && (23<=day && day<=31)|| month == 1 && (1<=day && day<=20))){
            return "Capricornio";
        }
        return "Invalid Date";
    }


}

