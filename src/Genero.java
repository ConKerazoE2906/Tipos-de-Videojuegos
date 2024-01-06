public class Genero extends TiposDeVideojuegos{
    int Accion;

    public Genero(String genero, int accion) {
        super(genero);
        Accion = accion;
    }

    public int getAccion() {
        return Accion;
    }

    public void setAccion(int accion) {
        Accion = accion;
    }
}
