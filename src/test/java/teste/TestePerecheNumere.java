package teste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import exercitiu2.PerecheNumere;

/**
 * Teste pentru clasa PerecheNumere
 * @author Vidrean ALexandra-Maria
 * @version 1
 * @since 2024
 */
public class TestePerecheNumere {
    /**
     * Teste pentru metoda "consecutiveFibonacci"
     */
    @Nested
    class Teste_consecutiveFibonacci {
        @Test
        void test1_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(1,6);
            assertFalse(p.fibonacci(0, 1));
        }

        @Test
        void test2_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(3, 5);
            assertTrue(p.fibonacci(0, 1) );
        }

        @Test
        void test3_consecutiveFibonacci() {
            PerecheNumere p = new PerecheNumere(8, 24);
            assertFalse(p.fibonacci(0, 1) );
        }

    }
    /**
     * Teste pentru metoda "cel mai mic multiplu comun"
     */
    @Nested
    class Teste_cmmmc {
        @Test
        void test1_cmmmc() {
            PerecheNumere p = new PerecheNumere(5,11);
            assertTrue(p.cmmmc()==55);
        }

        @Test
        void test2_cmmmc() {
            PerecheNumere p = new PerecheNumere(2, 5);
            assertEquals(10,p.cmmmc());
        }

        @Test
        void test3_cmmmc() {
            PerecheNumere p = new PerecheNumere(3, 11);
            assertFalse(p.cmmmc()!=33 );
        }

    }
    /**
     * Teste pentru metoda "suma cifrelor egala"
     */
    @Nested
    class Teste_sumacifre {
        @Test
        void test1_sumacifre() {
            PerecheNumere p = new PerecheNumere(20,11);
            assertTrue(p.sumacifrelor());
        }

        @Test
        void test2_sumacifre() {
            PerecheNumere p = new PerecheNumere(22, 31);
            assertTrue(p.sumacifrelor());
        }

        @Test
        void test3_sumacifre() {
            PerecheNumere p = new PerecheNumere(32, 454);
            assertFalse(p.sumacifrelor());
        }

    }
    /**
     * Teste pentru metoda "acelasi numar de cifre pare"
     */
    @Nested
    class Teste_cifrepare {
        @Test
        void test1_cifrepare() {
            PerecheNumere p = new PerecheNumere(210,142);
            assertTrue(p.sumacifrelor());
        }

        @Test
        void test2_cifrepare() {
            PerecheNumere p = new PerecheNumere(21, 31);
            assertTrue(p.sumacifrelor());
        }

        @Test
        void test3_cifrepare() {
            PerecheNumere p = new PerecheNumere(32, 454);
            assertFalse(p.sumacifrelor());
        }

    }
}
