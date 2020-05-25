package com.bytedance.p723j;

import android.content.Context;

/* renamed from: com.bytedance.j.a */
public class C11511a {

    /* renamed from: a */
    static Context f30865a;

    /* renamed from: b */
    static volatile String f30866b;

    /* renamed from: c */
    static C11529c f30867c;

    /* renamed from: d */
    private static final Object f30868d = new Object();

    /* renamed from: a */
    public static void m23578a(String str) {
        m23580a(str, false, false, null);
    }

    /* renamed from: a */
    public static void m23579a(String str, Context context) {
        m23580a(str, false, true, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000e, code lost:
        f30865a = r1;
        f30866b = r2;
        f30867c = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        throw new java.lang.IllegalStateException("context or version is null in init");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23577a(android.content.Context r1, java.lang.String r2, com.bytedance.p723j.C11529c r3) {
        /*
            java.lang.Object r3 = f30868d
            monitor-enter(r3)
            java.lang.String r0 = f30866b     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            return
        L_0x0009:
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0016
            if (r2 == 0) goto L_0x0016
            f30865a = r1
            f30866b = r2
            r1 = 0
            f30867c = r1
            return
        L_0x0016:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "context or version is null in init"
            r1.<init>(r2)
            throw r1
        L_0x001e:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p723j.C11511a.m23577a(android.content.Context, java.lang.String, com.bytedance.j.c):void");
    }

    /* renamed from: a */
    private static void m23580a(String str, boolean z, boolean z2, Context context) {
        if (z2 && f30865a == null) {
            f30865a = context;
        }
        C11526b bVar = C11526b.f30889a;
        if (bVar != null) {
            bVar.mo22275a(str, false);
        } else if (f30867c != null) {
            C11529c.m23612a(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
