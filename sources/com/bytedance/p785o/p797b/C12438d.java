package com.bytedance.p785o.p797b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.p785o.p797b.p798a.C12432c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.o.b.d */
public final class C12438d {

    /* renamed from: a */
    private static volatile Handler f32716a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static HashMap<String, HandlerThread> f32717b = new HashMap<>();

    /* renamed from: c */
    private static List<String> f32718c = Arrays.asList(new String[]{"NpthHandlerThread", "NewVideo-HandlerThread", "trace_time_update_thread"});

    /* renamed from: d */
    private static List<String> f32719d = Arrays.asList(new String[]{"DBHelper-AsyncOp-New"});

    /* renamed from: e */
    private static Map<String, String> f32720e = new HashMap();

    /* renamed from: com.bytedance.o.b.d$a */
    public static class C12439a extends HandlerThread {

        /* renamed from: a */
        private volatile boolean f32721a;

        public final synchronized void start() {
            if (!this.f32721a) {
                this.f32721a = true;
                super.start();
            }
        }

        public C12439a(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: a */
    public static HandlerThread m25027a(String str, int i, String str2) {
        Iterator it = f32717b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((HandlerThread) ((Entry) it.next()).getValue()).isAlive()) {
                it.remove();
            }
        }
        HandlerThread handlerThread = (HandlerThread) f32717b.get(str);
        if (handlerThread != null) {
            return handlerThread;
        }
        C12439a aVar = new C12439a(str, 0);
        aVar.start();
        C12432c.m25023a((HandlerThread) aVar);
        f32717b.put(str, aVar);
        return aVar;
    }
}
