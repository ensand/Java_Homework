//Ülesanne 7
public class Duplicates {

    public static int duplicateCount(int[] numList, int num){
        int count = 0;
        for (int element:numList) {
            if (element == num){
                count = 1 + count;
            }
        }
        return count;
    }

    public static int duplicateSum(int[] numList){
        int sum = 0;
        for (int i = 0; i < numList.length; i ++){
            if (numList[i] == numList[i+1]){
                sum = numList[i] + sum;
            }
        }
        return sum;
    }

//    public static void main(String[] args) {
//        duplicateCount(args[0], args[1]);
//        duplicateSum(args[0]);
//    }

}
