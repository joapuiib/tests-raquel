import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedraPaperTisoresTest {
    @Test
    void test_givenPedraVsPedra_shouldReturn0(){
        String j1 = "pedra";
        String j2 = "pedra";
        int resultat = PedraPaperTisores.compare(j1, j2);
        assertEquals(0, resultat);
    }

    @Test
    void test_givenPedraVsPaper_shouldReturn2(){
        String j1 = "pedra";
        String j2 = "paper";
        int resultat = PedraPaperTisores.compare(j1, j2);
        assertEquals(2, resultat);
    }

    @Test
    void test_givenPedraVsTisores_shouldReturn1(){
        String j1 = "pedra";
        String j2 = "tisores";
        int resultat = PedraPaperTisores.compare(j1, j2);
        assertEquals(1, resultat);
    }
}