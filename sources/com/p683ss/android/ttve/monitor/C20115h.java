package com.p683ss.android.ttve.monitor;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ttve.monitor.h */
public final class C20115h {

    /* renamed from: a */
    public Map<Integer, C20116a> f55322a = new HashMap();

    /* renamed from: b */
    public Map<Integer, C20116a> f55323b = new HashMap();

    /* renamed from: c */
    public int f55324c = -1;

    /* renamed from: com.ss.android.ttve.monitor.h$a */
    public static class C20116a {

        /* renamed from: a */
        public String f55325a;

        /* renamed from: b */
        public int f55326b;

        /* renamed from: c */
        public int f55327c;
    }

    /* renamed from: b */
    public final synchronized boolean mo42272b() {
        return this.f55322a.isEmpty();
    }

    /* renamed from: c */
    public final synchronized boolean mo42273c() {
        return this.f55323b.isEmpty();
    }

    /* renamed from: a */
    public final synchronized void mo42269a() {
        this.f55322a.clear();
        this.f55323b.clear();
        this.f55324c = -1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|17|26|25|13|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[LOOP:0: B:12:0x0027->B:25:0x0027, LOOP_START, SYNTHETIC, Splitter:B:12:0x0027] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo42268a(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            r1 = 0
            if (r6 != 0) goto L_0x0014
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r6 = r5.f55322a     // Catch:{ all -> 0x005d }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x005d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005d }
            goto L_0x0023
        L_0x0014:
            r2 = 1
            if (r6 != r2) goto L_0x0022
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r6 = r5.f55323b     // Catch:{ all -> 0x005d }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x005d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005d }
            goto L_0x0023
        L_0x0022:
            r6 = r1
        L_0x0023:
            if (r6 != 0) goto L_0x0027
            monitor-exit(r5)
            return r1
        L_0x0027:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x005d }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.monitor.h$a r1 = (com.p683ss.android.ttve.monitor.C20115h.C20116a) r1     // Catch:{ all -> 0x005d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0027 }
            r2.<init>()     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r3 = "path"
            java.lang.String r4 = r1.f55325a     // Catch:{ JSONException -> 0x0027 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r3 = "start"
            int r4 = r1.f55326b     // Catch:{ JSONException -> 0x0027 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r3 = "duration"
            int r1 = r1.f55327c     // Catch:{ JSONException -> 0x0027 }
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x0027 }
            r0.put(r2)     // Catch:{ JSONException -> 0x0027 }
            goto L_0x0027
        L_0x0057:
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r6
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.monitor.C20115h.mo42268a(int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo42270a(int r1, int r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x001d
        L_0x0005:
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r1 = r0.f55323b     // Catch:{ all -> 0x001a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001a }
            r1.remove(r2)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000f:
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r1 = r0.f55322a     // Catch:{ all -> 0x001a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001a }
            r1.remove(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x001d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.monitor.C20115h.mo42270a(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo42271a(int r1, int r2, com.p683ss.android.ttve.monitor.C20115h.C20116a r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0005;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x001d
        L_0x0005:
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r1 = r0.f55323b     // Catch:{ all -> 0x001a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001a }
            r1.put(r2, r3)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000f:
            java.util.Map<java.lang.Integer, com.ss.android.ttve.monitor.h$a> r1 = r0.f55322a     // Catch:{ all -> 0x001a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x001a }
            r1.put(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x001d:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.monitor.C20115h.mo42271a(int, int, com.ss.android.ttve.monitor.h$a):void");
    }
}
