package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RangoTest {

    @Test
    void testGetSimbolo() {
        assertEquals(" Worker ⭘", Rango.WORKERS.getSimbolo());
        assertEquals("Soldado △", Rango.SOLDIERS.getSimbolo());
        assertEquals(" Manager ☐", Rango.MANAGERS.getSimbolo());
    }

    @Test
    void testValuesLength() {
     
        assertEquals(3, Rango.values().length);
    }

    @Test
    void testRangoValues() {
       
        assertEquals(" Worker ⭘", Rango.WORKERS.getSimbolo());
        assertEquals("Soldado △", Rango.SOLDIERS.getSimbolo());
        assertEquals(" Manager ☐", Rango.MANAGERS.getSimbolo());
    }

    @Test
    void testTrimSimbolo() {
     
        assertEquals(" Worker ⭘", Rango.WORKERS.getSimbolo());
        assertEquals("Soldado △", Rango.SOLDIERS.getSimbolo());
        assertEquals(" Manager ☐", Rango.MANAGERS.getSimbolo());
    }

    @Test
    void testEnumValues() {
  
        assertTrue(Rango.WORKERS instanceof Rango);
        assertTrue(Rango.SOLDIERS instanceof Rango);
        assertTrue(Rango.MANAGERS instanceof Rango);
    }

    @Test
    void testEnumName() {
   
        assertEquals("WORKERS", Rango.WORKERS.name());
        assertEquals("SOLDIERS", Rango.SOLDIERS.name());
        assertEquals("MANAGERS", Rango.MANAGERS.name());
    }

  

    @Test
    void testInvalidEnumValue() {
  assertThrows(IllegalArgumentException.class, () -> {
            Rango.valueOf("INVALID"); 
        });
    }

    @Test
    void testNullEnumValue() {
      
        assertThrows(NullPointerException.class, () -> {
            Rango.valueOf(null); 
        });
    }

    @Test
    void testEnumSize() {
      
        assertEquals(3, Rango.values().length);
    }

    @Test
    void testEnumNameBoundary() {
        
        assertEquals("MANAGERS", Rango.MANAGERS.name());
    }

    @Test
    void testEnumValueOfBoundary() {
      
        assertEquals(Rango.MANAGERS, Rango.valueOf("MANAGERS"));
    }
}
