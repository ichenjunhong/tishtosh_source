package com.facebook.imagepipeline.p964d;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p914c.p915a.C13619c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.d.u */
public class C13992u {

    /* renamed from: a */
    private static final Class<?> f36472a = C13992u.class;

    /* renamed from: b */
    private Map<C13619c, C14044e> f36473b = new HashMap();

    C13992u() {
    }

    /* renamed from: b */
    private synchronized void m28521b() {
        C13697a.m27673a(f36472a, "Count = %d", (Object) Integer.valueOf(this.f36473b.size()));
    }

    /* renamed from: a */
    public final void mo26168a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f36473b.values());
            this.f36473b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C14044e eVar = (C14044e) arrayList.get(i);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.p970j.C14044e mo26171b(com.facebook.p914c.p915a.C13619c r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.facebook.common.p920d.C13689i.m27652a(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.facebook.c.a.c, com.facebook.imagepipeline.j.e> r0 = r6.f36473b     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            com.facebook.imagepipeline.j.e r0 = (com.facebook.imagepipeline.p970j.C14044e) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = com.facebook.imagepipeline.p970j.C14044e.m28706e(r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.util.Map<com.facebook.c.a.c, com.facebook.imagepipeline.j.e> r1 = r6.f36473b     // Catch:{ all -> 0x004b }
            r1.remove(r7)     // Catch:{ all -> 0x004b }
            java.lang.Class<?> r1 = f36472a     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004b }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 1
            java.lang.String r5 = r7.mo25470a()     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3[r4] = r7     // Catch:{ all -> 0x004b }
            com.facebook.common.p921e.C13697a.m27687b(r1, r2, r3)     // Catch:{ all -> 0x004b }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r7
        L_0x0045:
            com.facebook.imagepipeline.j.e r7 = com.facebook.imagepipeline.p970j.C14044e.m28703a(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004e:
            r7 = r0
        L_0x004f:
            monitor-exit(r6)
            return r7
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p964d.C13992u.mo26171b(com.facebook.c.a.c):com.facebook.imagepipeline.j.e");
    }

    /* renamed from: c */
    public final synchronized boolean mo26173c(C13619c cVar) {
        C13689i.m27652a(cVar);
        if (!this.f36473b.containsKey(cVar)) {
            return false;
        }
        C14044e eVar = (C14044e) this.f36473b.get(cVar);
        synchronized (eVar) {
            if (C14044e.m28706e(eVar)) {
                return true;
            }
            this.f36473b.remove(cVar);
            C13697a.m27687b(f36472a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), cVar.mo25470a(), Integer.valueOf(System.identityHashCode(cVar)));
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo26170a(C13619c cVar) {
        C14044e eVar;
        C13689i.m27652a(cVar);
        synchronized (this) {
            eVar = (C14044e) this.f36473b.remove(cVar);
        }
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo26262a();
        } finally {
            eVar.close();
        }
    }

    /* renamed from: a */
    public final synchronized void mo26169a(C13619c cVar, C14044e eVar) {
        C13689i.m27652a(cVar);
        C13689i.m27655a(C14044e.m28706e(eVar));
        C14044e.m28705d((C14044e) this.f36473b.put(cVar, C14044e.m28703a(eVar)));
        m28521b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final synchronized boolean mo26172b(C13619c cVar, C14044e eVar) {
        C13689i.m27652a(cVar);
        C13689i.m27652a(eVar);
        C13689i.m27655a(C14044e.m28706e(eVar));
        C14044e eVar2 = (C14044e) this.f36473b.get(cVar);
        if (eVar2 == null) {
            return false;
        }
        C13715a b = eVar2.mo26263b();
        C13715a b2 = eVar.mo26263b();
        if (!(b == null || b2 == null)) {
            try {
                if (b.mo25630a() == b2.mo25630a()) {
                    this.f36473b.remove(cVar);
                    C13715a.m27752c(b2);
                    C13715a.m27752c(b);
                    C14044e.m28705d(eVar2);
                    m28521b();
                    return true;
                }
            } catch (Throwable th) {
                C13715a.m27752c(b2);
                C13715a.m27752c(b);
                C14044e.m28705d(eVar2);
                throw th;
            }
        }
        C13715a.m27752c(b2);
        C13715a.m27752c(b);
        C14044e.m28705d(eVar2);
        return false;
    }
}
