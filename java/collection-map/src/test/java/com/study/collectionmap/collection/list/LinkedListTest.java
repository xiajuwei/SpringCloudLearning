package com.study.collectionmap.collection.list;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkedListTest {
    /**
     * LinkedList:是基于链表结构实现的，所以查询速度慢，增删速度快，提供了特殊的方法，对头尾的元素操作（进行增删查）。
     *
     * 使用LinkedList来实现栈和队列；栈是先进后出，而队列是先进先出
     */
    @Test
    public void test1() throws InterruptedException {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("y");
        linkedList.add("s");
        linkedList.add("e");
        linkedList.add("h");
        linkedList.add("f");

        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        Thread.sleep(10);
        linkedList.add(2,"z");

        System.out.println(linkedList);
        System.out.println(linkedList.get(3));

        System.out.println(JSON.toJSONString(linkedList));

        linkedList.add(2,"z");

        System.out.println(JSON.toJSONString(linkedList));

        linkedList.forEach(s -> System.out.println(s));

        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(linkedList.indexOf(str)+" "+str);
        }

        Thread.sleep(10);
        System.out.println("---------------------------");

        linkedList.add(2,"z");


        Iterator<String> it1 = linkedList.iterator();
        while (it1.hasNext()){
            String str = it1.next();
            System.out.println(linkedList.indexOf(str)+" "+str);
        }




    }


    @Test
    public void test2() throws InterruptedException {

        // 测试栈
        MyStack stack = new MyStack();
        stack.push("我是第1个进去的");
        stack.push("我是第2个进去的");
        stack.push("我是第3个进去的");
        stack.push("我是第4个进去的");
        stack.push("我是第5个进去的");

        System.out.println(JSON.toJSONString(stack));

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Thread.sleep(10);
        System.out.println("-------------------");

        // 测试队列
        QueueTest queue = new QueueTest();

        queue.put("我是第1个进入队列的");
        queue.put("我是第2个进入队列的");
        queue.put("我是第3个进入队列的");
        queue.put("我是第4个进入队列的");
        queue.put("我是第5个进入队列的");

        // 遍历队列
        while (!queue.isEmpty()) {
            String str = queue.get();
            System.out.println(str);
        }


    }


}

class MyStack {
    private LinkedList<String> linkList = new LinkedList<String>();

    // 压栈
    public void push(String str) {
        linkList.addFirst(str);
    }

    // 出栈
    public String pop() {
        return linkList.removeFirst();
    }

    // 查看
    public String peek() {
        return linkList.peek();
    }

    // 判断是否为空
    public boolean isEmpty() {
        return linkList.isEmpty();
    }
}

class QueueTest {
    private Queue<String> queue = new LinkedList<String>();

    // 放入
    public void put(String str) {
        queue.add(str);
    }

    // 获取
    public String get() {
        return queue.remove();
    }

    // 判断是否为空
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
