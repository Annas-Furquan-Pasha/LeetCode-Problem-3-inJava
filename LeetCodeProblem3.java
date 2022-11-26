import java.util.*;

public class LeetCodeProblem3
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sn.nextLine();

        System.out.println("The length of longest substring is : " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s)
    {
        int[] allCharacters = new int[256];   // since ASCII charactes are 256
        Arrays.fill(allCharacters, -1);

        int maxLen =0; int start = -1;

        for(int i=0; i< s.length() ; i++)
        {
            if(allCharacters[s.charAt(i)] > start)     // char is automatically type casted to int
                start = allCharacters[s.charAt(i)];

            allCharacters[s.charAt(i)] = i ;

            maxLen = Math.max(maxLen, i-start);
        }

        return maxLen;
    }
}