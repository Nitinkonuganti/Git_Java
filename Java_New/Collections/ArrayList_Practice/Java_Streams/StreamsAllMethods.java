package Java_new.Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAllMethods {
    public static void main(String[] args) {


        /// Filter
//        List<Integer> order = Arrays.asList(500, 100, 400, 900, 700, 8000);
//        List<Integer> highValueOrders = order.stream()
//                .filter(o -> o> 100)
//                .collect(Collectors.toList());
//        System.out.println("High Value Orders: " + highValueOrders);

        /// Map
//        List<Double> pricesINR = Arrays.asList(10.0,20.0,30.0);
//        List<Double> PricesUSD = pricesINR.stream()
//                .map(price-> price * 83.0)
//                .collect(Collectors.toList());
//        System.out.println("Prices in INR : " + pricesINR);
//
        /// Sorted
//        List<Integer>score = Arrays.asList(85,91,60);
//        List<Integer> sortedscore = score.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println("Sortedscores : " + sortedscore);

        /// Distinct
//        List<Integer> productID = Arrays.asList(101,101,102,103,104,1057,7,8,9,8,9);
//
//        List<Integer> uniqieID = productID.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println("Unique Product ID"+ uniqieID);

        /// FlatMap
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(4,5),
                Arrays.asList(5,9),
                Arrays.asList(7,8)
        );

        List<Integer> flatenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattend list"+ flatenedList);

    }

}