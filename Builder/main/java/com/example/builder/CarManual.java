package org.example;

public class CarManual implements Builder {
    private Manual manual;

    public CarManual() {
        this.manual = new Manual();
    }
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(Integer number) {
        this.manual.setNumberOfSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.manual.setHasTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.manual.setHasGPS(true);
    }

    public Manual getResult() {
        return this.manual;
    }
}