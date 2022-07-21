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

}
