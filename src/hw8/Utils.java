package hw8;

public class Utils {

    public static void createTaskNumber(int num) {
        System.out.println("_".repeat(30) + "\n (ﾉ" + "\u001B[36m" + "◕" + "\u001B[0m" + "ヮ" + "\u001B[36m" + "◕" +
                "\u001B[0m" + ")ﾉ*:･ﾟ✧" + ("\u001B[32m" + "\u001B[1m" + "T") + ("\u001B[31m" + "a") +
                ("\u001B[96m" + "s") + ("\u001B[35m" + "k ") + ("\u001B[33m" + num) + "\n" + "\u001B[0m");
    }

    // print array
    public static String printArray(int[] array) {
        if (array == null) {
            return "null";
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    public static String printArray(double[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    public static String printArray(String[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    public static String printArray(boolean[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }

    //7
    public static int[] createArray(int one, int two, int three, int four, int five) {
        //int[] array5 = {one, two, three, four, five };
        return new int[]{one, two, three, four, five};
    }

    //8
    public static double[] createArray(double one, double two, double three, double four, double five) {
        return new double[]{one, two, three, four, five};
    }

    //9
    public static String[] createArray(String one, String two, String three, String four, String five) {
        return new String[]{one, two, three, four, five};
    }

    // 10
    public static double[] createArray(int[] array) {
        double[] arrayD = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayD[i] = array[i] * 2.5;
        }
        return arrayD;
    }

    //11
    public static int countEvenArray(int[] array) {
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;

    }

    //12
    public static int countOddArray(int[] array) {
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    //13
    public static boolean[] isItMore10(int[] array) {
        boolean[] arrayB = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                arrayB[i] = true;
            } else {
                arrayB[i] = false;
            }
        }
        return arrayB;
    }

    //14
    public static String createSentence(String[] words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++) {
            sentence += words[i] + " ";
        }
        return sentence;
    }

    //15
    public static int countSecondHalf(int[] numbers) {
        int count = 0;
        if (numbers.length % 2 == 0) {
            for (int i = numbers.length / 2; i < numbers.length; i++) {
                count += numbers[i];
            }
        } else {
            for (int i = (numbers.length + 1) / 2; i < numbers.length; i++) {
                count += numbers[i];
            }
        }
        return count;
    }

    //16
    public static int[] multiplesOfNumber(int num) {
        int[] multiples = new int[11];
        if (num < 1 || num > 10) {
            return null;
        } else {
            for (int i = 0; i < multiples.length; i++) {
                multiples[i] = i * num;
            }
        }
        return multiples;
    }

    //17
    public static int[] countMore(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        int[] arrEven = new int[even];
        int[] arrOdd = new int[odd];

        even = 0;
        odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[even] = arr[i];
                even++;
            } else {
                arrOdd[odd] = arr[i];
                odd++;
            }
        }
        if (arrEven.length == arrOdd.length) {
            return null;
        } else if (arrEven.length > arrOdd.length) {
            return arrEven;
        } else {
            return arrOdd;
        }
    }
    //18

    public static int[] createRandomArr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    //19
    public static int[] createRandomArr(int l, int d) {
        if (l < 1 || d < 1 || d > 10) {
            return null;
        }
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            if (d == 1) {
                arr[i] = (int) (Math.random() * 10);
            } else if (d == 2) {
                arr[i] = (int) (Math.random() * 100);
            } else if (d == 3) {
                arr[i] = (int) (Math.random() * 1000);
            } else if (d == 4) {
                arr[i] = (int) (Math.random() * 10000);
            } else if (d == 5) {
                arr[i] = (int) (Math.random() * 100000);
            } else if (d == 6) {
                arr[i] = (int) (Math.random() * 1000000);
            } else if (d == 7) {
                arr[i] = (int) (Math.random() * 10000000);
            } else if (d == 8) {
                arr[i] = (int) (Math.random() * 100000000);
            } else if (d == 9) {
                arr[i] = (int) (Math.random() * 1000000000);
            } else if (d == 10) {
                arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
            } else {
                return null;
            }


        }
        return arr;

    }
}





















