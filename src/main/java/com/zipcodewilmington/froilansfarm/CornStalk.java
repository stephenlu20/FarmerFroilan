package com.zipcodewilmington.froilansfarm;

    public class CornStalk implements Produce {
        private boolean hasBeenFertilized = false;
        private boolean hasBeenHarvested = false;

        public CornStalk() {
        }

        @Override
        public String yield() {
            return "Corn ear";
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

