import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String [] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextLine();
        }*/
        // Task 1 & 2
       /* int minIndex = 0;
        int maxIndex = 0;
        int averageIndex = 0;
        int lenght = array [0].length();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < lenght ) {
                minIndex = i;
            }
            if (array[i].length() > lenght ) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i ++) {
            if (i != minIndex && i != maxIndex) {
                averageIndex = i;
            }
        }

        System.out.println(array[minIndex] + " " + array[minIndex].length());
        System.out.println(array[averageIndex]);
        System.out.println(array[maxIndex] + " " + array[maxIndex].length());*/

        // Task 3
       /* double averageLenght = (array[0].length() + array[1].length() + array[2].length()) / 3;
        System.out.println(averageLenght);
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < averageLenght) {
                System.out.println(array[i]);
            }
        }*/

        //Task 4

       /*String [] [] splitArrrays = new String[3][];
        for (int i = 0; i < array.length; i++) {
           splitArrrays [i] = array [i].split(" ");
        }*/

        // Task*

        String example = "tenet isn't my favorite movie";
        String exampleArray[] = example.split(" ");
        int index = scanner.nextInt() - 1;
        int count = 0;
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == ' ')
                count++;
            }
                if (count >= index) {
                StringBuilder sb = new StringBuilder(exampleArray[index]);
                String reverse = sb.reverse().toString();
                if (exampleArray[index].equals(reverse)) {
                    System.out.println("Данное слово полиндром");
                } else {
                    System.out.println("Данное слово не палиндром");
                }
            } else {
                System.out.println("Введенное число неверное");
            }
        }
    }