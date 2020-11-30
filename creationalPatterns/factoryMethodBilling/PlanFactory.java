public class PlanFactory {

    public Plan getPlan(String planType){

        planType = planType.toLowerCase();
        
        switch (planType){
            case "commercial":
                return new CommercialPlan();
            case "institutional":
                return new InstitutionalPlan();
            case "foreign":
                return new ForeignPlan();
            default: 
                return null;
        }


    }
}
