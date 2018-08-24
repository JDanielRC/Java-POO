public class Clase4b {
    public static void main(String[] args) {

        Transporte t1 = new Transporte();
        Transporte t2 = new Transporte(2000, 120);

        System.out.println(t1.getCapacidadInKg());
        System.out.println(t2.getCapacidadInKg());
        t1.desplazarse();
        t2.desplazarse();

        Autobus a1 = new Autobus();

        System.out.println(a1.getCapacidadInKg());
        System.out.println(a1.getVelocidadMaxima());

        Autobus a2 = new Autobus(2000, 120, 50);

        System.out.println(a2.getCapacidadInKg());
        System.out.println(a2.getVelocidadMaxima());
        System.out.println(a2.getCantidadDeAsientos());

        ExpresoTec e1 = new ExpresoTec();
        ExpresoTec e2 = new ExpresoTec("Patria");

        System.out.println(e1.getCapacidadInKg());
        System.out.println(e1.getVelocidadMaxima());
        System.out.println(e1.getCantidadDeAsientos());
        System.out.println(e1.getRuta());

        // System.out.println(a1.getRuta()); el el autobus no hereda los rasgos de su hijo
    }
}
