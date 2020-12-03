/**
 * The director uses the builders to construct Housings.
 * Since he uses the common builder he doesnt know what exactly is being build.
 * that way we can use him to build both the housing and the housingManual.
 */

public class Director {

    public void constructCastle(Builder builder){
        builder.setHouseType(HouseType.CASTLE);
        builder.setAmountOfFloors(5);
        builder.setAmountOfWindows(25);
        builder.setTypeOfFuel(FuelType.MAGIC);
    }

    public void constructClassicHouse(Builder builder){
        builder.setHouseType(HouseType.CLASSICHOUSE);
        builder.setAmountOfFloors(2);
        builder.setAmountOfWindows(10);
        builder.setTypeOfFuel(FuelType.GAS);
    }

    public void constructFancyHouse(Builder builder){
        builder.setHouseType(HouseType.FANCYHOUSE);
        builder.setAmountOfFloors(3);
        builder.setAmountOfWindows(20);
        builder.setTypeOfFuel(FuelType.RENEWABLES);
    }

    public void constructTent(Builder builder){
        builder.setHouseType(HouseType.TENT);
        builder.setAmountOfFloors(1);
        builder.setAmountOfWindows(1);
        builder.setTypeOfFuel(FuelType.COAL);
    }

}
