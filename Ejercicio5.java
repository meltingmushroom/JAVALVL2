package LVL2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        ArrayList<Integer> horasDeTrabajo = new ArrayList<>();
        ArrayList<Integer> valorXhora = new ArrayList<>();

        listaHoras(horasDeTrabajo);
        ListaValorXHoras(valorXhora);

        List<Integer> totalXsemana = new ArrayList<>();

        int resultado = 0;
        for (int i = 0; i < horasDeTrabajo.size() ; i++) {
            totalXsemana.add(horasDeTrabajo.get(i) * valorXhora.get(i));
            resultado += totalXsemana.get(i);
        }

        System.out.println(totalXsemana);
        System.out.println("Total Final: $ "+resultado);

    }

    public static void listaHoras(List<Integer>horasDeTrabajo) {
        horasDeTrabajo.add(6);
        horasDeTrabajo.add(7);
        horasDeTrabajo.add(8);
        horasDeTrabajo.add(4);
        horasDeTrabajo.add(5);
    }

    public static void ListaValorXHoras(List<Integer> valorXhora) {
        valorXhora.add(350);
        valorXhora.add(345);
        valorXhora.add(550);
        valorXhora.add(600);
        valorXhora.add(320);
    }
}