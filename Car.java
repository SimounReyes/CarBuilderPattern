public class Car{
    protected final String brand;
    protected final String engineType;
    protected final String transmission;
    protected final String color;
    protected final int passengerCapacity;

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.passengerCapacity = builder.passengerCapacity;
    }

    protected static class CarBuilder{
        private String brand;
        private String engineType;
        private String transmission;
        private String color;
        private int passengerCapacity;

        public CarBuilder brand(String brand){
            this.brand = brand;
            return this;
        }
        public CarBuilder
    }

}