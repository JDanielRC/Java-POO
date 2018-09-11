//tarea realizada por Daniel Rubio A01663924
public class Oly{

    public static void trackEvent(Human a, Human b){
        if (a.getSpeed() > b.getSpeed()){
            System.out.println("El humano " + a.getName() + " es mas rapido que el humano " + b.getName());
        } else if (a.getSpeed() < b.getSpeed()){
            System.out.println("El humano " + b.getName() + " es mas rapido que el humano " + a.getName());
        } else {
            System.out.println("Son igual de rápidos");
        }
    }
}
