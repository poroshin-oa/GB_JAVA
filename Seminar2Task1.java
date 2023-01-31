//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

import java.util.Scanner;

public class Seminar2Task1 {
    // Метод для ввода
    public static byte byte_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");

        Byte inp_byte = scanner.nextByte();

        scanner.close();

        return inp_byte;
    }

    //Метод записи в файл
    public static void file_out(String out_file_name, Byte out_byte){

    }

    public static void main(String[] args) {
        Byte new_byte = byte_input();
        file_out("test", new_byte);
    }
}