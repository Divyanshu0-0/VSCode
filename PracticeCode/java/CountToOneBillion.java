public class CountToOneBillion {
    public static void main(String[] args) {
        // Variables to store time
        long startTime, endTime;
        long elapsedTime;

        // Record the start time
        startTime = System.nanoTime();

        // Counting loop (count from 0 to 1 billion)
        for (long i = 0; i <= 1_000_000_000L; i++) {
            // The loop does nothing with 'i' but still counts
        }

        // Record the end time
        endTime = System.nanoTime();

        // Calculate elapsed time in seconds
        elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = elapsedTime / 1_000_000_000.0;

        // Output the results
        System.out.println("Counting completed!");
        System.out.printf("Execution time: %.6f seconds\n", elapsedTimeInSeconds);
    }
}
