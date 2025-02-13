package Java_new;

public class SumOfEven {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<5; i++){
            if(i % 2 == 0){
                sum += i;
                System.out.println(sum);
            }
        }
    }
}
