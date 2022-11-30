import java.util.ArrayList;
import java.util.List;

public class FifthTask {
    /* Даний клас Person з полями firstName, lastName, age.
    Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15 символів. */
    public static void fifthTask() {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Вікторія", "Синьова", 25);
        Person person2 = new Person("Дмитрій", "Телюков", 19);
        Person person3 = new Person("Олена", "Стасюк", 46);
        Person person4 = new Person("Анастасія", "Новоселова", 50);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        Person result = list.stream()
                .filter(a -> (a.getFirstName().length() + a.getLastName().length()) < 15)
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .get();
        System.out.println(result.getFirstName() + " " + result.getLastName());
    }

    public static void main(String[] args) {
        FifthTask.fifthTask();
    }
}