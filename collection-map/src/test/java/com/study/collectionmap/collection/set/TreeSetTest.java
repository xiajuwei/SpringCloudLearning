package com.study.collectionmap.collection.set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.TreeSet;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TreeSetTest {

    /**
     * 有序，元素唯一
     * 自然排序，比较器排序
     * 排序是在添加的时候进行排序
     * 不能为null
     * 基于红黑树实现
     * 比较的返回值是否是0来决定唯一
     */
    @Test
    public void test1() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("b");

        System.out.println(treeSet);

        treeSet.forEach(s -> System.out.println(s));


    }

}
