public class Student{

    private String name;
    private String lastName;
    private double grade;
    private boolean attendance;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public Double getGrade() {return grade;}
    public void setGrade(double grade) {this.grade = grade;}
    public boolean getAttendance() {return attendance;}
    public void setAttendance(boolean attendance) {this.attendance = attendance;}

    public Student(String name, String lastName, Double grade, Boolean attendance){

        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
        this.attendance = false;
    }

    public Student(){

    }

    public void asistio() { asistencia = true;}
    public void falto() { asistencia = false;}

    public String toString(){
        return nombre + "" + apellido + "," + calificación + "," + asistencia;
    }
}
