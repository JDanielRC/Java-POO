//actividad realizada por Daniel Rubio A01633924
public class Computer {

    private int memory;
    private float clockSpeed;

    public int getMemory() { return memory; }
    private void setMemory(int memory) {this.memory = memory;}

    public float getClockSpeed() { return clockSpeed; }
    private void setAge(float clockSpeed) {this.clockSpeed = clockSpeed;}

    public Computer() {
        System.out.println("Constructor default");
        memory = 3072;
        clockSpeed = 3.7f;
    }

    public Computer(int memory, float clockSpeed) {
        this.memory=memory;
        this.clockSpeed=clockSpeed;
    }

    public void descarga(int memory){
        if (memory > 1024){
            System.out.println("Cuentas con " + memory + " megabytes de memoria, puedes realizar la descarga.");
        } else {
            System.out.println("Cuentas con solo " + memory + " megabytes de memoria, no puedes realizar esta descarga.");
        }
    }
    public void encender(float clockSpeed){
        System.out.println("El sistema se enciende con una velocidad de " + clockSpeed + " GHZ.");
    }

}
