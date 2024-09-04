package GreedAlgo.greedyAlgo;

import java.util.Arrays;
// Minimum Number of Platforms Required
public class Ex5 {
    public static int findMinimumPlatforms(int[] arrivals, int[] departures) {
        Arrays.sort(arrivals);
        Arrays.sort(departures);

        int platformsNeeded = 1;
        int maxPlatforms = 1;

        int i = 1, j = 0;
        int n = arrivals.length;
        while (i < n && j < n) {
            if (arrivals[i] <= departures[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int arv[] = {10, 12, 15, 20, 30}; // Arrival times
        int dep[] = {11, 14, 17, 25, 40}; // Departure times

        int result = findMinimumPlatforms(arv, dep);
        System.out.println("Minimum Number of Platforms Required: " + result);
    }
}
