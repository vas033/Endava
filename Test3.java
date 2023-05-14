package Endava;

import java.io.*;
import java.util.Arrays;

public class Test3 {
        char[] chars;

        public void readFile(String fileName) {
                try (FileReader reader = new FileReader(fileName)) {
                        char[] buf = new char[256];
                        int c;
                        while ((c = reader.read(buf)) > 0) {

                                if (c < 256) {
                                        buf = Arrays.copyOf(buf, c);
                                }
                        }
                        this.chars = buf;
                } catch (IOException ex) {

                        System.out.println(ex.getMessage());
                }
        }

        public void checkCharCount(char ch) {
                int count = 0;
                for (int i = 0; i < this.chars.length; i++) {
                        if (this.chars[i] == ch) {
                                count++;
                        }
                }
                System.out.println("Current file has char " + ch + " " + count + " times.");
        }

        public void checkCharCount( char ch1, char ch2) {
                this.checkCharCount(ch1);
                this.checkCharCount(ch2);
        }

        public static void main(String[] args) {
                Test3 test = new Test3();
                test.readFile("test.txt");
                test.checkCharCount('a', 'd');
        }
}
