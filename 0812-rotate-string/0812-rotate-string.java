class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String n = s + s;
        return n.contains(goal);
    }
}