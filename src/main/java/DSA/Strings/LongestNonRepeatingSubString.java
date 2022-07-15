package DSA.Strings;

public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
//        System.out.println(getLongestNonRepeatingSubString("bbbb"));
//        System.out.println(getLongestNonRepeatingSubString("abcda$#@^a&(*"));
//        System.out.println(getLongestNonRepeatingSubString(""));
//        System.out.println(getLongestNonRepeatingSubString(null));
        System.out.println(getLongestNonRepeatingSubString("tmmxutz"));
    }
    public static int getLongestNonRepeatingSubString(String s) {
        int maxL = 1;
        if(s == null || s.isEmpty()) {
            return 0;
        }
        int sIndex = 0,eIndex = 0;
        int i = 0;
        int j = 1;
        int[] index = new int[128];
        for(int k = 0 ; k< 128;k++) {
            index[k] = -1;
        }
        
        index[s.charAt(i)] = i;
        while(j < s.length()) {
            if(index[s.charAt(j)] == -1) {
                index[s.charAt(j)] = j;
               // maxL = Math.max(maxL,j -i + 1);
                if(maxL < j - i + 1) {
                    maxL = j - i + 1;
                    sIndex = i ;
                    eIndex = j;
                }
            } else {
                i = Math.max((index[s.charAt(j)] + 1),i);
                index[s.charAt(j)] = j;
                maxL = Math.max(maxL,j -i + 1);
            }
            j++;
        }
        System.out.println(s.substring(sIndex,eIndex + 1));
        return maxL;
    }
}
