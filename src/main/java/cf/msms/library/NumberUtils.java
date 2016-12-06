package cf.msms.library;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {
    public static Double getNumber(Object o) {
        Double number = 0d;
        if (o instanceof Number) return ((Number) o).doubleValue();
        if (o instanceof String) {
            String tmp = ((String) o).trim();
            Pattern decimalPattern = Pattern.compile("([,.])?(\\d+)\\s*$");
            Matcher matcher = decimalPattern.matcher(tmp);
            if (matcher.find()) {
                String dp = (matcher.group(1) == null ? "" : ".") + matcher.group(2);
                tmp = matcher.replaceAll("")
                        .replaceAll("[^\\-\\d]", "")
                        .replaceAll("(\\d)-+", "$1") +
                        dp;
            }
            return Double.parseDouble(tmp);
        }
        return number;
    }

    public static int getInt(Object num){
        return getNumber(num).intValue();
    }
}
