//actividad realizada por Daniel Rubio A01633924
public class Kangaroo {

    private String name;
    private int age;

    public String getName() { return name; }
    private void setName(String name) {this.name = name;}

    public int getAge() { return age; }
    private void setAge(int age) {this.age = age;}

    public Kangaroo() {
        System.out.println("Constructor default");
        name = "Kangu";
        age = 8;
    }

    public Kangaroo(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void saltar(String name){
        System.out.println("El kanguro " + name + " salta!");
    }
    public void envejecer(String name, int age){
        System.out.println( name + " el kanguro ha envejecido un año más, ahora tiene " + (age+1) + " años.");
    }

}
