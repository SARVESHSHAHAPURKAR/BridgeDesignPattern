package Implementations;

import Interfaces.BreatheImplementor;

public class AirBreathing implements BreatheImplementor {

    @Override
    public void breathe() {
        System.out.println("Breathing through lungs");
    }
}
