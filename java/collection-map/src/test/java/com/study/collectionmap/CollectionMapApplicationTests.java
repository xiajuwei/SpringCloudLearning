package com.study.collectionmap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CollectionMapApplicationTests {

    @Test
    public void contextLoads() {
        int a = 1;
        int b=2;

        if((a=b)>1){



        }
        System.out.println(a);
        System.out.println(b);


    }

}
