import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        //Q1
//        Write a Java program that accept three numbers from the user and print the largest number .

        Scanner input = new Scanner(System.in);
        System.out.println("Finding largest number");
        int[] numbers = new int[3];
        int largest = 0;
        for (int i = 0; i<=3-1; i++){
            System.out.println("Enter "+(i+1)+" number");
            numbers[i] = input.nextInt();

            if (i == 0){
                largest = numbers[i];
            }
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }

        input.nextLine();
        System.out.println("The largest number is "+largest);

//Q2
//Write a Java program that accept a String and a number from the user,then print the character in the given index .
        String word;
        int number;

        System.out.println("Char at program:");
        System.out.println("Enter a word");
        word = input.nextLine();

        System.out.println("Enter an index to print char at:");
        number = input.nextInt();

        if (number <0 || number >=word.length()){
            System.out.println("The entered number is out of bound");
        } else {
            System.out.println("The character at index "+number+" is "+word.charAt(number));
        }

//        Q3
//         Write a program to enter the numbers till the user wants and at the end it should display the sum entered .
        System.out.println("Sum of numbers:");
        number = -1;
        int sum = 0;
        do {
            System.out.println("Enter a number (0 to exit)");
            number = input.nextInt();
            sum +=number;
        } while (number !=0);

        System.out.println("The sum is "+sum);

//        Q4
//        Write a Java program to find positive and negative numbers of a given array:
        System.out.println("Finding positive and negative numbers in an array");
        int[] arrayOfNumbers = {10, -21 , 30, 31, -25};

        for (int i = 0; i <= arrayOfNumbers.length-1; i++) {
            if (arrayOfNumbers[i] < 0){
                System.out.println(arrayOfNumbers[i] +" is a negative number ");
            } else {
                System.out.println(arrayOfNumbers[i] +" is a positive number ");
            }
        }

//        Q5
//        Write a Java program to find a shortest word of a given array:
        System.out.println("Finding shortest word in an array");
        String[] wordsArray = {"Tuwaiq", "Bootcamp", "Student", "JAVA"};
        String shortestWord = null;
        for (int i = 0; i <= wordsArray.length-1; i++) {
            System.out.print(wordsArray[i]);
            if (i !=wordsArray.length-1){
                System.out.print(", ");
            }
            if (i ==0){
                shortestWord = wordsArray[i];
            }
            if (wordsArray[i].length() < shortestWord.length()){
                shortestWord = wordsArray[i];
            }
        }

        System.out.println();
        System.out.println("The shortest word is:");
        System.out.println(shortestWord);
    }
}
