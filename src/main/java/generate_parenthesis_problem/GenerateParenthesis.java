package generate_parenthesis_problem;

import java.util.List;

/*
https://leetcode.com/problems/generate-parentheses/
Given n pairs of parentheses,
write a function to generate all combinations of well-formed parentheses.

Es n.1
Input: n = 1
Output: ["()"]

Es n.2
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
*/
public class GenerateParenthesis {

    public void solution(List<String> parenthesis, int n) {
        generateParenthesis(parenthesis, n, n, "");
    }

    private void generateParenthesis(List<String> parenthesis, int leftRemaining, int rightRemaining,
                                     String str) {
        if (leftRemaining == 0 && rightRemaining == 0) {
            parenthesis.add(str);
            return;
        }
        if (leftRemaining < 0 || rightRemaining < leftRemaining)
            return;
        generateParenthesis(parenthesis, leftRemaining - 1, rightRemaining, str + "(");
        generateParenthesis(parenthesis, leftRemaining, rightRemaining - 1, str + ")");
    }

}
