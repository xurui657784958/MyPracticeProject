package leetcode;

import java.util.Scanner;
public class Test015 {

    /**
     * 如果按照面向对象思想来设计，那么我们应该对该题设计一个求解对象
     */
    public static class SolutionWay {

        /**
         * 定义常量
         */
        private static final String GBP = "GBP";
        private static final String USD = "USD";
        private static final String CNY = "CNY";
        private static final String HKD = "HKD";
        private static final String MAX = "MAX";
        private static final String MIN = "MIN";
        private static final String ERROR = "ERROR";

        /**
         * 以HKD为基准汇率
         */
        private static int gbpRate;
        private static int usdRate;
        private static int cnyRate;

        private static int inputNum;
        private static String inputType;
        private static String resultType;


        private static void setParam(int a, int b, int c, int num, String inputT, String resultT) {
            gbpRate = a * b * c;
            usdRate = a * b;
            cnyRate = a;
            inputNum = num;
            inputType = inputT;
            resultType = resultT;
        }

        private static int getRate(String type) {
            switch (type) {
                case GBP:
                    return gbpRate;
                case USD:
                    return usdRate;
                case CNY:
                    return cnyRate;
                default:
                    return 1;

            }
        }


        private static boolean checkNum(String num) {

            char c1 = num.charAt(0);
            if (c1 < '1' || c1 > '9') {
                return false;
            }

            for (int i = 1; i < num.length(); i++) {
                char c = num.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            return true;
        }


        private static boolean checkType(String type) {

            return type.equals(HKD) || type.equals(CNY) || type.equals(USD) || type.equals(GBP);
        }

        private static boolean checkResultType(String resultType) {
            return resultType.equals(MAX) || resultType.equals(MIN);
        }


        /**
         * Max是从GBP开始算起
         *
         * @return
         */
        private static String getMaxResult() {
            int tempV = getRate(inputType) * inputNum;
            StringBuilder result = new StringBuilder();
            if (tempV / gbpRate > 0) {
                result.append(tempV / gbpRate).append(' ').append("GBP ");
                tempV = tempV % getRate(GBP);
            }
            if (tempV / usdRate > 0) {
                result.append(tempV / usdRate).append(' ').append("USD ");
                tempV = tempV % getRate(USD);
            }
            if (tempV / cnyRate > 0) {
                result.append(tempV / cnyRate).append(' ').append("CNY ");
                tempV = tempV % getRate(CNY);
            }
            if (tempV > 0) {
                result.append(tempV).append(' ').append("HKD");
            }
            return result.toString();
        }

        /**
         * min理应用的HKD
         *
         * @return
         */
        private static String getMinResult() {
            return inputNum * getRate(inputType) + " HKD";
        }


        private static String computer(String input) {
            String[] strArr = input.split("\\s");
            if (strArr.length == 6 && (checkNum(strArr[0]) && checkNum(strArr[1]) && checkNum(strArr[2]) && checkNum(strArr[3]) && checkType(strArr[4]) && checkResultType(strArr[5]))) {
                setParam(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]), Integer.parseInt(strArr[3]), strArr[4], strArr[5]);

                if (resultType.equals(MAX)) {
                    return getMaxResult();
                } else {
                    return getMinResult();
                }
            } else {
                return ERROR;
            }

        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        while (in.hasNextLine()) {
            result.append(SolutionWay.computer(in.nextLine())).append("\n");
        }
        System.out.println(result);
    }
}