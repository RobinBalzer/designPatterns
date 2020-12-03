/**
 * general interface for our different builders.
 * here we declare the methods to be overwritten by our concreteBuilder implementations later on
 */

public interface Builder {

    void setHouseType(HouseType houseType);

    void setAmountOfFloors(int floors);

    void setAmountOfWindows(int windows);

    void setTypeOfFuel(FuelType fuelType);


}
