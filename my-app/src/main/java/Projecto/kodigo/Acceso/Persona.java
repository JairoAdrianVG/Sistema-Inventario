package Projecto.kodigo.Acceso;
import lombok.*;

import java.io.*;
import java.util.Scanner;


@Data
public class Persona implements Serializable {
    private String nombre;
    private int dni;
    private int telefono;
    public String usuario;
    public String contraseña;
    public String userName;
    public String userPass;

    public void appInit() throws FileNotFoundException, IOException {
        Scanner x = new Scanner(System.in);
        System.out.println("\n" + "---------------------------------" + "\n" + "Bienvenido a su Sistema de Inventario, " +
                "para continuar seleccione un metodo de ingreso:" + "\n" + "---------------------------------");
        Systepackage Projecto.kodigo.Acceso;
import lombok.*;

import java.io.*;
import java.util.Scanner;


@Data
public class Persona implements Serializable {
    private String nombre;
    private int dni;
    private int telefono;
    public String usuario;
    public String contraseña;
    public String userName;
    public String userPass;

    public void appInit() throws FileNotFoundException, IOException {
        Scanner x = new Scanner(System.in);
        System.out.println("\n" + "---------------------------------" + "\n" + "Bienvenido a su Sistema de Inventario, " +
                "para continuar seleccione un metodo de ingreso:" + "\n" + "---------------------------------");
        System.out.println("1. Iniciar sesion como Administrador");
        System.out.println("2. Iniciar sesion como Usuario");
        System.out.println("3. Registrarse como Usuario");
        System.out.println("0. Exit");

        int num = x.nextInt();
        if (num == 1) {
            Admin administrador = Admin.getInstance("Administrador", "123456");
            System.out.println("Usted a iniciado sesion satisfactoriamente como " + administrador.getName());
            TypeMenu adminReturn = new TypeMenu();
            adminReturn.menuAdministrador();
        } else if (num == 2) {
            loginUsuario();
        } else if (num == 3) {
            registroUsuario();
        }
        else if (num == 0){
            System.out.println("Gracias por usar nuestra aplicacion.");
        }
    }

    public void registroUsuario() throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "---------------------------------------------------------" + "\n" +
                "Registrate:" + "\n" + "---------------------------------------------------------");
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();


        System.out.println("Ingresa tu dni:");
        dni = sc.nextInt();


        System.out.println("Ingresa tu telefono:");
        telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa tu usuario:");
        usuario = sc.nextLine();


        System.out.println("Ingresa tu contraseña:");
        contraseña = sc.nextLine();
        printPersona();
        createTXT();

        appInit();
    }

    public void createTXT() throws FileNotFoundException, IOException{
        File datos = new File("datos.txt");
        if(!datos.exists()) {
            datos.createNewFile();
        }
        PrintWriter pw = new PrintWriter(datos);
        pw.println("Nombre: " + getNombre());
        pw.println("DNI: " + getDni());
        pw.println("Telefono: " + getTelefono());
        pw.println("Usuario: " + getUsuario());
        pw.println("Contraseña: " + getContraseña());
        pw.close();
        System.out.println("===========================================================" + "\n" +
                "Archivo local generado con éxito." + "\n" +
                "===========================================================");
    }

    public void printPersona(){
        System.out.println("===========================================================" + "\n" +
                "Registro completado con éxito. Sus datos son:" + "\n" +
                "===========================================================");
        System.out.print("Tu nombre: ");
        System.out.println(getNombre());
        System.out.print("Tu DNI: ");
        System.out.println(getDni());
        System.out.print("Tu telefono: ");
        System.out.println(getTelefono());
        System.out.print("Tu usuario: ");
        System.out.println(getUsuario());
        System.out.print("Tu contraseña: ");
        System.out.println(getContraseña());
    }

    public void loginUsuario() throws FileNotFoundException, IOException{
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------------------------------------------" + "\n" +
                "Inicio de sesion:" + "\n" + "---------------------------------------------------------");
        System.out.println("Inicio de sesión: ");
        boolean check = true;

        while(check) {
            System.out.println("Ingresa tu usuario: ");
            userName = input.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            userPass = input.nextLine();
            check = validacionUsuario(userName, userPass);

        }
    }

    public boolean validacionUsuario(String a, String b){
         boolean flag;

        if (!a.equals(usuario))
        {
            System.out.println("Usuario incorrecto, por favor, intente nuevamente" + "\n" +
                    "-----------------------------------------------------");
        }else if(!b.equals(contraseña)){
            System.out.println("Contraseña incorrecta, por favor, intente nuevamente." + "\n" +
                    "-----------------------------------------------------");
        } else {
            System.out.println("===========================================================" + "\n" +
                    "Iniciaste sesion correctamente. Bienvenido!");
                    TypeMenu userReturn = new TypeMenu();
                    flag = userReturn.menuUsuario();
                    return (flag);
        }
        return (true);
    }
}
