package com.study.collectionmap.collection.set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HashSetTest {

    /**
     * 元素不重复，存取无序，无下标
     * 基于哈希表实现
     * 哈希表通过 equals 和hashCode 方法共同保证唯一
     */
    @Test
    public void test() {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String data : Arrays.asList("B", "E", "D", "C", "A")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }

        //不保证有序
        System.out.println("Ordering in HashSet :" + hashSet);

        //FIFO保证安装插入顺序排序
        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);

        //内部实现排序
        System.out.println("Order of objects in TreeSet :" + treeSet);

    }


    @Test
    public void test1() {
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("c");
        set.add("d");
        set.add("b");
        System.out.println(set);

    }


    @Test
    public void test2() throws InterruptedException {
        // 利用HashSet来存取
        Set<String> set = new HashSet<String>();
        set.add(null);
        set.add("我的天");
        set.add("我是重复的");
        set.add("我是重复的");
        set.add(null);
        set.add("welcome");

        // 遍历 第一种方式 迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        Thread.sleep(10);
        System.out.println("--------------");

        for (String str : set) {
            System.out.println(str);
        }
    }

    @Test
    public void test3() {
        // 利用HashSet来存取自定义对象 Person
        Set<Person> set = new HashSet<Person>();
        Person person = new Person("张三", 12);

//        set.add(new Person("张三", 12));
//        set.add(new Person("李四", 13));
//        set.add(new Person("王五", 22));
//        set.add(new Person("张三", 12));

        // 遍历
        for (Person p : set) {
            System.out.println(p);
        }


    }

    @Test
    public void test4() {
        // 利用HashSet来存取自定义对象 Person
        Set<Person> set = new HashSet<Person>();
        new Person("张三", 12);
//        set.add(new Person("张三", 12));
//        set.add(new Person("李四", 13));
//        set.add(new Person("王五", 22));
//        set.add(new Person("张三", 15));

        set.forEach(p -> System.out.println(p.getName() + p.getAge()));


    }


}

class Person {
    // 属性
    private String name;
    private int age;

    // 构造方法
    public Person() {
        super();

    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // 要让哈希表存储不重复的元素，就必须重写hasCode和equals方法
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
