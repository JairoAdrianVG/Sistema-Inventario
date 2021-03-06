package Projecto.kodigo.Acceso;

import Projecto.kodigo.Productos.Categorias;
import Projecto.kodigo.Productos.GestionProductos;
import Projecto.kodigo.Productos.Inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class TypeMenu {
    // Menu de cada tipo de usuario

    public ArrayList<String> categoria = new ArrayList<>();
    public ArrayList<String> userList = new ArrayList<>();
    ArrayList<String> producto = new ArrayList<>();

    public boolean menuAdministrador() {

        boolean confirm = true;

        while(confirm){
            System.out.println("Selecciona el numero requerido");
            System.out.println("-------------------------------");
            System.out.println("1. Inventario");
            System.out.println("2. Gestion de Producto");
            System.out.println("3. Creacion de categoria de producto");
            System.out.println("0. Exit");

            // Toma de datos para el menu
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // Llamada de clase Inventario
            Inventario adm = new Inventario();

            // Llamada gestion producto
            GestionProductos userAdm = new GestionProductos();

            if (number == 1){
                // llevar a la clase inventario
                confirm = adm.printPase(producto);
            }
            else if (number == 2){
                // Gestion de producto
                producto = userAdm.escogerOperacion(categoria);
            }
            else if (number == 3){
                Categorias userCategoria = new Categorias();
                userList = userCategoria.crudCategoriaProducto();
                for (int i = 0; i<userList.size(); i++){
                    categoria.add(userList.get(i));
                }
            }
            else if (number == 0){
                confirm = false;
            }
            else{
                System.out.println("Por favor, marque solo los numeros de seleccion disponibles");
            }

            if (number == 0){
                confirm = false;
                input.close();
            }
            else {
                confirm = true;
            }
        }
        return(confirm);
    }

    public boolean menuUsuario() {
        boolean confirm = true;
        while(confirm){
            System.out.println("Ingresa el numero que corresponda:");
            System.out.println("1. Mostrar el inventario");
            System.out.println("0. Exit");

            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            Inventario adm = new Inventario();

            if (num == 1 ) {
                confirm = adm.printPase(producto);
            }
            else if(num == 0){
                confirm = false;
                input.close();
            }
            else{
                confirm = true;
            }
        }
        return(confirm);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      package Projecto.kodigo.Acceso;

import Projecto.kodigo.Productos.Categorias;
import Projecto.kodigo.Productos.GestionProductos;
import Projecto.kodigo.Productos.Inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class TypeMenu {
    // Menu de cada tipo de usuario

    public ArrayList<String> categoria = new ArrayList<>();
    public ArrayList<String> userList = new ArrayList<>();
    ArrayList<String> producto = new ArrayList<>();

    public boolean menuAdministrador() {

        boolean confirm = true;

        while(confirm){
            System.out.println("Selecciona el numero requerido");
            System.out.println("-------------------------------");
            System.out.println("1. Inventario");
            System.out.println("2. Gestion de Producto");
            System.out.println("3. Creacion de categoria de producto");
            System.out.println("0. Exit");

            // Toma de datos para el menu
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // Llamada de clase Inventario
            Inventario adm = new Inventario();

            // Llamada gestion producto
            GestionProductos userAdm = new GestionProductos();

            if (number == 1){
                // llevar a la clase inventario
                confirm = adm.printPase(producto);
            }
            else if (number == 2){
                // Gestion de producto
                producto = userAdm.escogerOperacion(categoria);
            }
            else if (number == 3){
                Categorias userCategoria = new Categorias();
                userList = userCategoria.crudCategoriaProducto();
                for (int i = 0; i<userList.size(); i++){
                    categoria.add(userList.get(i));
                }
            }
            else if (number == 0){
                confirm = false;
            }
            else{
                System.out.println("Por favor, marque solo los numeros de seleccion disponibles");
            }

            if (number == 0){
                confirm = false;
                input.close();
            }
            else {
                confirm = true;
            }
        }
        return(confirm);
    }

    public boolean menuUsuario() {
        boolean confirm = true;
        while(confirm){
            System.out.println("Ingresa el numero que corresponda:");
            System.out.println("1. Mostrar el inventario");
            System.out.println("0. Exit");

            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            Inventario adm = new Inventario();

            if (num == 1 ) {
                confirm = adm.printPase(producto);
            }
            else if(num == 0){
                confirm = false;
                input.close();
            }
            else{
                confirm = true;
            }
        }
        return(confirm);
    }
}
