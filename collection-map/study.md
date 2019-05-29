java集合入门和深入学习

集合框架：
Java中的集合框架大类可分为Collection和Map；两者的区别：
1、Collection是单列集合；Map是双列集合
2、Collection中只有Set系列要求元素唯一；Map中键需要唯一，值可以重复
3、Collection的数据结构是针对元素的；Map的数据结构是针对键的。

Collection体系：
ollection包括两大体系，List和Set



Collection体系总结：

List  : "特点 :" 存取有序,元素有索引,元素可以重复.

ArrayList : 数组结构,查询快,增删慢,线程不安全,因此效率高.

Vector : 数组结构,查询快,增删慢,线程安全,因此效率低.

LinkedList : 链表结构,查询慢,增删快,线程不安全,因此效率高.

Set :"特点 :" 存取无序,元素无索引,元素不可以重复.

HashSet : 哈希表结构，存储无序,元素无索引,元素不可以重复..

LinkedHashSet :链表和哈希表结构，存储有序（）,元素不可以重复.

TreeSet : 二叉树机构，存取无序, 但是可以排序 (), 元素不可以重复.

Map:
Map是一个双列集合，其中保存的是键值对，键要求保持唯一性，值可以重复

键值是一一对应的，一个键只能对应一个值

Map的特点：是存取无序，键不可重复

Map在存储的时候，将键值传入Entry，然后存储Entry对象

其中下面有HashMap，LinkedHashMap和TreeMap


















