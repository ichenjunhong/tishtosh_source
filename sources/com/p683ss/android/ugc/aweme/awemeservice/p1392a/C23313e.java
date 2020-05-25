package com.p683ss.android.ugc.aweme.awemeservice.p1392a;

import android.os.Looper;
import com.google.p1057b.p1059b.C17522m;
import com.google.p1057b.p1059b.C17523n;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.e */
final /* synthetic */ class C23313e implements C17522m {

    /* renamed from: a */
    private final C23311d f62311a;

    C23313e(C23311d dVar) {
        this.f62311a = dVar;
    }

    /* renamed from: a */
    public final void mo33783a(C17523n nVar) {
        C23311d dVar = this.f62311a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C0013i.m16a((Callable<TResult>) new Callable<Object>(nVar) {

                /* renamed from: a */
                final /* synthetic */ C17523n f62309a;

                public final Object call() throws Exception {
                    C23311d.this.mo48356a((String) this.f62309a.getKey(), (Aweme) this.f62309a.getValue());
                    return null;
                }

                {
                    this.f62309a = r2;
                }
            });
        } else {
            dVar.mo48356a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }
}
