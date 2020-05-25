package android.support.p043v7.p048c.p049a;

import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.p051e.C1216d;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.c.a.b */
public final class C1199b<T> {

    /* renamed from: g */
    private static final Executor f3974g = new C1203a();

    /* renamed from: a */
    final C1216d f3975a;

    /* renamed from: b */
    final C1197a<T> f3976b;

    /* renamed from: c */
    final Executor f3977c;

    /* renamed from: d */
    List<T> f3978d;

    /* renamed from: e */
    public List<T> f3979e = Collections.emptyList();

    /* renamed from: f */
    int f3980f;

    /* renamed from: android.support.v7.c.a.b$a */
    static class C1203a implements Executor {

        /* renamed from: a */
        final Handler f3988a = new Handler(Looper.getMainLooper());

        C1203a() {
        }

        public final void execute(Runnable runnable) {
            this.f3988a.post(runnable);
        }
    }

    public C1199b(C1216d dVar, C1197a<T> aVar) {
        this.f3975a = dVar;
        this.f3976b = aVar;
        if (aVar.f3966a != null) {
            this.f3977c = aVar.f3966a;
        } else {
            this.f3977c = f3974g;
        }
    }
}
