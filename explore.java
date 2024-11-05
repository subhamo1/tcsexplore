package ilp;
/*
 * quistion 1
 * Exaple:
 * String Input: Xplore
 * Charracter Input :
 * Output : 4
 * /*
 * 
 * 
 */

import java.text.StringCharacterIterator;
import java.util.Scanner;

// public class explore {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// char ch = sc.next().charAt(0);
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == ch) {
// System.out.println(i);
// break;
// }
// }

// }
// }

/*
 * String Input: DataBaSe
 * Output:5
 */

/**
 * explore
 * //
 */
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch >= 'a' && ch <= 'z') {
// count++;
// }
// // System.out.println(count);
// }
// System.out.println(count);
// }
// }

/*
 * String Input: experience
 * Output:exprinc
 */

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String uniq = "";
// for (int i = 0; i < str.length(); i++) {
// if (uniq.indexOf(str.charAt(i)) == -1) {
// uniq = uniq + str.charAt(i);
// }

// }
// System.out.println(uniq);
// }
// }

/*
 * compute the number of spaces and character in string
 * String Input: Hi I am a Student
 * Output:4 13
 */

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// // Count spaces by comparing length before and after removing spaces
// int s_count = str.length() - str.replace(" ", "").length();

// // Count alphabetic characters by removing spaces and calculating remaining
// // length
// int c_count = str.replace(" ", "").length();

// System.out.println(s_count + " " + c_count);
// int s_count = 0, c_count = 0;
// for (int i = 0; i < str.length(); i++) {
// char ch = str.charAt(i);
// if (ch == ' ')
// s_count++;
// else if (ch >= 'a' || ch <= 'z' || ch >= 'A' || ch >= 'Z')
// c_count++;
// }
// System.out.println(s_count + " " + c_count);
// }

/*
 * write a program to print the last character of every word in a string
 * condition: Ignore all the digit and whitspace
 * Input: Hye3 Java Learners
 * Output: as
 */

/**
 * explore
 */
// public class explore {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// // Split the string into words based on spaces
// String[] words = str.split(" ");

// for (String word : words) {
// // Remove all digits from the word
// String cleanWord = word.replaceAll("\\d", "");

// // If the cleaned word is not empty, print its last character
// if (!cleanWord.isEmpty()) {
// // Add a space after printing the last character for clarity
// System.out.print(cleanWord.charAt(cleanWord.length() - 1) + " ");
// }
// }
// }
// }

/*
 * print the number of spaces in the particular string
 * Input: Hello what is your name
 * Output: 4
 * condition: if the count is greater than or eqal to 3 then print the count
 * else print NA as it is
 */

// public class explore {

// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// int count=0;
// for(int i=0;i<str.length();i++){
// char ch=str.charAt(i);
// if (ch==' ') {
// count++;

// }
// if (count>=3) {
// System.out.println(count);

// }else{
// System.out.println("Na");
// }
// }

// }
// }

// /*
// * Enter a string and print all vowel as it is which is available on the
// string
// * in the 0 index
// * Input: Hello I am a Student
// * Output: Iaa
// */

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String[] temp = str.split(" ");
// for (int i = 0; i < temp.length; i++) {
// String word = temp[i];
// char ch = word.charAt(0);
// if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch ==
// 'I' || ch == 'o' || ch == 'O'
// || ch == 'u' || ch == 'U')
// System.out.println(ch);
// }

// }
// }

// *
// * Find character of a string at odd index
// * Input: Management
// * Output: aaeet
// */

/**
 * explore
 */
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// for(int i=0;i<str.length();i++){
// if (i%2==1) {
// System.out.println(str.charAt(i));

// }
// }
// }

// }

// *
// * Take an integer as input and calculate the sum of its digit
// if the sum is divisible by 3,then print True else pritn False
// * Input: 123
// * Output: TRUe
// */
// * Input: 1234
// * Output: FALSE
// */

/**
 * explore
 */
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int sum = 0, x;
// while (a != 0) {
// x = a % 10;
// sum = sum + x;
// a = a / 10;

// }

// if (sum % 3 == 0) {
// System.out.println("True");
// } else {
// System.out.println("False");
// }
// }
// }

// * Find largest word from a given sentence if two string have same length the
// print the first one
// * Input: TCS is the best Company ever
// * Output: Company
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String[] arr = str.split(" ");
// String largest = " ";
// for (int i = 0; i < arr.length; i++) {
// if (arr[i].length() > largest.length()) {
// largest = arr[i];

// }
// }
// System.out.println(largest);
// }
// }

// * write main method in Solution class
// In the main methd ,write code to read a numric digit (without any alphabets
// or special character using Scanner and print it in the reverse seuence as
// they apper in the input)
//
// * Input: 12345
// * Output: 54321
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// while (a != 0) {
// int d = a % 10;
// a = a / 10;

// System.out.println(d);

// }
// }
// }

// * write main method in Solution class
// program take input as string and digit . chek wheter given string containg
// digit and sum all the digit as output in java it should print the sum when
// its greater than 10
//
// * Input: T1T2T3
// * Output: 6
// * Input: Tcslp19ore4
// * Output: 6

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int sum = 0;
// for (int i = 0; i < str.length(); i++) {
// if (Character.isDigit(str.charAt(i)))
// sum = sum + Character.getNumericValue(str.charAt(i));

// }
// if (sum>10) {

// }
// System.out.println(sum);
// }
// }

/*
 * Find first letter of each word in a string
 * Input : Kalyani Govt. Eng. College
 * Output : KGEC
 */

// public class explore {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// String s = "";
// s = s+str.charAt(0);
// for (int i = 0; i < str.length(); i++) {
// if(str.charAt(i)==' ')
// {
// s = s + str.charAt(i+1);
// }
// }
// System.out.println(s);
// }
// }

// sum of perfect number
// if number is 6 then factors of 6 is 123 ans sum of factor is 1+2+3 also 6

/**
 * explore
 */
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int sum = 0;
// for (int i = 0; i < a; i++) {
// if (a % i == 0) {
// sum = sum + i;
// }
// }
// if (sum == a) {
// System.out.println("Perfect number");
// } else {
// System.out.println("not");
// }

// }
// }

// perfect square

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// for (int i = 0; i <= a; i++) {
// int sqr = i * i;
// if (sqr == a) {
// System.out.println("true");
// }
// }
// }
// }

// print smallelst first vowel in String

// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.nextLine();
// String[] vowels = { "a", "e", "i", "o", "u" };
// for (int i = 0; i < vowels.length; i++) {
// if (a.contains(vowels[i])) {
// System.out.println(vowels[i]);
// break;

// }
// }

// }
// }
// find calpitel letter in string
// Input : EducationalTalk
// output : 2
// public class explore {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.nextLine();
// int count = 0;
// for (int i = 0; i < a.length(); i++) {
// if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
// count++;
// }
// }
// if (count == 0) {
// System.out.println("No capilel letter");

// } else {
// System.out.println(count);
// }
// }
// }

// write a prgramer to take a string as input all should be in capital letter
// and if the first three letter is 'C' 'H' 'N' IF the first three letter is 'C'
// 'H' 'N' then print the rest character in reverse order or else print "NA"
// example : input :CHNKSC OUTPUT: CSK NEXTiNPUT: CASHDKKD OUTPUT:"NA" GIVE ME
// IN JAVA IN EASY WAY

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string in capital letters:");
        String input = sc.nextLine();

        // Check if the first three letters are 'C', 'H', and 'N'
        if (input.startsWith("CHN")) {
            // Reverse the remaining part of the string and print it
            String remainingPart = input.substring(3);
            String reversed = new StringBuilder(remainingPart).reverse().toString();
            System.out.println(reversed);
        } else {
            // If the first three letters are not 'C', 'H', and 'N', print "NA"
            System.out.println("NA");
        }

        sc.close();
    }
}