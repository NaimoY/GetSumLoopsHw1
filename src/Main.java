//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numArr1 = {100, 200, 300, 400, 500};
        int[] numArr2 = {11,22,33};

        int sum1 = getSum(numArr1);
        int sum2 = getSum(numArr2);
        System.out.println("NumArr1 Sum is: " + sum1);
        System.out.println("NumArr2 Sum is: " + sum2);

    }

    // nums = 100, 200, 300, 400
    public static int getSum(int[] nums) {
         int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
             currentSum += nums[i];
        }
        return currentSum;
    }
    /*

    // for each value in the array, update currentSum
           //currentSum = currentSum + nums[i];
          // currentSum += nums[i];
     */
}
/*
Assignment

Step 1: Inside your main() method, create an array of integers called numArr1
 and have it contain the following numbers: 100, 200, 300, 400, 500.

Step 2: Inside your main() method, create another array of
integers called numArr2 and have it contain the following numbers: 11, 22, 33.

Step 3: Create a method called getSum()
that takes an array of integers and returns the sum.
 */