//actividad realizada Juan Daniel Rubio Camacho A01633924
public class Actividad3 {

    public static void main(String[] args) {

        Eye rightEye = new Eye();
        Eye leftEye = new Eye();
        Head deBucky = new Head(leftEye, rightEye);
        Dog Charlie = new Dog();
        Dog Bucky = new Dog(4, 11, "Bucky", deBucky);

        rightEye.blink();
        leftEye.blink();

        Charlie.fight(Bucky);
        Bucky.fight(Charlie);

        Charlie.run(Bucky);
        Bucky.run(Charlie);

    }
}
