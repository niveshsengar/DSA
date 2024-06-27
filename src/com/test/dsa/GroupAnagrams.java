package com.test.dsa;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            Set<String> keySet = map.keySet();
            boolean added = false;
            for(String key : keySet){
                if(isAnagram(key, str) && !key.equals(str)){
                    map.get(key).add(str);
                    added = true;
                    break;
                }
            }
            if(!added){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(str, list);
            }
        }
        return map.values().stream().collect(Collectors.toList());
    }

    public static boolean isAnagram(String str1, String str2){

        int[] chars = new int[26];
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        if(charArray1.length != charArray2.length){
            return false;
        }
        for(int i=0; i<charArray1.length; i++){
            chars[charArray1[i] - 'a']++;
            chars[charArray2[i] - 'a']--;
        }

        for(int a : chars){
            if(a != 0){
                return false;
            }
        }

        return true;

    }
}
