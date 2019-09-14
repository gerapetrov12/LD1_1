package imperative;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PerfectNumber {

    public enum STATE{
        ABUNDANT,
        DEFICIENT,
        PERFECT
    }

    public static Set<Integer> divisors(int n){
        Set<Integer> intSet = new HashSet<>();

        for(int i = 1; i < n + 1; i++){
            if(n % i == 0){
                intSet.add(i);
            }
        }
        return intSet;
    }

    public static STATE process(int n) {
        Set<Integer> divisorsN = divisors(n);
        Iterator<Integer> j = divisorsN.iterator();
        int sum = 0;

        while(j.hasNext()){
            int k = j.next();

            if(k != n){
                sum = sum + k;
            }

        }

        if (sum < n) {
            return STATE.DEFICIENT;
        } else if (sum == n) {
            return STATE.PERFECT;
        } else {
            return STATE.ABUNDANT;
        }
    }
}
