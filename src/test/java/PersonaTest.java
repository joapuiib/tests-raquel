import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Nested
    class Constructors {
        @Test
        void test_givenConstructorWithAllAttributes_shouldSetAllAttributes() {
            Persona persona = new Persona("Joan", "Martínez", 25);
            assertAll(
                () ->assertEquals("Joan", persona.getNom()),
                () ->assertEquals("Martínez", persona.getCognoms()),
                () ->assertEquals(25, persona.getEdat())
            );
        }

        @Test
        void test_givenConstructorWithNoEdat_shouldSetEdatToZero() {
            Persona persona = new Persona("Joan", "Martínez");
            assertAll(
                    () ->assertEquals("Joan", persona.getNom()),
                    () ->assertEquals("Martínez", persona.getCognoms()),
                    () ->assertEquals(0, persona.getEdat())
            );
        }
    }

    @Nested
    class Setters {
        @Test
        void test_setNom() {
            Persona persona = new Persona("Joan", "Martínez", 25);
            persona.setNom("Pere");
            assertEquals("Pere", persona.getNom());
        }

        @Test
        void test_setCognoms() {
            Persona persona = new Persona("Joan", "Martínez", 25);
            persona.setCognoms("García");
            assertEquals("García", persona.getCognoms());
        }

        @Test
        void test_setEdat() {
            Persona persona = new Persona("Joan", "Martínez", 25);
            persona.setEdat(30);
            assertEquals(30, persona.getEdat());
        }
    }

    @Nested
    class EsMajorEdat {
        @Test
        void test_givenEdatGreaterThan18_shouldReturnTrue() {
            Persona persona = new Persona("Joan", "Martínez", 25);
            assertTrue(persona.esMajorEdat());
        }

        @Test
        void test_givenEdatEqual18_shouldReturnTrue() {
            Persona persona = new Persona("Joan", "Martínez", 18);
            assertTrue(persona.esMajorEdat());
        }

        @Test
        void test_givenEdatLessThan18_shouldReturnFalse() {
            Persona persona = new Persona("Joan", "Martínez", 17);
            assertFalse(persona.esMajorEdat());
        }
    }
}