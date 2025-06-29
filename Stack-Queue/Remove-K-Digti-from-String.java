class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k is still greater than 0, remove remaining digits from the end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the result from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        // Remove leading zeros
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
