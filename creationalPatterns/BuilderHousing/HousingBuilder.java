/**
 * concrete implementation for Builder for constructing Housings.
 */

public class HousingBuilder implements Builder {
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

    public Housing getResult() {
        return new Housing(houseType, floors, windows, fuelType);
    }
}
