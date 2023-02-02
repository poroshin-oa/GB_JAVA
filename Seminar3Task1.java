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
    public static List<Integer> removeEvenValue(List<Integer> rem_list){
        ArrayList<Integer> result_rem_even_list = new ArrayList<Integer>();

        for (int i = 0; i < rem_list.size(); i++) {
            if(rem_list.get(i) % 2 == 0){

            }
        }

        return rem_list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        int list_min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < list_min){
                list_min = list.get(i);
            }
        }

        return list_min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int list_max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list_max){
                list_max = list.get(i);
            }
        }

        return list_max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int list_sum = 0;
        int list_average = 0;

        for (int i = 0; i < list.size(); i++) {
            list_sum += list.get(i);
        }

        list_average = list_sum / list.size();

        return list_average;
    }

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> new_int_list = fillList();
        List<Integer> rem_even_list = removeEvenValue(new_int_list);

        System.out.println("\nИсходный список: ");
        System.out.print(new_int_list);
        System.out.println("\n");

        System.out.print("Минимальное значение: ");
        System.out.println(getMin(new_int_list));

        System.out.print("Максимальное значение: ");
        System.out.println(getMax(new_int_list));

        System.out.print("Среднее значение: ");
        System.out.println(getAverage(new_int_list));
        System.out.print("\n");


//        System.out.println("Удаленные четные числа: ");
//        System.out.print(rem_even_list);
//        System.out.println("\n");
    }
}