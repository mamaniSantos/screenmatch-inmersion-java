import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersion en Java");
        //System.out.println("Pelicula Matrix");

        //Declaracion de variables

        int fechaDeLanzamineto = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """ 
                La mejor peliucla del milenio
                """;
        double mediaEvaluacionUsuario=0;

        System.out.println("Peliculas " + nombre);
        System.out.println(fechaDeLanzamineto);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evalucion de Matrix " + mediaEvaluacion);

        if (fechaDeLanzamineto >= 2023) {

            System.out.println("Pelicula popular del momento");

        } else {
            System.out.println("Pelicula Retro");
        }

        /*for (int i = 0; i < 3; i++) {

            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix= teclado.nextDouble();

            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + notaMatrix);


        }
        //System.out.println("La media de la pelicula Matrix calculada " +
               // "por el usuario es: "+mediaEvaluacionUsuario/3);*/


        //Desafios realizar README y construimos la repetición con WHILE
        int i=0;
        while (i!=3){

            i=i+1;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix= teclado.nextDouble();

            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + notaMatrix);

        }

        System.out.println("La media de la pelicula Matrix calculada " +
         "por el usuario es: "+mediaEvaluacionUsuario/3);



    }




}
