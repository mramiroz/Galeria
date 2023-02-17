package daw.programacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ObraTest {
    private Obra obra;
    @BeforeEach
    void crearObra(){
        obra = new Obra(1, "Escultura", "Obra1", "Autor1", 100, 2, 40, 4, "asd");
    }

    @AfterEach
    void borrarObra(){
        obra = null;
    }
    @Test
    void testGetId() {
        int expected = 1;
        assertEquals(expected, obra.getId(), "No se ha establecido bien el id");
    }
    
    @Test
    void testGetNombre() {
        String expected = "Obra1";
        assertEquals(expected, obra.getNombre(), "No se ha establecido bien el nombre");
    }

    @Test
    void testGetAltura() {
        double expected = 2;
        assertEquals(expected, obra.getAltura(), "No se ha establecido bien la altura");
    }
    
    @Test
    void testGetAutor() {
        String expected = "Autor1";
        assertEquals(expected, obra.getAutor(), "No se ha establecido bien el autor");
    }
    
    @Test
    void testGetDesc() {
        String expected = "asd";
        assertEquals(expected, obra.getDesc(), "No se ha establecido bien la descripción");
    }

    @Test
    void testGetPeso() {
        double expected = 40;
        assertEquals(expected, obra.getPeso(), "No se ha establecido bien el peso");
    }
    
    @Test
    void testGetPiezas() {
        int expected = 4;
        assertEquals(expected, obra.getPiezas(), "No se ha establecido bien las piezas");

    }

    @Test
    void testGetPrecio() {
        double expected = 100;
        assertEquals(expected, obra.getPrecio(), "No se ha establecido bien el precio");

    }

    @Test
    void testGetTipo() {
        String expected = "Escultura";
        assertEquals(expected, obra.getTipo(), "No se ha establecido bien el tipo");
    }

    @Test
    void testImprimirEtiquetaToString() {

    }

    @Test
    void testMostrarObrasToString() {

    }

    @Test
    void testObtenerImporteAdicional() {

    }

    @Test
    void testObtenerImporteAlturaMenorIgual2() {
        double expected = 20;
        assertEquals(expected, obra.obtenerImporteAltura());
    }

    @Test
    void testObtenerImporteAlturaMayorIgual2() {
        double expected = 100;
        obra.setAltura(4);
        assertEquals(expected, obra.obtenerImporteAltura());
    }

    @Test
    void testObtenerImportePeso() {
        double expected = 10
    }

    @Test
    void testObtenerPrecio() {

    }

    @Test
    void testObternerComisionGaleria() {

    }

    @Test
    void testObternerPrecioToString() {

    }

    @Test
    void testSetAltura() {

    }

    @Test
    void testSetAutor() {

    }

    @Test
    void testSetDesc() {

    }

    @Test
    void testSetNombre() {

    }

    @Test
    void testSetPeso() {

    }

    @Test
    void testSetPiezas() {

    }

    @Test
    void testSetPrecio() {

    }

    @Test
    void testSetTipo() {

    }

    @Test
    void testVisualizarObraToString() {

    }

    @Test
    void testVisualizarObrasToString() {

    }
}
