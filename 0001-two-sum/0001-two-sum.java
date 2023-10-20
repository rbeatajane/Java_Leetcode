// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int sum;
//         for(int i=0; i < nums.length; i++) {            
//             for(int j=i+1; j < nums.length; j++) {
//                 sum = nums[i] + nums[j];
//                 if(sum == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int diffKey;

        for(int i=0; i < nums.length; i++) {
            diffKey = target - nums[i];
            if(map.containsKey(diffKey)){
                return new int[] {map.get(diffKey), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}


