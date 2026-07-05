class Solution {
    public boolean detectCapitalUse(String s) {
        if ((s.equals(s.toUpperCase()))|| (s.equals(s.toLowerCase()))) {
            return true;
        }
         else if
        ((Character.isUpperCase(s.charAt(0))) && (s.substring(1).equals(s.substring(1).toLowerCase()))){
            return true;
        }
    return false;
}
}