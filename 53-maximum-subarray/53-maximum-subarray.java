class Solution {
    public int maxSubArray(int[] nums) {
       /* int maxSum = Integer.MIN_VALUE;
       int sum =0;
        if(nums.length == 1)
            return nums[0];
        for(int i = 0; i < nums.length; i++){
           sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0)
                sum = 0;
        }
        return maxSum;*/
          int result = maximumSubArraySum(nums,0,nums.length-1);
        return result;
    }
    public static int maxCrossingSubArray(int[] array, int start, int end, int mid){
        int left_sum =Integer.MIN_VALUE, right_sum =Integer.MIN_VALUE,sum=0;
       // int mid = (start+end)/2;
        //System.out.println("mid is " + mid);
        for(int i =  mid; i>=start;i--){
            sum += array[i];
            if(left_sum < sum){
                left_sum = sum;
            }


        }
       // System.out.println("left sum is " + left_sum);
        sum =0;
        for(int i = mid+1; i<=end;i++){
            sum += array[i];
            if(right_sum < sum){
                right_sum = sum;
            }
        }
        //System.out.println(right_sum);
        return  left_sum+right_sum;

    }

    public static int maximumSubArraySum(int[] array, int start, int end){

        if(start==end){
            return array[start];
        }
        int mid = (start+end)/2;

        //Calculate maximumSubArraySum for thr left
        int maxi = Math.max(maximumSubArraySum(array,start,mid),maximumSubArraySum(array,mid+1,end));
        //Calculate maximumSubArraySum for thr left



        return Math.max(maxi,maxCrossingSubArray(array,start,end,mid));
    }
}