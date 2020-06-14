class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Queue<Character> q = new LinkedList();
        //Put every characters of string s to queue q
        for(char c : sArr) {
            q.add(c);
        }
        //Loop through each character of string t and check
        for(char c : tArr) {
            if(c == q.peek()) {
                q.remove();
                if(q.isEmpty()) return true;
            }
        }
        return false;
    }
}