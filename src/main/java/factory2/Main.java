package factory2;

import factory.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Create Factory method
        VehicleFactory myFactory = new VehicleFactory();

        // Create objects from factory class
        Vehicle mitsubishiAsxRed = myFactory.vehicle("Mitsubishi", "Red");
        Vehicle fordMondeoBlack = myFactory.vehicle("Ford", "Black");

        //
        Vehicle fordMondeoBlue = myFactory.vehicle("Ford").createVehicle("Blue");
        Vehicle mitsubishiAsxWhite = myFactory.vehicle("Mitsubishi").createVehicle("White");

        //
        IVehicle skoda = myFactory.vehicle("Skoda");
        Vehicle skodaFabiaGreen = skoda.createVehicle("Green");

        // Out
        System.out.println(
                skodaFabiaGreen.getCompany() + " " +
                        skodaFabiaGreen.getModel() + " " +
                        skodaFabiaGreen.getColor()
        );

        System.out.println(
                fordMondeoBlue.getCompany() + " " +
                        fordMondeoBlue.getModel() + " " +
                        fordMondeoBlue.getColor()
        );

        System.out.println(
                mitsubishiAsxWhite.getCompany() + " " +
                        mitsubishiAsxWhite.getModel() + " " +
                        mitsubishiAsxWhite.getColor()
        );

        System.out.println(
                mitsubishiAsxRed.getCompany() + " " +
                        mitsubishiAsxRed.getModel() + " " +
                        mitsubishiAsxRed.getColor()
        );

        System.out.println(
                fordMondeoBlack.getCompany() + " " +
                        fordMondeoBlack.getModel() + " " +
                        fordMondeoBlack.getColor()
        );
    }
}
