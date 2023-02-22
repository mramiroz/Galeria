package daw.programacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.rmi.server.ExportException;

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
    void testObtenerImporteAlturaMenorIgual2() {
        double expected = 20;
        assertEquals(expected, obra.obtenerImporteAltura(), "Ha habido un error al calcular el importe de la altura");
    }

    @Test
    void testObtenerImporteAlturaMayorIgual2() {
        double expected = 100;
        obra.setAltura(4);
        assertEquals(expected, obra.obtenerImporteAltura(), "Ha habido un error al calcular el importe de la altura");
    }

    @Test
    void testObtenerImportePesoMenorUnKg() {
        double expected = 20;
        obra.setPeso(0.001);
        assertEquals(expected, obra.obtenerImportePeso(), "Ha habido un error al calcular el importe del peso");
    }

    @Test
    void testObtenerImportePesoMayorUnKg() {
        double expected = 100;
        obra.setPeso(1);
        assertEquals(expected, obra.obtenerImportePeso(), "Ha habido un error al calcular el importe del peso");
    }

    @Test
    void testObtenerImporteAdicionalMenor3piezas() {
        double expected = 0;
        obra.setPiezas(2);
        assertEquals(expected, obra.obtenerImporteAdicional());
    }

    @Test
    void testObtenerImporteAdicionalMayor3piezas4piezas() {
        double expected = 20;
        obra.setPiezas(4);
        assertEquals(expected, obra.obtenerImporteAdicional());
    }
    @Test
    void testObtenerImporteAdicionalMenor3piezas10piezas() {
        double expected = 80;
        obra.setPiezas(10);
        assertEquals(expected, obra.obtenerImporteAdicional());
    }

    @Test
    void testObternerComisionGaleria() {
        double expected = 25;
        assertEquals(expected, obra.obternerComisionGaleria());
    }

    @Test
    void testObternerPrecioEscultura() {
        double expected = 182;
        assertEquals(expected, obra.obtenerPrecio());
    }

    @Test
    void testObternerPrecioPintura() {
        double expected = 148.5;
        obra.setTipo("Pintura");
        assertEquals(expected, obra.obtenerPrecio());
    }

    @Test
    void testSetAltura() {
        double expected = 2;
        obra.setAltura(2);
        assertEquals(expected, obra.getAltura());
    }

    @Test
    void testSetAutor() {
        String expected = "Autor";
        obra.setAutor("Autor");
        assertEquals(expected, obra.getAutor());
    }

    @Test
    void testSetDesc() {
        String expected = "asd";
        obra.setDesc("asd");
        assertEquals(expected, obra.getDesc());
    }

    @Test
    void testSetNombre() {
        String expected = "Nombre";
        obra.setNombre("Nombre");
        assertEquals(expected, obra.getNombre());
    }

    @Test
    void testSetPeso() {
        double expected = 2;
        obra.setPeso(2);
        assertEquals(expected, obra.getPeso());
    }

    @Test
    void testSetPiezas() {
        int expected = 2;
        obra.setPiezas(2);
        assertEquals(expected, obra.getPiezas());
    }

    @Test
    void testSetPrecio() {
        double expected = 2;
        obra.setPrecio(2);
        assertEquals(expected, obra.getPrecio());
    }

    @Test
    void testSetTipo() {
        String expected = "Escultura";
        obra.setTipo("Escultura");
        assertEquals(expected, obra.getTipo());
    }
}
