import java.util.Arrays;
import java.util.Collections;

public class getLastIndex {
    public static void main(String[] args) {
        String[] names = {"Bill", "Sang", "Jamal", "Enrique", "Isaiah"};
        System.out.println("Printing names...");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("\n");
        System.out.println("Now printing the last index position of names array:");
        System.out.println(getLastIndex(names));
        System.out.println("\n");
        System.out.println("Now printing the SECOND to last index position in names array:");
        System.out.println(getSecondToLastIndex(names));
        System.out.println("\n");
        System.out.println("Now printing the first element listed in names array:");
        System.out.println(getFirstElement(names));
        System.out.println("\n");
        System.out.println("And let's print the last element too:");
        System.out.println(getLastElement(names));
        System.out.println("\n");
        System.out.println("Might as well throw in the second to last element:");
        System.out.println(getSecondToLastElement(names));
        System.out.println("\n");
        System.out.println("Index position 0 holds this element:");
        System.out.println(getIndexByElement(names, "bill"));
        System.out.println("\n");
        //-----------------
        int[] test = new int[8];
        test[0] = 3;
        test[1] = 3;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;
        test[5] = 6;
        test[6] = 7;
        test[7] = 8;
        System.out.println("Printing numbers in my test array subject to calculations");
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        System.out.println("\n");
        System.out.println("Calculating for sum of numbers in array...");
        System.out.println(getSum(test));
        System.out.println("\n");
        System.out.println("Calculating the average of numbers in array...");
        System.out.println(getAverage(test));
        System.out.println("\n");
        //-----------------

        int numbers[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Printing numbers in my array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("\n");
        System.out.println("Odd numbers....");
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println("\n");
        System.out.println("Even numbers....");
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println("\n");
        //-----------------
        String[] names2 = {"Bob", "Chad", "Joe"};
        System.out.println("Let's get a new array of names:");
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i]);
        }
        System.out.println("\n");
        System.out.println("Checking if the name Johnny is in my new array...");
        System.out.println(contains(names2, "Johnny"));
        System.out.println("\n");
        //-----------------
        System.out.println("Now printing all odd numbers from 0-20:");
        printOddNumbersInRange(0, 20);
        System.out.println("\n");
        //-----------------
        System.out.println("Now repeating the word Repeat 5x");
        System.out.println(printGivenStringTimesNumberGiven("repeat ", 5));
        System.out.println("\n");
        //-----------------
        System.out.println("Now repeating the first 3 letters of the word Three 3x: ");
        System.out.println(repeatFirstThreeLetters("Three", 3));
        System.out.println("\n");
        //-----------------
        System.out.println("Now counting the amount of words in the following string:");
        System.out.println(WordsInAStringCounter("word1, word2, word3, word4"));
        System.out.println("\n");

        System.out.println("How many vowels are in this phrase: Craft mac and cheese");
        System.out.println(VowelsCounter("Craft mac and cheese"));
        System.out.println("\n");

        System.out.println("Printing all elements");
        String[] names3 = {"Jimmy", "John", "Joe"};
        for (int i = 0; i < names3.length; i++) {
            System.out.println(names3[i]);
        }
        System.out.println("\n");
        System.out.println("Printing first and last element before swap:");
        System.out.println(names3[0]);
        System.out.println(names3[2]);
        System.out.println("\n");
        System.out.println("Printing first and last element after swap:");
        swap(names3);
        System.out.println(names3[0]);
        System.out.println(names3[2]);
        System.out.println("\n");

        String str2 = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
        System.out.println("Printing string BEFORE replacements:");
        System.out.println(str2);
        System.out.println("\n");

        System.out.println("Printing string AFTER replacements:");
        System.out.println(replaceCharacters(str2));
        System.out.println("\n");


        String smallDog = "The small brown dog hopped the fence";
        System.out.println("Printing string before change");
        System.out.println(smallDog);
        System.out.println("\n");
        System.out.println("Printing string after change");
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println("\n");

        System.out.println("Fibonnaci Party");
        System.out.println( createStringOfFibonnaciUpToMax(500));


    }


    //============================= METHODS =====================================


    //   Q1=============
    public static int getLastIndex(String[] names) {
        return names.length - 1;

    }

    //    Q2================
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;

    }

    //    Q3================
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //    Q4=====================
    public static String getLastElement(String[] names) {
        return names[names.length - 1];

    }

    //    Q5==============
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //    Q6==========
    public static int getSum(int[] ints) {
        int sum = 0;
        int position = 0;
        while (position < ints.length - 0) {
            sum = sum + ints[position];
            position++;
        }
        return sum;
    }

    //    Q7 ==========
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum / ints.length;
    }

    //    Q8========
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbers = " ";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {

                oddNumbers = oddNumbers + numbers[i];
            }

        }
        return oddNumbers;
    }


// Q9===================

    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers = " ";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                evenNumbers = evenNumbers + numbers[i];
            }

        }
        return evenNumbers;
    }


    //    Q10================
    public static boolean contains(String[] names2, String element) {
        for (int i = 0; i < names2.length; i++) {
            if (element == names2[i]) {
                return true;

            }

        }
        return false;
    }

    //       Q11===============================
    public static int getIndexByElement(String[] names, String element) {
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (element == names[i]) {
                j = i;
            }

        }
        return j;
    }


    //    Q12==================
    public static void printOddNumbersInRange(int start, int end) {
        for (int x = start; x < end; x++) {
            if (x % 2 != 0) {
                System.out.println(x + " ");
            }
        }
    }


    //        Q13 ===============
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        str = str.repeat(n);
        return str;
    }

    //       Q14 ===============
    public static String repeatFirstThreeLetters(String str, int n) {
        str = str.substring(0, 3);
        return str.repeat(n);
    }

    //      Q15 ==============
//// Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        //Use regular expression "\s" to detect space
        //When a new space is made in sysout, new word is recognized
        //When invoking method, fill parameters with Strings
        String[] words = str.split("\\s+");
        return words.length;
    }

    //        }
//        Q16 ===========
    public static int VowelsCounter(String str) {
        String x = str;
        x = x.toLowerCase();
        int i;
        int count = 0;
        for (i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y') {
                count++;

            }

        }
        return count;
    }

    //        Q17 ================
//        Swap the first element in an array with the last element in an array and return
    public static String[] swap(String[] stringArray) {

        int last = stringArray.length - 1;
        String temp = stringArray[0];
        stringArray[0] = stringArray[last];
        stringArray[last] = temp;

        return null;
    }
////        Question 18

    public static String replaceCharacters(String str) {
        String str2 = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
        str2 = str2.replace('F', '7');
        str2 = str2.replace('f', '7');
        str2 = str2.replace('s', '$');
        str2 = str2.replace('1', '!');
        str2 = str2.replace('a', '@');

        return str2;
    }
//        Question 19

    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String result = " ";
        String[] replaceString = stringInput.split(" "); //Using split method, providing a space as a string saying that each element will show up different after space
        for (int i = 0; i < replaceString.length; i++) {
            if ((i + 1) % 2 == 0) {
                replaceString[i] = "Wu";
            } else if ((i + 1) % 3 == 0) {
                replaceString[i] = "Tang";
            }
            result += replaceString[i] + " ";
        }
        return result;
    }

    //        Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
            int one = 0;
            int two = 1;
            String keepAdding = " " + one + " " + two + " ";

            for(int i=0; i < maxnumber; i++){
                int three = one + two;
                one = two;
                two = three;
                if(three >= maxnumber){
                    break;
                }
               keepAdding =  keepAdding + three + " ";
            }
        return keepAdding;

    }
}









