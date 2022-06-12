package LVL2;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<String> barajaFrancesa = new ArrayList<>();

        for (int i = 1; i < 13; i++) {
            barajaFrancesa.add(String.format("%s", i));
        }
        System.out.println("Baraja ordenada " + barajaFrancesa);
        Collections.reverse(barajaFrancesa);
        System.out.println("Baraja en orden inverso " + barajaFrancesa);
        Collections.shuffle(barajaFrancesa);
        System.out.println("Baraja mezclada " + barajaFrancesa);
    }
}

