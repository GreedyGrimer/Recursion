package week6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    //create an instance of your class
    Car Honda = new Car("Civic","Honda" ,1990,80000);

    @Test
    public void getYear() {
        //assertEquals()
        assertEquals(1990, Honda.getYear());


    }

    void testConstructor() {
        //assertNotNull --->
        Car Honda2 = new Car();
        assertNotNull(Honda2);

    }

    void testIsElectricCar(){}
    Car Honda3 = new Car("Civic", "Honda", 1990, 80000 );
    

    @Test
    void testGetYear() {
    }
}