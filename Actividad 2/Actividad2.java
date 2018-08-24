//actividad realizada por Daniel Rubio A01633924
public class Actividad2 {
    public static void main(String[] args) {

        System.out.println("Carro Jeep:");
        Car Jeep = new Car("Grand Cherokee", 1998);
        int velocidad = 80;
        Jeep.arrancado(velocidad);
        Jeep.presumir(Jeep.getModelo(), Jeep.getYear());
        System.out.println(Jeep.getModelo());
        System.out.println(Jeep.getYear());

        System.out.println("Carro Ford");
        Car Ford = new Car();
        velocidad = 60;
        Ford.arrancado(velocidad);
        Ford.presumir(Ford.getModelo(), Ford.getYear());
        System.out.println(Ford.getModelo());
        System.out.println(Ford.getYear());

        System.out.println("Kanguro Kangy:");
        Kangaroo Kangy = new Kangaroo("Kangy", 12);
        Kangy.saltar(Kangy.getName());
        Kangy.envejecer(Kangy.getName(), Kangy.getAge());
        System.out.println(Kangy.getName());
        System.out.println(Kangy.getAge());

        System.out.println("Canguro Kangu:");
        Kangaroo Kangu = new Kangaroo();
        Kangu.saltar(Kangu.getName());
        Kangu.envejecer(Kangu.getName(), Kangu.getAge());
        System.out.println(Kangu.getName());
        System.out.println(Kangu.getAge());

        System.out.println("Computadora Asus:");
        Computer Asus = new Computer(512, 3.4f);
        Asus.descarga(Asus.getMemory());
        Asus.encender(Asus.getClockSpeed());
        System.out.println(Asus.getMemory());
        System.out.println(Asus.getClockSpeed());

        System.out.println("Computadora Predator:");
        Computer Predator = new Computer();
        Predator.descarga(Predator.getMemory());
        Predator.encender(Predator.getClockSpeed());
        System.out.println(Predator.getMemory());
        System.out.println(Predator.getClockSpeed());

    }
}
