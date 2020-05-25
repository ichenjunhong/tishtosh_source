package com.p683ss.sys.ces.p2581b;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.sys.ces.b.a */
public class C51389a {

    /* renamed from: c */
    private static C51389a f128487c;

    /* renamed from: a */
    private Context f128488a;

    /* renamed from: b */
    private List<String> f128489b = new ArrayList();

    private C51389a(Context context) {
        this.f128488a = context;
    }

    /* renamed from: a */
    public static C51389a m110522a(Context context) {
        if (f128487c == null) {
            synchronized (C51389a.class) {
                if (f128487c == null) {
                    f128487c = new C51389a(context);
                }
            }
        }
        return f128487c;
    }

    /* renamed from: a */
    public final void mo102058a() {
        String c = m110523c();
        if (c != null) {
            this.f128489b.add(c);
            try {
                int size = this.f128489b.size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(this.f128489b.subList(size - 10, size));
                    this.f128489b.clear();
                    this.f128489b = arrayList;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final synchronized String mo102059b() {
        String str;
        str = "";
        int size = this.f128489b.size();
        if (size <= 0) {
            return str;
        }
        if (size == 1) {
            return (String) this.f128489b.get(0);
        }
        try {
            List<String> list = this.f128489b;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List subList = list.subList(i, size);
            String str2 = str;
            int i2 = 0;
            while (i2 < subList.size()) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append((String) subList.get(i2));
                    sb.append(",");
                    i2++;
                    str2 = sb.toString();
                } catch (Throwable unused) {
                    str = str2;
                }
            }
            str = str2.substring(0, str2.length() - 1);
        } catch (Throwable unused2) {
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(-10001);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return r0.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:1:0x0001] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m110523c() {
        /*
            r7 = this;
            r0 = -1
            monitor-enter(r7)     // Catch:{ Exception -> 0x0081, all -> 0x0073 }
            android.content.Context r1 = r7.f128488a     // Catch:{ all -> 0x006b }
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch:{ all -> 0x006b }
            r3 = 0
            android.content.Intent r1 = r1.registerReceiver(r3, r2)     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0014
            r1 = -1
            goto L_0x0024
        L_0x0014:
            java.lang.String r2 = "plugged"
            int r1 = r1.getIntExtra(r2, r0)     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "[+] plugged : "
            r2.<init>(r4)     // Catch:{ all -> 0x006b }
            r2.append(r1)     // Catch:{ all -> 0x006b }
        L_0x0024:
            android.content.Context r2 = r7.f128488a     // Catch:{ all -> 0x0068 }
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)     // Catch:{ all -> 0x0068 }
            android.content.Intent r2 = r2.registerReceiver(r3, r4)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x0034
            goto L_0x0052
        L_0x0034:
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "scale"
            int r2 = r2.getIntExtra(r4, r0)     // Catch:{ all -> 0x0068 }
            float r3 = (float) r3     // Catch:{ all -> 0x0068 }
            float r2 = (float) r2     // Catch:{ all -> 0x0068 }
            float r3 = r3 / r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r2
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)     // Catch:{ all -> 0x0068 }
            int r2 = r2 / 10
            r0 = r2
        L_0x0052:
            monitor-exit(r7)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r1 * 10000
            int r1 = r1 + r0
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x008f
        L_0x0063:
            r2 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x006d
        L_0x0068:
            r2 = move-exception
            r0 = r1
            goto L_0x006c
        L_0x006b:
            r2 = move-exception
        L_0x006c:
            r1 = -1
        L_0x006d:
            monitor-exit(r7)     // Catch:{ all -> 0x0071 }
            throw r2     // Catch:{ Exception -> 0x0081, all -> 0x006f }
        L_0x006f:
            r2 = move-exception
            goto L_0x0075
        L_0x0071:
            r2 = move-exception
            goto L_0x006d
        L_0x0073:
            r2 = move-exception
            r1 = -1
        L_0x0075:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r0 * 10000
            int r0 = r0 + r1
            r3.append(r0)
            throw r2
        L_0x0081:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -10001(0xffffffffffffd8ef, float:NaN)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.sys.ces.p2581b.C51389a.m110523c():java.lang.String");
    }
}
