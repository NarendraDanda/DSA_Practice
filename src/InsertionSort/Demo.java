package InsertionSort;

public class Demo {
    public static void main(String[] args){
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;

        for(int i =1; i<nums.length-1;i++){
            int key = nums[i];
            int j = i-1;

            while( j>=0 && nums[j]>key ){
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = key;

        }
        System.out.println();
        System.out.println("Sorted array: " );
        for(int num:nums) {
            System.out.print(num + " ");
        }
    }
}
