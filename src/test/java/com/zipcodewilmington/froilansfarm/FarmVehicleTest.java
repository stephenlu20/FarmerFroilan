package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import static org.junit.jupiter.api.Assertions.*;

public class FarmVehicleTest {
    
    private static class TestFarmVehicle implements FarmVehicle {
        private boolean hasOperated = false;

        @Override
        public void operate(Farm farm) {
            hasOperated = true;
        }

        @Override
        public String makeNoise() {
            return "Beep beep";
        }
    }

    @Test
    public void testFarmVehicleInterfaceExists() {
        Class<?> farmVehicleInterface = FarmVehicle.class;
        assertTrue(farmVehicleInterface.isInterface());
    }

    @Test
    public void testFarmVehicleExtendsVehicle() {
        assertTrue(Vehicle.class.isAssignableForm(FarmVehicle.class));
    }

    @Test
    public void testFarmVehicleCanOperate() throws NoSuchMethodException {
        FarmVehicle.class.getMethod("operate", Farm.class);
        assertTrue(true);
    }

    @Test
    public void testFarmVehicleCanBeImplemented() {
        TestFarmVehicle vehicle = new TestFarmVehicle();
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof FarmVehicle);
        assertTrue(vehicle instanceof Vehicle);
    }

    @Test
    public void testOperateMethod() {
        TestFarmVehicle vehicle = new TestFarmVehicle();
        Farm farm = new Farm();
        assertFalse(vehicle.hasOperated);
        vehicle.operate(farm);
        assertTrue(vehicle.hasOperated);
    }
}
