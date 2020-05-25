package p001a;

import com.C2240a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.i */
public class C0013i<TResult> {

    /* renamed from: a */
    public static final ExecutorService f24a = C0005c.m0a();

    /* renamed from: b */
    public static final Executor f25b = C0002b.f3a.f7b;

    /* renamed from: c */
    private static final Executor f26c = C0005c.f8a.f9b;

    /* renamed from: d */
    private static volatile C0026a f27d;

    /* renamed from: m */
    private static C0013i<?> f28m = new C0013i<>((TResult) null);

    /* renamed from: n */
    private static C0013i<Boolean> f29n = new C0013i<>((TResult) Boolean.valueOf(true));

    /* renamed from: o */
    private static C0013i<Boolean> f30o = new C0013i<>((TResult) Boolean.valueOf(false));

    /* renamed from: p */
    private static C0013i<?> f31p = new C0013i<>(true);

    /* renamed from: e */
    private final Object f32e = new Object();

    /* renamed from: f */
    private boolean f33f;

    /* renamed from: g */
    private boolean f34g;

    /* renamed from: h */
    private TResult f35h;

    /* renamed from: i */
    private Exception f36i;

    /* renamed from: j */
    private boolean f37j;

    /* renamed from: k */
    private C0028k f38k;

    /* renamed from: l */
    private List<C0011g<TResult, Void>> f39l = new ArrayList();

    /* renamed from: a.i$a */
    public interface C0026a {
    }

    /* renamed from: a */
    public static C0026a m11a() {
        return f27d;
    }

    /* renamed from: h */
    public static <TResult> C0013i<TResult> m25h() {
        return f31p;
    }

    /* renamed from: a */
    public final boolean mo22a(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean b;
        synchronized (this.f32e) {
            if (!mo26b()) {
                this.f32e.wait(timeUnit.toMillis(j));
            }
            b = mo26b();
        }
        return b;
    }

    /* renamed from: a */
    public final <TContinuationResult> C0013i<TContinuationResult> mo20a(C0011g<TResult, TContinuationResult> gVar, Executor executor) {
        return mo21a(gVar, executor, (C0008d) null);
    }

    /* renamed from: a */
    public final <TContinuationResult> C0013i<TContinuationResult> mo21a(C0011g<TResult, TContinuationResult> gVar, Executor executor, C0008d dVar) {
        boolean b;
        C0027j jVar = new C0027j();
        synchronized (this.f32e) {
            b = mo26b();
            if (!b) {
                List<C0011g<TResult, Void>> list = this.f39l;
                final C0027j jVar2 = jVar;
                final C0011g<TResult, TContinuationResult> gVar2 = gVar;
                final Executor executor2 = executor;
                final C0008d dVar2 = dVar;
                C00172 r0 = new C0011g<TResult, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C0013i<TResult> iVar) {
                        C0013i.m20a(jVar2, gVar2, iVar, executor2, dVar2);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b) {
            m20a(jVar, gVar, this, executor, dVar);
        }
        return jVar.f77a;
    }

    /* renamed from: a */
    public final <TContinuationResult> C0013i<TContinuationResult> mo19a(C0011g<TResult, TContinuationResult> gVar) {
        return mo21a(gVar, f26c, (C0008d) null);
    }

    /* renamed from: e */
    public final TResult mo34e() {
        TResult tresult;
        synchronized (this.f32e) {
            tresult = this.f35h;
        }
        return tresult;
    }

    C0013i() {
    }

    /* renamed from: d */
    public final boolean mo33d() {
        boolean z;
        synchronized (this.f32e) {
            if (mo35f() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final Exception mo35f() {
        Exception exc;
        synchronized (this.f32e) {
            if (this.f36i != null) {
                this.f37j = true;
                if (this.f38k != null) {
                    this.f38k.f78a = null;
                    this.f38k = null;
                }
            }
            exc = this.f36i;
        }
        return exc;
    }

    /* renamed from: g */
    public final void mo36g() throws InterruptedException {
        synchronized (this.f32e) {
            if (!mo26b()) {
                this.f32e.wait();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo37i() {
        synchronized (this.f32e) {
            if (this.f33f) {
                return false;
            }
            this.f33f = true;
            this.f34g = true;
            this.f32e.notifyAll();
            m26j();
            return true;
        }
    }

    /* renamed from: j */
    private void m26j() {
        synchronized (this.f32e) {
            for (C0011g then : this.f39l) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f39l = null;
        }
    }

    /* renamed from: c */
    public final boolean mo31c() {
        boolean z;
        synchronized (this.f32e) {
            z = this.f34g;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo26b() {
        boolean z;
        synchronized (this.f32e) {
            z = this.f33f;
        }
        return z;
    }

    /* renamed from: a */
    public static <TResult> C0013i<TResult> m16a(Callable<TResult> callable) {
        return m19a(callable, (Executor) f24a, (C0008d) null);
    }

    /* renamed from: b */
    public static <TResult> C0013i<TResult> m22b(Callable<TResult> callable) {
        return m19a(callable, f26c, (C0008d) null);
    }

    /* renamed from: c */
    public final <TContinuationResult> C0013i<TContinuationResult> mo29c(C0011g<TResult, TContinuationResult> gVar) {
        return m24c(gVar, f26c, null);
    }

    /* renamed from: a */
    public static <TResult> C0013i<TResult> m13a(Exception exc) {
        C0027j jVar = new C0027j();
        jVar.mo46b(exc);
        return jVar.f77a;
    }

    /* renamed from: b */
    public final <TContinuationResult> C0013i<TContinuationResult> mo23b(C0011g<TResult, C0013i<TContinuationResult>> gVar) {
        return mo25b(gVar, f26c, null);
    }

    /* renamed from: d */
    public final <TContinuationResult> C0013i<TContinuationResult> mo32d(final C0011g<TResult, C0013i<TContinuationResult>> gVar) {
        return mo24b(new C0011g<TResult, C0013i<TContinuationResult>>(null) {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (null != null && null.mo8a()) {
                    return C0013i.m25h();
                }
                if (iVar.mo33d()) {
                    return C0013i.m13a(iVar.mo35f());
                }
                if (iVar.mo31c()) {
                    return C0013i.m25h();
                }
                return iVar.mo23b(gVar);
            }
        }, f26c);
    }

    /* renamed from: a */
    public static <TResult> C0013i<List<TResult>> m15a(final Collection<? extends C0013i<TResult>> collection) {
        return m21b(collection).mo29c(new C0011g<Void, List<TResult>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (C0013i e : collection) {
                    arrayList.add(e.mo34e());
                }
                return arrayList;
            }
        });
    }

    private C0013i(TResult tresult) {
        mo28b(tresult);
    }

    /* renamed from: a */
    public static C0013i<Void> m12a(long j) {
        ScheduledExecutorService b = C0005c.m1b();
        if (j <= 0) {
            return m14a((TResult) null);
        }
        final C0027j jVar = new C0027j();
        b.schedule(new Runnable() {
            public final void run() {
                jVar.mo44a(null);
            }
        }, j, TimeUnit.MILLISECONDS);
        return jVar.f77a;
    }

    private C0013i(boolean z) {
        mo37i();
    }

    /* renamed from: a */
    public static <TResult> C0013i<TResult> m14a(TResult tresult) {
        if (tresult == null) {
            return f28m;
        }
        if (!(tresult instanceof Boolean)) {
            C0027j jVar = new C0027j();
            jVar.mo47b(tresult);
            return jVar.f77a;
        } else if (((Boolean) tresult).booleanValue()) {
            return f29n;
        } else {
            return f30o;
        }
    }

    /* renamed from: b */
    public static C0013i<Void> m21b(Collection<? extends C0013i<?>> collection) {
        if (collection.size() == 0) {
            return m14a((TResult) null);
        }
        C0027j jVar = new C0027j();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C0013i iVar : collection) {
            final Object obj2 = obj;
            final ArrayList arrayList2 = arrayList;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final AtomicInteger atomicInteger2 = atomicInteger;
            final C0027j jVar2 = jVar;
            C001611 r0 = new C0011g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C0013i<Object> iVar) {
                    if (iVar.mo33d()) {
                        synchronized (obj2) {
                            arrayList2.add(iVar.mo35f());
                        }
                    }
                    if (iVar.mo31c()) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (arrayList2.size() != 0) {
                            if (arrayList2.size() == 1) {
                                jVar2.mo46b((Exception) arrayList2.get(0));
                            } else {
                                jVar2.mo46b((Exception) new C0001a(C2240a.m6772a("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List<? extends Throwable>) arrayList2));
                            }
                        } else if (atomicBoolean2.get()) {
                            jVar2.mo45b();
                        } else {
                            jVar2.mo47b(null);
                        }
                    }
                    return null;
                }
            };
            iVar.mo19a((C0011g<TResult, TContinuationResult>) r0);
        }
        return jVar.f77a;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27b(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f32e
            monitor-enter(r0)
            boolean r1 = r3.f33f     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f33f = r1     // Catch:{ all -> 0x002c }
            r3.f36i = r4     // Catch:{ all -> 0x002c }
            r3.f37j = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f32e     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m26j()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f37j     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            a.i$a r4 = m11a()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            a.k r4 = new a.k     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f38k = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a.C0013i.mo27b(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo28b(TResult tresult) {
        synchronized (this.f32e) {
            if (this.f33f) {
                return false;
            }
            this.f33f = true;
            this.f35h = tresult;
            this.f32e.notifyAll();
            m26j();
            return true;
        }
    }

    /* renamed from: c */
    public final <TContinuationResult> C0013i<TContinuationResult> mo30c(C0011g<TResult, TContinuationResult> gVar, Executor executor) {
        return m24c(gVar, executor, null);
    }

    /* renamed from: b */
    public final <TContinuationResult> C0013i<TContinuationResult> mo24b(C0011g<TResult, C0013i<TContinuationResult>> gVar, Executor executor) {
        return mo25b(gVar, executor, null);
    }

    /* renamed from: a */
    public static <TResult> C0013i<TResult> m17a(Callable<TResult> callable, C0008d dVar) {
        return m19a(callable, (Executor) f24a, dVar);
    }

    /* renamed from: a */
    public static <TResult> C0013i<TResult> m18a(Callable<TResult> callable, Executor executor) {
        return m19a(callable, executor, (C0008d) null);
    }

    /* renamed from: c */
    private <TContinuationResult> C0013i<TContinuationResult> m24c(final C0011g<TResult, TContinuationResult> gVar, Executor executor, C0008d dVar) {
        return mo24b(new C0011g<TResult, C0013i<TContinuationResult>>(null) {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (null != null && null.mo8a()) {
                    return C0013i.m25h();
                }
                if (iVar.mo33d()) {
                    return C0013i.m13a(iVar.mo35f());
                }
                if (iVar.mo31c()) {
                    return C0013i.m25h();
                }
                return iVar.mo19a(gVar);
            }
        }, executor);
    }

    /* renamed from: b */
    public final <TContinuationResult> C0013i<TContinuationResult> mo25b(C0011g<TResult, C0013i<TContinuationResult>> gVar, Executor executor, C0008d dVar) {
        boolean b;
        C0027j jVar = new C0027j();
        synchronized (this.f32e) {
            b = mo26b();
            if (!b) {
                List<C0011g<TResult, Void>> list = this.f39l;
                final C0027j jVar2 = jVar;
                final C0011g<TResult, C0013i<TContinuationResult>> gVar2 = gVar;
                final Executor executor2 = executor;
                final C0008d dVar2 = dVar;
                C00183 r0 = new C0011g<TResult, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C0013i<TResult> iVar) {
                        C0013i.m23b(jVar2, gVar2, iVar, executor2, dVar2);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b) {
            m23b(jVar, gVar, this, executor, dVar);
        }
        return jVar.f77a;
    }

    /* renamed from: a */
    private static <TResult> C0013i<TResult> m19a(final Callable<TResult> callable, Executor executor, final C0008d dVar) {
        final C0027j jVar = new C0027j();
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo8a()) {
                        try {
                            jVar.mo47b(callable.call());
                        } catch (CancellationException unused) {
                            jVar.mo45b();
                        } catch (Exception e) {
                            jVar.mo46b(e);
                        }
                    } else {
                        jVar.mo45b();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo46b((Exception) new C0012h(e));
        }
        return jVar.f77a;
    }

    /* renamed from: b */
    public static <TContinuationResult, TResult> void m23b(final C0027j<TContinuationResult> jVar, final C0011g<TResult, C0013i<TContinuationResult>> gVar, final C0013i<TResult> iVar, Executor executor, final C0008d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo8a()) {
                        try {
                            C0013i iVar = (C0013i) gVar.then(iVar);
                            if (iVar == null) {
                                jVar.mo47b(null);
                            } else {
                                iVar.mo19a((C0011g<TResult, TContinuationResult>) new C0011g<TContinuationResult, Void>() {
                                    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                                        if (dVar != null && dVar.mo8a()) {
                                            jVar.mo45b();
                                        } else if (iVar.mo31c()) {
                                            jVar.mo45b();
                                        } else if (iVar.mo33d()) {
                                            jVar.mo46b(iVar.mo35f());
                                        } else {
                                            jVar.mo47b(iVar.mo34e());
                                        }
                                        return null;
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            jVar.mo45b();
                        } catch (Exception e) {
                            jVar.mo46b(e);
                        }
                    } else {
                        jVar.mo45b();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo46b((Exception) new C0012h(e));
        }
    }

    /* renamed from: a */
    public static <TContinuationResult, TResult> void m20a(final C0027j<TContinuationResult> jVar, final C0011g<TResult, TContinuationResult> gVar, final C0013i<TResult> iVar, Executor executor, final C0008d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo8a()) {
                        try {
                            jVar.mo47b(gVar.then(iVar));
                        } catch (CancellationException unused) {
                            jVar.mo45b();
                        } catch (Exception e) {
                            jVar.mo46b(e);
                        }
                    } else {
                        jVar.mo45b();
                    }
                }
            });
        } catch (Exception e) {
            jVar.mo46b((Exception) new C0012h(e));
        }
    }
}
