package org.example;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        class main {
            public main(String[] args) {

                Tipo1 Analgesico = new Tipo1("Analgesico", 4000d, "ASD", "HBN", LocalDate.now(), LocalDate.now(), 3d);
                System.out.println(Analgesico.getNombre());
                System.out.println("La cantidad del medicamento es:" + Analgesico.getCantidad());
                System.out.println("El valor Unitario del producto " + Analgesico.getNombre() + " es de: $" + Analgesico.getPrecio());
                System.out.println("El valor del descuento por la compra es: $" + Analgesico.calcularDescuento());
                System.out.println("El valor Total de la compra Tipo 1 es: $" + Analgesico.calcularCosto());
                Tipo2 Antiacido = new Tipo2("Antiacido", 6000d, "ASD", "HBN", LocalDate.now(), LocalDate.now(), 3d);
                System.out.println(Antiacido.getNombre());
                System.out.println("La cantidad del medicamento es:" + Antiacido.getCantidad());
                System.out.println("El valor Unitario del producto " + Antiacido.getNombre() + " es de: $" + Antiacido.getPrecio());
                System.out.println("El valor del descuento por la compra es: $" + Antiacido.calcularDescuento());
                System.out.println("El valor Total de la compra Tipo 2 es : $" + Antiacido.calcularCosto());
                Tipo3 Antialergenico = new Tipo3("Antialergenico", 8000d, "ASD", "HBN", LocalDate.now(), LocalDate.now(), 3d);
                System.out.println(Antialergenico.getNombre());
                System.out.println("La cantidad del medicamento es:" + Antialergenico.getCantidad());
                System.out.println("El valor Unitario del producto " + Antialergenico.getNombre() + " es de: $" + Antialergenico.getPrecio());
                System.out.println("El valor del descuento por la compra es: $" + Antialergenico.calcularDescuento());
                System.out.println("El valor Total de la compra Tipo 3 es : $" + Antialergenico.calcularCosto());
                Tipo4 Antiinflamatorio = new Tipo4("Antiinflamatorio", 10000d, "ASD", "HBN", LocalDate.now(), LocalDate.now(), 3d);
                System.out.println(Antiinflamatorio.getNombre());
                System.out.println("La cantidad del medicamento es:" + Antiinflamatorio.getCantidad());
                System.out.println("El valor Unitario del producto " + Antiinflamatorio.getNombre() + " es de: $" + Antiinflamatorio.getPrecio());
                System.out.println("El valor del descuento por la compra es: $" + Antiinflamatorio.calcularDescuento());
                System.out.println("El valor Total de la compra Tipo 4 es : $" + Antiinflamatorio.calcularCosto());
                Tipo5 Antiinfeccioso = new Tipo5("Antiinfeccioso", 100000d, "ASD", "HBN", LocalDate.now(), LocalDate.now(), 3d);
                System.out.println(Antiinfeccioso.getNombre());
                System.out.println("La cantidad del medicamento es:" + Antiinfeccioso.getCantidad());
                System.out.println("El valor Unitario del producto " + Antiinfeccioso.getNombre() + " es de: $" + Antiinfeccioso.getPrecio());
                System.out.println("El valor del descuento por la compra es: $" + Antiinfeccioso.calcularDescuento());
                System.out.println("El valor Total de la compra Tipo 5 es : $" + Antiinfeccioso.calcularCosto());


            }
        }
    }
}