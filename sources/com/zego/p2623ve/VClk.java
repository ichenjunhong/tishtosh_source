package com.zego.p2623ve;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.zego.ve.VClk */
public class VClk {
    private static VClk sInstance = new VClk();
    private EventHandler mCallback;
    private Handler mHandler;
    private HandlerThread mThread = new HandlerThread("VClk");
    private long pThis;

    /* renamed from: com.zego.ve.VClk$EventHandler */
    static class EventHandler implements Callback, FrameCallback {
        private AtomicLong mAtomicThis;
        private boolean mRunning;

        public void uninit() {
            this.mAtomicThis.set(0);
        }

        private EventHandler() {
            this.mAtomicThis = new AtomicLong();
            this.mRunning = false;
        }

        public void init(long j) {
            this.mAtomicThis.set(j);
        }

        public void doFrame(long j) {
            if (this.mRunning) {
                long j2 = this.mAtomicThis.get();
                if (j2 != 0) {
                    VClk.on_video_tick(j2, j);
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:35:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:21:0x0042] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                int r0 = r6.what
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0026
                boolean r6 = r5.mRunning
                if (r6 != 0) goto L_0x00a0
                r5.mRunning = r1
                android.view.Choreographer r6 = android.view.Choreographer.getInstance()     // Catch:{ Exception -> 0x0015 }
                r6.postFrameCallback(r5)     // Catch:{ Exception -> 0x0015 }
                goto L_0x00a0
            L_0x0015:
                java.util.concurrent.atomic.AtomicLong r6 = r5.mAtomicThis
                long r0 = r6.get()
                r3 = 0
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 == 0) goto L_0x00a0
                com.zego.p2623ve.VClk.on_error(r0)
                goto L_0x00a0
            L_0x0026:
                int r0 = r6.what
                if (r0 != r1) goto L_0x008d
                boolean r6 = r5.mRunning
                if (r6 == 0) goto L_0x00a0
                r5.mRunning = r2
                android.view.Choreographer r6 = android.view.Choreographer.getInstance()     // Catch:{  }
                r6.removeFrameCallback(r5)     // Catch:{  }
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
                r0 = 24
                r3 = 0
                if (r6 < r0) goto L_0x004e
                java.lang.Class<android.view.Choreographer> r6 = android.view.Choreographer.class
                java.lang.String r0 = "releaseInstance"
                java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00a0 }
                java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch:{ Exception -> 0x00a0 }
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a0 }
                r6.invoke(r3, r0)     // Catch:{ Exception -> 0x00a0 }
                goto L_0x00a0
            L_0x004e:
                int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
                r0 = 16
                if (r6 < r0) goto L_0x00a0
                android.view.Choreographer r6 = android.view.Choreographer.getInstance()     // Catch:{  }
                java.lang.Class<android.view.Choreographer> r0 = android.view.Choreographer.class
                java.lang.String r4 = "sThreadInstance"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                r0.setAccessible(r1)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                r0.remove()     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.Class<android.view.Choreographer> r0 = android.view.Choreographer.class
                java.lang.String r3 = "mDisplayEventReceiver"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                r0.setAccessible(r1)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.Class r0 = r6.getClass()     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.String r1 = "dispose"
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                r0.invoke(r6, r1)     // Catch:{ Exception -> 0x00a0, Exception -> 0x00a0 }
                goto L_0x00a0
            L_0x008d:
                int r6 = r6.what
                r0 = 2
                if (r6 != r0) goto L_0x00a0
                android.view.Choreographer r6 = android.view.Choreographer.getInstance()     // Catch:{  }
                r6.removeFrameCallback(r5)     // Catch:{  }
                android.view.Choreographer r6 = android.view.Choreographer.getInstance()     // Catch:{  }
                r6.postFrameCallback(r5)     // Catch:{  }
            L_0x00a0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zego.p2623ve.VClk.EventHandler.handleMessage(android.os.Message):boolean");
        }
    }

    private static VClk getInstance() {
        return sInstance;
    }

    public static native int on_error(long j);

    public static native int on_video_tick(long j, long j2);

    public int restartClock() {
        if (this.pThis != 0) {
            this.mHandler.sendEmptyMessage(2);
        }
        return 0;
    }

    public int startClock() {
        if (this.pThis != 0) {
            this.mCallback.init(this.pThis);
            this.mHandler.sendEmptyMessage(0);
        }
        return 0;
    }

    public int stopClock() {
        if (this.pThis != 0) {
            this.mHandler.sendEmptyMessage(1);
            this.mCallback.uninit();
        }
        return 0;
    }

    VClk() {
        this.mThread.start();
        this.mCallback = new EventHandler();
        this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);
    }

    public int start(long j) {
        this.pThis = j;
        return 0;
    }

    public int stop(long j) {
        this.mHandler.removeCallbacksAndMessages(null);
        this.pThis = 0;
        return 0;
    }
}
