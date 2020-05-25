package com.bytedance.p785o.p797b.p798a;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.p785o.p797b.C12444g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.o.b.a.c */
public final class C12432c {

    /* renamed from: a */
    public static Map<String, C12430a> f32694a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<ThreadPoolExecutor, C12434d> f32695b = new ConcurrentHashMap();

    /* renamed from: c */
    public static boolean f32696c = true;

    /* renamed from: d */
    private static List<ThreadPoolExecutor> f32697d = new ArrayList();

    /* renamed from: e */
    private static List<HandlerThread> f32698e = new ArrayList();

    /* renamed from: f */
    private static boolean f32699f = false;

    /* renamed from: a */
    public static void m25023a(final HandlerThread handlerThread) {
        if (f32696c && !f32698e.contains(handlerThread)) {
            f32698e.add(handlerThread);
            handlerThread.getLooper().setMessageLogging(new Printer() {

                /* renamed from: a */
                long f32700a;

                /* renamed from: b */
                long f32701b;

                /* renamed from: c */
                long f32702c;

                /* renamed from: d */
                long f32703d;

                public final void println(String str) {
                    if (str.startsWith(">>>>> Dispatching")) {
                        this.f32700a = SystemClock.currentThreadTimeMillis();
                        this.f32701b = SystemClock.elapsedRealtime();
                        return;
                    }
                    if (str.startsWith("<<<<< Finished")) {
                        this.f32702c = SystemClock.currentThreadTimeMillis();
                        this.f32703d = SystemClock.elapsedRealtime();
                        String name = handlerThread.getName();
                        C12430a aVar = (C12430a) C12432c.f32694a.get(name);
                        if (aVar == null) {
                            aVar = new C12430a(name);
                            C12432c.f32694a.put(name, aVar);
                        }
                        aVar.f32686c++;
                        aVar.f32684a += this.f32702c - this.f32700a;
                        aVar.f32685b += this.f32703d - this.f32701b;
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m25024a(C12434d dVar) {
        if (f32696c && !f32695b.containsKey(dVar.f32706b)) {
            f32695b.put(dVar.f32706b, dVar);
        }
    }

    /* renamed from: a */
    public static void m25025a(ThreadPoolExecutor threadPoolExecutor, String str, C12444g gVar) {
        if (f32696c) {
            m25024a(new C12434d(threadPoolExecutor, str, gVar));
        }
    }
}
