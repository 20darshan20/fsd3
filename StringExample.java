import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
public class StringExample {
    static int count(String s, int x) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                continue;
            }
                for (int j = i; j < n; j++) {
                    String substring = s.substring(i, j + 1);
                    int num = Integer.parseInt(substring);
                    if (num > x) {
                        count++;
                    }
                }
            }
            return count;
    }
    public static void main(String[] args) {
        String s1="471";
        int x1=47;
        System.out.println(count(s1,x1));

        String s2="2222";
        int x2=97;
        System.out.println(count(s2,x2));
    }
}





