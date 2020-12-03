/**
 * HousingManual is another product class. Product of the HousingManualBuilder.
 */

public class HousingManual {

    private final HouseType houseType;
    private final int floors;
    private final int windows;
    private FuelType fuelType;

    public HousingManual(HouseType houseType, int floors, int windows, FuelType fuelType) {
        this.houseType = houseType;
        this.floors = floors;
        this.windows = windows;
        this.fuelType = fuelType;
    }

    public String print() {
        String information = "";
        information += "Type of house: " + houseType + "\n";
        information += " Number of floors: " + floors + "\n";
        information += " Number of windows:  " + windows + "\n";
        information += " Type of fueling: " + fuelType + "\n";

        return information;
    }
}
