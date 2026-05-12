import java.io.IOException;

public class Main {
    public static void main(String[] args){
        TextFileWriter writer = new TextFileWriter("ejemplo.txt");

        try {
            writer.openFile();
            writer.writeToFile("Hola, mundo!\n");
            writer.writeToFile("Este es un archivo de texto plano creado en Java y POO");
            System.out.println("Archivo creado exitosamente");
        } catch (IOException e){
            System.err.println("Error al escribir en el archivo: "+e.getMessage());
        } finally{
            try{
                writer.closeFile();
            }catch (IOException e){
                System.err.println("Error al errar el archivo: "+e.getMessage());
            }
        }
    }
}
