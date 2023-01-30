// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
public class Seminar1Task3 {
    // Проверка числа на простоту
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        int a = 2, b = 100;
        System.out.println("Prime numbers in between [" + (int)a + ", " + (int)b + "]:");
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
