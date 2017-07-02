/**
 * Created by Tarun on 7/1/2017.
 *https://leetcode.com/problems/reverse-words-in-a-string-ii/#/description
 */
public class ReverseWordsSecondPart {





    public char[] reverse(char[] s,int left, int right)
    {
        while (left<right)
        {
            char tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
        return s;
    }


    public void reverseWords(char[] s) {

        reverse(s,0,s.length-1);
        int left=0;
        int right=0;

        while (left<s.length-1 && right<=s.length-1)
        {
            while (right<s.length-1 && s[right]!=' ')
                right++;
            if(right<s.length-1 && s[right]==' ')
                right--;
            if(left<s.length-1)
                s= reverse(s, left,right);
            left=right+2;
            right=right+2;
        }

    }
}
