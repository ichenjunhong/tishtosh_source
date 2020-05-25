package com.facebook.common.p924h;

import com.facebook.common.p920d.C13679b;
import com.facebook.common.p920d.C13689i;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.common.h.a */
public final class C13715a<T> implements Closeable, Cloneable {

    /* renamed from: b */
    private static Class<C13715a> f35691b = C13715a.class;

    /* renamed from: d */
    private static final C13718c<Closeable> f35692d = new C13718c<Closeable>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo25600a(Object obj) {
            try {
                C13679b.m27633a((Closeable) obj, true);
            } catch (IOException unused) {
            }
        }
    };

    /* renamed from: a */
    public final C13719d<T> f35693a;

    /* renamed from: c */
    private boolean f35694c;

    /* renamed from: d */
    public final synchronized boolean mo25635d() {
        boolean z;
        if (!this.f35694c) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized C13715a<T> clone() {
        C13689i.m27657b(mo25635d());
        return new C13715a<>(this.f35693a);
    }

    /* renamed from: c */
    public final synchronized C13715a<T> mo25632c() {
        if (!mo25635d()) {
            return null;
        }
        return clone();
    }

    /* JADX INFO: used method not loaded: com.facebook.common.h.d.a(java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = r0.f35699a;
        r0.f35699a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r0.f35700b.mo25600a(r1);
        com.facebook.common.p924h.C13719d.m27759a((java.lang.Object) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r0 = r3.f35693a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0.mo25639c() != 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f35694c     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return
        L_0x0007:
            r0 = 1
            r3.f35694c = r0     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            com.facebook.common.h.d<T> r0 = r3.f35693a
            int r1 = r0.mo25639c()
            if (r1 != 0) goto L_0x0026
            monitor-enter(r0)
            T r1 = r0.f35699a     // Catch:{ all -> 0x0023 }
            r2 = 0
            r0.f35699a = r2     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            com.facebook.common.h.c<T> r0 = r0.f35700b
            r0.mo25600a(r1)
            com.facebook.common.p924h.C13719d.m27759a(r1)
            goto L_0x0026
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p924h.C13715a.close():void");
    }

    /* JADX INFO: used method not loaded: com.facebook.common.e.a.a(java.lang.Class):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.facebook.common.e.a.a(java.lang.String, java.lang.Object[]):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = f35691b;
        r1 = "Finalized without closing: %x %x (type = %s)";
        r2 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8));
        r3 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r8.f35693a));
        r4 = r8.f35693a.mo25637a().getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (com.facebook.common.p921e.C13697a.f35669a.mo25590b(3) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        com.facebook.common.p921e.C13697a.f35669a.mo25588b(com.facebook.common.p921e.C13697a.m27669a((java.lang.Class) r0), com.facebook.common.p921e.C13697a.m27670a(r1, r2, r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)     // Catch:{ all -> 0x005a }
            boolean r0 = r8.f35694c     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r8)     // Catch:{ all -> 0x0057 }
            super.finalize()
            return
        L_0x000a:
            monitor-exit(r8)     // Catch:{ all -> 0x0057 }
            java.lang.Class<com.facebook.common.h.a> r0 = f35691b     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "Finalized without closing: %x %x (type = %s)"
            int r2 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x005a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x005a }
            com.facebook.common.h.d<T> r3 = r8.f35693a     // Catch:{ all -> 0x005a }
            int r3 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x005a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x005a }
            com.facebook.common.h.d<T> r4 = r8.f35693a     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r4.mo25637a()     // Catch:{ all -> 0x005a }
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x005a }
            com.facebook.common.e.c r5 = com.facebook.common.p921e.C13697a.f35669a     // Catch:{ all -> 0x005a }
            r6 = 3
            boolean r5 = r5.mo25590b(r6)     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0050
            com.facebook.common.e.c r5 = com.facebook.common.p921e.C13697a.f35669a     // Catch:{ all -> 0x005a }
            java.lang.String r0 = com.facebook.common.p921e.C13697a.m27669a(r0)     // Catch:{ all -> 0x005a }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x005a }
            r7 = 0
            r6[r7] = r2     // Catch:{ all -> 0x005a }
            r2 = 1
            r6[r2] = r3     // Catch:{ all -> 0x005a }
            r2 = 2
            r6[r2] = r4     // Catch:{ all -> 0x005a }
            java.lang.String r1 = com.facebook.common.p921e.C13697a.m27670a(r1, r6)     // Catch:{ all -> 0x005a }
            r5.mo25588b(r0, r1)     // Catch:{ all -> 0x005a }
        L_0x0050:
            r8.close()     // Catch:{ all -> 0x005a }
            super.finalize()
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.p924h.C13715a.finalize():void");
    }

    /* renamed from: a */
    public final synchronized T mo25630a() {
        C13689i.m27657b(!this.f35694c);
        return this.f35693a.mo25637a();
    }

    /* renamed from: c */
    public static void m27752c(C13715a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    private C13715a(C13719d<T> dVar) {
        this.f35693a = (C13719d) C13689i.m27652a(dVar);
        dVar.mo25638b();
    }

    /* renamed from: a */
    public static <T extends Closeable> C13715a<T> m27746a(T t) {
        if (t == null) {
            return null;
        }
        return new C13715a<>(t, f35692d);
    }

    /* renamed from: b */
    public static <T> C13715a<T> m27751b(C13715a<T> aVar) {
        if (aVar != null) {
            return aVar.mo25632c();
        }
        return null;
    }

    /* renamed from: a */
    public static <T> List<C13715a<T>> m27748a(Collection<C13715a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (C13715a b : collection) {
            arrayList.add(m27751b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m27749a(Iterable<? extends C13715a<?>> iterable) {
        if (iterable != null) {
            for (C13715a c : iterable) {
                m27752c(c);
            }
        }
    }

    /* renamed from: a */
    public static boolean m27750a(C13715a<?> aVar) {
        if (aVar == null || !aVar.mo25635d()) {
            return false;
        }
        return true;
    }

    private C13715a(T t, C13718c<T> cVar) {
        this.f35693a = new C13719d<>(t, cVar);
    }

    /* renamed from: a */
    public static <T> C13715a<T> m27747a(T t, C13718c<T> cVar) {
        if (t == null) {
            return null;
        }
        return new C13715a<>(t, cVar);
    }
}
