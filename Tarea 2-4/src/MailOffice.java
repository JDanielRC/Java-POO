//Juan Daniel Rubio Camacho A01633924
// estatico:
// no hay copia por objeto, pertenece a la clase
// 
public class MailOffice {

	public static Transporter getFastestDelivery(Transporter a, Transporter b) {
		if (a.calculateSpeed() > b.calculateSpeed()) {
			return a;
		}
		return b;
	}
	
	public static Robot getNewerRobot(Robot a, Robot b) {
		if (a.getYear() > b.getYear()) {
			return a;
		}
		return b;
	}
}
