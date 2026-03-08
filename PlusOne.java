import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        }
        int [] ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        PlusOne solution=new PlusOne();
        int digits[] = {1,2,3};
        int[] result =solution.plusOne(digits); 
       if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("New Array is: " + Arrays.toString(result)); 
        }
    }
}
