public class COD extends Accion{
    int Rango;

    public COD(String genero, int accion, int COD, int rango) {
        super(genero, accion, COD);
        Rango = rango;
    }

    public int getRango() {
        return Rango;
    }
    public void RangoJuego() {
        if (getRango()>0 && getRango()<=5){
            System.out.println("Estas en el rango de Amateur");
        } else if (getRango()>5 && getRango()<=10) {
            System.out.println("Estas en el rango de Soldado");
        } else if (getRango()>10 && getRango()<=15) {
            System.out.println("Estas en el rango de Veterano");
        }else if (getRango()>15 && getRango()<=20){
            System.out.println("Eres Gran Maestro");
        }else {
            System.out.println("No perteneces a ningun rango");
        }
    }
}
