package com.lyh;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/5/16 17:46
 * @version: v1.0
 */
//工具类
public class Utils {
    //产生min到min—1的随机数
    //min:0 ,max:2 ，产生随机数0（不砍），1（砍）
    private static int max=2;
    private static int min= 0;
     public static int randomMonsterChop(){
        return (int) (Math.random()*(max-min)+min);

    }

}
