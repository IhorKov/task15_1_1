package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Reader implements Runnable{
    private List<Integer> list;
    private DateTimeFormatter date = DateTimeFormatter.ISO_LOCAL_TIME;

    public Reader(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        try {
            while (list.isEmpty()) {
                Thread.sleep(1000);
                System.out.println(date.format(LocalDateTime.now()) + " The list is Empty");
            }

            for (Integer i: list) {
                System.out.println(i);
            }

            list.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
