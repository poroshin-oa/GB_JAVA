import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;
public class Seminar4Task1 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);


        for(int i = 0; i < deque.size(); i++){
            System.out.println("--" + i + "--");
            System.out.println(deque.pollFirst());
            System.out.println(deque.pollLast());
        }

        System.out.println(deque);


    }


    public ArrayDeque<Integer> checkOn(ArrayDeque<Integer> deque){

        return deque;
    }
}

