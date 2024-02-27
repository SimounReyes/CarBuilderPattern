public class CarAssemble {
    public static void main(String[] args) {
        Car myCar = new Car.CarBuilder()
                .color("Red")
                .tranmission("Manual")
                .brand("Nissan")
                .engineType("gasoline")
                .passengerCapacity(4)
                .build();

        System.out.println("You've successfully purchased a car!\n\nHere are the details of your car:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Engine Type: " + myCar.getEngineType());
        System.out.println("Transmission: " + myCar.getTranmission());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Passenger Capacity: " + myCar.getPassengerCapacity());
    }
}
