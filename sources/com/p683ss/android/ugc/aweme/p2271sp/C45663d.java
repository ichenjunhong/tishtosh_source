package com.p683ss.android.ugc.aweme.p2271sp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.sp.d */
public class C45663d {

    /* renamed from: a */
    static final Object f115462a = new Object();

    /* renamed from: b */
    static Object f115463b = new Object();

    /* renamed from: c */
    static final LinkedList<Runnable> f115464c = new LinkedList<>();

    /* renamed from: d */
    static final LinkedList<Runnable> f115465d = new LinkedList<>();

    /* renamed from: e */
    static boolean f115466e = true;

    /* renamed from: f */
    private static final String f115467f = "d";

    /* renamed from: g */
    private static Handler f115468g = null;

    /* renamed from: h */
    private static final C45661b f115469h = new C45661b(16);

    /* renamed from: i */
    private static int f115470i = 0;

    /* renamed from: com.ss.android.ugc.aweme.sp.d$a */
    static class C45664a extends Handler {
        C45664a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            LinkedList linkedList;
            if (message.what == 1) {
                synchronized (C45663d.f115463b) {
                    synchronized (C45663d.f115462a) {
                        linkedList = (LinkedList) C45663d.f115465d.clone();
                        C45663d.f115465d.clear();
                        C45663d.m99424a().removeMessages(1);
                    }
                    if (linkedList.size() > 0) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m99425b() {
        boolean z;
        synchronized (f115462a) {
            z = !f115465d.isEmpty();
        }
        return z;
    }

    /* renamed from: a */
    static Handler m99424a() {
        Handler handler;
        synchronized (f115462a) {
            if (f115468g == null) {
                HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                handlerThread.start();
                f115468g = new C45664a(handlerThread.getLooper());
            }
            handler = f115468g;
        }
        return handler;
    }
}
