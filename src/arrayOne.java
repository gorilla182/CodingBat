public class arrayOne {
    public boolean firstLast6(int[] nums) {
        boolean result = false;
        for (int i = 0; i<nums.length; i++){
            if (nums[0]==6||nums[nums.length-1]==6){
                result =true;
            }
        }
        return result;
    }
    public boolean sameFirstLast(int[] nums) {
        boolean result = false;
        for(int i = 0; i<nums.length; i++){
            if(nums.length >=1 &&nums[0] == nums[nums.length-1] ){
                result = true;
            }
        }
        return result;
    }
    public int[] makePi() {
        int[] nums = new int[]{3,1,4};
        return nums;
    }
    public int sum3(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums.length<3){
                break;
            }else{
                result += nums[i];
            }
        }
        return result;
    }
    public boolean commonEnd(int[] a, int[] b) {
        boolean result = false;
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<b.length;j++){
                if(a[0]==b[0]||a[a.length-1]==b[b.length-1]){
                    result =  true;
                }
            }
        }
        return result;
    }
    public int sum2(int[] nums) {
        int result= 0;
        for(int i = 0; i<nums.length;i++){
            if(nums.length >= 2){
                result = nums[0] + nums[1];

            } else if (nums.length == 1){
                result = nums[0];

            } else
                result = 0;

        }
        return result;
    }
    public int[] middleWay(int[] a, int[] b) {
        int [] newArray = new int[]{a[1],b[1]};
        return newArray;
    }
    public int[] makeEnds(int[] nums) {
        int[] newArray = new int[]{nums[0], nums[nums.length-1]};
        return newArray;
    }
    public boolean has23(int[] nums) {
        for(int num : nums){
            if(num == 2 || num == 3){
                return true;
            }
        }
        return false;
    }
    public boolean no23(int[] nums) {
        for(int num : nums){
            if(num == 2 || num == 3)
                return false;
        }
        return true;
    }
    public int[] makeLast(int[] nums) {
        int [] newArray = new int[nums.length*2];
        if(nums.length>=1){
            for(int i = 0; i<nums.length; i++){
                newArray[newArray.length-1] = nums[nums.length-1];
            }
        }
        return newArray;
    }
    public boolean double23(int[] nums) {
        if(nums.length == 2){
            if(nums[0]==2 && nums[1]==2 || nums[0] ==3 && nums[1] == 3){
                return true;
            }
        }
        return false;
    }

}
