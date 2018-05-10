//Ülesanne 7

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static int duplicateCount(ArrayList<Integer> numList, int num){
        int count = 0;
        for (int element:numList) {
            if (element == num){
                count = 1 + count;
                //System.out.println("Boop!");
            }
        }
        return count;
    }

    public static int duplicateSum(ArrayList<Integer> numList){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numList.size(); i ++) {
            count = Collections.frequency(numList, numList.get(i));
            if (count == 1) {
                numList.remove(i);
            }
        }
        for (int num : numList) {
            sum += num;
            //System.out.println("sum: " + sum);
        }
        return sum;
    }


    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(1, 2, 3, 2, 1));

        System.out.println(duplicateCount(numList, 1));
        System.out.println(duplicateSum(numList));

    }

}
