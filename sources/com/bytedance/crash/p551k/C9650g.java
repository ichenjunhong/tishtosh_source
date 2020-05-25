package com.bytedance.crash.p551k;

import android.os.Build.VERSION;
import android.system.Os;
import android.system.OsConstants;
import java.util.LinkedList;

/* renamed from: com.bytedance.crash.k.g */
public final class C9650g {

    /* renamed from: b */
    public static long f26338b = -1;

    /* renamed from: a */
    public long f26339a;

    /* renamed from: c */
    private LinkedList<Object> f26340c;

    /* renamed from: d */
    private int f26341d;

    /* renamed from: e */
    private final long f26342e;

    /* renamed from: f */
    private long f26343f;

    /* renamed from: com.bytedance.crash.k.g$a */
    public static class C9651a {

        /* renamed from: a */
        private static long f26344a = -1;

        /* renamed from: b */
        private static long m19251b() {
            return m19249a(100);
        }

        /* renamed from: a */
        public static long m19248a() {
            if (C9650g.f26338b == -1) {
                C9650g.f26338b = 1000 / m19251b();
            }
            return C9650g.f26338b;
        }

        /* renamed from: a */
        private static long m19249a(long j) {
            long j2;
            if (f26344a > 0) {
                return f26344a;
            }
            if (VERSION.SDK_INT >= 21) {
                j2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else if (VERSION.SDK_INT >= 14) {
                j2 = m19250a("_SC_CLK_TCK", 100);
            } else {
                j2 = 100;
            }
            if (j2 <= 0) {
                j2 = 100;
            }
            f26344a = j2;
            return j2;
        }

        /* renamed from: a */
        private static long m19250a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class cls = Class.forName("libcore.io.Libcore");
                Class cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get(null);
                return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (Throwable unused) {
                return j;
            }
        }
    }

    public C9650g(int i) {
        this.f26340c = new LinkedList<>();
        this.f26341d = 1;
        this.f26339a = 0;
        this.f26343f = 50;
        this.f26342e = C9651a.m19248a();
        this.f26341d = 5;
    }
}
