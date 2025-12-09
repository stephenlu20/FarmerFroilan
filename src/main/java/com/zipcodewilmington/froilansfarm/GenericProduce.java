package com.zipcodewilmington.froilansfarm;

    public class GenericProduce<C> {
     
        private C crop;
        private boolean hasBeenFertilized = false;
        private boolean hasBeenHarvested = false;

        public GenericProduce(C crop) {
            this.crop = crop;
        }

        public C yield() {
            return this.crop;
        }

        public boolean hasBeenFertilized() {
            return hasBeenFertilized;
        }

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

    

