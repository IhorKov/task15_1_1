package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Reader reader = new Reader(list);
        Writer writer = new Writer(list);

        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(writer);

        t1.start();
        t2.start();
    }
}
