package hw8;

public class Utils {

    public static void createTaskNumber(int num) {
        System.out.println("_".repeat(30) + "\n (ﾉ" + "\u001B[36m" + "◕" + "\u001B[0m" + "ヮ" + "\u001B[36m" + "◕" +
                "\u001B[0m" + ")ﾉ*:･ﾟ✧" + ("\u001B[32m" + "\u001B[1m" + "T") + ("\u001B[31m" + "a") +
                ("\u001B[96m" + "s") + ("\u001B[35m" + "k ") + ("\u001B[33m" + num) + "\n" + "\u001B[0m");
    }

// print array
    public static String printArray (int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result+=array[i] + " ";
        }
        return result;
    }

    public static String printArray (double[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result+=array[i] + " ";
        }
        return result;
    }

    public static String printArray (String[] array){
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result+=array[i] + " ";
        }
        return result;
    }
//7
    public static int[] createArray (int one, int two, int three, int four, int five) {
        //int[] array5 = {one, two, three, four, five };

    return new int[] {one, two, three, four, five} ;
    }
//8
    public static double[] createArray (double one, double two, double three, double four, double five) {
        return new double[] {one, two, three, four, five};
    }

//9
    public static String[] createArray (String one, String two, String three, String four, String five) {
        return new String[] {one, two, three, four, five};
    }

// 10
    public static double[] createArray (int[] array) {
        double[] arrayD = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayD[i] = array[i] * 2.5;
        }
        return arrayD;
    }
//11
    public static int countEvenArray (int[] array) {
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0) {
                countEven++;
            }
        }
        return countEven;

    }

    //12
    public static int countOddArray (int[] array) {
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }






}




