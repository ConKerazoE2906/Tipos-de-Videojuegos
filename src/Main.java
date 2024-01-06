public class Main {
    public static void main(String[] args) {
        try {
            // Crear un array de objetos Juego
            Juego[] juegos = new Juego[3];

            // Inicializar objetos en el array
            juegos[0] = new Juego("Aventura", "Disparos", "FPS", 8);
            juegos[1] = new Juego("Estrategia", "Combate", "RTS", 12);
            juegos[2] = new Juego("Deportes", "Competitivo", "Simulación", 18);

            // Iterar sobre el array y realizar operaciones en cada objeto
            for (Juego juego : juegos) {
                // Llamar al método RangoJuego para imprimir el rango
                juego.RangoJuego();

                // Llamar al método imprimirDetalles para imprimir todos los parámetros
                juego.imprimirDetalles();

                System.out.println("\n------------------------\n");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error: Alguno de los objetos no ha sido inicializado correctamente.");
        } catch (Exception e) {
            System.err.println("Ocurrió una excepción no esperada: " + e.getMessage());
        }

        try {
            // Crear un objeto Juego
            Juego juego = new Juego("Aventura", "Disparos", "60 FPS", 25);

            // Llamar al método RangoJuego para imprimir el rango
            juego.RangoJuego();

            // Llamar al método imprimirDetalles para imprimir todos los parámetros
            juego.imprimirDetalles();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

