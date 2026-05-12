import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TextFileWriter writer = new TextFileWriter("ejemplo.txt");
        System.out.println("Programa para crear archivo sobre tu personaje favorito");
        System.out.println("Como se llama tu personaje?");
        String name = sc.nextLine();
        System.out.println("De que serie/pelicula/videojuego/etc es tu personaje?");
        String place = sc.nextLine();
        System.out.println("Cuando es el cumpleaños de tu personaje?");
        String bd = sc.nextLine();
        System.out.println("Cual es la caracteristica principal de tu personaje?");
        String car = sc.nextLine();
        System.out.println("Cual es la debilidad de tu personaje?");
        String deb = sc.nextLine();


        try {
            writer.openFile();
            writer.writeToFile("Nombre: "+name+" - "+place+"\n");
            writer.writeToFile("Cumpleaños: "+bd+"\n");
            writer.writeToFile("Caracteristica principal: "+car+"\n");
            writer.writeToFile("Debilidad: "+deb+"\n");
            System.out.println("Archivo creado exitosamente");
        } catch (IOException e){
            System.err.println("Error al escribir en el archivo: "+e.getMessage());
        } finally{
            try{
                writer.closeFile();
            }catch (IOException e){
                System.err.println("Error al cerrar el archivo: "+e.getMessage());
            }
        }
    }
}
