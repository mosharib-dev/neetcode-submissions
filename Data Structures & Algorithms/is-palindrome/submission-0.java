class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
            char ch = s.charAt(i);
            if (('a' <= ch && ch <= 'z') ||
                ('A' <= ch && ch <= 'Z') ||
                ('0' <= ch && ch <= '9')) {

                sb.append(Character.toLowerCase(ch));
            }
       }
       int low = 0;
       int high = sb.length()-1;
       while(low <= high)
       {
           char ch1 = sb.charAt(low);
           char ch2 = sb.charAt(high);
           if(ch1 != ch2)
           {
                return false;
           }
           low++;
           high--;
       }
       return true;
    }
}
