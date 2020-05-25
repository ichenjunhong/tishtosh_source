package com.bytedance.ttnet.p886d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9859a;
import com.bytedance.ttnet.p883a.C13258a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;

/* renamed from: com.bytedance.ttnet.d.c */
public final class C13314c implements C9859a {

    /* renamed from: e */
    private static C13314c f34736e;

    /* renamed from: a */
    long f34737a;

    /* renamed from: b */
    Context f34738b;

    /* renamed from: c */
    public C13313b f34739c;

    /* renamed from: d */
    Handler f34740d = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            boolean z;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                C13314c cVar = C13314c.this;
                C13312a b = cVar.mo24925b();
                if (b != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (z || cVar.f34737a + (((long) b.f34729k) * 1000) <= elapsedRealtime) {
                        cVar.f34737a = elapsedRealtime;
                        C13258a.m26660a(cVar.f34738b).mo24854a(C13316d.m26820a(cVar.f34738b));
                    }
                }
            }
        }
    };

    /* renamed from: f */
    private boolean f34741f;

    /* renamed from: g */
    private int f34742g;

    /* renamed from: h */
    private long f34743h;

    /* renamed from: i */
    private int f34744i;

    /* renamed from: j */
    private HashMap<String, Integer> f34745j = new HashMap<>();

    /* renamed from: k */
    private HashMap<String, Integer> f34746k = new HashMap<>();

    /* renamed from: l */
    private int f34747l = 0;

    /* renamed from: m */
    private HashMap<String, Integer> f34748m = new HashMap<>();

    /* renamed from: n */
    private HashMap<String, Integer> f34749n = new HashMap<>();

    /* renamed from: o */
    private boolean f34750o = true;

    /* renamed from: b */
    public final C13312a mo24925b() {
        if (this.f34739c != null) {
            return this.f34739c.f34734b;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C13314c m26812a() {
        C13314c cVar;
        synchronized (C13314c.class) {
            if (f34736e == null) {
                f34736e = new C13314c();
            }
            cVar = f34736e;
        }
        return cVar;
    }

    /* renamed from: c */
    private void m26814c() {
        this.f34744i = 0;
        this.f34745j.clear();
        this.f34746k.clear();
        this.f34747l = 0;
        this.f34748m.clear();
        this.f34749n.clear();
    }

    private C13314c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo24923a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "/get_domains/v4"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "/ies/speed"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x00a1
        L_0x0020:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x002f }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = r1.getProtocol()     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = r1.getHost()     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0031
        L_0x002f:
            r2 = r0
        L_0x0030:
            r1 = r0
        L_0x0031:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00a0
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0047
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00a0
        L_0x0047:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x004e
            goto L_0x00a0
        L_0x004e:
            com.bytedance.ttnet.d.a r3 = r5.mo24925b()
            if (r3 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f34722d
        L_0x0056:
            if (r0 == 0) goto L_0x009f
            boolean r3 = r0.containsKey(r1)
            if (r3 != 0) goto L_0x005f
            goto L_0x009f
        L_0x005f:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x006c
            return r6
        L_0x006c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = "://"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "://"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r2 = r6.startsWith(r1)
            if (r2 == 0) goto L_0x009e
            java.lang.String r6 = r6.replaceFirst(r1, r0)
        L_0x009e:
            return r6
        L_0x009f:
            return r6
        L_0x00a0:
            return r6
        L_0x00a1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p886d.C13314c.mo24923a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private void m26813a(boolean z, long j) {
        if (!this.f34740d.hasMessages(10000)) {
            Message obtainMessage = this.f34740d.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            if (j > 0) {
                this.f34740d.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f34740d.sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo24924a(Context context, boolean z) {
        if (!this.f34741f) {
            this.f34738b = context;
            this.f34750o = z;
            this.f34739c = new C13313b(context, z);
            if (z) {
                SharedPreferences a = C35807d.m80935a(this.f34738b, "ttnet_tnc_config", 0);
                this.f34742g = a.getInt("tnc_probe_cmd", 0);
                this.f34743h = a.getLong("tnc_probe_version", 0);
            }
            this.f34741f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d1, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17708a(okhttp3.C53498ab r6, java.lang.Exception r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r5.f34750o     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            android.content.Context r0 = r5.f34738b     // Catch:{ all -> 0x00d2 }
            boolean r0 = com.bytedance.ttnet.p886d.C13316d.m26820a(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r5)
            return
        L_0x0015:
            okhttp3.t r0 = r6.f132378a     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r0.f133140a     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = r0.f133143d     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = r0.mo111619f()     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r6.f132383f     // Catch:{ all -> 0x00d2 }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x00d2 }
            r3.<init>()     // Catch:{ all -> 0x00d2 }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ all -> 0x00d2 }
            r4.<init>(r3)     // Catch:{ all -> 0x00d2 }
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r7, r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x00d2 }
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = "https"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0048
            monitor-exit(r5)
            return
        L_0x0048:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x0050
            monitor-exit(r5)
            return
        L_0x0050:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00d0
            java.lang.String r1 = "timeout"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = "time out"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = "unreachable"
            boolean r7 = r7.contains(r1)     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x006f
            goto L_0x00d0
        L_0x006f:
            com.bytedance.ttnet.d.a r7 = r5.mo24925b()     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00ce
            boolean r1 = r7.f34719a     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x007a
            goto L_0x00ce
        L_0x007a:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f34721c     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f34721c     // Catch:{ all -> 0x00d2 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d2 }
            if (r1 <= 0) goto L_0x00cc
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f34721c     // Catch:{ all -> 0x00d2 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x008f
            goto L_0x00cc
        L_0x008f:
            int r1 = r5.f34744i     // Catch:{ all -> 0x00d2 }
            int r1 = r1 + 1
            r5.f34744i = r1     // Catch:{ all -> 0x00d2 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f34745j     // Catch:{ all -> 0x00d2 }
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            r1.put(r0, r3)     // Catch:{ all -> 0x00d2 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.f34746k     // Catch:{ all -> 0x00d2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            r0.put(r6, r1)     // Catch:{ all -> 0x00d2 }
            int r6 = r5.f34744i     // Catch:{ all -> 0x00d2 }
            int r0 = r7.f34723e     // Catch:{ all -> 0x00d2 }
            if (r6 < r0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.f34745j     // Catch:{ all -> 0x00d2 }
            int r6 = r6.size()     // Catch:{ all -> 0x00d2 }
            int r0 = r7.f34724f     // Catch:{ all -> 0x00d2 }
            if (r6 < r0) goto L_0x00ca
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.f34746k     // Catch:{ all -> 0x00d2 }
            int r6 = r6.size()     // Catch:{ all -> 0x00d2 }
            int r7 = r7.f34725g     // Catch:{ all -> 0x00d2 }
            if (r6 < r7) goto L_0x00ca
            r6 = 0
            r5.m26813a(r2, r6)     // Catch:{ all -> 0x00d2 }
            r5.m26814c()     // Catch:{ all -> 0x00d2 }
        L_0x00ca:
            monitor-exit(r5)
            return
        L_0x00cc:
            monitor-exit(r5)
            return
        L_0x00ce:
            monitor-exit(r5)
            return
        L_0x00d0:
            monitor-exit(r5)
            return
        L_0x00d2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p886d.C13314c.mo17708a(okhttp3.ab, java.lang.Exception):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0173, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0175, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x017c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17709a(okhttp3.C53498ab r14, okhttp3.C53504ad r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            if (r14 == 0) goto L_0x017b
            if (r15 != 0) goto L_0x0007
            goto L_0x017b
        L_0x0007:
            boolean r0 = r13.f34750o     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r13)
            return
        L_0x000d:
            android.content.Context r0 = r13.f34738b     // Catch:{ all -> 0x0178 }
            boolean r0 = com.bytedance.ttnet.p886d.C13316d.m26820a(r0)     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r13)
            return
        L_0x0017:
            okhttp3.t r0 = r14.f132378a     // Catch:{ all -> 0x0178 }
            java.lang.String r1 = r0.f133140a     // Catch:{ all -> 0x0178 }
            java.lang.String r2 = r0.f133143d     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = r0.mo111619f()     // Catch:{ all -> 0x0178 }
            java.lang.String r14 = r14.f132383f     // Catch:{ all -> 0x0178 }
            int r3 = r15.f132400c     // Catch:{ all -> 0x0178 }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = "https"
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0178 }
            if (r1 != 0) goto L_0x0037
            monitor-exit(r13)
            return
        L_0x0037:
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0178 }
            if (r1 == 0) goto L_0x003f
            monitor-exit(r13)
            return
        L_0x003f:
            okhttp3.ad r1 = r15.f132405h     // Catch:{ all -> 0x0178 }
            if (r1 != 0) goto L_0x0045
            monitor-exit(r13)
            return
        L_0x0045:
            com.bytedance.ttnet.d.a r1 = r13.mo24925b()     // Catch:{ all -> 0x0178 }
            r4 = 0
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x00d0
            boolean r8 = r1.f34720b     // Catch:{ all -> 0x0178 }
            if (r8 == 0) goto L_0x00d0
            if (r15 == 0) goto L_0x00d0
            boolean r8 = r13.f34750o     // Catch:{ all -> 0x0178 }
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = "tt-idc-switch"
            r9 = 0
            java.lang.String r15 = r15.mo111273a(r8, r9)     // Catch:{ all -> 0x0178 }
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0178 }
            if (r8 != 0) goto L_0x00d0
            java.lang.String r8 = "@"
            java.lang.String[] r15 = r15.split(r8)     // Catch:{ all -> 0x0178 }
            if (r15 == 0) goto L_0x00d0
            int r8 = r15.length     // Catch:{ all -> 0x0178 }
            r9 = 2
            if (r8 == r9) goto L_0x0073
            goto L_0x00d0
        L_0x0073:
            r8 = r15[r7]     // Catch:{ Throwable -> 0x0080 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Throwable -> 0x0080 }
            r15 = r15[r6]     // Catch:{ Throwable -> 0x0081 }
            long r9 = java.lang.Long.parseLong(r15)     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0082
        L_0x0080:
            r8 = 0
        L_0x0081:
            r9 = r4
        L_0x0082:
            long r11 = r13.f34743h     // Catch:{ all -> 0x0178 }
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x00d0
            r13.f34742g = r8     // Catch:{ all -> 0x0178 }
            r13.f34743h = r9     // Catch:{ all -> 0x0178 }
            android.content.Context r15 = r13.f34738b     // Catch:{ all -> 0x0178 }
            java.lang.String r11 = "ttnet_tnc_config"
            android.content.SharedPreferences r15 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r15, r11, r7)     // Catch:{ all -> 0x0178 }
            android.content.SharedPreferences$Editor r15 = r15.edit()     // Catch:{ all -> 0x0178 }
            java.lang.String r11 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r15 = r15.putInt(r11, r8)     // Catch:{ all -> 0x0178 }
            java.lang.String r8 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r15 = r15.putLong(r8, r9)     // Catch:{ all -> 0x0178 }
            r15.apply()     // Catch:{ all -> 0x0178 }
            int r15 = r13.f34742g     // Catch:{ all -> 0x0178 }
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r15 != r8) goto L_0x00d0
            com.bytedance.ttnet.d.a r15 = r13.mo24925b()     // Catch:{ all -> 0x0178 }
            if (r15 == 0) goto L_0x00d0
            java.util.Random r8 = new java.util.Random     // Catch:{ all -> 0x0178 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0178 }
            r8.<init>(r9)     // Catch:{ all -> 0x0178 }
            int r9 = r15.f34730l     // Catch:{ all -> 0x0178 }
            if (r9 <= 0) goto L_0x00cc
            int r15 = r15.f34730l     // Catch:{ all -> 0x0178 }
            int r15 = r8.nextInt(r15)     // Catch:{ all -> 0x0178 }
            long r8 = (long) r15     // Catch:{ all -> 0x0178 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            goto L_0x00cd
        L_0x00cc:
            r8 = r4
        L_0x00cd:
            r13.m26813a(r6, r8)     // Catch:{ all -> 0x0178 }
        L_0x00d0:
            if (r1 == 0) goto L_0x0176
            boolean r15 = r1.f34719a     // Catch:{ all -> 0x0178 }
            if (r15 != 0) goto L_0x00d8
            goto L_0x0176
        L_0x00d8:
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f34721c     // Catch:{ all -> 0x0178 }
            if (r15 == 0) goto L_0x0174
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f34721c     // Catch:{ all -> 0x0178 }
            int r15 = r15.size()     // Catch:{ all -> 0x0178 }
            if (r15 <= 0) goto L_0x0174
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f34721c     // Catch:{ all -> 0x0178 }
            boolean r15 = r15.containsKey(r2)     // Catch:{ all -> 0x0178 }
            if (r15 != 0) goto L_0x00ee
            goto L_0x0174
        L_0x00ee:
            if (r3 <= 0) goto L_0x0172
            r15 = 200(0xc8, float:2.8E-43)
            if (r3 < r15) goto L_0x00fa
            r15 = 400(0x190, float:5.6E-43)
            if (r3 >= r15) goto L_0x00fa
            r15 = 1
            goto L_0x00fb
        L_0x00fa:
            r15 = 0
        L_0x00fb:
            if (r15 == 0) goto L_0x010a
            int r14 = r13.f34744i     // Catch:{ all -> 0x0178 }
            if (r14 > 0) goto L_0x0105
            int r14 = r13.f34747l     // Catch:{ all -> 0x0178 }
            if (r14 <= 0) goto L_0x0172
        L_0x0105:
            r13.m26814c()     // Catch:{ all -> 0x0178 }
            monitor-exit(r13)
            return
        L_0x010a:
            r15 = 100
            if (r3 < r15) goto L_0x0138
            r15 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r15) goto L_0x0113
            goto L_0x0138
        L_0x0113:
            com.bytedance.ttnet.d.a r15 = r13.mo24925b()     // Catch:{ all -> 0x0178 }
            if (r15 == 0) goto L_0x0136
            java.lang.String r2 = r15.f34731m     // Catch:{ all -> 0x0178 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0178 }
            if (r2 != 0) goto L_0x0136
            java.lang.String r15 = r15.f34731m     // Catch:{ all -> 0x0178 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0178 }
            r2.<init>()     // Catch:{ all -> 0x0178 }
            r2.append(r3)     // Catch:{ all -> 0x0178 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0178 }
            boolean r15 = r15.contains(r2)     // Catch:{ all -> 0x0178 }
            if (r15 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r15 = 0
            goto L_0x0139
        L_0x0138:
            r15 = 1
        L_0x0139:
            if (r15 != 0) goto L_0x0172
            int r15 = r13.f34747l     // Catch:{ all -> 0x0178 }
            int r15 = r15 + r6
            r13.f34747l = r15     // Catch:{ all -> 0x0178 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r15 = r13.f34748m     // Catch:{ all -> 0x0178 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0178 }
            r15.put(r0, r2)     // Catch:{ all -> 0x0178 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r15 = r13.f34749n     // Catch:{ all -> 0x0178 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0178 }
            r15.put(r14, r0)     // Catch:{ all -> 0x0178 }
            int r14 = r13.f34747l     // Catch:{ all -> 0x0178 }
            int r15 = r1.f34726h     // Catch:{ all -> 0x0178 }
            if (r14 < r15) goto L_0x0172
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r13.f34748m     // Catch:{ all -> 0x0178 }
            int r14 = r14.size()     // Catch:{ all -> 0x0178 }
            int r15 = r1.f34727i     // Catch:{ all -> 0x0178 }
            if (r14 < r15) goto L_0x0172
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r13.f34749n     // Catch:{ all -> 0x0178 }
            int r14 = r14.size()     // Catch:{ all -> 0x0178 }
            int r15 = r1.f34728j     // Catch:{ all -> 0x0178 }
            if (r14 < r15) goto L_0x0172
            r13.m26813a(r7, r4)     // Catch:{ all -> 0x0178 }
            r13.m26814c()     // Catch:{ all -> 0x0178 }
        L_0x0172:
            monitor-exit(r13)
            return
        L_0x0174:
            monitor-exit(r13)
            return
        L_0x0176:
            monitor-exit(r13)
            return
        L_0x0178:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x017b:
            monitor-exit(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p886d.C13314c.mo17709a(okhttp3.ab, okhttp3.ad):void");
    }
}
