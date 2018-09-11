//actividad realizada por Juan Daniel Rubio Camacho A01633924
public class Actividad4 {
    public static void main(String[] args) {

        Vehicle T1 = new Vehicle(180, 4);
        T1.moving();
        System.out.println(T1.getSpeed());
        System.out.println(T1.getAsientos());

        Car C1 = new Car(150, 5, 4, 2009);
        C1.arrancar(C1.getSpeed());
        C1.moving();
        System.out.println(C1.getSpeed());
        System.out.println(C1.getAsientos());
        System.out.println(C1.getNumeroLlantas());
        System.out.println(C1.getYear());

        Sportscar SC1 = new Sportscar(250, 4, 4, 2017, "Mercedes", 4);
        SC1.pisarFondo(SC1.getMarca(), SC1.getSpeed());
        SC1.arrancar(SC1.getSpeed());
        SC1.moving();
        System.out.println(SC1.getSpeed());
        System.out.println(SC1.getAsientos());
        System.out.println(SC1.getNumeroLlantas());
        System.out.println(SC1.getYear());
        System.out.println(SC1.getMarca());
        System.out.println(SC1.getNumeroCilindros());

        Airplane A1 = new Airplane(950, 120, "Volaris", 8);
        A1.volar(A1.getAerolinea());
        A1.moving();
        System.out.println(A1.getSpeed());
        System.out.println(A1.getAsientos());
        System.out.println(A1.getAerolinea());
        System.out.println(A1.getPuertasDeEmergencia());
    }
}
