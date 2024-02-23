class Solution {
    public int findSubstringInWraproundString(String s)
    {
        if(s==null || s.length() ==0)
        {
            return 0;
        }
      int[] arr = new int[26];
    //   Arrays.fill(arr, 0);
        int continuous = 0;
      for(int i=0; i<= s.length()-1; i++)
      {
        int currCharIndex = s.charAt(i) - 'a';
        if(i > 0 && (s.charAt(i) - s.charAt(i-1) == 1 || s.charAt(i-1) - s.charAt(i) == 25 ))
        {   
            continuous++;
            // arr[currCharIndex] = arr[s.charAt(i-1) - 'a']+1;
        }else{
            // arr[currCharIndex] =  1;
            continuous = 1;
        }

        arr[currCharIndex] = Math.max(arr[currCharIndex] , continuous);
      }       
       int calSubString = 0;
        for (int length : arr) {
            calSubString += length;
        }

        return calSubString;
    }
}
