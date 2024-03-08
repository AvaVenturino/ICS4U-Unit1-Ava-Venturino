/*
 * This is a program that calculates mean, median, and mode
 * @author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-29
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeanMedianModeCalculator {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java MeanMedianModeCalculator <set1.txt>");
            return;
        }

        String filename = args[0];
        List<Integer> numbers = readFile(filename);

        // Output lines read from the file
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Calculate mean, median, and mode
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        List<Integer> mode = calculateMode(numbers);

	// Output results
        System.out.println("The mean is: " + mean);
        System.out.println("The median is: " + median);
        System.out.println("The mode is: " + mode);
        System.out.println("\nDone.");
    }

    private static List<Integer> readFile(String filename) {
    List<Integer> numbers = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Assuming each line contains a single integer
            numbers.add(Integer.parseInt(line.trim()));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return numbers;
}

private static double calculateMean(List<Integer> numbers) {
    if (numbers.isEmpty()) {
        return 0;
    }
    double sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum / numbers.size();
}

private static double calculateMedian(List<Integer> numbers) {
    if (numbers.isEmpty()) {
        return 0;
    }
    List<Integer> sortedNumbers = new ArrayList<>(numbers);
    sortedNumbers.sort(Integer::compareTo);
    int length = sortedNumbers.size();
    if (length % 2 == 0) {
        return (sortedNumbers.get(length / 2 - 1) + sortedNumbers.get(length / 2)) / 2.0;
    } else {
        return sortedNumbers.get(length / 2);
    }
}

private static List<Integer> calculateMode(List<Integer> numbers) {
    List<Integer> modes = new ArrayList<>();
    if (numbers.isEmpty()) {
        return modes;
    }
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    int maxFrequency = 0;
    for (int num : numbers) {
        int frequency = frequencyMap.getOrDefault(num, 0) + 1;
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
