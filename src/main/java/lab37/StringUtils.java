package lab37;

public class StringUtils {
    public static String rightShift(String arg, int delta) {
        while (delta < 0) {
            delta += arg.length();
        }
        while (delta > arg.length()){
            delta-= arg.length();
        }
        return arg.substring(arg.length() - delta) + arg.substring(0, arg.length() - delta);
    }
}
