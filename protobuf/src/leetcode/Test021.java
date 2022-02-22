package leetcode;

import java.util.Set;

import com.google.common.collect.Sets;
import util.VxlanRouteConfig;

public class Test021 {
    // Driver's code
    public static void main(String[] args)
    {

        VxlanRouteConfig routeConfig1 = new VxlanRouteConfig("CAP","2200",2200,"11.0.0.1/32","9.197.181.204",0,5,"even","2.0.0.1",null,0,10000);
        VxlanRouteConfig routeConfig2 = new VxlanRouteConfig("CAP","2200",2200,"11.0.0.1/32","9.197.181.204",0,5,"even","2.0.0.1",null,0,10000);


        // Creating first set named set1
        Set<String>
                set1 = Sets
                .newHashSet(routeConfig1.toString());

        // Creating second set named set2
        Set<String>
                set2 = Sets
                .newHashSet(routeConfig2.toString());

        // Using Guava's Sets.difference() method
        Set<String>
                diff = Sets.difference(set1, set2);

        Set<String>
                diff2 = Sets.difference(set2, set1);

        // Displaying the unmodifiable view of
        // the difference of two sets.
        System.out.println("Difference between "
                + "Set 1 and Set 2:"
                + diff);

        System.out.println("Difference between "
                + "Set 1 and Set 2:"
                + diff2);
        System.out.println(routeConfig1.hashCode());
        System.out.println(routeConfig2.hashCode());
    }
}
