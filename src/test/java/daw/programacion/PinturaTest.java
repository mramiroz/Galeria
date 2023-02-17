package daw.programacion;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//import org.junit.jupiter.params.provider.CsvSource;

public class PinturaTest {
    private Pintura pintura;

    @BeforeEach
    void crearPintura(){
        pintura = new Pintura(1, "Pintura", "asd", "asd", 10, 20, 30, 2, "asd largo", "oleo");
    }

    @AfterEach
    void borrarPintura(){
        pintura = null;
    }

    @Test
    public void testGetTecnica() {
        String expected = "oleo";
        assertEquals(expected, pintura.getTecnica(), "No se ha establecido bien la técnica");
    }

    @Test
    public void testSetTecnica() {
        String expected = "paco";
        pintura.setTecnica("paco");
        assertEquals(expected, pintura.getTecnica(), "La tecnica no se ha cambiano");
    }
}
