package Projecto.kodigo.Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {
    Producto gestionProductos = new Producto();
    Scanner sc = new Scanner(System.in);
    private int operacion;
    ArrayList<String> producto = new ArrayList<>();

    public ArrayList<String> escogerOperacion(ArrayList<String> categoria){
        do {
            System.out.println("========¿Qué operación deseas hacer?========");
            System.out.println("1>>>Registrar productos"+"\n"+
                    "2>>>Eliminar productos" +"\n"+
                    "3>>>Mostrar productos"  +"\n"+
                    "4>>>Modificar productos" + "\n"+
                    "5>>>Regresar" + "\n"+"\n"+
                    "-***Interactúe con el menú ingresando el dígito correspondiente a una acción: ");
            operacion = sc.nextInt();
            switch (operacion){
                case 1:
                    gestionProductos.registrarProducto(categoria);
                    continue;
                case 2:
                    gestionProductos.eliminarProducto();
                    continue;
                case 3:
                    gestionProductos.mostrarProductos();
                    continue;
                case 4:
                    gestionProductos.modificarProducto();
                    continue;
                case 5:
            }
        }while (operacion!=5);
        return categoria;
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 package Projecto.kodigo.Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {
    Producto gestionProductos = new Producto();
    Scanner sc = new Scanner(System.in);
    private int operacion;
    ArrayList<String> producto = new ArrayList<>();

    public ArrayList<String> escogerOperacion(ArrayList<String> categoria){
        do {
            System.out.println("========¿Qué operación deseas hacer?========");
            System.out.println("1>>>Registrar productos"+"\n"+
                    "2>>>Eliminar productos" +"\n"+
                    "3>>>Mostrar productos"  +"\n"+
                    "4>>>Modificar productos" + "\n"+
                    "5>>>Regresar" + "\n"+"\n"+
                    "-***Interactúe con el menú ingresando el dígito correspondiente a una acción: ");
            operacion = sc.nextInt();
            switch (operacion){
                case 1:
                    gestionProductos.registrarProducto(categoria);
                    continue;
                case 2:
                    gestionProductos.eliminarProducto();
                    continue;
                case 3:
                    gestionProductos.mostrarProductos();
                    continue;
                case 4:
                    gestionProductos.modificarProducto();
                    continue;
                case 5:
            }
        }while (operacion!=5);
        return categoria;
    }
}
