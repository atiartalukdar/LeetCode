/*
https://leetcode.com/problems/two-sum/
Solved : 2021.03.12
Solved : Atiar Talukdar
Contact: atiar.info

*/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var i=0
        var j=0
        for(i in nums.indices){
            for(j in (i+1) until nums.size){
                if((nums[i]+nums[j])==target) return intArrayOf(i,j)
            }
        }

        return intArrayOf(i,j)
    }
}