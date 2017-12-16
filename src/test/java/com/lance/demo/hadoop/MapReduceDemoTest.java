package com.lance.demo.hadoop;

import org.junit.Test;

public class MapReduceDemoTest {
    private MapReduceDemo mapReduceDemo = new MapReduceDemo();
    @Test
    public void demo() throws Exception {
        mapReduceDemo.demo("E:/test/hadoop/input/input.txt","E:/test/hadoop/output");
    }
}