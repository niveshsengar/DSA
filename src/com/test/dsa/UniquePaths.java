package com.test.dsa;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {

    public int uniquePaths(int m, int n) {

        return uniquePathsWithMemo(m, n, new HashMap<String, Integer>());

    }

    int uniquePathsWithMemo(int m, int n, Map   <String, Integer> map){

        String key1 = m + "," + n;
        String key2 = n + "," + m;

        if(map.containsKey(key1)){
            return map.get(key1);
        }

        if(map.containsKey(key2)){
            return map.get(key2);
        }

        if(m == 1 && n == 1){
            return 1;
        }

        if(m == 0 || n == 0){
            return 0;
        }

        map.put(key1, uniquePathsWithMemo(m-1, n, map)
                + uniquePathsWithMemo(m, n-1, map));

        map.put(key2, map.get(key1));

        return map.get(key1);

    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(3, 7));

    }
}
