package com.google.firebase.components;

import com.google.android.gms.common.internal.C15464q;
import com.google.firebase.p1072a.C17845a;
import com.google.firebase.p1072a.C17846b;
import com.google.firebase.p1072a.C17847c;
import com.google.firebase.p1072a.C17848d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.o */
class C17879o implements C17847c, C17848d {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C17846b<Object>, Executor>> f49672a = new HashMap();

    /* renamed from: b */
    private Queue<C17845a<?>> f49673b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f49674c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34709a() {
        Queue<C17845a> queue;
        synchronized (this) {
            if (this.f49673b != null) {
                queue = this.f49673b;
                this.f49673b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C17845a a : queue) {
                m43831a(a);
            }
        }
    }

    C17879o(Executor executor) {
        this.f49674c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C17846b<Object>, Executor>> m43832b(C17845a<?> aVar) {
        Map map = (Map) this.f49672a.get(aVar.f49607a);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.C17880p(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m43832b(r5).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m43831a(com.google.firebase.p1072a.C17845a<?> r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C15464q.m32123a(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r4.f49673b     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r4.f49673b     // Catch:{ all -> 0x0034 }
            r0.add(r5)     // Catch:{ all -> 0x0034 }
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            return
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            java.util.Set r0 = r4.m43832b(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.p r3 = new com.google.firebase.components.p
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0034 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C17879o.m43831a(com.google.firebase.a.a):void");
    }

    /* renamed from: a */
    public final <T> void mo34668a(Class<T> cls, C17846b<? super T> bVar) {
        mo34669a(cls, this.f49674c, bVar);
    }

    /* renamed from: a */
    public final synchronized <T> void mo34669a(Class<T> cls, Executor executor, C17846b<? super T> bVar) {
        C15464q.m32123a(cls);
        C15464q.m32123a(bVar);
        C15464q.m32123a(executor);
        if (!this.f49672a.containsKey(cls)) {
            this.f49672a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f49672a.get(cls)).put(bVar, executor);
    }
}
