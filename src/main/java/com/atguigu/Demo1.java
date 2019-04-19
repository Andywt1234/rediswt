package com.atguigu;

import com.sun.tools.jdi.EventSetImpl;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @program: rediswt
 * @description:
 * @author: wangtian
 * @create: 2019-04-15 16:09
 **/
public class Demo1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("linux01", 6379);
        String ping = jedis.ping();
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("name","lisi");
        map.put("age","18");
        map.put("email","1364944367@qq.com");
        String k11 = jedis.hmset("k11", map);
        System.out.println("-------------------------");
        System.out.println(k11);
        System.out.println(jedis.hmget("k11","name","age","email"));
    }
}
