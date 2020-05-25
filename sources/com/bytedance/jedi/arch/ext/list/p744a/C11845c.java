package com.bytedance.jedi.arch.ext.list.p744a;

import android.support.p043v7.p051e.C1208c.C1212c;
import com.bytedance.jedi.arch.C11867g;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.c */
public final class C11845c<T> {

    /* renamed from: a */
    public final Executor f31428a;

    /* renamed from: b */
    public final C1212c<T> f31429b;

    /* renamed from: c */
    public final Executor f31430c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.c$a */
    public static final class C11846a<T> {

        /* renamed from: a */
        Executor f31431a;

        /* renamed from: b */
        private final C1212c<T> f31432b;

        /* renamed from: a */
        public final C11845c<T> mo22598a() {
            return new C11845c<>(this.f31432b, this.f31431a, null);
        }

        public C11846a(C1212c<T> cVar) {
            C52711k.m112240b(cVar, "mDiffCallback");
            this.f31432b = cVar;
        }
    }

    private C11845c(C1212c<T> cVar, Executor executor) {
        this.f31429b = cVar;
        this.f31430c = executor;
        this.f31428a = (Executor) C11867g.m24219c().invoke();
    }

    public /* synthetic */ C11845c(C1212c cVar, Executor executor, C52707g gVar) {
        this(cVar, executor);
    }
}
