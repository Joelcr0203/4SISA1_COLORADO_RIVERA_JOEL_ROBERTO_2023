import java.util.Scanner;
import java.util.Random;

public class ExamenJuego2{
    static char[][] tablero = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static char jugadorActual = 'X';
    static boolean jugadorContraMaquina = false;
    static Random rand = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego del Gato!");
        System.out.println("Instrucciones: Ingresa las coordenadas para hacer tu movimiento.");
        System.out.println("Ejemplo: '1 2' colocará tu ficha en la fila 1, columna 2.");
        System.out.println();

        while (true) {
            imprimirTablero();
            hacerMovimiento();

            if (verificarVictoria()) {
                imprimirTablero();
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                reiniciarJuego(scanner);
            } else if (verificarEmpate()) {
                imprimirTablero();
                System.out.println("¡Empate!");
                reiniciarJuego(scanner);
            }

            cambiarJugador();
        }
    }

    static void imprimirTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void hacerMovimiento() {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        if (jugadorContraMaquina && jugadorActual == 'O') {
            // Movimiento de la máquina (jugador O)
            System.out.println("Turno de la máquina (O)...");
            fila = rand.nextInt(3);
            columna = rand.nextInt(3);
        } else {
            System.out.println("Turno del jugador " + jugadorActual + ":");
            System.out.print("Ingresa la fila y columna (ejemplo: 1 2): ");
            fila = scanner.nextInt() - 1;
            columna = scanner.nextInt() - 1;
        }

        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
        } else {
            System.out.println("Movimiento inválido. Intenta de nuevo.");
            hacerMovimiento();
        }
    }

    static void cambiarJugador() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }

    static boolean verificarVictoria() {
        for (int i = 0; i < 3; i++) {
            // Verificar filas y columnas
            if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                return true;
            }
        }

        // Verificar diagonales
        if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
            (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
            return true;
        }

        return false;
    }

    static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay espacios vacíos
                }
            }
        }
        return true; // No quedan espacios vacíos, es un empate
    }

    static void reiniciarJuego(Scanner scanner) {
        System.out.print("¿Deseas jugar de nuevo? (S/N): ");
        char respuesta = scanner.next().charAt(0);
        if (respuesta == 'S' || respuesta == 's') {
            tablero = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
            };
            jugadorActual = 'X';
            System.out.println("Nuevo juego iniciado.");
        } else {
            System.out.println("¡Gracias por jugar!");
            System.exit(0);
        }
    }
}