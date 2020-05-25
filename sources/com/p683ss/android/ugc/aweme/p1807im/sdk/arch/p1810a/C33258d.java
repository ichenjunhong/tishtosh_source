package com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a;

import android.support.p043v7.p051e.C1208c.C1212c;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.d */
public final class C33258d<T> {

    /* renamed from: a */
    public final C1212c<T> f86276a;

    /* renamed from: b */
    public final Executor f86277b;

    /* renamed from: c */
    public final Executor f86278c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.d$a */
    public static final class C33259a<T> {

        /* renamed from: c */
        public static final C33260a f86279c = new C33260a(null);

        /* renamed from: e */
        private static final Object f86280e = new Object();

        /* renamed from: f */
        private static Executor f86281f;

        /* renamed from: a */
        Executor f86282a;

        /* renamed from: b */
        Executor f86283b;

        /* renamed from: d */
        private final C1212c<T> f86284d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.d$a$a */
        public static final class C33260a {
            private C33260a() {
            }

            public /* synthetic */ C33260a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: a */
        public final C33258d<T> mo70607a() {
            if (this.f86283b == null) {
                synchronized (f86280e) {
                    if (f86281f == null) {
                        f86281f = C33261e.m76375a(2);
                    }
                }
                this.f86283b = f86281f;
            }
            C1212c<T> cVar = this.f86284d;
            Executor executor = this.f86283b;
            if (executor == null) {
                C52711k.m112234a();
            }
            return new C33258d<>(cVar, executor, this.f86282a, null);
        }

        public C33259a(C1212c<T> cVar) {
            C52711k.m112240b(cVar, "mDiffCallback");
            this.f86284d = cVar;
        }
    }

    private C33258d(C1212c<T> cVar, Executor executor, Executor executor2) {
        this.f86276a = cVar;
        this.f86277b = executor;
        this.f86278c = executor2;
    }

    public /* synthetic */ C33258d(C1212c cVar, Executor executor, Executor executor2, C52707g gVar) {
        this(cVar, executor, executor2);
    }
}
