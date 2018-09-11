import javax.swing.*;

//HECHO, REALIZADO, Y SUFRIDO POR JUAN DANIEL RUBIO CAMACHO - A01633924 (MÁTENME POR FAVOR)
public class Database{

    public static void main(String[] args){

        Student[] array = new Student[10];

        Student mayra = new Student("Mayra", "Guajardo", "10", false);
        //Constructor toString()
        System.out.println(mayra);

        int index = 0;
        Boolean estado = true;
        while(estado == true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n 1) Crear nuevo estudiante. \n 2) Editar estudiante. \n 3) Encontrar estudiante. \n 4) Eliminar estudiante. \n 5) Nombrar asistencia. \n 6) Mostar estudiantes actuales. \n 7) Salir."));
            boolean attendance = false;
            int counter = 0;
            int attendanceNumero = 0;
            for (int i=0; i<array.length; i++){
                if (array[i] != null){
                    counter++;
                }
            }
            switch(opcion) {
                case 1:
                String name = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
                String lastName = JOptionPane.showInputDialog("Ingresa el apellido del alumno");
                double grade = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación del alumno"));
                Student estudiante = new Student(name, lastName, grade, attendance);
                if (index == 9){
                    index = 0;
                }
                array[index] = estudiante;
                index++;
                break;

                case 2:
                int position = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion del 0 al 9 del alumno que quieres editar: "));
                System.out.println("Datos del alumno: \n");
                System.out.println("Nombre: " + array[position].getName() + " Apellido: " + array[position].getLastName() + " Calificacion: " + array[position].getGrade() + " Asistencia: " + array[position].getAttendance());
                int editar = Integer.parseInt(JOptionPane.showInputDialog("¿Qué dato desea editar? \n 1) Nombre \n 2) Apellido \n 3) Calificacion \n 4) Asistencia"));
                if (editar == 1){
                     String newName = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                     array[position].setName(newName);
                } else if (editar == 2){
                    String newLastName = JOptionPane.showInputDialog("Ingresa el nuevo apellido");
                    array[position].setLastName(newLastName);
                } else if (editar == 3){
                    int newGrade = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nueva calificación"));
                    array[position].setGrade(newGrade);
                } else if (editar == 4){
                    attendanceNumero = Integer.parseInt(JOptionPane.showInputDialog("Asistió = 1, No asistió = 0"));
                    if (attendanceNumero == 1){
                        attendance = true;
                    } else if (attendanceNumero == 0){
                        attendance = false;
                    }
                    array[position].setAttendance(attendance);
                }
                System.out.println("Cambio realizado!");
                break;

                case 3:
                String buscaNombre = JOptionPane.showInputDialog("¿Cuál es el nombre del alumno que quieres conocer?");
                for (int x=0; x < counter; x++){
                    if (array[x].getName().equals(buscaNombre)){
                        System.out.println("Nombre: " + array[x].getName() + " Calificacion: " + array[x].getGrade());
                    }
                }
                /*
                for (int i=0; array.length; i++){
                    if (array[i] != null){
                        if (array[i].getName().equals(buscaNombre)){
                            System.out.println(array[i].getGrade());
                        }
                    }
                }
                */

                break;

                case 4:
                int borrar = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el número de estudiante a borrar (0 a 9)"));
                array[borrar] = null;
                for (int x=borrar; x<counter; x++){
                    array[x] = array[x+1];
                }
                /*
                for (int i=borrar; i < estudiantes.length -1; i++){
                    estudiantes[i] = estudiantes[i+1];
                }
                estudiantes[estudiantes.length - 1] = null;
                */
                break;

                case 5:
                for (int x=0; x<counter; x++){
                    String asistencia = JOptionPane.showInputDialog(array[x].getName() + " estás presente? (si/no)");
                    if (asistencia.equals("si")){
                        boolean valor = true;
                        array[x].setAttendance(valor);
                    } else if (asistencia == "no"){
                        boolean valor = false;
                        array[x].setAttendance(valor);
                    }
                }
                break;

                case 6:
                for (int x = 0; x < counter; x++){
                    position = x;
                    System.out.println("Nombre: " + array[position].getName() + " Apellido: " + array[position].getLastName() + " Calificacion: " + array[position].getGrade() + " Asistencia: " + array[position].getAttendance());
                }
                break;
                case 7:
                estado = false;
                break;
            }
        }

    }
}
