package DataInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Data input
public class Main {
    public static List<ClientsInput> itemData = new ArrayList<>();
    public static void main(String[] args) {
        int i=0;
        String name1;
        int priority1;
        long cost1;
        String email1;
        String[] item  = new String[7];
        for (i=0; i<3; i++)  {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Введите имя и фамилию клиента " + i);
            String name = keyboard.next();

            Scanner keyboard2 = new Scanner(System.in);
            System.out.println("Введите дату рождения клиента " + i);
            long cost = keyboard2.nextLong();

            Scanner keyboard3 = new Scanner(System.in);
            System.out.println("Введите номер телефона клиента " + i);
            int priority = keyboard3.nextInt();

            Scanner keyboard4 = new Scanner(System.in);
            System.out.println("Введите адрес электронной почты " + i);
            String email = keyboard4.next();

            ItemData x = new ItemData(name, cost, priority, email);
        }
    }
}
