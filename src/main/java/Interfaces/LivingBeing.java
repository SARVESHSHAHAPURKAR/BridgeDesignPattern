package Interfaces;

public abstract class LivingBeing {

    BreatheImplementor implementor;

    public LivingBeing(BreatheImplementor implementor) {
        this.implementor = implementor;
    }

    public void breathe(){
        implementor.breathe();
    };
}
