package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArmasTest {

    @Test
    void testGetArma() {
        assertEquals("Pistola Glock17", Armas.PISTOLA_GLOCK17.getArma());
        assertEquals("Rifle de Asalto", Armas.RIFLE_ASALTO.getArma());
        assertEquals("Heckler Koch MP5", Armas.HECKLER_KOCHMP5.getArma());
        assertEquals("Rifle Automático", Armas.RIFLE_AUTOMATICO.getArma());
        assertEquals("Heckler Koch G3", Armas.HECKLER_KOCHG3.getArma());
        assertEquals("Smith & Wesson Model 10", Armas.SMITH_WESSON_MODEL10.getArma());
    }

    @Test
    void testFromStringValid() {
        Armas arma = Armas.fromString("Rifle de Asalto");
        assertNotNull(arma);
        assertEquals("Rifle de Asalto", arma.getArma());
    }

    @Test
    void testFromStringInvalid() {
     
        assertThrows(IllegalArgumentException.class, () -> {
            Armas.fromString("ARMA_INEXISTENTE");
        });
    }

    @Test
    void testFromStringNull() {
       
        assertThrows(IllegalArgumentException.class, () -> {
            Armas.fromString(null);
        });
    }

    @Test
    void testFromStringEmpty() {
    
        assertThrows(IllegalArgumentException.class, () -> {
            Armas.fromString("");
        });
    }

    @Test
    void testFromStringTrim() {
       
        Armas arma = Armas.fromString("  pistola gLOCK17  ");
        assertNotNull(arma);
        assertEquals("Pistola Glock17", arma.getArma());
    }

    @Test
    void testValuesLength() {
      
        assertEquals(6, Armas.values().length);
    }

  
    @Test
    void testFromStringUpperCase() {
      
        Armas arma = Armas.fromString("RIFLE DE ASALTO");
        assertNotNull(arma);
        assertEquals("Rifle de Asalto", arma.getArma());
    }

    @Test
    void testFromStringLowerCase() {
       
        Armas arma = Armas.fromString("rifle de asalto");
        assertNotNull(arma);
        assertEquals("Rifle de Asalto", arma.getArma());
    }

    @Test
    void testFromStringLongInput() {
            String input = "Pistola Glock17 Pistola Glock17 Pistola Glock17 Pistola Glock17 Pistola Glock17 Pistola Glock17 Pistola Glock17";
        assertThrows(IllegalArgumentException.class, () -> {
            Armas.fromString(input); 
        });
    }

    @Test
    void testEnumSize() {
    
        assertEquals(6, Armas.values().length);
    }
}
