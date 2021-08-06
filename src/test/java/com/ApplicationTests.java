package com;


import com.xiaozhuaiyang.XiaozhuaiyangApplication;
import com.xiaozhuaiyang.test.entity.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XiaozhuaiyangApplication.class)
public class ApplicationTests {

    @Autowired
    Dog dog;

    @Test
    public void aa(){
        System.out.println(dog.toString());
    }
}
