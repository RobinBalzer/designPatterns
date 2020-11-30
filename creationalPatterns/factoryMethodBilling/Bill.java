import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bill {

    public static void main (String[] args) throws IOException {
        PlanFactory planFactory = new PlanFactory();

        System.out.print("Enter the type of plan: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.print("Enter the amount of units: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);

        System.out.print("The bill for " + planName + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);

    }

}
