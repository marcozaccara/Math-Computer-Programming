package combination_sum_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumTest {

    private CombinationSum sut;

    @BeforeEach
    void setUp() {
        sut = new CombinationSum();
    }

    /*
    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    */
    @Test
    void testCase1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> results = sut.combinationSum(candidates, target);
        List<Integer> firstCombination = results.get(0);
        List<Integer> secondCombination = results.get(1);

        assertEquals(2, results.size());
        assertEquals(Arrays.asList(2, 2, 3), firstCombination);
        assertEquals(Collections.singletonList(7), secondCombination);

    }

    /*
    Input: candidates = [2,3,5], target = 8
    Output: [[2,2,2,2],[2,3,3],[3,5]]
    */
    @Test
    void testCase2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> results = sut.combinationSum(candidates, target);
        List<Integer> firstCombination = results.get(0);
        List<Integer> secondCombination = results.get(1);
        List<Integer> thirdCombination = results.get(2);

        assertEquals(3, results.size());
        assertEquals(Arrays.asList(2, 2, 2, 2), firstCombination);
        assertEquals(Arrays.asList(2, 3, 3), secondCombination);
        assertEquals(Arrays.asList(3, 5), thirdCombination);
    }

    /*
    Input: candidates = [2], target = 1
    Output: []
    */
    @Test
    void testCase3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> results = sut.combinationSum(candidates, target);

        assertEquals(0, results.size());
    }

    /*
    Input: candidates = [1], target = 1
    Output: [[1]]
    */
    @Test
    void testCase4() {
        int[] candidates = {1};
        int target = 1;
        List<List<Integer>> results = sut.combinationSum(candidates, target);
        List<Integer> firstCombination = results.get(0);

        assertEquals(1, results.size());
        assertEquals(Collections.singletonList(1), firstCombination);
    }

    /*
    Input: candidates = [1], target = 2
    Output: [[1,1]]
    */
    @Test
    void testCase5() {
        int[] candidates = {1};
        int target = 2;
        List<List<Integer>> results = sut.combinationSum(candidates, target);
        List<Integer> firstCombination = results.get(0);

        assertEquals(1, results.size());
        assertEquals(Arrays.asList(1, 1), firstCombination);
    }

}