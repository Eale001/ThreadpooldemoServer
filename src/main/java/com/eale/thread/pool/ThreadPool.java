package com.eale.thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author Admin
 * @Date 2020/10/29
 * @Description //TODO
 * @Version 1.0
 **/
public class ThreadPool {

    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,10,60, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(300),
            new ThreadFactoryBuilder().setDaemon(true).setNameFormat("thread-pool-%d").build(),
            new ThreadPoolExecutor.AbortPolicy());




}
