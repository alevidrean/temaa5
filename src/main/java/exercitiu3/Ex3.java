package exercitiu3;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Clasa Principala
 * @author Vidrean Alexandra-Maria
 * @version 1
 * @since 2024
 */
public class Ex3 {
    /**
     * Metoda statica care va salva datele despre piesele de mobilier in fisierul "mobilier.json"
     * @param lista
     */
    public static void scriere(List<Mobilier> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/mobilier.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda statica care va incarca lista pieselor de mobilier din fisierul "mobilier.json" in program
     * @return
     */
    public static List<Mobilier> citire() {
        try {
            File file=new File("src/main/resources/mobilier.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Mobilier> mobiliere = mapper.readValue(file, new TypeReference<List<Mobilier>>(){});
            return mobiliere;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        List<Mobilier>mobiliers=citire();
        Scanner scanner=new Scanner(System.in);
        int opt;
        do{
            System.out.println("\n0.Iesire");
            System.out.println("1.Afisarea elementelor de mobilier din colectie");
            System.out.println("2.Afisarea placilor unei anumite piese de mobilier");
            System.out.println("3.Nr colilor de pal necesare pentru realizarea unui anumit corp de mobile cu dimensiunea de 2800 x 2070 mm");
            System.out.print("Alegeti optiunea: ");
            opt=scanner.nextInt();
            switch (opt)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    /**
                     * Afisarea elementelor de mobilier din colectie si placile care le compun
                     */
                    for(Mobilier m: mobiliers)
                {
                    System.out.println(m);
                }
                    break;
                case 2:
                    /**
                     * Afisarea caracteristicilor placilor care compun o anumita piesa de mobilier
                     */
                    System.out.println("Introduceti numele pisei de mobilier pentru a vedea placile:");
                    String nume=scanner.next();

                    for(Mobilier m: mobiliers)
                {
                    if(m.getNume().equals(nume)) {
                        System.out.println("Placi pentru:" + nume + ":");
                        for (Placa placa : m.getPlaci())
                            System.out.println(placa);
                    }
                }
                    break;
                case 3:
                    /**
                     * Afișarea estimativa a numărului colilor de pal necesare pentru realizarea unui anumit corp de mobile știind că o coală de pal are dimensiunea 2800 x 2070 mm
                     */
                    System.out.println("Introduceti numele pisei de mobilier pentru a vedea de cate placi este nevoie:");
                    String num=scanner.next();

                    for(Mobilier m: mobiliers)
                    {
                        if(m.getNume().equals(num)) {
                            System.out.println(m.nrplaci());
                        }
                    }
                    break;
                default:
                    break;

            }

        }while(true);
    }
}
