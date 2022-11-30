import java.util.HashMap;
import java.util.Map;

public class ThirdTask {
    //3. Дана Map <String, Integer>. Знайти суму всіх значень, довжина ключів яких менше 7 символів.
    public static void thirdTask() {
        Map<String, Integer> strInt = new HashMap<>();
        strInt.put("1234567", 1);
        strInt.put("123456", 1); //1
        strInt.put("мало", 1); //2
        strInt.put("мало", 1);
        strInt.put("мало", 2); //3
        strInt.put("багато символів", 1);
        strInt.put("світло", 1); //4
        Integer result = strInt.entrySet().stream()
                .filter(s -> s.getKey().length() < 7).mapToInt(Map.Entry::getValue).sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        ThirdTask.thirdTask();
    }
}