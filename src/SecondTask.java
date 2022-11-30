import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    //2. Дано перелік рядків. Знайти кількість унікальних рядків завдовжки більше 8 символів.
    public static void secondTask(){
        List<String> list = new ArrayList<>();
        list.add("Мало");
        list.add("Мало");
        list.add("Більше");
        list.add("Унікальний"); //1 унікальний
        list.add("Унікальний");
        list.add("Скоро Новий Рік"); //2 унікальний
        list.add("Скоро Новий Рік");
        list.add("Знову вимкнули світло"); //3 унікальний
        long result = list.stream()
                .filter(s -> s.length() >= 8)
                .distinct()
                .count();
        System.out.println(result);
    }

    public static void main(String[] args) {
        SecondTask.secondTask();
    }
}