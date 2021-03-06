package com.bl.cabinvoicegenerator;
/**
 * =============== Cab Invoice Generator ======================
 * <p>
 * The cab service is a subscription based cap service, where the customer books a cab, and
 * pays the bill at the end of the month.
 * <p>
 * Step 1 :- Calculate Fare
 * - Given Distance and time the invoice generator should return the total fare of journey
 * - Cost Rs.10 per KM + Rs.1 per minute.
 * -Minimum Fare - Rs.5
 *
 * @author : Rohit
 */

public class CabInvoiceGenerator {

    /**
     * final variable
     */
    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MIN = 1;
    private static final int MIN_FARE = 5;

    /**
     * Created a method to calculate the fare of journey
     *
     * @param distance is 5
     * @param time
     * @return total fare
     */
    public double CalculateFare(double distance, int time) {

        // formula for total fare
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        /**
         * if total fare is greater than min fare then
         */
        if (totalFare < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }

    public static void main(String[] args) {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.CalculateFare(5, 20);
        System.out.println("Total Fare : " + fare + " Rs");
    }
}
