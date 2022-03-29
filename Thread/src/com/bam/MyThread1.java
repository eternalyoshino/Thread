package com.bam;

import java.util.*;

public class MyThread1 extends Thread {

    private final Buffer __buffer;

    public MyThread1(Buffer buffer) {
        __buffer = buffer;
    }


    /**
     * Главный метод потока. Запускается при вызове start
     */
    @Override
    public void run() {

        try {

            method();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    /**
     * Бесконечно генерирует рандомные числа и добавляет их в буфер.
     *
     * @return
     */
    private void method() throws InterruptedException {

        while (true) {
            int i,j;

            for (i=2;i<100;i++)
            {
                int k=0;
                for (j=2;j<=i;j++)
                {
                    if ((i%j) == 0)
                        k++;
                }
                if (k<2)
                    __buffer.add(i);
            }
        }
    }
}
