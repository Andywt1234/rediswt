package com.atguigu;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;

/**
 * @program: rediswt
 * @description:
 * @author: wangtian
 * @create: 2019-04-16 17:19
 **/
public class Demo2 {
    public static void main(String[] args) {
        HashSet<HostAndPort> hostAndPorts = new HashSet<HostAndPort>();
        hostAndPorts.add(new HostAndPort("172.16.59.11",6379));
        hostAndPorts.add(new HostAndPort("172.16.59.11",6380));
        hostAndPorts.add(new HostAndPort("172.16.59.11",6381));
        hostAndPorts.add(new HostAndPort("172.16.59.11",6389));
        hostAndPorts.add(new HostAndPort("172.16.59.11",6390));
        hostAndPorts.add(new HostAndPort("172.16.59.11",6391));
        JedisCluster jedisCluster = new JedisCluster(hostAndPorts);
        String set = jedisCluster.set("k1", "v1");
        System.out.println(set);
        String k1 = jedisCluster.get("k1");
        System.out.println(k1);
    }
}
