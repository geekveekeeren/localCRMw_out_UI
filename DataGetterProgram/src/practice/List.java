package practice;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;                           //input utils
import java.io.PrintWriter;                         //input utils
import java.io.IOException;                         //input utils

public class List {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        //scanner

        boolean exit = true;

        while (true)
        {
            String[] userData = getData(in);

            try (PrintWriter printer = new PrintWriter(new FileWriter("userInfo.txt", true))) {

                printer.printf("Имя клиента: %s\n", userData[0]);
                printer.printf("Имя магазина: %s\n", userData[1]);
                printer.printf("Время звонка: %s\n", userData[2]);
                printer.printf("Дата звонка: %s\n", userData[3]);
                printer.println("----------------------------");

                System.out.print("Для выхода из программы напишите ВЫХОД. Если планируете продолжить работу - нажмите Enter");

                }
                    catch (IOException e) {

                    System.out.println("Ошибка в работе программы, номер ошибки: " + e.getMessage());

            }
            String choise = in.nextLine();
            if (choise.equalsIgnoreCase("выход")){
                break;
            }
        }
    }

    public static String[] getData(Scanner in){

        String name;                                //var
        String org;                                 //var
        String time;                                //var
        String date;                                //var

        System.out.print("Имя клиента: ");
        name = in.nextLine();

        System.out.print("Название организации: ");
        org = in.nextLine();

        System.out.print("Время звонка: ");
        time = in.nextLine();

        System.out.print("Дата звонка: ");
        date = in.nextLine();

        return new String[] {name, org, time, date};
    } //getData Array

}
