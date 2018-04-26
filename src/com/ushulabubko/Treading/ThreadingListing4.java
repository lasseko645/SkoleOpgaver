package com.ushulabubko.Treading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class ThreadingListing4 {

    private static int ballance = 0;


    public static void main(String[] args) {




        ExecutorService executor = new Executors.newFixedThreadPool(1000);

        for (int i = 0; i < 1000; i++){
            executor.execute(this.ballance ++);
        }

        executor.shutdown();
    }
}
