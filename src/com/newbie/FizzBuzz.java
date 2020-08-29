package com.newbie;

import java.util.concurrent.atomic.AtomicInteger;


public class FizzBuzz{

        int n;
        private final AtomicInteger counter = new AtomicInteger(1);

        public FizzBuzz(int n) {
            this.n = n;
        }

        public Runnable fizz() {
           Runnable printFizz = () ->{
               while (counter.get()<=n)
                if (((counter.get()%3) == 0) & ( counter.get()%5 != 0) ) {
                    System.out.println(" fizz, ");
                    counter.getAndIncrement();
                }
            };
            return printFizz;
        }

        public Runnable buzz() {
           Runnable printBuzz = () ->{
            while (counter.get()<=n) {
                if ( ((counter.get() % 5) == 0) & ((counter.get() % 3) != 0) ) {
                    System.out.println(" buzz, ");
                    counter.getAndIncrement();
                }
            }
           };
           return printBuzz;
        }

        public Runnable fizzbuzz() {
            Runnable printFizzBuzz = () -> {
                while (counter.get() <= n)
                    if ((counter.get() % 3) == 0 & (counter.get() % 5) == 0) {
                        System.out.println(" fizzbuzz,");
                        counter.getAndIncrement();
                    }
            };
            return printFizzBuzz;
        }

        public Runnable number() {
            Runnable printNumber =  () -> {
                while (counter.get()<=n) {
                    if (((counter.get() % 3) != 0) & ((counter.get() % 5) != 0)){
                        System.out.println(" " + counter.get() + ",");
                        counter.getAndIncrement();
                    }
                }
            };
            return printNumber;
        }

}
