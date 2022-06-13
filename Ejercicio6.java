package LVL2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Empleado {
    public String nombre;
    public int dni;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(int dni, String nombre, int horasTrabajadas, int valorPorHora){
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (this.dni + " - "+this.nombre);
    }
}

public class Ejercicio6 {


    public static void main(String[] args) {
        //Inicializo el hashset
        Set<Empleado> empleados = new HashSet<Empleado>();
        //Inicializar HashMap
        Map<Integer, Integer> sueldos = new HashMap<>();
        //Cargo Empleados de prueba
        empleados.add(new Empleado(12345678, "Humming", 6, 200));
        empleados.add(new Empleado(23456789, "Bird", 8, 300));
        empleados.add(new Empleado(34567891, "Blue", 5, 300));
        //Cargo sueldos
        for (Empleado i : empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas*i.valorPorHora));
        }
        System.out.println("Sueldo para DNI 12345678: "+sueldos.get(12345678));
        System.out.println("Sueldo para DNI 23456789: "+sueldos.get(23456789));
        System.out.println("Sueldo para DNI 34567891: "+sueldos.get(34567891));
    }
}
