import java.util.Random;
import java.util.Scanner;

public class Buscaminas{
    public static void main ( string []args){
        System.out.println("UTC Universidad Tres Culturas");
        System.out.println("Area:Ingenieria en Sistemas Computacionales");
        System.out.println("Cuarto Cuatrimestre");
        System.out.println("Programacion Orientada a Objetos");
        System.out.println("Examen Primer Parcial");
        System.out.println("Integrantes:");
        System.out.println("Colorado Rivera Joel Roberto");
        System.out.println("Gonzales Barbosa Joel");
        System.out.println("Olvera Cazares Jennifer Aline");
    
    }
}
public class Buscaminas{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = crearTablero(5, 5); // Cambia el tamaño del tablero según tus preferencias
        colocarMinas(tablero, 5); // Cambia el número de minas según tus preferencias
        boolean juegoTerminado = false;

        do {
            mostrarTablero(tablero);
            juegoTerminado = jugar(tablero);

            if (juegoTerminado) {
                System.out.println("¡Has perdido! ¿Quieres jugar de nuevo? (s/n)");
                char respuesta = scanner.next().charAt(0);
                if (respuesta == 's' || respuesta == 'S') {
                    tablero = crearTablero(5, 5); // Reiniciar el juego
                    colocarMinas(tablero, 5);
                    juegoTerminado = false;
                } else {
                    System.out.println("¡Gracias por jugar!");
                }
            }
        } while (!juegoTerminado);

        scanner.close();
    }

    // Crea un tablero de tamaño filas x columnas y lo inicializa con caracteres '*'
    public static char[][] crearTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '*';
            }
        }
        return tablero;
    }

    // Coloca un número específico de minas aleatoriamente en el tablero
    public static void colocarMinas(char[][] tablero, int numeroMinas) {
        Random rand = new Random();
        int filas = tablero.length;
        int columnas = tablero[0].length;

        for (int i = 0; i < numeroMinas; i++) {
            int fila;
            int columna;

            do {
                fila = rand.nextInt(filas);
                columna = rand.nextInt(columnas);
            } while (tablero[fila][columna] == 'M');

            tablero[fila][columna] = 'M';
        }
    }

    // Muestra el tablero actual
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (char[] fila : tablero) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Realiza un movimiento y devuelve true si el jugador ha perdido
    public static boolean jugar(char[][] tablero) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.print("Ingresa la fila: ");
            fila = scanner.nextInt();
            System.out.print("Ingresa la columna: ");
            columna = scanner.nextInt();
        } while (fila < 0 || fila >= tablero.length || columna < 0 || columna >= tablero[0].length);

        if (tablero[fila][columna] == 'M') {
            return true;
        }

        descubrirCasilla(tablero, fila, columna);
        return false;
    }

    // Descubre la casilla y muestra el número de minas cercanas
    public static void descubrirCasilla(char[][] tablero, int fila, int columna) {
        int minasCercanas = 0;
        int filas = tablero.length;
        int columnas = tablero[0].length;

        if (tablero[fila][columna] != '*') {
            return;
        }

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;

                if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas
                        && tablero[nuevaFila][nuevaColumna] == 'M') {
                    minasCercanas++;
                }
            }
        }

        if (minasCercanas == 0) {
            tablero[fila][columna] = ' ';
        } else {
            tablero[fila][columna] = (char) ('0' + minasCercanas);
        }
    }
}