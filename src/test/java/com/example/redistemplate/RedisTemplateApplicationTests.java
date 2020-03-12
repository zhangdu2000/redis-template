package com.example.redistemplate;

import com.example.redistemplate.entity.User;
import com.example.redistemplate.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;


import javax.annotation.Resource;

@SpringBootTest
class RedisTemplateApplicationTests {

    @Test
    void contextLoads() {
    }

  // @Autowired
   // private RedisTemplate<String,Object> redisTemplate;

   // @Resource
   // private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private RedisService redisService;

   /**
   * @author         张渡
   * @version        1.0
   * @date           2020/3/12 14:08
   * Modified By    修改人姓名(如果有其他人修改时增加这三项)
   * Modified Date: 修改日期
    *
   * RedisTemplate中定义了对应redis 5种数据结构操作
    * opsForValue();//操作字符串
    * opsForHash();//操作hash
    * opsForList();//操作list
    * opsForSet();//操作set
    * opsForZSet();//操作有序set
   */


   @Test
   public void testRedis(){

      // redisTemplate.setKeySerializer(new StringRedisSerializer());//防止默认序列化(jdk序列化)乱码，把key转换为字符串类型
     //  redisTemplate.setValueSerializer(new StringRedisSerializer());//防止默认序列化(jdk序列化)乱码，把value转换为字符串类型
      // redisTemplate.opsForValue().set("agsssse","12345678");
       User user=new User();
       user.setName("小明");
       user.setAge("19");
       redisService.set("user",user);
       System.out.println(redisService.hasKey("agsssse"));
   }

}
