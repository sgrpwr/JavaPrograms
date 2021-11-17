package Java.Basic.Programs.MajorityElement;

class Solution {
    public static void main(String[] args) {
        int nums[] = {4,5,4};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {

        int freEle = 0;
        int count = 1;
        int nCount=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[freEle]) count++;
            else count--;

            if(count==0){
                freEle = i;
                count = 1;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[freEle]==nums[i]) nCount++;
        }

        return nCount>nums.length/2 ? nums[freEle] : 0;
    }
}