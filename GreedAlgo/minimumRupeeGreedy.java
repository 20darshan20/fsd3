package GreedAlgo;

import java.util.HashMap;
import java.util.Map;

    public class minimumRupeeGreedy {
        public static void main(String[] args) {
            int arr[] = {500, 100, 50, 20, 10, 5, 2, 1};
            Map<Integer, Integer> map = new HashMap<>();
            int target = 596;
            int i = 0;

            while (target > 0) {
                if (arr[i] > target) {
                    i++;
                } else {
                    target -= arr[i];
                    map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
        }
    }




