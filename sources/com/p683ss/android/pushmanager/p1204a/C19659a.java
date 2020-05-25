package com.p683ss.android.pushmanager.p1204a;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.ss.android.pushmanager.a.a */
public final class C19659a {

    /* renamed from: a */
    private final int f54158a;

    /* renamed from: b */
    private final TreeMap<C19661a, C19661a> f54159b = new TreeMap<>(new Comparator<C19661a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C19661a aVar = (C19661a) obj;
            C19661a aVar2 = (C19661a) obj2;
            if (aVar == null) {
                return 1;
            }
            if (aVar2 != null) {
                if (aVar.equals(aVar2)) {
                    return 0;
                }
                if (aVar.f54162b > aVar2.f54162b) {
                    return 1;
                }
            }
            return -1;
        }
    });

    /* renamed from: com.ss.android.pushmanager.a.a$a */
    public class C19661a {

        /* renamed from: a */
        public Long f54161a;

        /* renamed from: b */
        public long f54162b;

        public final int hashCode() {
            return this.f54161a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.f54161a));
            sb.append("|");
            sb.append(String.valueOf(this.f54162b));
            return sb.toString();
        }

        public C19661a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C19661a) || obj == null) {
                return super.equals(obj);
            }
            return this.f54161a.equals(((C19661a) obj).f54161a);
        }
    }

    /* renamed from: a */
    public final synchronized String mo40998a() {
        String str;
        str = "";
        try {
            StringBuilder sb = new StringBuilder();
            Set<Entry> entrySet = this.f54159b.entrySet();
            int i = 0;
            for (Entry value : entrySet) {
                C19661a aVar = (C19661a) value.getValue();
                if (aVar != null) {
                    if (i != entrySet.size() - 1) {
                        sb.append(aVar.toString());
                        sb.append("@");
                    } else {
                        sb.append(aVar.toString());
                    }
                    i++;
                }
            }
            str = sb.toString();
        } catch (Throwable unused) {
        }
        return str;
    }

    public C19659a(int i) {
        this.f54158a = i;
    }

    /* renamed from: a */
    public final synchronized boolean mo41000a(C19661a aVar) {
        if (aVar == null) {
            return false;
        }
        return this.f54159b.containsKey(aVar);
    }

    /* renamed from: b */
    public final synchronized C19661a mo41001b(C19661a aVar) {
        C19661a aVar2;
        if (aVar == null) {
            return null;
        }
        try {
            aVar2 = (C19661a) this.f54159b.get(aVar);
        } catch (Exception unused) {
            aVar2 = null;
        }
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41002c(com.p683ss.android.pushmanager.p1204a.C19659a.C19661a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            boolean r0 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 == 0) goto L_0x000e
            r2.mo40998a()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x000e:
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r0 = r2.f54159b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            int r1 = r2.f54158a     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 < r1) goto L_0x0029
            boolean r0 = r2.mo41000a(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 != 0) goto L_0x0029
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r0 = r2.f54159b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r1 = r2.f54159b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            java.lang.Object r1 = r1.firstKey()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.remove(r1)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0029:
            boolean r0 = r2.mo41000a(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r0 == 0) goto L_0x0034
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r0 = r2.f54159b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0034:
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r0 = r2.f54159b     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            r0.put(r3, r3)     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            boolean r3 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
            if (r3 == 0) goto L_0x0042
            r2.mo40998a()     // Catch:{ Exception -> 0x0047, all -> 0x0044 }
        L_0x0042:
            monitor-exit(r2)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0047:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.p1204a.C19659a.mo41002c(com.ss.android.pushmanager.a.a$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40999a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            java.util.TreeMap<com.ss.android.pushmanager.a.a$a, com.ss.android.pushmanager.a.a$a> r0 = r7.f54159b     // Catch:{ Exception -> 0x004d }
            r0.clear()     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "@"
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x004d }
            if (r8 == 0) goto L_0x004b
            int r0 = r8.length     // Catch:{ Exception -> 0x004d }
            r1 = 0
            r2 = 0
        L_0x0019:
            if (r2 >= r0) goto L_0x004b
            r3 = r8[r2]     // Catch:{ Exception -> 0x004d }
            com.ss.android.pushmanager.a.a$a r4 = new com.ss.android.pushmanager.a.a$a     // Catch:{ Exception -> 0x004d }
            r4.<init>()     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0045
            java.lang.String r5 = "\\|"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0045
            int r5 = r3.length     // Catch:{ Exception -> 0x004d }
            r6 = 2
            if (r5 != r6) goto L_0x0045
            r5 = r3[r1]     // Catch:{ Exception -> 0x004d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x004d }
            r4.f54161a = r5     // Catch:{ Exception -> 0x004d }
            r5 = 1
            r3 = r3[r5]     // Catch:{ Exception -> 0x004d }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x004d }
            long r5 = r3.longValue()     // Catch:{ Exception -> 0x004d }
            r4.f54162b = r5     // Catch:{ Exception -> 0x004d }
        L_0x0045:
            r7.mo41002c(r4)     // Catch:{ Exception -> 0x004d }
            int r2 = r2 + 1
            goto L_0x0019
        L_0x004b:
            monitor-exit(r7)
            return
        L_0x004d:
            monitor-exit(r7)
            return
        L_0x004f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.p1204a.C19659a.mo40999a(java.lang.String):void");
    }
}
