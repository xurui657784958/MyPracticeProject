package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test001 {
    public static void main(String[] args){
        List<String> stringSet = new ArrayList<>();
        stringSet.sort(Comparator.comparing(String::toString));
        stringSet.stream().forEach(o->{
            System.out.println(o);
        });
    }
}
