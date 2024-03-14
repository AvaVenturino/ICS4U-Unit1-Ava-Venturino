/*
 * This is a program that calculates mean, median, and mode
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-29
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a standard calculation program.
 */

final class MeanMedianModeCalculator {

    /**
     * This is a standard calculation program.
     *
     * @param args using args
     */

    private static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(
                "Usage: java MeanMedianModeCalculator <set1.txt>");
        }

        final String filename = args[0];
        final List<Integer> numbers = readFile(filename);

        // Output lines read from the file
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Calculate mean, median, and mode
        final double mean = calculateMean(numbers);
        final double median = calculateMedian(numbers);
        final List<Integer> mode = calculateMode(numbers);

        // Output results
        System.out.println("The mean is: " + mean);
        System.out.println("The median is: " + median);
        System.out.println("The mode is: " + mode);
        System.out.println("\nDone.");
    }

    /**
     * This is a standard calculation program.
     *
     * @param filename using filename
     *
     * @return something
     */

    private static List<Integer> readFile(String filename) {
        final List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line contains a single integer
                numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (InputMismatchException inputMismatchException) {
            inputMismatchException.printStackTrace();
        }
    }

    /**
     * This is a standard calculation program.
     *
     * @param numbers using numbers
     *
     * @return mean
     */

    private static double calculateMean(List<Integer> numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    /**
     * This is a standard calculation program.
     *
     * @param numbers using numbers
     *
     * @return median
     */

    private static double calculateMedian(List<Integer> numbers) {
        final List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Integer::compareTo);
        final int length = sortedNumbers.size();
        if (length % 2 == 0) {
            return (
                sortedNumbers.get(length / 2 - 1)
                + sortedNumbers.get(length / 2)) / 2.0;
        } else {
            sortedNumbers.get(length / 2);
        }
    }

    /**
     * This is a standard calculation program.
     *
     * @param numbers using numbers
     *
     * @return mode
     */

    private static List<Integer> calculateMode(List<Integer> numbers) {
        final List<Integer> modes = new ArrayList<>();
        final Map<Integer, Integer> frequencyMap = new HashMap<>();
        final int maxFrequency = 0;
        for (int num : numbers) {
            final int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }
        return modes;
    }

}
