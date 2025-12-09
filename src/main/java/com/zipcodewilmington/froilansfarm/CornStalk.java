package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CornStalk implements Produce {
        private boolean hasBeenFertilized = false;
        private boolean hasBeenHarvested = false;

        public CornStalk() {
        }

        @Override
        public Edible yield() {
            return new EarCorn();
        }

        @Override 
        public boolean hasBeenFertilized() {
            return hasBeenFertilized;
        }

        @Override
        public boolean hasBeenHarvested() {
            return hasBeenHarvested;
        }

        public void fertilize() {
            this.hasBeenFertilized = true;
        }

        public void harvest() {
            this.hasBeenHarvested = true;
        }
    
    }

