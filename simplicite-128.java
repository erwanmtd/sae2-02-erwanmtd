package eraser;

public class EraserSimple {
    public static String erase(String str) {
        if (str.length() > 0 && str.charAt(1) != ' ' && str.charAt(0) == ' ') {
            str = str.substring(1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if ( i == str.length() - 1 || (str.charAt(i + 1) != ' ' && str.charAt(i - 1) != ' ')) {
                    str = str.substring(0, i) + str.substring(i + 1);
                }
            }
        }
        
        return str;
    }
}
