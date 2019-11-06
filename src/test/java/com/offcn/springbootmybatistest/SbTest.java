package com.offcn.springbootmybatistest;

import com.offcn.springbootmybatistest.eneity.Person;
import com.offcn.springbootmybatistest.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootmybatistestApplication.class)
public class SbTest {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getList(){
        List<Person> list =  personMapper.getAll();
        for (Person person : list) {
            System.out.println(person);
        }
    }
    @Test
    public void getRedis(){
        redisTemplate.opsForValue().set("hello","难受老铁");
        String str = (String)redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        Person person = new Person(1,22,"laoli");
        redisTemplate.opsForValue().set("object",person);
        Person per = (Person)redisTemplate.opsForValue().get("object");
        System.out.println(per);
    }
}
