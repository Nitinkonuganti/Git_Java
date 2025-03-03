package Java_new.Java_Collections.Maps_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKEle {

        public static List<Integer> findTopKFrequent(int[] nums, int k) {
            //count freq of each
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : nums) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            //freq to list and sort
            List<Integer> sortedList = new ArrayList<>(frequencyMap.keySet());
            sortedList.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

           //return ele
            return sortedList.subList(0, k);
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 1, 2, 2, 3};
            //need this
            int k = 2;

            List<Integer> result = findTopKFrequent(nums, k);
            System.out.println("Top " + k + " frequent elements: " + result);
        }
    }


