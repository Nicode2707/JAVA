import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for item costs
        System.out.print("Enter the cost of the pencil (float): ");
        float pencilCost = scanner.nextFloat();

        System.out.print("Enter the cost of the pen (float): ");
        float penCost = scanner.nextFloat();

        System.out.print("Enter the cost of the eraser (float): ");
        float eraserCost = scanner.nextFloat();

        // Calculate total cost before tax
        float totalCost = pencilCost + penCost + eraserCost;

        // Flag to include GST calculation
        boolean includeGst = true; // Change to false to exclude GST

        // Calculate GST if applicable
        float gstAmount = 0.0f;
        if (includeGst) {
            final float gstRate = 0.18f; // 18% GST rate
            gstAmount = totalCost * gstRate;
        }

        // Calculate total cost with GST (if applicable)
        float totalCostWithGst = totalCost + gstAmount;

        // Display the bill
        System.out.println("\nBill:");
        System.out.println("  Pencil Cost: $" + pencilCost);
        System.out.println("  Pen Cost: $" + penCost);
        System.out.println("  Eraser Cost: $" + eraserCost);

        if (includeGst) {
            System.out.println("  GST @ " + (gstRate * 100) + "%: $" + gstAmount);
        }

        System.out.println("---------------------");
        System.out.println("  Total Cost: $" + (includeGst ? totalCostWithGst : totalCost));
    }
}
