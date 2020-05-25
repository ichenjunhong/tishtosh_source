package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C16299uq
public final class afp {
    /* renamed from: a */
    public static <V> void m32827a(aga<V> aga, afm<? super V> afm, Executor executor) {
        aga.mo28797a(new afq(afm, aga), executor);
    }

    /* renamed from: a */
    public static <A, B> aga<B> m32823a(aga<A> aga, afl<A, B> afl, Executor executor) {
        agl agl = new agl();
        aga.mo28797a(new afr(agl, afl, aga), executor);
        m32829a((aga<A>) agl, (Future<B>) aga);
        return agl;
    }

    /* renamed from: a */
    public static <A, B> aga<B> m32822a(aga<A> aga, afk<? super A, ? extends B> afk, Executor executor) {
        agl agl = new agl();
        aga.mo28797a(new afs(agl, afk, aga), executor);
        m32829a((aga<A>) agl, (Future<B>) aga);
        return agl;
    }

    /* renamed from: a */
    public static <V> aga<V> m32821a(aga<V> aga, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        agl agl = new agl();
        m32829a((aga<A>) agl, (Future<B>) aga);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new aft(agl), j, timeUnit);
        m32828a(aga, agl);
        agl.mo28797a(new afu(schedule), agf.f40431b);
        return agl;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> aga<V> m32824a(aga<? extends V> aga, Class<X> cls, afk<? super X, ? extends V> afk, Executor executor) {
        agl agl = new agl();
        m32829a((aga<A>) agl, (Future<B>) aga);
        afv afv = new afv(agl, aga, cls, afk, executor);
        aga.mo28797a(afv, agf.f40431b);
        return agl;
    }

    /* renamed from: a */
    public static <T> T m32825a(Future<T> future, T t) {
        try {
            return future.get(((Long) caf.m37099d().mo30717a(C15740bx.f44306bn)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            future.cancel(true);
            abv.m32795c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C14963ax.m30834d().mo28591b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            abv.m32793b("Error waiting for future.", e2);
            C14963ax.m30834d().mo28591b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m32826a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            future.cancel(true);
            abv.m32795c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C14963ax.m30834d().mo28591b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            future.cancel(true);
            abv.m32793b("Error waiting for future.", e2);
            C14963ax.m30834d().mo28591b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> afz<T> m32820a(T t) {
        return new afz<>(t);
    }

    /* renamed from: a */
    static <V> void m32828a(aga<? extends V> aga, agl<V> agl) {
        m32829a((aga<A>) agl, (Future<B>) aga);
        aga.mo28797a(new afw(agl, aga), agf.f40431b);
    }

    /* renamed from: a */
    private static <A, B> void m32829a(aga<A> aga, Future<B> future) {
        aga.mo28797a(new afx(aga, future), agf.f40431b);
    }
}
