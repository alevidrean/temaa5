package exercitiu3;

import java.util.List;
/**
 * Clasa Mobilier
 * @author Vidrean Alexandra-Maria
 * @version 1
 * @since 2024
 */
public class Mobilier {
    private String nume;
    private List<Placa> placi;
    /**
     * Constructorul clasei fara parametrii
     */
    public Mobilier(){};


    /**
     * Constructorul clasei Mobilier cu parametrii
     * @param nume - reprezinta numele pieselor de mobilier
     * @param placi - cuprinde informatiile privind placile de pal care compun piesa de mobilier
     */
    public Mobilier(String nume,List placi)
    {
super();
this.nume=nume;
this.placi=placi;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine numele pieselor
     * @return
     */

    public String getNume()
    {
        return nume;
    }
    /**
     * Getter care da acces de citire a variabilei membre ce contine placile ce compus piesa de mobilier
     * @return
     */
    public List<Placa> getPlaci()
    {
        return placi;
    }

    /**
     * Seteaza numele pieselor de mobilier
     * @param nume
     */
   public void setNume(String nume)
    {
        this.nume=nume;
    }
    /**
     * Setter pentru placi
     * @param placi
     */
   public void setPlaci(List<Placa> placi)
    {
        this.placi=placi;
    }
    /**
     * Calculare nr necesar de placi
     * @return arietotala/ariepal +1
     */
   public int nrplaci()
   {
       int ariepal=2800*2070;
       int arietotala=0;
       for(Placa p:placi)
       {
           arietotala=arietotala+p.arie();
       }
       System.out.println("Arie pal:"+ariepal);
       System.out.println("Arie totala mobilier:"+ arietotala);
       return arietotala/ariepal+1;
   }
    /**
     * Redefinirea metodei toString() din clasa Object, metodă care va fi utilizată pentru afișare
     * @return caracteristicile pieselor de mobilier
     */
    @Override
    public String toString() {
        return "Mobilier{" + "nume='" + nume + '\'' + ", placi=" + placi + '}';
    }
}
