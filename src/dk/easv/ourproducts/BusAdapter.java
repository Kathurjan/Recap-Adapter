package dk.easv.ourproducts;

import dk.easv.theirproducts.Bus;

public class BusAdapter extends Vehicle{
    public static Bus bus;
    public BusAdapter(Color color) {
        super(color);


    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return bus.topSpeedInMilesPerHour*1.609344;
    }

    @Override
    public void honk() {

    }

    @Override
    public String getName() {
        return "bus";
    }
}
