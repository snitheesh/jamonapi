package com.jamonapi;


/** Class used to help in the jamon multi-threaded tests JAMon. */
public class MultiThreadedTestHelper  implements Runnable {

    static final int THREADS=25000;
    long lobits, hibits;
    Monitor mon;


    public MultiThreadedTestHelper(int threadNum, long lobits, long hibits, Monitor mon) {
    }



    public void run() {
        // Alternating threads are either setting the high or lo bit.  The idea is that if a thread

    static  class TimingMonitorThreads implements Runnable {
        public void run() {

}

