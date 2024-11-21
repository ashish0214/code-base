import java.util.Arrays;

public class MaxSubString {
    public static void main(String[] args) {
        String arr = "abcdabccdaadbcc";
        char[] ch = arr.toCharArray();
        int max = 0;
        int start = 0;
        for (int i = 0; i < arr.length(); i++) {
            int ele = ch[i];
            int value = 1;
            for (int j = 1; j < arr.length(); j++) {
                if (ch[j] == ele) {
                    value=1;break;
                }
                value++;
            }
            if (max < value) {
                max = value;
                start = i;
            }
        }
        System.out.println(arr.substring(start,start+max));
    }
}
