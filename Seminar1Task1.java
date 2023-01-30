// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

public class Seminar1Task1 {
    public static void main(String[] args) {

        int[] integer_array = new int[10];

        // Заполнение массива
        for (int i = 0; i < 10; i++){
            double new_int = Math.random() * 300;
            integer_array[i] = (int)new_int;
        }

        // Поиск максимального значения
        int array_max = integer_array[0];

        for(int i = 0; i < 10; i++){
            if(integer_array[i] > array_max){
                array_max = integer_array[i];
            }
        }

        // Поиск минимального значения
        int array_min = integer_array[0];

        for(int i = 0; i < 10; i++){
            if(integer_array[i] < array_min){
                array_min = integer_array[i];
            }
        }

        // Поиск среднего арифметического значений массива
        float array_sum = 0;
        float array_average = 0;

        for(int i = 0; i < 10; i++){
            array_sum += integer_array[i];
        }

        array_average = array_sum / 10;

        System.out.println("MAX: " + Integer.toString(array_max) + "  MIN: " + Integer.toString(array_min) + "  AVERAGE: " + Float.toString(array_average));
    }
}
