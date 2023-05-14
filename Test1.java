package Endava;

public class Test1 {
        public static String reverseString(String str) {
                char [] chars = str.toCharArray();
                StringBuilder result = new StringBuilder();
                for(int i = chars.length - 1; i >= 0; i -= 1) {
                        result.append(chars[i]);
                }
                return result.toString();
        }

        public static void main(String[] args) {
                System.out.println(Test1.reverseString("abcdef"));
        }
}