// Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class Seminar1Task2 {

    // Метод сортировки
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Инициализация массива
        int[] sortArr = {12, 6, 4, 1, 15, 10};

        // Вывод исходного массива
        System.out.println("ORIGINAL ARRAY: ");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }

        bubbleSort(sortArr);

        // Вывод отсортированного массива
        System.out.println("SORTED ARRAY: ");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
}
