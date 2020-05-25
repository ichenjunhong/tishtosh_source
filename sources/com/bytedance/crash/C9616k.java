package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import com.bytedance.crash.p551k.C9617a;
import com.bytedance.crash.p551k.C9636b;
import com.bytedance.crash.p551k.C9655i;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.k */
public final class C9616k {

    /* renamed from: a */
    static Context f26227a = null;

    /* renamed from: b */
    static Application f26228b = null;

    /* renamed from: c */
    static long f26229c = 0;

    /* renamed from: d */
    public static String f26230d = "default";

    /* renamed from: e */
    static C9617a f26231e;

    /* renamed from: f */
    public static volatile ConcurrentHashMap<Integer, String> f26232f;

    /* renamed from: g */
    static volatile String f26233g = null;

    /* renamed from: h */
    static volatile int f26234h = 0;

    /* renamed from: i */
    public static volatile String f26235i;

    /* renamed from: j */
    static int f26236j = 0;

    /* renamed from: k */
    private static boolean f26237k;

    /* renamed from: l */
    private static C9636b f26238l = new C9636b();

    /* renamed from: m */
    private static C9551b f26239m = new C9551b();

    /* renamed from: n */
    private static C9655i f26240n = null;

    /* renamed from: o */
    private static Object f26241o = new Object();

    /* renamed from: a */
    public static C9617a m19147a() {
        return f26231e;
    }

    /* renamed from: b */
    public static C9551b m19150b() {
        return f26239m;
    }

    /* renamed from: f */
    public static Context m19154f() {
        return f26227a;
    }

    /* renamed from: g */
    public static Application m19155g() {
        return f26228b;
    }

    /* renamed from: h */
    public static C9636b m19156h() {
        return f26238l;
    }

    /* renamed from: i */
    public static long m19157i() {
        return f26229c;
    }

    /* renamed from: j */
    public static boolean m19158j() {
        return f26237k;
    }

    /* renamed from: k */
    public static int m19159k() {
        return f26234h;
    }

    /* renamed from: c */
    public static C9655i m19151c() {
        if (f26240n == null) {
            synchronized (C9616k.class) {
                f26240n = new C9655i(f26227a);
            }
        }
        return f26240n;
    }

    /* renamed from: d */
    public static String m19152d() {
        StringBuilder sb = new StringBuilder();
        sb.append(m19153e());
        sb.append('_');
        sb.append(Long.toHexString(new Random().nextLong()));
        return sb.toString();
    }

    /* renamed from: e */
    public static String m19153e() {
        if (f26233g == null) {
            synchronized (f26241o) {
                if (f26233g == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Long.toHexString(new Random().nextLong()));
                    sb.append("U");
                    f26233g = sb.toString();
                }
            }
        }
        return f26233g;
    }

    /* renamed from: a */
    static void m19149a(boolean z) {
        f26237k = true;
    }

    /* renamed from: a */
    public static String m19148a(long j, C9571d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(dVar.getName());
        sb.append('_');
        sb.append(m19153e());
        sb.append('_');
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("U");
        return sb.toString();
    }
}
