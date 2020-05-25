package com.bytedance.ies.p675g.p677b;

import com.bytedance.ies.p675g.p677b.C10791k.C10795c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.ies.g.b.w */
final class C10812w {

    /* renamed from: a */
    final C10819y f29047a = C10805r.f29029a;

    /* renamed from: b */
    public C10795c f29048b;

    /* renamed from: c */
    private final Set<String> f29049c;

    /* renamed from: d */
    private final Set<String> f29050d;

    /* renamed from: e */
    private final C10813x f29051e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19591a(Collection<String> collection) {
        this.f29049c.addAll(collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo19593b(Collection<String> collection) {
        this.f29050d.addAll(collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19590a(C10823a aVar) {
        if (this.f29047a != null) {
            this.f29047a.mo19600a(aVar);
        }
    }

    /* renamed from: a */
    private synchronized boolean m21943a(String str, C10777b bVar) throws C10816a {
        return m21944a(str, bVar, true);
    }

    /* renamed from: b */
    private synchronized boolean m21945b(String str, C10777b bVar) {
        return m21944a(str, bVar, false);
    }

    C10812w(C10813x xVar, Set<String> set, Set<String> set2) {
        this.f29051e = xVar;
        this.f29049c = new LinkedHashSet(set);
        this.f29050d = new LinkedHashSet(set2);
    }

    /* renamed from: a */
    private boolean m21944a(String str, C10777b bVar, boolean z) {
        if (!z || this.f29051e == null) {
            return true;
        }
        C10818c a = this.f29051e.mo19594a(str, this.f29049c);
        if (a.f29067c.contains(bVar.getName())) {
            return true;
        }
        if (!a.f29066b.contains(bVar.getName()) && a.f29065a.compareTo(bVar.getPermissionGroup()) < 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo19592a(boolean r8, java.lang.String r9, com.bytedance.ies.p675g.p677b.C10777b r10) throws com.bytedance.ies.p675g.p677b.C10813x.C10816a {
        /*
            r7 = this;
            monitor-enter(r7)
            android.net.Uri r0 = android.net.Uri.parse(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r0.getHost()     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x000e
            r8 = 1
            monitor-exit(r7)
            return r8
        L_0x000e:
            java.util.Set<java.lang.String> r2 = r7.f29050d     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r10.getName()     // Catch:{ all -> 0x0075 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0075 }
            r3 = 0
            if (r2 == 0) goto L_0x001d
            monitor-exit(r7)
            return r3
        L_0x001d:
            java.util.Set<java.lang.String> r2 = r7.f29049c     // Catch:{ all -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0075 }
        L_0x0023:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x004f
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r0.getHost()     // Catch:{ all -> 0x0075 }
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0075 }
            if (r5 != 0) goto L_0x004d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = "."
            r5.<init>(r6)     // Catch:{ all -> 0x0075 }
            r5.append(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0075 }
            boolean r4 = r1.endsWith(r4)     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x0023
        L_0x004d:
            monitor-exit(r7)
            return r3
        L_0x004f:
            com.bytedance.ies.g.b.k$c r0 = r7.f29048b     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0067
            com.bytedance.ies.g.b.k$c r0 = r7.f29048b     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.mo19564a(r9)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0067
            com.bytedance.ies.g.b.k$c r8 = r7.f29048b     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = r10.getName()     // Catch:{ all -> 0x0075 }
            boolean r8 = r8.mo19565a(r9, r10)     // Catch:{ all -> 0x0075 }
            monitor-exit(r7)
            return r8
        L_0x0067:
            if (r8 == 0) goto L_0x006f
            boolean r8 = r7.m21943a(r9, r10)     // Catch:{ all -> 0x0075 }
            monitor-exit(r7)
            return r8
        L_0x006f:
            boolean r8 = r7.m21945b(r9, r10)     // Catch:{ all -> 0x0075 }
            monitor-exit(r7)
            return r8
        L_0x0075:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p677b.C10812w.mo19592a(boolean, java.lang.String, com.bytedance.ies.g.b.b):boolean");
    }
}
