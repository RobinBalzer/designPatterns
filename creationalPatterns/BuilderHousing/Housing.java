/**
 * Housing is a product class. (product of HousingBuilder)
 */

public class Housing {

    private final HouseType houseType;
    private final int floors;
    private final int windows;
    private FuelType fuelType;

    public Housing(HouseType houseType, int floors, int windows, FuelType fuelType){
        this.houseType = houseType;
        this.floors = floors;
        this.windows = windows;
        this.fuelType = fuelType;
    }

    public HouseType getHouseType(){
        return houseType;
    }

    public int getFloors(){
        return floors;
    }

    public int getWindows(){
        return windows;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType newFuelType){
        this.fuelType = newFuelType;
    }
}
