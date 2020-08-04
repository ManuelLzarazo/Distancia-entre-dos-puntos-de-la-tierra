package distancia.entre.dos.puntos.de.la.tierra;

import java.util.Scanner;

public class DistanciaEntreDosPuntosDeLaTierra {

    public static void main(String[] args) {
        

            
   Scanner Teclado =new Scanner(System.in);



        double Latitud1 =0;

        double Latitud2 =0;

        double Longitud1 =0; 

        double Longitud2 =0;

        double Distancia =0;
   
    System.out.println("Diguite la Latidud de la primera ciudad");

            Latitud1 = Teclado.nextInt();

     System.out.println("Digite la Longitud de la primera ciudad");

             Longitud1 = Teclado.nextInt();

     System.out.println("Diguite la Latidud de la segunda ciudad");

            Latitud2 = Teclado.nextInt();

     System.out.println("Digite la Longitud de la segunda ciudad");

             Longitud2 = Teclado.nextInt();       
            



        Distancia = 6371.07*((Math.acos(Latitud1))*(Math.sin(Latitud2))+(Math.cos(Latitud1))*(Math.cos(Latitud2))*Math.cos(Longitud1 - Longitud2));
        

     System.out.print("La distancia entre las dos ciudades es :"+Distancia);

     
     System.out.print("Kilometros");
    }
   
}

 

