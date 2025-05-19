package utils;

import entities.Directorio;

public class ExploradorDirectorios {
    public static void explorarDirectorio(Directorio dir, String tabulacion) {
        // Imprimimos el directorio actual donde estmos
        System.out.println(tabulacion + "(Directorio) " + dir.getNombre());
        // Con el for recorremos el directorio y nos da una lista de los archidos que están en él
        for (String archivo : dir.getArchivos()) {
            System.out.println(tabulacion + "   (Archivo) " + archivo);
        }
        // Con este for recorremos recursivamente los subdirectorios, llamando de nuevo al méto-do "explorar"
        for (Directorio subdir : dir.getSubdirectorios()) {
            explorarDirectorio(subdir, tabulacion + "   ");
        }
    }
}
