package hw8;

import static hw8.Utils.*;
import hw8.Utils;
import java.util.Arrays;

public class HW8 {

    public static Integer position = new Integer (1);
    public static Double age = new Double(2.5);
    public static String assistant = new String("Olivia");



    public static void main(String[] args) {

      //Utils.createTaskNumber(1);
      //createTaskNumber(1);

        createTaskNumber(6);


//        System.out.println(HW8_1.age.equals(HW8.age));
//        System.out.println(HW8_1.assistant.equals(HW8.assistant));

        String line = "_".repeat(79) + "\n";
        String table = line;
        table+= String.format("|%-30s|%-30s|%-15s|%n","HW8","HW8_1","areEquals?");
        table+= line;
        table+= String.format("|%-15s%-15.1f|%-15s%-15.1f|%-15b|%n", "Double d = ",
                HW8.age, "Double d_1 = ", HW8_1.age,HW8_1.age.equals(HW8.age));
        table+= line;
        table+= String.format("|%-15s%-15d|%-15s%-15d|%-15b|%n", "Integer i = ",
                HW8.position, "Integer i_1 = ", HW8_1.position,HW8_1.position.equals(HW8.position));
        table+= line;
        table+= String.format("|%-15s%-15s|%-15s%-15s|%-15b|%n", "String m = ",
                HW8.assistant, "String m_1 = ", HW8_1.assistant,HW8_1.assistant.equals(HW8.assistant));
        table+=line;

        System.out.println(table);

        createTaskNumber(7);
        System.out.println(printArray(createArray(9,44,3,20,5)));

        createTaskNumber(8);
        System.out.println(printArray(createArray(1.0,2.2,3,4.4,5)));

        createTaskNumber(9);
        System.out.println(printArray(createArray("Tom", "Myata", "Vasilii","Bandit","Myrka")));

        createTaskNumber(10);
        System.out.println(printArray(createArray(createArray(9,44,3,20,5))));

        createTaskNumber(11);
        System.out.println(countEvenArray(createArray(2,2,2,1,1)));

        createTaskNumber(12);
        System.out.println(countOddArray(createArray(2,2,2,1,1)));


    }



}
