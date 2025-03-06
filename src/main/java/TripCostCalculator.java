import java.util.Scanner;

public class TripCostCalculator {

	public static double calculateTripCost(double kilometers, double fuelPrice, double fuelConsumptionPer100Km) {
		double fuelNeeded = (kilometers / 100) * fuelConsumptionPer100Km;
		return fuelNeeded * fuelPrice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double distance;
		double fuelEfficiency;
		double fuelPrice;
		
		System.out.print("Enter the distance of the trip (in kilometers): ");
		distance = sc.nextDouble();
		
		System.out.print("Enter the fuel efficiency of the vehicle (in litres per 100 kilometers): ");
		fuelEfficiency = sc.nextDouble();
		
		System.out.print("Enter the price of fuel (in euros per litre): ");
		fuelPrice = sc.nextDouble();

		double tripCost = calculateTripCost(distance, fuelEfficiency, fuelPrice);
		System.out.println("The total cost of the trip is: " + tripCost);
	}
	
}

