package com.p683ss.ttvideoengine.utils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttvideoengine.utils.EngineThreadPool */
public class EngineThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;
    private static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    private static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    /* renamed from: com.ss.ttvideoengine.utils.EngineThreadPool$AsyncRunnable */
    public static class AsyncRunnable implements Runnable {
        private Runnable mRunnable;

        public void run() {
            this.mRunnable.run();
            EngineThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    public static int getPoolSize() {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.getPoolSize();
    }

    public static void shutdown() {
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
    }

    private static void _promoteRunnable() {
        if (mReadyRunnables.size() > 0) {
            Iterator it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                AsyncRunnable asyncRunnable = (AsyncRunnable) it.next();
                it.remove();
                mRunningRunnables.add(asyncRunnable);
                mExecutorInstance.execute(asyncRunnable);
            }
        }
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        if (mExecutorInstance == null) {
            synchronized (EngineThreadPool.class) {
                if (mExecutorInstance == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    mExecutorInstance = threadPoolExecutor;
                }
            }
        }
        return mExecutorInstance;
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (EngineThreadPool.class) {
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (EngineThreadPool.class) {
            mExecutorInstance = threadPoolExecutor;
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (EngineThreadPool.class) {
            if (runnable == null) {
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            StringBuilder sb = new StringBuilder("addExecuteTask,cur thread num:");
            sb.append(getPoolSize());
            TTVideoEngineLog.m110644d("EngineThreadPool", sb.toString());
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 5) {
                mReadyRunnables.add(asyncRunnable);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            Future submit = mExecutorInstance.submit(asyncRunnable);
            return submit;
        }
    }
}
