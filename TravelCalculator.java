public class MyProgram
{
    public static void main(String[] args)
    {
        String travelerName = "A Human";
        String destination = "Syria";
        int numberofdays = 5;
        double hotelcostperday = 125.0;
        double foodCostPerDay = 50.0;
        double transportationCost = 150.0;
        double activityCost = 200.0;
        // Calculations
        double totalHotelCost = hotelcostperday;
        totalHotelCost *= numDays;
        double totalFoodCost = foodCostPerDay;
        totalFoodCost *= numDays;
        
        // Adds one at a time, compound assignment
        double totalTripCost = 0.0;
        totalTripCost += totalHotelCost;
        totalTripCost += totalFoodCost;
        totalTripCost += transportationCost;
        totalTripCost += activityCost;
 
        // To get decimal
        double averageCostPerDay = totalTripCost / (double) numDays;
 
        // Rounding 
        int roundedTotalCost = (int) totalTripCost;
 
        // Output
        System.out.println("========================================");
        System.out.println("           TRAVEL SUMMARY");
        System.out.println("========================================");
        System.out.println("Traveler: " + travelerName);
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + numDays + " days");
        System.out.println();
 
        System.out.println("--- Breakdown of Expenses ---");
        System.out.println("Total Hotel Cost: $" + totalHotelCost);
        System.out.println("Total Food Cost: $" + totalFoodCost);
        System.out.println("Transportation: $" + transportationCost);
        System.out.println("Activities: $" + activityCost);
        System.out.println();
 
        System.out.println("--- Totals ---");
        System.out.print("Grand Total Trip Cost: $");
        System.out.println(totalTripCost);
        System.out.print("Average Cost Per Day: $");
        System.out.println(averageCostPerDay);
        System.out.print("Estimated Whole Dollar Total: $");
        System.out.println(roundedTotalCost);
        System.out.println("========================================");
    }
}