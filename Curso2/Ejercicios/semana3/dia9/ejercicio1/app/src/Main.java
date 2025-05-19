import entities.Directorio;
import utils.ExploradorDirectorios;

public class Main {
    public static void main(String[] args) {
        // Creamos un archivo raiz y subdirectorios que sirvan de ejemplo
        Directorio raiz = new Directorio("ROOT");
        Directorio usuario = new Directorio("USER");
        Directorio publico = new Directorio("PUBLIC");
        Directorio documentos = new Directorio("DOCUMENTS");
        Directorio imagenes = new Directorio("PICTURES");
        // Construimos la jerarquía de subdirectorios
        raiz.addSubdirectory(usuario);
        raiz.addSubdirectory(publico);
        usuario.addSubdirectory(documentos);
        usuario.addSubdirectory(imagenes);
        // Agregamos archivos a los directorios y subdirectorios
        raiz.addFile("readme.txt");
        usuario.addFile("add-ons.zip");
        documentos.addFile("test.doc");
        documentos.addFile("prueba_tecnica.pdf");
        imagenes.addFile("jpeg_123456.jpeg");
        imagenes.addFile("bola.gif");
        // exploramos los directorios
        System.out.println("Sistema de archivos del sistema: ");
        ExploradorDirectorios.explorarDirectorio(raiz, "   ");
    }
}