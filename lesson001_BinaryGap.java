// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static int solution(int n) {
        return solution(n, 0, 0);
    }
    
    static int solution(int n, int max, int current) {
        if (n == 0)
            return max;
        else if (n % 2 == 0)
            return solution(n / 2, max, current + 1);
        else
            return solution(n / 2, Math.max(max, current), 0);
    }
}