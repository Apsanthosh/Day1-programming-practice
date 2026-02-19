class VarargsAverager {

    // Method using varargs
    double calculateAverage(double... numbers) {

        // If no values are passed
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return 0;
        }

        double sum = 0;

        // Varargs behaves like an array here
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;
        return average;
    }
}

public class Main1 {
    public static void main(String[] args) {

        VarargsAverager obj = new VarargsAverager();

        // Different number of arguments
        System.out.println("Average (2 values): " + obj.calculateAverage(10, 20));

        System.out.println("Average (5 values): " + obj.calculateAverage(5, 10, 15, 20, 25));

        // Passing an array explicitly
        double[] data = {2.5, 3.5, 4.5};
        System.out.println("Average (array): " + obj.calculateAverage(data));
    }
}
