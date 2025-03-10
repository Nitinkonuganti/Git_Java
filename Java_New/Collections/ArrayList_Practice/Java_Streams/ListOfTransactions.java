package Java_new.Java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private int amount;
    private String date;

    public Transaction(int amount, String date) {
        this.amount = amount;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}
public class ListOfTransactions {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(50000, "03/3/25"),
                new Transaction(10000, "03/4/25"),
                new Transaction(20000, "03/5/25")
        );

        Map<String, Integer> sumbyday = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                                Collectors.summingInt(Transaction::getAmount)
                        )
                );
        sumbyday.forEach((date, sum) -> System.out.println(date + " -> " + sum));
    }
}


