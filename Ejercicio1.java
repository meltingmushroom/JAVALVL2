package LVL2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> ciudades = new ArrayList<>();

        int x = 1, i = 1;

        while (x != 0) {

            System.out.println("Ingresar ciudad favorita : ");

            System.out.println("#" + (i));
            String ciudad = sc.nextLine();
            ciudades.add(ciudad);
            i++;

            System.out.println("Presione 0 para finalizar, o cualquier otro número para ingresar una nueva ciudad");
            x = Integer.parseInt(sc.nextLine());

        }

        cuidadesFavoritas(ciudades);

        sc.close();

    }

    public static void cuidadesFavoritas(ArrayList<String> ciudades) {

        System.out.println("Ranking de ciudades favoritas  : ");

        for (String c : ciudades) {

            System.out.println("#" + (ciudades.indexOf(c) + 1) + " - " + c);
        }
    }
}


