package exercitiu2;

import org.example.Persoana;


/**
 * Clasa PerecheNumere care are variabilele membre private doi intregi
 * @author Vidrean Alexandra-Maria
 * @version 1
 * @since 2024
 */

public class PerecheNumere {
    private int a;
    private int b;
    /**
     * Constructor fara parametrii
     */
    public PerecheNumere(){};

    /**
     * Constructorul clasei PerecheNumere cu parametrii
     * @param a-primul numar intreg
     * @param b-al doilea numar intreg
     */
    public PerecheNumere(int a,int b)
    {
        super();
        this.a=a;
        this.b=b;
    }

    /**
     * Metoda ce returneaza o valoare booleana care indica daca cele doua numere care formeaza perechea sunt numere consecutive in sirul lui Fibonacci
     * @param x
     * @param y
     * @return
     */

    public boolean fibonacci(int x, int y) {
        if((a == x && b == y) || (b == x && a == y)) {
            return true;
        }
        if(a < y || b < y) {
            return false;
        }
        return this.fibonacci(y, x+y);
    }
    /**
     * Metoda care returneaza cel mai mic multiplu comun al celor doua numere
     * @return
     */

    public int cmmmc() {
        int x = a, y = b;
        while(x != y) {
            if(x > y)
                x=x-y;
            else
                y=y-x;
        }
        int cmmdc = x;
        return a*b/cmmdc;
    }

    /**
     * Metoda care va returna boolean daca cele doua numere au suma cifrelor egala
     * @return
     */
    public boolean sumacifrelor()
    {
        int x = a, y = b;
        int sumaa = 0, sumab = 0;
        while(x != 0){
            sumaa += x%10;
            x/=10;
        }
        while(y != 0) {
            sumab += y%10;
            y/=10;
        }
        return sumaa == sumab;

    }
    /**
     * Metoda care va returna boolean daca cele doua numere au acelasi numar de cifre pare
     * @return
     */
    public boolean cifrepare()
    {
        int x=a,y=b;
        int nrcpa=0,nrcpb=0;
        while(x!=0)
        {
            if(x%2==0)
                nrcpa++;
            x/=10;
        }
        while(y!=0)
        {
            if(y%2==0)
                nrcpb++;
            y/=10;
        }
        return nrcpa==nrcpb;
    }
    /**
     * Getter care da acces de citire a variabilei membre care contine primul numar din pereche
     * @return a
     */

public int getA()
{
    return a;
}



    /**
     * Getter care da acces de citire a variabilei membre care contine cel de al doilea numar din pereche
     * @return b
     */
public int getB()
{
    return b;
}

    /**
     * Redefinirea metodei toString() din clasa Object, metodă care va fi utilizată pentru afișare
     * @return valorile lui x si y, separate prin virgula
     */
    @Override
    public String toString()
    {
        return "a + b";
    }
}
