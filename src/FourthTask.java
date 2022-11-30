import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FourthTask {
    //4. Дано список цілих чисел, вивести рядок, що є конкатенацією представлення рядковим типом цих чисел.
    public static void fourthTask() {
        Stream<Integer> intValues = Stream.of(5, 2, 4, 2, 1);
        String strValues = intValues.map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(strValues);
    }

    public static void main(String[] args) {
        FourthTask.fourthTask();
    }
}