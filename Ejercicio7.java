package LVL2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número menor: ");
        int numMenor = scan.nextInt();
        System.out.println("Ingrese el número mayor: ");
        int numMayor = scan.nextInt();

        scan.close();

        System.out.println(Arrays.toString(FizzBuzzFunction(numMenor, numMayor).toArray()));

    }

    public static List<String> FizzBuzzFunction(int argumento1, int argumento2) {
        List<String> array = new ArrayList<>();

        for (int i = argumento1; i <= argumento2; i++) {
            if (argumento1 % 2 == 0 && argumento1 % 3 == 0) {
                array.add(i + " " + "FizzBuzz");
            } else if (argumento1 % 3 == 0) {
                array.add(i + " " + "Buzz");
            } else if (argumento1 % 2 == 0) {
                array.add(i + " " + "Fizz");
            }
        }
        return (array);
    }
}