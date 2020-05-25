package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.bl */
public class C16568bl extends C16860r {

    /* renamed from: a */
    private static C16568bl f46564a;

    public C16568bl(C16862t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        synchronized (C16568bl.class) {
            f46564a = this;
        }
    }

    /* renamed from: b */
    public static C16568bl m39529b() {
        return f46564a;
    }

    /* renamed from: a */
    public final void mo31826a(C16564bh bhVar, String str) {
        String bhVar2 = bhVar != null ? bhVar.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo32498c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), bhVar2);
    }

    /* renamed from: a */
    public final void mo31827a(Map<String, String> map, String str) {
        String str2;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        String str3 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo32498c(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106 A[DONT_GENERATE] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31828b(int r8, java.lang.String r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.common.internal.C15464q.m32123a(r9)     // Catch:{ all -> 0x0108 }
            r0 = 0
            if (r8 >= 0) goto L_0x0008
            r8 = 0
        L_0x0008:
            r1 = 9
            if (r8 < r1) goto L_0x000e
            r8 = 8
        L_0x000e:
            com.google.android.gms.internal.measurement.au r1 = r7.mo32508i()     // Catch:{ all -> 0x0108 }
            boolean r1 = r1.mo31809a()     // Catch:{ all -> 0x0108 }
            if (r1 == 0) goto L_0x001b
            r1 = 67
            goto L_0x001d
        L_0x001b:
            r1 = 99
        L_0x001d:
            java.lang.String r2 = "01VDIWEA?"
            char r8 = r2.charAt(r8)     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = com.google.android.gms.internal.measurement.C16861s.f47331a     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = m39528a(r10)     // Catch:{ all -> 0x0108 }
            java.lang.String r11 = m39528a(r11)     // Catch:{ all -> 0x0108 }
            java.lang.String r12 = m39528a(r12)     // Catch:{ all -> 0x0108 }
            java.lang.String r9 = m40931c(r9, r10, r11, r12)     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0108 }
            int r10 = r10.length()     // Catch:{ all -> 0x0108 }
            int r10 = r10 + 4
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0108 }
            int r11 = r11.length()     // Catch:{ all -> 0x0108 }
            int r10 = r10 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
            r11.<init>(r10)     // Catch:{ all -> 0x0108 }
            java.lang.String r10 = "3"
            r11.append(r10)     // Catch:{ all -> 0x0108 }
            r11.append(r8)     // Catch:{ all -> 0x0108 }
            r11.append(r1)     // Catch:{ all -> 0x0108 }
            r11.append(r2)     // Catch:{ all -> 0x0108 }
            java.lang.String r8 = ":"
            r11.append(r8)     // Catch:{ all -> 0x0108 }
            r11.append(r9)     // Catch:{ all -> 0x0108 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x0108 }
            int r9 = r8.length()     // Catch:{ all -> 0x0108 }
            r10 = 1024(0x400, float:1.435E-42)
            if (r9 <= r10) goto L_0x0073
            java.lang.String r8 = r8.substring(r0, r10)     // Catch:{ all -> 0x0108 }
        L_0x0073:
            com.google.android.gms.internal.measurement.t r9 = r7.f47329b     // Catch:{ all -> 0x0108 }
            com.google.android.gms.internal.measurement.br r10 = r9.f47340g     // Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x0085
            com.google.android.gms.internal.measurement.br r10 = r9.f47340g     // Catch:{ all -> 0x0108 }
            boolean r10 = r10.mo32515q()     // Catch:{ all -> 0x0108 }
            if (r10 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            com.google.android.gms.internal.measurement.br r9 = r9.f47340g     // Catch:{ all -> 0x0108 }
            goto L_0x0086
        L_0x0085:
            r9 = 0
        L_0x0086:
            if (r9 == 0) goto L_0x0106
            com.google.android.gms.internal.measurement.bt r9 = r9.f46575a     // Catch:{ all -> 0x0108 }
            long r10 = r9.mo31847c()     // Catch:{ all -> 0x0108 }
            r1 = 0
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x0097
            r9.mo31845a()     // Catch:{ all -> 0x0108 }
        L_0x0097:
            if (r8 != 0) goto L_0x009b
            java.lang.String r8 = ""
        L_0x009b:
            monitor-enter(r9)     // Catch:{ all -> 0x0108 }
            com.google.android.gms.internal.measurement.br r10 = r9.f46579a     // Catch:{ all -> 0x0103 }
            android.content.SharedPreferences r10 = r10.f46576c     // Catch:{ all -> 0x0103 }
            java.lang.String r11 = r9.mo31848d()     // Catch:{ all -> 0x0103 }
            long r10 = r10.getLong(r11, r1)     // Catch:{ all -> 0x0103 }
            r3 = 1
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x00ce
            com.google.android.gms.internal.measurement.br r10 = r9.f46579a     // Catch:{ all -> 0x0103 }
            android.content.SharedPreferences r10 = r10.f46576c     // Catch:{ all -> 0x0103 }
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch:{ all -> 0x0103 }
            java.lang.String r11 = r9.mo31849e()     // Catch:{ all -> 0x0103 }
            r10.putString(r11, r8)     // Catch:{ all -> 0x0103 }
            java.lang.String r8 = r9.mo31848d()     // Catch:{ all -> 0x0103 }
            r10.putLong(r8, r3)     // Catch:{ all -> 0x0103 }
            r10.apply()     // Catch:{ all -> 0x0103 }
            monitor-exit(r9)     // Catch:{ all -> 0x0103 }
            monitor-exit(r7)
            return
        L_0x00ce:
            java.util.UUID r12 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0103 }
            long r1 = r12.getLeastSignificantBits()     // Catch:{ all -> 0x0103 }
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r1 = r1 & r5
            long r10 = r10 + r3
            long r5 = r5 / r10
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x00e3
            r0 = 1
        L_0x00e3:
            com.google.android.gms.internal.measurement.br r12 = r9.f46579a     // Catch:{ all -> 0x0103 }
            android.content.SharedPreferences r12 = r12.f46576c     // Catch:{ all -> 0x0103 }
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = r9.mo31849e()     // Catch:{ all -> 0x0103 }
            r12.putString(r0, r8)     // Catch:{ all -> 0x0103 }
        L_0x00f6:
            java.lang.String r8 = r9.mo31848d()     // Catch:{ all -> 0x0103 }
            r12.putLong(r8, r10)     // Catch:{ all -> 0x0103 }
            r12.apply()     // Catch:{ all -> 0x0103 }
            monitor-exit(r9)     // Catch:{ all -> 0x0103 }
            monitor-exit(r7)
            return
        L_0x0103:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0103 }
            throw r8     // Catch:{ all -> 0x0108 }
        L_0x0106:
            monitor-exit(r7)
            return
        L_0x0108:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16568bl.mo31828b(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: a */
    private static String m39528a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            sb.append("...");
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
    }
}
