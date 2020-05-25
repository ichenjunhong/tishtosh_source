package com.google.android.gms.p1033b;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.g */
public abstract class C15179g<TResult> {
    /* renamed from: a */
    public abstract C15179g<TResult> mo27995a(Executor executor, C15176d dVar);

    /* renamed from: a */
    public abstract C15179g<TResult> mo27996a(Executor executor, C15177e<? super TResult> eVar);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo27997a(Class<X> cls) throws Throwable;

    /* renamed from: a */
    public abstract boolean mo27998a();

    /* renamed from: b */
    public abstract boolean mo28000b();

    /* renamed from: c */
    public abstract boolean mo28001c();

    /* renamed from: d */
    public abstract TResult mo28002d();

    /* renamed from: e */
    public abstract Exception mo28003e();

    /* renamed from: a */
    public C15179g<TResult> mo27991a(C15175c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public C15179g<TResult> mo27994a(Executor executor, C15175c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public C15179g<TResult> mo27993a(Executor executor, C15174b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C15179g<TContinuationResult> mo27990a(C15172a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C15179g<TContinuationResult> mo27992a(Executor executor, C15172a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> C15179g<TContinuationResult> mo27999b(Executor executor, C15172a<TResult, C15179g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
