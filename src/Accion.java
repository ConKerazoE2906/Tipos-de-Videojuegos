public class Accion extends Genero{
    int FPS;

    public Accion(String genero, int accion, int FPS) {
        super(genero, accion);
        this.FPS = FPS;
    }

    public int getFPS() {
        return FPS;
    }

    public void setFPS(int FPS) {
        this.FPS = FPS;
    }
}
