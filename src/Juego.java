public class Juego extends Accion {
    int numeroDeRango;

    public Juego(String genero, String accion, String FPS, int numeroDeRango) {
        super(genero, accion, FPS);
        setNumeroDeRango(numeroDeRango); // Utilizar el método setNumeroDeRango para validar el rango
    }

    public int getNumeroDeRango() {
        return numeroDeRango;
    }

    public void setNumeroDeRango(int numeroDeRango) {
        if (numeroDeRango < 1 || numeroDeRango > 20) {
            throw new IllegalArgumentException("El número de rango debe estar en el rango de 1 a 20.");
        }
        this.numeroDeRango = numeroDeRango;
    }

    public void RangoJuego() {
        if (getNumeroDeRango() >= 1 && getNumeroDeRango() <= 5) {
            System.out.println("Estás en el rango de Amateur");
        } else if (getNumeroDeRango() > 5 && getNumeroDeRango() <= 10) {
            System.out.println("Estás en el rango de Soldado");
        } else if (getNumeroDeRango() > 10 && getNumeroDeRango() <= 15) {
            System.out.println("Estás en el rango de Veterano");
        } else if (getNumeroDeRango() > 15 && getNumeroDeRango() <= 20) {
            System.out.println("Eres Gran Maestro");
        }else {
            System.out.println("No perteneces a ningún rango");
        }
    }

    public void imprimirDetalles() {
        System.out.println("Detalles del juego:");
        System.out.println("Género: " + getGenero());
        System.out.println("Acción: " + getAccion());
        System.out.println("FPS: " + getFPS());
        System.out.println("Numero de Rango es: " + getNumeroDeRango());
    }
}

