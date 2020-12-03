/**
 * another concrete builder that implements the builder interface.
 * We produce manuals so we know which specifications our Housing has!
 */

public class HousingManualBuilder implements Builder {

    private HouseType houseType;
    private int floors;
    private int windows;
    private FuelType fuelType;


    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setAmountOfFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setAmountOfWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setTypeOfFuel(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public HousingManual getResult() {
        return new HousingManual(houseType, floors, windows, fuelType);
    }
}


