import java.util.Scanner;

public class ExamenJuego1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego del Ahorcado!");

        // Ingrese la palabra para adivinar
        System.out.print("Ingrese la palabra para adivinar (en minúsculas): ");
        String palabraSecreta = scanner.nextLine();
        char[] letrasPalabra = palabraSecreta.toCharArray();
        int longitudPalabra = letrasPalabra.length;

        // Pistas
        System.out.println("¡Tienes 3 pistas para adivinar la palabra!");
        System.out.println("Pista 1: La palabra tiene " + longitudPalabra + " letras.");
        System.out.println("Pista 2: La primera letra de la palabra es '" + letrasPalabra[0] + "'.");
        System.out.println("Pista 3: La última letra de la palabra es '" + letrasPalabra[longitudPalabra - 1] + "'.");
        
        // Inicialización del juego
        char[] letrasAdivinadas = new char[longitudPalabra];
        int intentosRestantes = 6; // Número de intentos permitidos
        int puntaje = 0;

        // Bucle principal del juego
        while (intentosRestantes > 0) {
            System.out.println("\nPalabra adivinada: " + obtenerPalabraAdivinada(letrasAdivinadas));
            System.out.println("Intentos restantes: " + intentosRestantes);

            // Pedir al jugador una letra
            System.out.print("Ingresa una letra: ");
            char letraIngresada = scanner.next().charAt(0);

            // Verificar si la letra está en la palabra secreta
            boolean acierto = false;
            for (int i = 0; i < longitudPalabra; i++) {
                if (letrasPalabra[i] == letraIngresada && letrasAdivinadas[i] == 0) {
                    letrasAdivinadas[i] = letraIngresada;
                    acierto = true;
                    puntaje += 10;
                }
            }

            if (acierto) {
                System.out.println("¡Adivinaste una letra! Puntaje: " + puntaje);
            } else {
                System.out.println("Letra incorrecta. Pierdes un intento.");
                intentosRestantes--;
            }

            // Verificar si se ha adivinado la palabra completa
            if (palabraAdivinada(letrasAdivinadas)) {
                System.out.println("\n¡Felicidades! Adivinaste la palabra: " + palabraSecreta);
                System.out.println("Puntaje total: " + puntaje);
                break;
            }
        }

        if (intentosRestantes == 0) {
            System.out.println("\n¡Agotaste todos tus intentos! La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }

    static boolean palabraAdivinada(char[] letrasAdivinadas) {
        for (char letra : letrasAdivinadas) {
            if (letra == 0) {
                return false; // Todavía hay letras sin adivinar
            }
        }
        return true; // Todas las letras se han adivinado
    }

    static String obtenerPalabraAdivinada(char[] letrasAdivinadas) {
        StringBuilder palabraAdivinada = new StringBuilder();
        for (char letra : letrasAdivinadas) {
            if (letra != 0) {
                palabraAdivinada.append(letra);
            } else {
                palabraAdivinada.append("_");
            }
        }
        return palabraAdivinada.toString();
    }
}