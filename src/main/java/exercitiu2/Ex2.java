package exercitiu2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Clasa Principala
 * @author Vidrean Alexandra-Maria
 * @version 1
 * @since 2024
 */

public class Ex2 {
    /**
     * Metoda care va salva lista perechilor de numere in fisierul "perecheNumere.json"
     * @param lista
     */
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/perechinumere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda care va incarca lista perechilor de numere din fisierul "perecheNumere.json" in program
     * @return
     */
    public static List<PerecheNumere> citire() {
        try {
            File file=new File("src/main/resources/perechinumere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> persoane = mapper.readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        List<PerecheNumere>perecheNumereList=citire();
        System.out.println(perecheNumereList);
        for (PerecheNumere p : perecheNumereList)
            System.out.println(p + " ");

        scriere(perecheNumereList);

    }
}
