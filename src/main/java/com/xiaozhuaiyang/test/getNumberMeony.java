package com.xiaozhuaiyang.test;

import java.util.*;

/**
 * @Author: zglai
 * Date:23:05 2021/6/2
 * @Description:<描述>
 */
public class getNumberMeony {
    public static void main(String[] args) {
        Random random = new Random();
        //21060
        List<Integer> excludeNum5 = Arrays.asList(3,8,11,7,15,13,17,1);
        List<Integer> excludeNum2 = Arrays.asList(1,3,5,7,9,11,12);
        for(int i=0;i<5;i++){
            List<Integer> num5 = new ArrayList<>();
            List<Integer> num2 = new ArrayList<>();
            //选5个
            while (true){
                if(num5.size() == 5){
                    break;
                }
                int n = random.nextInt(35)+1;
                if(!num5.contains(n) && !excludeNum5.contains(n)){
                    num5.add(n);
                }
            }

            //选2个
            while (true){
                if(num2.size() == 2){
                    break;
                }
                int m = random.nextInt(10)+1;
                if(!num2.contains(m) && !excludeNum2.contains(m)){
                    num2.add(m);
                }
            }
            Collections.sort(num5);
            Collections.sort(num2);
            System.out.println(num5.toString()+"  "+num2.toString());
        }
    }
}
