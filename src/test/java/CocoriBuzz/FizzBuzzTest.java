package CocoriBuzz;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static fr.arpinum.cocoritest.affirmation.Affirmations.alors;

public class FizzBuzzTest {

    @Before
    public void avant() {
        nombres = new FizzBuzz().nombres();
    }

    @Test
    public void peutObtenirLesNombres() {
        List<String> valeurs = Lists.newArrayList(nombres); // cocoritest ne gère pas encore les tableaux

        alors().les(valeurs).sontAuNombreDe(101);
    }

    @Test
    public void peutObtenirLesNombresSimples() {
        alors().le(nombres[1]).est("1");
        alors().le(nombres[2]).est("2");
        alors().le(nombres[98]).est("98");
    }

    @Test
    public void peutObtenirLesFizz() {
        alors().le(nombres[3]).est("Fizz");
        alors().le(nombres[6]).est("Fizz");
        alors().le(nombres[99]).est("Fizz");
    }

    @Test
    public void peutObtenirLesBuzz() {
        alors().le(nombres[5]).est("Buzz");
        alors().le(nombres[100]).est("Buzz");
    }

    @Test
    public void peutObtenirLesFizzBuzz() {
        alors().le(nombres[15]).est("FizzBuzz");
    }

    //@Test
    //public void peutObtenirLesFizzBuzz() {
    //    alors().lElement(15).de(nombres).est("FizzBuzz");
    //}

    private String[] nombres;
}
