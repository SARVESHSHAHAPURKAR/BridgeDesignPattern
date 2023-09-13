package Main;

import Implementations.*;
import Interfaces.LivingBeing;

public class Main {
    public static void main(String[] args) {

        LivingBeing human = new Human(new AirBreathing());
        LivingBeing plant = new Plant(new AirBreathing());
        LivingBeing fish = new Fish(new WaterBreathing());

        human.breathe();
        fish.breathe();
        plant.breathe();
    }
}