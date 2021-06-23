package combination_sum_problem;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum/
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order. The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of
at least one of the chosen numbers is different. It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations
for the given input.

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []

Example 4:
Input: candidates = [1], target = 1
Output: [[1]]

Example 5:
Input: candidates = [1], target = 2
Output: [[1,1]]
*/
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return recursive(candidates, 0, 0, target, new ArrayList<>());
    }

    private List<List<Integer>> recursive(int[] candidates, int index, int currentSum, int target, List<Integer> sub) {
        List<List<Integer>> toReturn = new ArrayList<>();
        if (currentSum == target) {
            toReturn.add(new ArrayList<>(sub));
            return toReturn;
        }
        if (currentSum > target) {
            return new ArrayList<>();
        }
        for (int i = index; i < candidates.length; i++) {
            Integer candidate = candidates[i];
            sub.add(candidate);
            currentSum += candidate;
            toReturn.addAll(recursive(candidates, i, currentSum, target, sub));
            currentSum -= candidate;
            sub.remove(candidate);
        }
        return toReturn;
    }

}

