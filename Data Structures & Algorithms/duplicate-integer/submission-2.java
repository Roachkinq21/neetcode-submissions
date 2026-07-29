
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> unique = new java.util.HashSet<>();

        for(int element : nums){
            if(!unique.add(element)){
                return true;
            }
        }
        return false;
    }
}