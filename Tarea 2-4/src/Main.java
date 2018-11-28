//Juan Daniel Rubio Camacho A01633924
public class Main {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("Prime", 1999, "Optimus");
		DeliveryPlane dp1 = new DeliveryPlane("Avionsin", 2005, 3.5f);
		DeliveryDrone dd1 = new DeliveryDrone("Bombol", 1993, "Bee", 4);
		Mailman m1 = new Mailman("Pepe");
		// se va realizando todo de izq a derecha, entonces al decir .state your name es como si pusiera el objeto con el stateYourName
		System.out.println(MailOffice.getFastestDelivery(dp1, dd1).stateYourName() + " es el más rápido.");
		System.out.println(MailOffice.getFastestDelivery(dp1, m1).stateYourName() + " es el más rápido.");
		System.out.println(MailOffice.getFastestDelivery(m1, dd1).stateYourName() + " es el más rápido.");
		System.out.println(MailOffice.getNewerRobot(r1, dd1).getName() + " es el robot más nuevo.");


	}

}
