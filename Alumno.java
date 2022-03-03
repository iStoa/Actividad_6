package POO;

import java.util.Scanner;

public class Alumno<Public> {
    Scanner teclado = new Scanner(System.in);
    private String Alumno;
    int Calif [] =new int[5];
    private int suma;
    private int promedio;
    private String assigment;


     public void lista() {


            System.out.printf("Introduzca Nombre del Alumno: ");
            Alumno= teclado.next();
        }


    public void cal(){
        System.out.printf("-----CALIFICACIONES-------\n");

        System.out.printf("Calificacacion de la Materia 1: ");
        Calif[0] = teclado.nextInt();

        System.out.printf("Calificacacion de la Materia 2: ");
        Calif[1] = teclado.nextInt();

        System.out.printf("Calificacacion de la Materia 3: ");
        Calif[2] = teclado.nextInt();

        System.out.printf("Calificacacion de la Materia 4: ");
        Calif[3] = teclado.nextInt();

        System.out.printf("Calificacacion de la Materia 5:");
        Calif[4] = teclado.nextInt();


     }

     public void promedio(){

         for(int i =0; i<Calif.length;i++){
             suma+=Calif[i];
         }
         promedio = (suma/Calif.length);

    }

    public String letra(String assigment){
         if(promedio <=50) {
             System.out.println("Calificación: F");
             assigment=teclado.nextLine();

         }else if (promedio >=51 && promedio <=60){
                 System.out.println("Calificación: E");
             assigment=teclado.nextLine();

         }else if (promedio >=61 && promedio <=70){
             System.out.println("Calificación: D");
             assigment=teclado.nextLine();

         }else if (promedio >=71 && promedio <=80) {
             System.out.println("Calificación: C");
             assigment=teclado.nextLine();

         }else if (promedio >=81 && promedio <=90){
        System.out.println("Calificación: B");
             assigment=teclado.nextLine();

        }else if (promedio >=91 && promedio <=100){
        System.out.println("Calificación: A");
        assigment=teclado.nextLine();
        }

        return assigment;

    }

    public void imprimir(){
        System.out.println("\n\nNombre del Estudiante: "+Alumno);
        System.out.printf("\nCalificación 1: "+Calif[0]);
        System.out.printf("\nCalificación 2: "+Calif[1]);
        System.out.printf("\nCalificación 3: "+Calif[2]);
        System.out.printf("\nCalificación 4: "+Calif[3]);
        System.out.printf("\nCalificación 5: "+Calif[4]);
        System.out.println("\nPromedio: "+promedio);
        System.out.println(letra(assigment));
    }

}





