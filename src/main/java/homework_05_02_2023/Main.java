package homework_05_02_2023;

import java.util.regex.Pattern;

public class Main {
    public static boolean isMatch(String s, String p) {
        String regex = p.replace(".", "\\.").replace("*", ".*");
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(s).matches();
    }

    public static void main(String[] args) {
        String s1 = "aa", p1 = "a";
        String s2 = "aa", p2 = "a*";
        String s3 = "ab", p3 = ".*";
        System.out.println(isMatch(s1, p1));
        System.out.println(isMatch(s2, p2));
        System.out.println(isMatch(s3, p3));
    }

}

