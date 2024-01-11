import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListService listService = new ListService();

        //TODO: Задача 1 - можно напечатать только нечетные числа в консоль
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        listService.oddNumber(nums1);
        System.out.println();

        //TODO: Задача 2 - можно напечатать только четные числа без повторений в порядке возрастания (вводные прежние)
        List<Integer> nums2 = new ArrayList<>(List.of(7, 6, 6, 5, 5, 4, 5, 3, 3, 2, 2, 1));
        listService.oddAscending(nums2);

        //TODO: Задача 3 - можно напечатать только уникальные слова из списка слов, в котором могут встречаться дубли
        List<String> words1 = new ArrayList<>(List.of("яблоко", "яблоко", "акула", "яблоко", "акула", "библиотека", "винт", "дом", "гараж"));
        listService.uniqueWords(words1);

        //TODO: Задача 4 - количество дублей для каждого уникального слова
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        listService.dublicateCount(strings);
    }
}