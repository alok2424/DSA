import java.util.*;

class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean collision = false;
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // smaller positive asteroid explodes
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // both explode
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // push if no collision or previous is also left-moving
                }
                // else: asteroid is destroyed (do nothing)
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
