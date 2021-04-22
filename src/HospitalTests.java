import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que se encarga de realizar pruebas unitarias a la implementacion de VectorHeap
 * @author Andres de la Roca 20332
 */
public class HospitalTests {
    VectorHeap queue = new VectorHeap();

    @Test
    public void TestAgregarYSacar() {
        queue.add("Lorena");
        queue.add("Ana");
        assertEquals("Ana", queue.getFirst());
    }
}
