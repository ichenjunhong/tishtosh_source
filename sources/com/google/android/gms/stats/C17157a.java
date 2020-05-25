package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1036c.C15370a;
import com.google.android.gms.common.util.C15528s;
import com.google.android.gms.common.util.C15530u;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.stats.a */
public final class C17157a {

    /* renamed from: n */
    private static ScheduledExecutorService f48546n;

    /* renamed from: o */
    private static volatile C17158a f48547o = new C17159b();

    /* renamed from: a */
    public final Object f48548a;

    /* renamed from: b */
    public final WakeLock f48549b;

    /* renamed from: c */
    public final int f48550c;

    /* renamed from: d */
    public final String f48551d;

    /* renamed from: e */
    public final Context f48552e;

    /* renamed from: f */
    public boolean f48553f;

    /* renamed from: g */
    public final Map<String, Integer[]> f48554g;

    /* renamed from: h */
    public int f48555h;

    /* renamed from: i */
    public AtomicInteger f48556i;

    /* renamed from: j */
    private WorkSource f48557j;

    /* renamed from: k */
    private final String f48558k;

    /* renamed from: l */
    private final String f48559l;

    /* renamed from: m */
    private final Set<Future<?>> f48560m;

    /* renamed from: com.google.android.gms.stats.a$a */
    public interface C17158a {
    }

    public C17157a(Context context, int i, String str) {
        this(context, 1, str, null, context == null ? null : context.getPackageName());
    }

    private C17157a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    private C17157a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f48548a = this;
        this.f48553f = true;
        this.f48554g = new HashMap();
        this.f48560m = Collections.synchronizedSet(new HashSet());
        this.f48556i = new AtomicInteger(0);
        C15464q.m32124a(context, (Object) "WakeLock: context must not be null");
        C15464q.m32126a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f48550c = i;
        this.f48558k = null;
        this.f48559l = null;
        this.f48552e = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str);
            this.f48551d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            this.f48551d = str;
        }
        this.f48549b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C15530u.m32316a(context)) {
            if (C15528s.m32308a(str3)) {
                str3 = context.getPackageName();
            }
            this.f48557j = C15530u.m32312a(context, str3);
            WorkSource workSource = this.f48557j;
            if (workSource != null && C15530u.m32316a(this.f48552e)) {
                if (this.f48557j != null) {
                    this.f48557j.add(workSource);
                } else {
                    this.f48557j = workSource;
                }
                try {
                    this.f48549b.setWorkSource(this.f48557j);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f48546n == null) {
            f48546n = C15370a.m31939a().mo28315a();
        }
    }

    /* renamed from: a */
    public final List<String> mo33414a() {
        return C15530u.m32315a(this.f48557j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r0 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r11.f48555h == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C15501e.m32252a(r11.f48552e, com.google.android.gms.common.stats.C15500d.m32251a(r11.f48549b, r4), 7, r11.f48551d, r4, null, r11.f48550c, mo33414a(), 1000);
        r11.f48555h++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33416a(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r12 = r11.f48556i
            r12.incrementAndGet()
            r12 = 0
            java.lang.String r4 = r11.mo33413a(r12)
            java.lang.Object r12 = r11.f48548a
            monitor-enter(r12)
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f48554g     // Catch:{ all -> 0x008f }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x008f }
            r0 = 0
            if (r13 == 0) goto L_0x001a
            int r13 = r11.f48555h     // Catch:{ all -> 0x008f }
            if (r13 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r13 = r11.f48549b     // Catch:{ all -> 0x008f }
            boolean r13 = r13.isHeld()     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f48554g     // Catch:{ all -> 0x008f }
            r13.clear()     // Catch:{ all -> 0x008f }
            r11.f48555h = r0     // Catch:{ all -> 0x008f }
        L_0x0029:
            boolean r13 = r11.f48553f     // Catch:{ all -> 0x008f }
            r10 = 1
            if (r13 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f48554g     // Catch:{ all -> 0x008f }
            java.lang.Object r13 = r13.get(r4)     // Catch:{ all -> 0x008f }
            java.lang.Integer[] r13 = (java.lang.Integer[]) r13     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f48554g     // Catch:{ all -> 0x008f }
            java.lang.Integer[] r1 = new java.lang.Integer[r10]     // Catch:{ all -> 0x008f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x008f }
            r1[r0] = r2     // Catch:{ all -> 0x008f }
            r13.put(r4, r1)     // Catch:{ all -> 0x008f }
            r0 = 1
            goto L_0x0054
        L_0x0047:
            r1 = r13[r0]     // Catch:{ all -> 0x008f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008f }
            int r1 = r1 + r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008f }
            r13[r0] = r1     // Catch:{ all -> 0x008f }
        L_0x0054:
            if (r0 != 0) goto L_0x005e
        L_0x0056:
            boolean r13 = r11.f48553f     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x007a
            int r13 = r11.f48555h     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x007a
        L_0x005e:
            android.content.Context r0 = r11.f48552e     // Catch:{ all -> 0x008f }
            android.os.PowerManager$WakeLock r13 = r11.f48549b     // Catch:{ all -> 0x008f }
            java.lang.String r1 = com.google.android.gms.common.stats.C15500d.m32251a(r13, r4)     // Catch:{ all -> 0x008f }
            r2 = 7
            java.lang.String r3 = r11.f48551d     // Catch:{ all -> 0x008f }
            r5 = 0
            int r6 = r11.f48550c     // Catch:{ all -> 0x008f }
            java.util.List r7 = r11.mo33414a()     // Catch:{ all -> 0x008f }
            r8 = 1000(0x3e8, double:4.94E-321)
            com.google.android.gms.common.stats.C15501e.m32252a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008f }
            int r13 = r11.f48555h     // Catch:{ all -> 0x008f }
            int r13 = r13 + r10
            r11.f48555h = r13     // Catch:{ all -> 0x008f }
        L_0x007a:
            monitor-exit(r12)     // Catch:{ all -> 0x008f }
            android.os.PowerManager$WakeLock r12 = r11.f48549b
            r12.acquire()
            java.util.concurrent.ScheduledExecutorService r12 = f48546n
            com.google.android.gms.stats.c r13 = new com.google.android.gms.stats.c
            r13.<init>(r11)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r12.schedule(r13, r0, r2)
            return
        L_0x008f:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x008f }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C17157a.mo33416a(long):void");
    }

    /* renamed from: a */
    public final void mo33415a(int i) {
        if (this.f48549b.isHeld()) {
            try {
                this.f48549b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
            }
            this.f48549b.isHeld();
        }
    }

    /* renamed from: a */
    public final String mo33413a(String str) {
        if (!this.f48553f) {
            return this.f48558k;
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return this.f48558k;
    }
}
