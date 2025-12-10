package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;


public class Farmer extends Person implements Rider, Botanist {
    
    private Rideable currentMount;

    public Farmer(String name) {
        super(name);
        this.currentMount = null;
    }

    @Override
    public String makeNoise() {
        return getName() + " says 'YAML!'";
    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable != null && rideable.mount(this)) {
            this.currentMount = rideable;
        }
    }

    @Override
    public void dismount(Rideable rideable) {
        if (rideable != null && currentMount == rideable) {
            if (rideable.dismount(this)) {
                this.currentMount = null;
            }
        }
    }

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        if (crop != null && cropRow != null) {
            cropRow.add(crop);
        }
    }

    public boolean isRiding() {
        return currentMount != null;
    }

    public Rideable getCurrentMount() {
        return currentMount;
    }
}
