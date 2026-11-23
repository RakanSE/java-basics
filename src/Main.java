import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


// Q1
        System.out.print("Enter the Weight: ");
        double w = in.nextDouble();

        System.out.print("Enter the height: ");
        double h = in.nextDouble();

        System.out.println("The BMI = " + w / (h*h));

        System.out.println("_______________________________________________");


// ََQ2

        System.out.print("Enter the obtained marks: ");
        double mrk = in.nextDouble();

        System.out.print("Enter the total marks: ");
        double totl = in.nextDouble();

        double percentage = (mrk / totl) *  100;
        System.out.println("The percentage = " + percentage +"%");

        System.out.println("_______________________________________________");

// Q3

        System.out.print("Enter the amount in USD: ");
        double us = in.nextDouble();

        System.out.print("Enter the exchange rate USD to ERU: ");
        double rt = in.nextDouble();

        double conv = us * rt;

        System.out.println("The amount in EUR: " + conv);

        System.out.println("_______________________________________________");

// Q4
        System.out.print("Enter the string: ");
        in.nextLine();
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String revers = sb.toString();

        System.out.println("The length of string: " + str.length() + " The revers string is: " + revers );

        System.out.println("_______________________________________________");

// Q5

        System.out.print("Enter the sentences: ");
        String sen = in.nextLine();

        System.out.print("Enter the start index: ");
        int st = in.nextInt();

        System.out.print("Enter the end index: ");
        int end = in.nextInt();

        String sent = sen.substring(st, end);

        System.out.println(sent);

        System.out.println("_______________________________________________");

// Q6

        System.out.print("Enter the sentences: ");
        in.nextLine();
        String sente = in.nextLine();

        System.out.print("Enter the keyword: ");
        String key = in.nextLine();

        System.out.println("Keyword " + key +  " is presnt? " + sente.contains(key));

        System.out.println("_______________________________________________");

// Q7

        System.out.print("Enter the sentence: ");
        String sent3 = in.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = in.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = in.nextLine();

        String modified = sent3.replace(oldWord, newWord);
        System.out.println(modified);

        System.out.println("_______________________________________________");

// Q8

        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();

        System.out.print("Enter the secound string: ");
        String s2 = in.nextLine();

        System.out.println("Are the strings equal ? " + s1.equalsIgnoreCase(s2));



    }
}