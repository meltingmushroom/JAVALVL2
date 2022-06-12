package LVL2;
import java.util.ArrayList;
import java.util.List;

    public class Ejercicio2 {

        public static void main(String[] args) {


            List<Integer> listaNumeros = new ArrayList<Integer>();

            listaNumeros.add(5);
            listaNumeros.add(3);
            listaNumeros.add(33);
            listaNumeros.add(17);
            listaNumeros.add(23);

            System.out.println("Tamaño de Lista: " + listaNumeros.size()+"- Elementos: "+listaNumeros);
            listaNumeros.add(0,11);
            System.out.println("Tamaño de la lista luego de agregar un elemento al inicio: " + listaNumeros.size());
            listaNumeros.add(6, 13);
            System.out.println("Tamaño de la lista luego de agregar un elemento al final: " + listaNumeros.size());

            for (int i = 0; i <= i ;) {
                System.out.println("Lista final: " + listaNumeros + ". Tamaño: "+ listaNumeros.size() + " elementos. ");
                break;

            }

        }


    }
