package org.learn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomManager {
    public static Set<Long> set = new HashSet<>();
    public static Set<String> set1 = new HashSet<>();
    public static Set<String> set2 = new HashSet<>();

    /**
     * 随机生产 factor 位的数字，最大不超过 19位，因为long的最大值为19位
     * @param factor
     * @return
     */
    public static Long randomNum(int factor){
        return new Double((Math.random() + 1) * Math.pow(10, factor - 1)).longValue();
    }

    public static String characters = "0123456789";
    public static String randomNum1(int factor){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < factor; i++) {
            // nextInt(10) = [0, 10)
            sb.append(characters.charAt(random.nextInt(10)));
        }
        return sb.toString();
    }

    public static String characters1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String randomStr(int factor){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < factor; i++) {
            // nextInt(10) = [0, 10)
            sb.append(characters1.charAt(random.nextInt(36)));
        }
        return sb.toString();
    }

    public static void main (String [] args){
        // randomNum
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Long key = randomNum(10);
//            if(set.contains(key)){
//                System.out.println(String.format("Current value (%d) is repeating ", key));
//            }else{
//                set.add(key);
//            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("randomNum used %d ms", endTime - beginTime));
        // randomNum1
        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String key = randomNum1(10);
//            if(set1.contains(key)){
//                System.out.println(String.format("Current value (%d) is repeating ", key));
//            }else{
//                set1.add(key);
//            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(String.format("randomNum1 used %d ms", endTime - beginTime));

        // randomStr
        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String key = randomStr(10);
//            if(set2.contains(key)){
//                System.out.println(String.format("Current value (%d) is repeating ", key));
//            }else{
//                set2.add(key);
//            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(String.format("randomStr used %d ms", endTime - beginTime));

        System.out.println("it is completed!");
    }
}
