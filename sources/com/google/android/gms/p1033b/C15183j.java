package com.google.android.gms.p1033b;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.b.j */
public final class C15183j {

    /* renamed from: com.google.android.gms.b.j$a */
    public static final class C15184a implements C15185b {

        /* renamed from: a */
        public final CountDownLatch f39206a;

        private C15184a() {
            this.f39206a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo27989a(Object obj) {
            this.f39206a.countDown();
        }

        /* renamed from: a */
        public final void mo27988a(Exception exc) {
            this.f39206a.countDown();
        }

        /* renamed from: a */
        public final void mo27987a() {
            this.f39206a.countDown();
        }

        public /* synthetic */ C15184a(C15173aa aaVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.b.j$b */
    interface C15185b extends C15174b, C15176d, C15177e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C15179g<TResult> m31395a(TResult tresult) {
        C15201z zVar = new C15201z();
        zVar.mo28019a(tresult);
        return zVar;
    }

    /* renamed from: a */
    public static <TResult> C15179g<TResult> m31394a(Exception exc) {
        C15201z zVar = new C15201z();
        zVar.mo28018a(exc);
        return zVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m31397a(C15179g<TResult> gVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C15464q.m32127a();
        C15464q.m32124a(gVar, (Object) "Task must not be null");
        C15464q.m32124a(timeUnit, (Object) "TimeUnit must not be null");
        if (gVar.mo27998a()) {
            return m31396a(gVar);
        }
        C15184a aVar = new C15184a(null);
        m31398a(gVar, aVar);
        if (aVar.f39206a.await(j, timeUnit)) {
            return m31396a(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    public static <TResult> TResult m31396a(C15179g<TResult> gVar) throws ExecutionException {
        if (gVar.mo28000b()) {
            return gVar.mo28002d();
        }
        if (gVar.mo28001c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo28003e());
    }

    /* renamed from: a */
    public static void m31398a(C15179g<?> gVar, C15185b bVar) {
        gVar.mo27996a(C15181i.f39204b, (C15177e<? super TResult>) bVar);
        gVar.mo27995a(C15181i.f39204b, (C15176d) bVar);
        gVar.mo27993a(C15181i.f39204b, (C15174b) bVar);
    }
}
