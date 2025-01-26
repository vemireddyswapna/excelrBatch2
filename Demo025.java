class ReverseString {
    public static String reverse(String in) {
        if (in == null) {
            throw new IllegalArgumentException("Null is not valid input");
        }

        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }

        return out.toString();
    }
}

public class Demo025 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(ReverseString.reverse(str));
    }
}
