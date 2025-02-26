package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DepartamentosTest {

   
    @Test
    void testValuesLength() {
       
        assertEquals(4, Departamentos.values().length);
    }

    
    @Test
    void testEnumValues() {
  
        assertTrue(Departamentos.Limpieza_eliminados instanceof Departamentos);
        assertTrue(Departamentos.Preparación_juegos instanceof Departamentos);
        assertTrue(Departamentos.Limpieza_mantenimiento instanceof Departamentos);
        assertTrue(Departamentos.Distribución_alimentos instanceof Departamentos);
    }

   
    @Test
    void testEnumName() {
        assertEquals("Limpieza_eliminados", Departamentos.Limpieza_eliminados.name());
        assertEquals("Preparación_juegos", Departamentos.Preparación_juegos.name());
        assertEquals("Limpieza_mantenimiento", Departamentos.Limpieza_mantenimiento.name());
        assertEquals("Distribución_alimentos", Departamentos.Distribución_alimentos.name());
    }

   @Test
    void testEnumValuesEquality() {
        assertEquals(Departamentos.Limpieza_eliminados, Departamentos.valueOf("Limpieza_eliminados"));
        assertEquals(Departamentos.Preparación_juegos, Departamentos.valueOf("Preparación_juegos"));
        assertEquals(Departamentos.Limpieza_mantenimiento, Departamentos.valueOf("Limpieza_mantenimiento"));
        assertEquals(Departamentos.Distribución_alimentos, Departamentos.valueOf("Distribución_alimentos"));
    }

    @Test
    void testInvalidEnumValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            Departamentos.valueOf("Invalido"); 
        });
    }

   
    @Test
    void testNullEnumValue() {
       assertThrows(NullPointerException.class, () -> {
            Departamentos.valueOf(null); 
        });
    }

 
    @Test
    void testEnumSize() {
        assertEquals(4, Departamentos.values().length);
    }

   
    @Test
    void testEnumNameBoundary() {
        assertEquals("Distribución_alimentos", Departamentos.Distribución_alimentos.name());
    }

    
    @Test
    void testEnumValueOfBoundary() {
        assertEquals(Departamentos.Distribución_alimentos, Departamentos.valueOf("Distribución_alimentos"));
    }
}
