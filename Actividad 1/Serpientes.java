//actividad realizada por Daniel Rubio Camacho A01633924

public class Serpientes {

    //atributos
    public int largoDeSerpiente; //en metros
    public String especieDeSerpiente;
    public String color;

    //comportamiento
    public void mordida(String nombrePersona, int largoDeSerpiente){
        System.out.println("ÑAM! Te voy a morder " + nombrePersona + ", con mis " + largoDeSerpiente + " metros de largo");
    }
    public void comer(String queVaComer, String especieDeSerpiente, String color){
        System.out.println("Hoy quiero comer... " + queVaComer);
        System.out.println("Que bien se siente ser una " + especieDeSerpiente + " de color " + color);
    }
}
