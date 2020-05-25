package com.google.p1057b.p1065h.p1066a;

import com.google.p1057b.p1058a.C17421k;
import java.lang.Throwable;
import java.util.concurrent.Future;

/* renamed from: com.google.b.h.a.a */
abstract class C17801a<V, X extends Throwable, F, T> extends C17813h<V> implements Runnable {

    /* renamed from: a */
    C17832m<? extends V> f49547a;

    /* renamed from: b */
    Class<X> f49548b;

    /* renamed from: c */
    F f49549c;

    /* renamed from: com.google.b.h.a.a$a */
    static final class C17802a<V, X extends Throwable> extends C17801a<V, X, C17819d<? super X, ? extends V>, C17832m<? extends V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo34618a(Object obj) {
            mo34622a((C17832m) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo34616a(Object obj, Throwable th) throws Exception {
            C17832m a = ((C17819d) obj).mo34644a(th);
            C17421k.m42654a(a, (Object) "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a;
        }

        C17802a(C17832m<? extends V> mVar, Class<X> cls, C17819d<? super X, ? extends V> dVar) {
            super(mVar, cls, dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo34616a(F f, X x) throws Exception;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34618a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34619b() {
        mo34621a((Future<?>) this.f49547a);
        this.f49547a = null;
        this.f49548b = null;
        this.f49549c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo34617a() {
        C17832m<? extends V> mVar = this.f49547a;
        Class<X> cls = this.f49548b;
        F f = this.f49549c;
        String a = super.mo34617a();
        String str = "";
        if (mVar != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(mVar);
            sb.append("], ");
            str = sb.toString();
        }
        if (cls != null && f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(cls);
            sb2.append("], fallback=[");
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

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.b.h.a.m<? extends V> r0 = r7.f49547a
            java.lang.Class<X> r1 = r7.f49548b
            F r2 = r7.f49549c
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            r3 = 1
        L_0x0016:
            r3 = r3 | r5
            boolean r4 = r7.isCancelled()
            r3 = r3 | r4
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            r3 = 0
            r7.f49547a = r3
            java.lang.Object r0 = com.google.p1057b.p1065h.p1066a.C17825i.m43738a(r0)     // Catch:{ ExecutionException -> 0x002b, Throwable -> 0x0029 }
            r4 = r0
            r0 = r3
            goto L_0x0037
        L_0x0029:
            r0 = move-exception
            goto L_0x0036
        L_0x002b:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Object r0 = com.google.p1057b.p1058a.C17421k.m42653a(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0036:
            r4 = r3
        L_0x0037:
            if (r0 != 0) goto L_0x003d
            r7.mo34624b(r4)
            return
        L_0x003d:
            boolean r1 = r1.isInstance(r0)
            if (r1 != 0) goto L_0x0047
            r7.mo34623a(r0)
            return
        L_0x0047:
            java.lang.Object r0 = r7.mo34616a(r2, r0)     // Catch:{ Throwable -> 0x0055 }
            r7.f49548b = r3
            r7.f49549c = r3
            r7.mo34618a(r0)
            return
        L_0x0053:
            r0 = move-exception
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            r7.mo34623a(r0)     // Catch:{ all -> 0x0053 }
            r7.f49548b = r3
            r7.f49549c = r3
            return
        L_0x005e:
            r7.f49548b = r3
            r7.f49549c = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1065h.p1066a.C17801a.run():void");
    }

    C17801a(C17832m<? extends V> mVar, Class<X> cls, F f) {
        this.f49547a = (C17832m) C17421k.m42653a(mVar);
        this.f49548b = (Class) C17421k.m42653a(cls);
        this.f49549c = C17421k.m42653a(f);
    }
}
