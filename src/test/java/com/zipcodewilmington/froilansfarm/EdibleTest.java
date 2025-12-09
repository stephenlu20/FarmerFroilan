package com.zipcodewilmington.froilansfarm;
    
import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Tomato;   
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;  

public class EdibleTest {
    private EdibleEgg egg;
    private EarCorn corn;
    private Tomato tomato; 
    
    @BeforeEach
    public void setUp() {
        egg = new EdibleEgg();
        corn = new EarCorn();
        tomato = new Tomato();
    }   
    
    @Test
    public void testIsEdible() {
        assertTrue(egg.isEdible());
        assertTrue(corn.isEdible());
        assertTrue(tomato.isEdible());
    }  
}
      


