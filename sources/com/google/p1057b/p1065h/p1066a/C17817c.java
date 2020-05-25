package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17421k;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.b.h.a.c */
abstract class C17817c<I, O, F, T> extends C17813h<O> implements Runnable {

    /* renamed from: a */
    C17832m<? extends I> f49583a;

    /* renamed from: b */
    F f49584b;

    /* renamed from: com.google.b.h.a.c$a */
    public static final class C17818a<I, O> extends C17817c<I, O, C17410f<? super I, ? extends O>, O> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo34618a(O o) {
            mo34624b(o);
        }

        public C17818a(C17832m<? extends I> mVar, C17410f<? super I, ? extends O> fVar) {
            super(mVar, fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo34642a(Object obj, Object obj2) throws Exception {
            return ((C17410f) obj).mo33734a(obj2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo34642a(F f, I i) throws Exception;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34618a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34619b() {
        mo34621a((Future<?>) this.f49583a);
        this.f49583a = null;
        this.f49584b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo34617a() {
        C17832m<? extends I> mVar = this.f49583a;
        F f = this.f49584b;
        String a = super.mo34617a();
        String str = "";
        if (mVar != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(mVar);
            sb.append("], ");
            str = sb.toString();
        }
        if (f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        } else if (a == null) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(a);
            return sb3.toString();
        }
    }

    public final void run() {
        boolean z;
        C17832m<? extends I> mVar = this.f49583a;
        F f = this.f49584b;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (mVar == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f != null) {
            z2 = false;
        }
        if (!z3 && !z2) {
            this.f49583a = null;
            try {
                try {
                    Object a = mo34642a(f, C17825i.m43738a((Future<V>) mVar));
                    this.f49584b = null;
                    mo34618a(a);
                } catch (UndeclaredThrowableException e) {
                    mo34623a(e.getCause());
                    this.f49584b = null;
                } catch (Throwable th) {
                    this.f49584b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo34623a(e2.getCause());
            } catch (RuntimeException e3) {
                mo34623a((Throwable) e3);
            } catch (Error e4) {
                mo34623a((Throwable) e4);
            }
        }
    }

    C17817c(C17832m<? extends I> mVar, F f) {
        this.f49583a = (C17832m) C17421k.m42653a(mVar);
        this.f49584b = C17421k.m42653a(f);
    }
}
