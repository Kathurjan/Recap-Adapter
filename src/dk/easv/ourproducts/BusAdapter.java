package dk.easv.ourproducts;

import dk.easv.theirproducts.Bus;

public class BusAdapter extends Vehicle{

    public BusAdapter(Color color) {
        super(color);


    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return 50;
    }

    @Override
    public void honk() {

    }

    @Override
    public String getName() {
        return "bus";
    }
}
