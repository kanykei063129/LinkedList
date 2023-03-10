import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        LinkedList<Integer> chetnyi = new LinkedList<>();
        LinkedList<Integer> neChetnyi = new LinkedList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                chetnyi.add(numbers.get(i));
            } else {
                neChetnyi.add(numbers.get(i));
            }
        }
        System.out.println("Четных чисел:");
        System.out.println(chetnyi);

        System.out.println("Нечетных чисел:");
        System.out.println(neChetnyi);
    }
}