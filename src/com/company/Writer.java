package com.company;

import java.util.List;

public class Writer implements Runnable{
    private List<Integer> list;

    public Writer(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2500);
            for (int i = 0; i < 10; i++) {
                list.add((int) (Math.random() * 100));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
