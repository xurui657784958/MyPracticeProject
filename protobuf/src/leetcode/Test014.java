package leetcode;

import java.util.Scanner;

public class Test014{
    private static final String ERROR = "ERROR";
    private enum CurrentType{
        HKD,CNY,USD,GBP;
    }
    private enum ExType{
        MAX,MIN;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] params = line.split(" ");
            Object[] results = checkAndGetParm(params);
            if(!(Boolean) results[0]){
                System.out.println(ERROR);
                continue;
            }
            Integer[] currencyRates = (Integer[])results[1];
            Integer currencyAmount = (Integer)results[2];
            CurrentType currentType = (CurrentType)results[3];
            ExType exType = (ExType)results[4];
            if(exType == ExType.MAX){
                System.out.println(getMinExCurrency(currentType,currencyRates,currencyAmount) + " " + CurrentType.HKD.name());
            }else{
                int[] result = getMaxExCurrency(currentType,currencyRates,currencyAmount);
                String printResult = "";
                for(int i = 3; i >= 0; i--){
                    if(result[i] != 0){
                        printResult = printResult + (printResult.isEmpty() ? "" : " ")+result[i]+ " " + CurrentType.values()[i].name();
                    }
                }
                System.out.println(printResult);
            }
        }
    }
    private static int getMinExCurrency(CurrentType currentType,Integer[] currentRates, int currentAmount){
        CurrentType currentTypeTemp = currentType;
        int currentAmountTmp = currentAmount;
        while(currentTypeTemp != CurrentType.HKD){
            currentTypeTemp = CurrentType.values()[currentTypeTemp.ordinal() -1];
            currentAmountTmp = currentRates[currentTypeTemp.ordinal() - 1]*currentAmountTmp;
        }
        return currentAmountTmp;
    }
    private static int[] getMaxExCurrency(CurrentType currentType, Integer[] currentRates, int currencyAmount){
        int[] result = {0,0,0,0};
        CurrentType currencyTypeTmp = CurrentType.HKD;
        result[0] = getMinExCurrency(currentType,currentRates,currencyAmount);
        while(currencyTypeTmp != CurrentType.GBP && result[currencyTypeTmp.ordinal()] >= currentRates[currencyTypeTmp.ordinal()]){
            result[currencyTypeTmp.ordinal() +1 ] = result[currencyTypeTmp.ordinal()/currentRates[currencyTypeTmp.ordinal()]];
            result[currencyTypeTmp.ordinal()] = result[currencyTypeTmp.ordinal()] - result[currencyTypeTmp.ordinal() + 1]  * currentRates[currencyTypeTmp.ordinal()];
            currencyTypeTmp = CurrentType.values()[currencyTypeTmp.ordinal() + 1];
        }
        return result;
    }
    private static Object[] checkAndGetParm(String[] params){
        if(params == null || params.length != 6){
            return new Object[]{Boolean.FALSE,null};
        }
        Integer[] currencyRates = new Integer[3];
        Integer currencyAmount = 0;
        CurrentType currentType;
        ExType exType;
        try{
            for(int i = 0; i < 4; i++){
                Integer value = Integer.valueOf(params[i]);
                if(value <= 0){
                    return new Object[]{Boolean.FALSE,null};
                }
                if(i == 3){
                    currencyAmount = value;
                }else{
                    currencyRates[i] = value;
                }
            }
        }catch(NumberFormatException e){
            return new Object[]{Boolean.FALSE,null};
        }
        try{
            currentType = CurrentType.valueOf(CurrentType.class,params[4]);
            exType = ExType.valueOf(ExType.class,params[5]);
        }catch(IllegalArgumentException e){
            return new Object[]{Boolean.FALSE,null};
        }
        return new Object[]{Boolean.TRUE,currencyRates,currencyAmount,currentType,exType};
    }
}
