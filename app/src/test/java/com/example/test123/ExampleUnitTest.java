package com.example.test123;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    /**
     * 并集测试
     */
    @Test
    public void testUnionSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("d");
        set2.add("b");
        set2.add("c");

        set1.addAll(set2);
        System.out.println("并集是" + set1); // 并集是[a, b, c, d]

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        map1.put("a", "aa");
        map1.put("b", "bb");
        map1.put("c", "cc");

        map2.put("d", "dd");
        map2.put("b", "bb");
        map2.put("c", "cc");

        map1.putAll(map2);
        System.out.println("map并集是" + map1); // map并集是{a=aa, b=bb, c=cc, d=dd}
    }


    /**
     * 测试简单交集
     */
    @Test
    public void testSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        //交集
        set1.retainAll(set2);
        System.out.println("交集是 " + set1);  //交集是 [c]
    }

    /**
     * 差集测试
     */
    @Test
    public void testDifferenceSet() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");

        set2.add("c");
        set2.add("d");
        set2.add("e");
        set2.add("f");

        set1.removeAll(set2);
        System.out.println("差集是 " + set1); //差集是 [a, b]
    }
}