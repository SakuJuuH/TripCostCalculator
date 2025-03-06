import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

	@org.junit.jupiter.api.Test
	void calculateTripCost() {
		
		// Test with normal values
		assertEquals(10.0, TripCostCalculator.calculateTripCost(100.0, 10.0, 1.0));
		
		// Test with zero distance
		assertEquals(0.0, TripCostCalculator.calculateTripCost(0.0, 10.0, 1.0));
		
		// Test with zero fuel efficiency
		assertEquals(Double.POSITIVE_INFINITY, TripCostCalculator.calculateTripCost(100.0, 0.0, 1.0));
		
		// Test with zero fuel price
		assertEquals(0.0, TripCostCalculator.calculateTripCost(100.0, 10.0, 0.0));
		
		// Test with high fuel efficiency
		assertEquals(7.5, TripCostCalculator.calculateTripCost(100.0, 20.0, 1.5));
		
		// Test with high fuel price
		assertEquals(50.0, TripCostCalculator.calculateTripCost(100.0, 20.0, 10.0));
	}
}