public class Test {
    public static void main(String[] args) {
        //declare the integer array
    int[] test = new int[8];

        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;
        test[5] = 6;
        test[6] = 7;
        test[7] = 8;

        //find sum of numbers
        int sum = 0;

        int lengthOfArray = test.length;
        for(int i=0;i<lengthOfArray;i++) {

            System.out.println(test[i]+" ");

        }


    }
}