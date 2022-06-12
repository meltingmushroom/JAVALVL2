package LVL2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        ListaAlumnos(nombres);

        ArrayList<String> curso1 = new ArrayList<String>(nombres.subList(0, 4));
        ArrayList<String> curso2 = new ArrayList<String>(nombres.subList(4, 8));
        ArrayList<String> curso3 = new ArrayList<String>(nombres.subList(8, 12));

        System.out.println("Alumnos del primer curso: " + curso1);
        System.out.println("Alumnos del segundo curso: " + curso2);
        System.out.println("Alumnos del tercer curso: " + curso3);


    }

    public static void ListaAlumnos(List<String> nombres) {
        nombres.add("Diana");
        nombres.add("Lilith");
        nombres.add("Perséfone");
        nombres.add("Félix");
        nombres.add("Isis");
        nombres.add("Kira");
        nombres.add("Bastet");
        nombres.add("Kali");
        nombres.add("Lucy");
        nombres.add("Anya");
        nombres.add("Sky");
        nombres.add("Lykan");

    }
}
