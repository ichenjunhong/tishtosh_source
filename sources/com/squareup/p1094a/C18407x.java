package com.squareup.p1094a;

import com.squareup.p1094a.C18396v.C18403e;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.a.x */
final class C18407x extends ThreadPoolExecutor {

    /* renamed from: com.squareup.a.x$a */
    static final class C18408a extends FutureTask<C18362c> implements Comparable<C18408a> {

        /* renamed from: a */
        private final C18362c f50837a;

        public C18408a(C18362c cVar) {
            super(cVar, null);
            this.f50837a = cVar;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            C18408a aVar = (C18408a) obj;
            C18403e eVar = this.f50837a.f50727s;
            C18403e eVar2 = aVar.f50837a.f50727s;
            if (eVar == eVar2) {
                return this.f50837a.f50709a - aVar.f50837a.f50709a;
            }
            return eVar2.ordinal() - eVar.ordinal();
        }
    }

    C18407x() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C18360c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36866a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        C18408a aVar = new C18408a((C18362c) runnable);
        execute(aVar);
        return aVar;
    }
}
