class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> Answer = new HashMap<>();
        int temp = 97;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !Answer.containsKey(ch)) {
                Answer.put(ch, (char) temp);
                temp++;
            }
        }
        String ans = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch != ' ') {
                char val = Answer.get(ch);
                ans += val;
            } else {
                ans += ' ';
            }
        }
        return ans;
    }
}