package daw.programacion;

//import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsculturaTest {
    private Escultura escultura;
    @BeforeEach
    void crearEscultura(){
        escultura = new Escultura(1, "Pintura", "asd", "asd", 10, 20, 30, 2, "asd largo", "metal");
    }

    @AfterEach
    void borrarEscultura(){
        escultura = null;
    }

    @Test
    public void testGetTecnica() {
        String expected = "metal";
        assertEquals(expected, escultura.getMaterial(), "No se ha establecido bien el material");
    }

    @Test
    public void testSetTecnica(){
        String expected = "madera";
        escultura.setMaterial("madera");
        assertEquals(expected, escultura.getMaterial(), "El material no se ha cambiado");
    }
}
