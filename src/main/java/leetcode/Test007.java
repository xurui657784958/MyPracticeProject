package leetcode;

import com.sun.tools.javac.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test007 {
    public static void main(String[] args) {
        String josn = "{\n"
                + "\n"
                + "\"name\": \"ISP_POLICY\",\n"
                + "\n"
                + " \"apis\": [\n"
                + "\n"
                + "   {\n"
                + "\n"
                + "    \"apiType\": \"routepolicy\",\n"
                + "\n"
                + "    \"apiData\": {\n"
                + "\n"
                + "      \"name\": \"uuid\",\n"
                + "\n"
                + "      \"routePolicy\": {\n"
                + "\n"
                + "          \"routePolicyName\": \"[policyName]\",\n"
                + "\n"
                + "          \"sequenceNumber\": 10,\n"
                + "\n"
                + "          \"permit\": true,\n"
                + "\n"
                + "          \"setCommunity\": \"[community1] [community2]\"\n"
                + "\n"
                + "      }\n"
                + "\n"
                + "    }\n"
                + "\n"
                + "  },{\n"
                + "\n"
                + "    \"apiType\": \"routepolicy\",\n"
                + "\n"
                + "    \"apiData\": {\n"
                + "\n"
                + "      \"serviceGroupId\": \"uuid\",\n"
                + "\n"
                + "      \"routePolicy\": {"
                + "\n"
                + "\n"
                + "          \"routePolicyName\": \"[policyName]\",\n"
                + "\n"
                + "          \"sequenceNumber\": 11,\n"
                + "\n"
                + "          \"permit\": true,\n"
                + "\n"
                + "          \"setCommunity\": \"[community1] [community2]\"\n"
                + "\n"
                + "      }\n"
                + "\n"
                + "  }\n"
                + "\n"
                + "]\n"

                + "\n"
                + "}";
        System.out.println(findJosnValue("name", josn));
    }
    public static String findJosnValue(String key, String josn) {
        String regex = "\""+key+"\": \"(.*?)\",";
        Matcher matcher = Pattern.compile(regex).matcher(josn);
        String value = null;
        String[] strings = new String[2];
        if (matcher.find()) {
            strings = matcher.group().split("\\:")[1].replace("\"", "").trim().split(",");
        }
        return strings[0];
    }

    /*public static String getValueFromJsonStr(String fieldName,String jsonStr) {
        List<String> fieldValues = new ArrayList<>();
        String regex = "(?<=(\"" + fieldName + "\":\")).*?(?=(\"))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jsonStr);
        while (matcher.find()) {
            if (matcher.group().trim().equals("")) {
                return matcher.group().trim();
            }
        }
        return "";
    }*/
}
