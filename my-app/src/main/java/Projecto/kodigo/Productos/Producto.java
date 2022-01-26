package Projecto.kodigo.Productos;
import lombok.Data;
import java.util.ArrayList;
import java.util.Scanner;
/*
*SuperClase encargada de definir campos y métodos para
* @author Jonathan
*
* */
@Data


public class Producto {

    private int id;
    private String nombreProducto;
    private String categoria;
    private String tipoUnd;
    Scanner sc = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();

    public Producto() {
    }

    public Producto(int id, String nombreProducto, String categoria, String tipoUnd) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.tipoUnd = tipoUnd;
    }
    public void registrarProducto(ArrayList<String> categoriaList) {
        boolean ans = categoriaList.isEmpty();
        System.out.println("*==Ingresa el ID del producto: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("*==Ingresa el nombre de producto: ");
        nombreProducto = sc.nextLine();

        System.out.println("*==Ingresa la categoría del producto: ");
        categoria = sc.nextLine();

        if(ans == true){
            System.out.println("No hay ninguna categoria creada");
            return;
        }

        for(int i = 0; i<categoriaList.size(); i++){
            boolean areEqual = categoria.equals(categoriaList.get(i));
            if(areEqual){
                break;
            }
            else{
                System.out.println("Esta categoria no se encuentra creada, por favor dirigase al menu de creacion de categoria");
                return;
            }
        }

        System.out.println("*==Ingresa el tipo de unidad: ");
        tipoUnd = sc.nextLine();

        productos.add(new Producto(id, nombreProducto, categoria, tipoUnd));

        System.out.println("Se creo correctamente el producto");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("===========================================================" + "\n" +
                    "Parece que no hay nada por acá, ¡ingrese un producto antes!" + "\n" +
                    "===========================================================");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("===========================" + "\n" +
                        "->ID de producto: " + productos.get(i).getId() + "\n" +
                        "->Nombre de producto: " + productos.get(i).getNombreProducto() + "\n" +
                        "->Categoria de producto: " + productos.get(i).getCategoria() + "\n" +
                        "->Tipo de unidad: " + productos.get(i).getTipoUnd() + "\n"
                );
            }
        }
    }


    public void modificarProducto() {
        if (productos.isEmpty()) {
            System.out.println("===========================================================" + "\n" +
                    "Parece que no hay nada por acá, ¡ingrese un producto antes!" + "\n" +
                    "===========================================================");

        }else{
            System.out.println("*==Ingrese el ID del prodpackage Projecto.kodigo.Productos;
import lombok.Data;
import java.util.ArrayList;
import java.util.Scanner;
/*
*SuperClase encargada de definir campos y métodos para
* @author Jonathan
*
* */
@Data


public class Producto {

    private int id;
    private String nombreProducto;
    private String categoria;
    private String tipoUnd;
    Scanner sc = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();

    public Producto() {
    }

    public Producto(int id, String nombreProducto, String categoria, String tipoUnd) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.tipoUnd = tipoUnd;
    }
    public void registrarProducto(ArrayList<String> categoriaList) {
        boolean ans = categoriaList.isEmpty();
        System.out.println("*==Ingresa el ID del producto: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("*==Ingresa el nombre de producto: ");
        nombreProducto = sc.nextLine();

        System.out.println("*==Ingresa la categoría del producto: ");
        categoria = sc.nextLine();

        if(ans == true){
            System.out.println("No hay ninguna categoria creada");
            return;
        }

        for(int i = 0; i<categoriaList.size(); i++){
            boolean areEqual = categoria.equals(categoriaList.get(i));
            if(areEqual){
                break;
            }
            else{
                System.out.println("Esta categoria no se encuentra creada, por favor dirigase al menu de creacion de categoria");
                return;
            }
        }

        System.out.println("*==Ingresa el tipo de unidad: ");
        tipoUnd = sc.nextLine();

        productos.add(new Producto(id, nombreProducto, categoria, tipoUnd));

        System.out.println("Se creo correctamente el producto");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("===========================================================" + "\n" +
                    "Parece que no hay nada por acá, ¡ingrese un producto antes!" + "\n" +
                    "===========================================================");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("===========================" + "\n" +
                        "->ID de producto: " + productos.get(i).getId() + "\n" +
                        "->Nombre de producto: " + productos.get(i).getNombreProducto() + "\n" +
                        "->Categoria de producto: " + productos.get(i).getCategoria() + "\n" +
                        "->Tipo de unidad: " + productos.get(i).getTipoUnd() + "\n"
                );
            }
        }
    }


    public void modificarProducto() {
        if (productos.isEmpty()) {
            System.out.println("===========================================================" + "\n" +
                    "Parece que no hay nada por acá, ¡ingrese un producto antes!" + "\n" +
                    "===========================================================");

        }else{
            System.out.println("*==Ingrese el ID del producto para modificar sus datos: ");
            int idModificar = sc.nextInt();
            int pos = -1;
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getId() == idModificar)
                    pos = i;
            }
            if (pos != -1) {
                registrarProducto(temp);
                productos.get(pos).setId(id);
                productos.get(pos).setNombreProducto(nombreProducto);
                productos.get(pos).setCategoria(categoria);
                productos.get(pos).setTipoUnd(tipoUnd);
                System.out.println("==========================================================" + "\n" +
                        "Producto actualizado con éxito, puede ver sus nuevos datos" + "\n" +
                        "==========================================================");

            }else{
                System.out.println("=================================================" + "\n" +
                        "¿Se equivocó? no tenemos este ID en nuestra lista" + "\n" +
                        "=================================================");
            }

        }

    }

    public void eliminarProducto() {
        System.out.println("*==Ingrese el ID del producto para eliminarlo: ");
        int idEliminar = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == idEliminar)
                pos = i;
        }
        if (pos != -1) {
            productos.remove(pos);
            System.out.println("=================================================" + "\n" +
                    "      Se ha eliminado el producto con éxito." + "\n" +
                    "=================================================");

        } else {
            System.out.println("=================================================" + "\n" +
                    "¿Se equivocó? no tenemos este ID en nuestra lista" + "\n" +
                    "=================================================");
        }
    }
}
