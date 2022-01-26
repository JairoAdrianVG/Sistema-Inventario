package Projecto.kodigo.Dependencias;

import Projecto.kodigo.Acceso.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class DatosTXT {
    public void createTXT() throws FileNotFoundException, IOException {
        File datos = new File("datos.txt");
        Persona persona = new Persona();
        if(!datos.exists()) {
            datos.createNewFile();
package Projecto.kodigo.Dependencias;

import Projecto.kodigo.Acceso.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class DatosTXT {
    public void createTXT() throws FileNotFoundException, IOException {
        File datos = new File("datos.txt");
        Persona persona = new Persona();
        if(!datos.exists()) {
            datos.createNewFile();
        }
        PrintWriter pw = new PrintWriter(datos);
        pw.println("Nombre: " + persona.getNombre());
        pw.println("DNI: " + persona.getDni());
        pw.println("Telefono: " + persona.getTelefono());
        pw.println("Usuario: " + persona.getUsuario());
        pw.println("Contraseña: " + persona.getContraseña());
        pw.close();
        System.out.println("================================");
        System.out.println("Archivo local generado con éxito.");
        System.out.println("=================================");
    }
}
