package design.pattern.factory;
import java.io.*;
public class GenerateBill {
	public static void main(String args[]) throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();
		System.out.println("Enetr the name of plan: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.println("Enetr the number of units: ");
		int units = Integer.parseInt(br.readLine());
		Plan plan = planFactory.getPlan(planName);
		System.out.println("Bill amount for "+planName+" of "+units+" units is:");
		plan.getRate();
		plan.calculateBill(units);
	}

}
