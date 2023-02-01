//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Seminar2Task1 {
    // Метод логгера
    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Seminar2Task1.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    // Метод для ввода
    public static byte byte_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");

        Byte inp_byte = scanner.nextByte();

        scanner.close();

        return inp_byte;
    }

    // Метод записи в файл
    public static void file_out(String out_file_name, Byte out_byte){
        byte[] byte_array = new byte[1]; // Костыль? Не нашел способа записи переменной типа byte в файл.
        byte_array[0] = out_byte;

        try(FileOutputStream fos = new FileOutputStream(out_file_name)){
            fos.write(byte_array);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Byte new_byte = byte_input();
        file_out("test.txt", new_byte);

    }
}