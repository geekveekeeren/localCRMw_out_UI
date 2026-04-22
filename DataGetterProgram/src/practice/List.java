package practice;


import java.io.FileWriter;
import java.util.Scanner;                           //input utils
import java.io.PrintWriter;                         //input utils
import java.io.IOException;                         //input utils

public class List {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        //scanner



        while (true)
        {
            String[] userData = getData(in);

            try (PrintWriter printer = new PrintWriter(new FileWriter("userInfo.txt", true))) {

                printer.printf("Client name: %s\n", userData[0]);
                printer.printf("Store name: %s\n", userData[1]);
                printer.printf("Preferred call time: %s\n", userData[2]);
                printer.printf("Preferred call date: %s\n", userData[3]);
                printer.println("----------------------------");

                System.out.print("To exit the program, type exit. If you want to continue working, press Enter.");

                }
                    catch (IOException e) {

                    System.out.println("Error! error number: " + e.getMessage());

            }
            String choose = in.nextLine();
            if (choose.equalsIgnoreCase("exit")){
                break;
            }
        }
    }

    public static String[] getData(Scanner in){

        String name;                                //var
        String org;                                 //var
        String time;                                //var
        String date;                                //var

        System.out.print("Client name: ");
        name = in.nextLine();

        System.out.print("Store name: ");
        org = in.nextLine();

        System.out.print("Preferred call time: ");
        time = in.nextLine();

        System.out.print("Preferred call date: ");
        date = in.nextLine();

        return new String[] {name, org, time, date};
    } //getData Array

}
