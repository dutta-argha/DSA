class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : nums) {

            String s = Integer.toString(x);

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                int digit = ch - '0';

                ans.add(digit);
            }
        }

        // convert ArrayList -> int[]
        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}