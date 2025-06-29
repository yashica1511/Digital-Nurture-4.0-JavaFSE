package Week2.TDDUsingJUnit5AndMockito.Exercise1_SettingUpJUnit.Code;

public class StringUtils {
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}

