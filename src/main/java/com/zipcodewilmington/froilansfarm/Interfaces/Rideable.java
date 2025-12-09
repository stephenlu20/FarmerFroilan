package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable {

    boolean mount(Rider rider);

    boolean dismount(Rider rider);

    boolean isMounted();

    Rider getCurrentRider();

}
