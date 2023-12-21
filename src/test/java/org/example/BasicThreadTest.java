package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicThreadTest {

    @Test
    public void testThreadExecution() throws InterruptedException {
        int NUMthreads = 3;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        for (int i = 0; i < NUMthreads; i++) {
            assertEquals(Thread.State.TERMINATED, myThreads[i].getState());
        }
    }

    @Test
    public void testThreadExecution5() throws InterruptedException {
        int NUMthreads = 5;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        for (int i = 0; i < NUMthreads; i++) {
            assertEquals(Thread.State.TERMINATED, myThreads[i].getState());
        }
    }

    @Test
    public void testThreadExecution1() throws InterruptedException {
        int NUMthreads = 1;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        for (int i = 0; i < NUMthreads; i++) {
            assertEquals(Thread.State.TERMINATED, myThreads[i].getState());
        }
    }

    @Test
    public void testNumberOfThreads5() throws InterruptedException {
        int NUMthreads = 5;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        assertEquals(NUMthreads, myThreads.length);
    }

    @Test
    public void testNumberOfThreads3() throws InterruptedException {
        int NUMthreads = 3;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        assertEquals(NUMthreads, myThreads.length);
    }

    @Test
    public void testNumberOfThreads43() throws InterruptedException {
        int NUMthreads = 43;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        assertEquals(NUMthreads, myThreads.length);
    }

    @Test
    public void testNumberOfThreads0() throws InterruptedException {
        int NUMthreads = 0;
        Thread[] myThreads = new Thread[NUMthreads];

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i] = new BasicThread(i);
        }

        for (int i = 0; i < NUMthreads; i++) {
            myThreads[i].join();
        }

        assertEquals(NUMthreads, myThreads.length);
    }
}
