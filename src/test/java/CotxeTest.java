import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CotxeTest {
    @Nested
    class Constructors {
        @Test
        void testConstructor() {
            Cotxe cotxe = new Cotxe("1234ABC", "Seat", "Ibiza");
            assertEquals("1234ABC", cotxe.getMatricula());
            assertEquals("Seat", cotxe.getMarca());
            assertEquals("Ibiza", cotxe.getModel());
        }

        @Test
        void testConstructor_velocitatShouldBe0() {
            Cotxe cotxe = new Cotxe("1234ABC", "Seat", "Ibiza");
            assertEquals(0, cotxe.getVelocitat());
        }
    }

    @Nested
    class Accelerate {
        @Test
        void testAccelerate_given10_shouldAccelerate10() {
            Cotxe cotxe = new Cotxe("1234ABC", "Seat", "Ibiza");
            cotxe.accelerate(10);
            assertEquals(10, cotxe.getVelocitat());
        }

        @Test
        void testAccelerate_given20_shouldAccelerate20() {
            Cotxe cotxe = new Cotxe("1234ABC", "Seat", "Ibiza");
            cotxe.accelerate(20);
            assertEquals(20, cotxe.getVelocitat());
        }

        @Test
        void testAccelerate_givenACarWith10_accelerate10_shouldAccelerate10() {
            Cotxe cotxe = new Cotxe("1234ABC", "Seat", "Ibiza");
            cotxe.setVelocitat(10);
            cotxe.accelerate(10);
            assertEquals(20, cotxe.getVelocitat());
        }
    }
}