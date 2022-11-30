import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class FirstTask {
    // 1. Дано список цілих чисел. Знайти середнє всіх непарних чисел, що діляться на 5.
    public static void firstTask() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(random.nextInt(100) + 1);
            System.out.print(list.get(i) + " ");
        }
        OptionalDouble result = list.stream()
                .filter((a) -> (a % 2 != 0) && (a % 5 == 0))
                .mapToDouble(Integer::doubleValue)
                .average();
        System.out.println("\n" + result);
    }

    public static void main(String[] args) {
        FirstTask.firstTask();
    }
}