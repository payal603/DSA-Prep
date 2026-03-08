import java.util.ArrayList;
import java.util.Arrays;

class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                ans.add(asteroids[i]);
            } else {
                while (!ans.isEmpty() && ans.get(ans.size() - 1) > 0
                        && Math.abs(asteroids[i]) > ans.get(ans.size() - 1)) {
                    ans.remove(ans.size() - 1);
                }
                if (!ans.isEmpty() && ans.get(ans.size() - 1) == Math.abs(asteroids[i])) {
                    ans.remove(ans.size() - 1);
                } else {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) < 0) {
                        ans.add(asteroids[i]);
                    }
                }
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    // Main method to test the solution
    public static void main(String[] args) {
        AsteroidCollision sol = new AsteroidCollision();

        int[][] testCases = {
            {5, 10, -15},   // Expected: [-15]
            {5, -5},        // Expected: []
            {10, -5},       // Expected: [10]
            {-1, -2},       // Expected: [-1, -2]
            {1, 2},         // Expected: [1, 2]
            {8, -8},        // Expected: []
            {10, 2, -5},    // Expected: [10]
            {-2, -1, 1, 2}  // Expected: [-2, -1, 1, 2]
        };

        for (int[] tc : testCases) {
            System.out.println("Input:  " + Arrays.toString(tc));
            System.out.println("Output: " + Arrays.toString(sol.asteroidCollision(tc)));
            System.out.println();
        }
    }
}
