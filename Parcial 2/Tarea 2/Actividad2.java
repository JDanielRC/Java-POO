//tarea realizada por Daniel Rubio A01663924
public class Actividad2{

    public static void main(String[] args){


        Human h1 = new Human(8, "Ivan", 15);
        Runner r1 = new Runner(18, "Juanpi", 10, 1);

        h1.getName();
        h1.getSpeed();
        h1.getStrength();
        h1.run();
        h1.run("GATO");
        h1.run(h1.getSpeed());

        r1.getName();
        r1.getSpeed();
        r1.getStrength();
        r1.getMedals();
        r1.run();
        r1.run("PERRO");
        r1.run(r1.getSpeed());

        Oly.trackEvent(h1, r1);
    }
}
