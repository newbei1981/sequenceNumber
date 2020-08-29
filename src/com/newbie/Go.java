package com.newbie;

import java.util.concurrent.*;

public class Go {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FizzBuzz fizzBuzz = new FizzBuzz(26);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

            executorService.submit(fizzBuzz.number());
            executorService.submit(fizzBuzz.fizz());
            executorService.submit(fizzBuzz.buzz());
            executorService.submit(fizzBuzz.fizzbuzz());



            executorService.shutdown();


    }
}
