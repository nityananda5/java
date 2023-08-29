public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40}; // Initialize the array with values
        
        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Calculate the average
        double average = (double) sum / numbers.length;
        
        // Display the average
        System.out.println("Array values: 10, 20, 30, 40");
        System.out.println("Average: " + average);
    }
}
