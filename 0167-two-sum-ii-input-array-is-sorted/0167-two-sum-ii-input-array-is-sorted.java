class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left_index = 0;
        int right_index = numbers.length - 1;

        while(numbers[left_index] + numbers[right_index] != target) {
            if (numbers[left_index] + numbers[right_index] < target){
                left_index++;
            }
            else {
                right_index--;
            }
        }
        return new int [] {++left_index, ++right_index};
    }
}

// [2,3,4,5,9] , Target 9
// Array containing atleast 2 elem to 30000
// nums range from -1000 to 1000
// 1,2,3,4,5
// target range from -1000 to 1000 value
// No duplicate
// S.C = O(1)
