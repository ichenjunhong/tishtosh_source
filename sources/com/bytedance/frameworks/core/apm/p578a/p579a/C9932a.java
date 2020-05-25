package com.bytedance.frameworks.core.apm.p578a.p579a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.C8994d;
import com.bytedance.apm.C8994d.C8996a;
import com.bytedance.apm.p485h.C9042d;
import com.bytedance.apm.p501q.C9190h;
import com.bytedance.frameworks.core.apm.p578a.C9928a;
import com.bytedance.frameworks.core.apm.p578a.C9928a.C9930a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.a */
public abstract class C9932a<T extends C9042d> extends C9928a<T> implements C9930a<T> {

    /* renamed from: a */
    private long f27011a = -1;

    /* renamed from: b */
    private int f27012b;

    /* renamed from: g */
    private synchronized long m19937g() {
        return mo17882b("is_sampled = 1", null);
    }

    /* renamed from: f */
    public final synchronized long mo17897f() {
        if (C8976c.m17751g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" -> getLogSampledCount, mTotalSampleCount: ");
            sb.append(this.f27011a);
            sb.append(" , mFastReadSampleTimes: ");
            sb.append(this.f27012b);
            String[] strArr = {sb.toString()};
        }
        if (this.f27011a >= 0) {
            if (this.f27012b <= 10) {
                this.f27012b++;
            }
        }
        this.f27011a = m19937g();
        this.f27012b = 0;
        return this.f27011a;
    }

    /* renamed from: c */
    public final synchronized int mo17896c(List<Long> list) {
        if (C9190h.m18253a(list)) {
            return -1;
        }
        int a = mo17890a(C9190h.m18251a(list, ","));
        this.f27011a -= (long) a;
        return a;
    }

    /* renamed from: a */
    public final synchronized int mo17890a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder("_id in ( ");
        sb.append(str);
        sb.append(" )");
        return mo17874a(sb.toString(), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo17891a(T r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            if (r9 != 0) goto L_0x0007
            monitor-exit(r8)
            return r0
        L_0x0007:
            android.content.ContentValues r2 = r8.mo17876a(r9)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r8)
            return r0
        L_0x000f:
            long r2 = r8.mo17875a(r2)     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            boolean r9 = r9.f24687l     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            if (r9 == 0) goto L_0x0028
            long r4 = r8.f27011a     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0021
            r8.f27011a = r6     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
        L_0x0021:
            long r4 = r8.f27011a     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
            r6 = 1
            long r4 = r4 + r6
            r8.f27011a = r4     // Catch:{ Throwable -> 0x002d, all -> 0x002a }
        L_0x0028:
            monitor-exit(r8)
            return r2
        L_0x002a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x002d:
            monitor-exit(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p578a.p579a.C9932a.mo17891a(com.bytedance.apm.h.d):long");
    }

    /* renamed from: b */
    public final synchronized void mo17895b(List<T> list) {
        Object obj;
        if (!C9190h.m18253a(list)) {
            int size = list.size();
            int i = ((size - 1) / 50) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 50;
                int min = Math.min(i3 + 50, size);
                ArrayList arrayList = new ArrayList(min - i3);
                while (i3 < min) {
                    C9042d dVar = (C9042d) list.get(i3);
                    try {
                        obj = mo17876a(dVar);
                    } catch (Throwable th) {
                        C8994d a = C8994d.m17799a();
                        StringBuilder sb = new StringBuilder("apm_AbsLogDao_");
                        sb.append(dVar.f24682g);
                        sb.append(dVar.f24683h);
                        String sb2 = sb.toString();
                        if (a.f24477a != null && !a.f24478b.contains(sb2)) {
                            a.f24478b.add(sb2);
                            C8996a aVar = a.f24477a;
                            StringBuilder sb3 = new StringBuilder("apm_");
                            sb3.append(sb2);
                            aVar.mo16328a(th, sb3.toString());
                        }
                        obj = null;
                    }
                    if (obj == null) {
                        list.set(i3, null);
                    } else {
                        arrayList.add(obj);
                        if (dVar.f24687l) {
                            if (this.f27011a < 0) {
                                this.f27011a = 0;
                            }
                            this.f27011a++;
                        }
                        list.set(i3, null);
                    }
                    i3++;
                }
                mo17880a((List<ContentValues>) arrayList);
                arrayList.clear();
            }
            list.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<? extends com.bytedance.apm.p485h.C9042d> mo17894a(java.util.List<java.lang.String> r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "is_sampled = ? "
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r7)     // Catch:{ Throwable -> 0x006d }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006d }
            r1.<init>()     // Catch:{ Throwable -> 0x006d }
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = " AND type IN ( "
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = ","
            int r4 = r7.size()     // Catch:{ Throwable -> 0x006d }
            java.lang.String r5 = "?"
            java.util.List r4 = java.util.Collections.nCopies(r4, r5)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ Throwable -> 0x006d }
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = " ) "
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x006d }
            int r1 = r7.size()     // Catch:{ Throwable -> 0x006d }
            int r1 = r1 + r3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x006d }
            java.lang.String r3 = "1"
            r1[r2] = r3     // Catch:{ Throwable -> 0x006d }
        L_0x003f:
            int r3 = r7.size()     // Catch:{ Throwable -> 0x006d }
            if (r2 >= r3) goto L_0x0057
            int r3 = r2 + 1
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x006d }
            r1[r3] = r2     // Catch:{ Throwable -> 0x006d }
            r2 = r3
            goto L_0x003f
        L_0x0051:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x006d }
            java.lang.String r7 = "1"
            r1[r2] = r7     // Catch:{ Throwable -> 0x006d }
        L_0x0057:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = "_id DESC  LIMIT "
            r7.<init>(r2)     // Catch:{ Throwable -> 0x006d }
            r7.append(r8)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x006d }
            java.util.List r7 = r6.mo17878a(r0, r1, r7, r6)     // Catch:{ Throwable -> 0x006d }
            monitor-exit(r6)
            return r7
        L_0x006b:
            r7 = move-exception
            goto L_0x0073
        L_0x006d:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x006b }
            monitor-exit(r6)
            return r7
        L_0x0073:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p578a.p579a.C9932a.mo17894a(java.util.List, int):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<T> mo17892a(long r2, long r4, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x000d
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)
            return r2
        L_0x000d:
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x005c }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x005c }
            r3 = 0
            r0[r3] = r2     // Catch:{ Throwable -> 0x005c }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x005c }
            r4 = 1
            r0[r4] = r2     // Catch:{ Throwable -> 0x005c }
            r2 = 2
            r0[r2] = r6     // Catch:{ Throwable -> 0x005c }
            java.lang.String r5 = ","
            java.lang.String[] r5 = r7.split(r5)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = ""
            int r7 = r5.length     // Catch:{ Throwable -> 0x005c }
            if (r7 != r2) goto L_0x0046
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = " LIMIT "
            r2.<init>(r6)     // Catch:{ Throwable -> 0x005c }
            r4 = r5[r4]     // Catch:{ Throwable -> 0x005c }
            r2.append(r4)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = " OFFSET "
            r2.append(r4)     // Catch:{ Throwable -> 0x005c }
            r3 = r5[r3]     // Catch:{ Throwable -> 0x005c }
            r2.append(r3)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x005c }
        L_0x0046:
            java.lang.String r2 = "timestamp >= ? AND timestamp <= ?  AND type2 = ? "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = "_id ASC "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x005c }
            r3.append(r6)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x005c }
            java.util.List r2 = r1.mo17878a(r2, r0, r3, r1)     // Catch:{ Throwable -> 0x005c }
            monitor-exit(r1)
            return r2
        L_0x005c:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)
            return r2
        L_0x0062:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p578a.p579a.C9932a.mo17892a(long, long, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00aa */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<T> mo17893a(long r8, long r10, java.util.List<java.lang.String> r12, java.lang.String r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "timestamp >= ? AND timestamp <= ? "
            boolean r1 = com.bytedance.apm.p501q.C9190h.m18253a(r12)     // Catch:{ Throwable -> 0x00aa }
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 != 0) goto L_0x005c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00aa }
            r1.<init>()     // Catch:{ Throwable -> 0x00aa }
            r1.append(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = " AND type2 IN ( "
            r1.append(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = ","
            int r5 = r12.size()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r6 = "?"
            java.util.List r5 = java.util.Collections.nCopies(r5, r6)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ Throwable -> 0x00aa }
            r1.append(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = " )"
            r1.append(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x00aa }
            int r1 = r12.size()     // Catch:{ Throwable -> 0x00aa }
            int r1 = r1 + r3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x00aa }
            r1[r4] = r8     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Throwable -> 0x00aa }
            r1[r2] = r8     // Catch:{ Throwable -> 0x00aa }
            r8 = 0
        L_0x0049:
            int r9 = r12.size()     // Catch:{ Throwable -> 0x00aa }
            if (r8 >= r9) goto L_0x006a
            int r9 = r8 + 2
            java.lang.Object r10 = r12.get(r8)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x00aa }
            r1[r9] = r10     // Catch:{ Throwable -> 0x00aa }
            int r8 = r8 + 1
            goto L_0x0049
        L_0x005c:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x00aa }
            r1[r4] = r8     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Throwable -> 0x00aa }
            r1[r2] = r8     // Catch:{ Throwable -> 0x00aa }
        L_0x006a:
            if (r13 == 0) goto L_0x0073
            java.lang.String r8 = ","
            java.lang.String[] r8 = r13.split(r8)     // Catch:{ Throwable -> 0x00aa }
            goto L_0x0075
        L_0x0073:
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x00aa }
        L_0x0075:
            java.lang.String r9 = ""
            int r10 = r8.length     // Catch:{ Throwable -> 0x00aa }
            if (r10 != r3) goto L_0x0094
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r10 = " LIMIT "
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00aa }
            r10 = r8[r2]     // Catch:{ Throwable -> 0x00aa }
            r9.append(r10)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r10 = " OFFSET "
            r9.append(r10)     // Catch:{ Throwable -> 0x00aa }
            r8 = r8[r4]     // Catch:{ Throwable -> 0x00aa }
            r9.append(r8)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x00aa }
        L_0x0094:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r10 = "_id ASC "
            r8.<init>(r10)     // Catch:{ Throwable -> 0x00aa }
            r8.append(r9)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00aa }
            java.util.List r8 = r7.mo17878a(r0, r1, r8, r7)     // Catch:{ Throwable -> 0x00aa }
            monitor-exit(r7)
            return r8
        L_0x00a8:
            r8 = move-exception
            goto L_0x00b0
        L_0x00aa:
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00a8 }
            monitor-exit(r7)
            return r8
        L_0x00b0:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p578a.p579a.C9932a.mo17893a(long, long, java.util.List, java.lang.String):java.util.List");
    }
}
