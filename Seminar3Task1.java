import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static List<Integer> fillList(){
        ArrayList<Integer> my_list = new ArrayList<Integer>();

        // Заполнение списка
        for (int i = 0; i < 10; i++) {
            double new_int = Math.random() * 300;
            my_list.add((int) new_int);
        }

        return my_list;
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){

        return new ArrayList<>();
    }

    // Найти минимальное значение
    public Integer getMin(List<Integer> list){

        return 0;
    }

    // Найти максимальное значение
    public Integer getMax(List<Integer> list){

        return 0;
    }

    // Найти среднее значение
    public Integer getAverage(List<Integer> list){

        return 0;
    }

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> new_int_list = fillList();
        List<Integer> rem_even_list = removeEvenValue(new_int_list);

        System.out.println("\nИсходный список: ");
        System.out.print(new_int_list);
        System.out.println("\n");

        System.out.println("Удаленные четные числа: ");
        System.out.print(rem_even_list);
        System.out.println("\n");
    }
}