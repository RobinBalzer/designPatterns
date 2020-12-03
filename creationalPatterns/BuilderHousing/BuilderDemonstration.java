public class BuilderDemonstration {

    /**
     * main class for this Builder-implementation.
     * We have a director, which knows 1) HousingBuilder
     *                                 2) HousingManualBuilder
     * we can use one director that manages the build of a Housing and its description via a manual
     *
     */

    public static void main(String[] args){

        Director director = new Director();
        HousingBuilder housingBuilder = new HousingBuilder();
        HousingManualBuilder manualBuilder = new HousingManualBuilder();

        /**
         * we now create our first Housing (a castle) and conclude with a HousingManual for it.
         */

        director.constructCastle(housingBuilder);
        Housing castle = housingBuilder.getResult();
        System.out.println("Housing built successfully:\n " + castle.getHouseType());

        director.constructCastle(manualBuilder);
        HousingManual castleManual = manualBuilder.getResult();
        System.out.println("Housing manual written: \n " + castleManual.print());

        /**
         * we create a tent and a manual for it.
         */

        director.constructTent(housingBuilder);
        Housing tent = housingBuilder.getResult();
        System.out.println("Housing build successfully:\n " + tent.getHouseType());

        director.constructTent(manualBuilder);
        HousingManual tentManual = manualBuilder.getResult();
        System.out.println("Housing manual written: \n" + tentManual.print());



    }
}
