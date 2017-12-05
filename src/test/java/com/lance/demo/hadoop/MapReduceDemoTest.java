package com.lance.demo.hadoop;

import org.junit.Test;

public class MapReduceDemoTest {
    private MapReduceDemo mapReduceDemo = new MapReduceDemo();
    @Test
    public void demo() throws Exception {
        mapReduceDemo.demo(getFile("demo/input.txt"),getFile("demo/output.txt"));
    }

    private String getFile(String filename) {
        return MapReduceDemoTest.class.getClassLoader().getResource(filename).getFile();
    }
}