package com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a;

import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1210a;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.p051e.C1216d;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.a */
public final class C33249a<T> {

    /* renamed from: a */
    public final Executor f86260a;

    /* renamed from: b */
    public int f86261b;

    /* renamed from: c */
    List<? extends T> f86262c;

    /* renamed from: d */
    final C33264h f86263d;

    /* renamed from: e */
    public final C33258d<T> f86264e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.a$a */
    public static final class C33250a implements Executor {

        /* renamed from: a */
        private final Handler f86265a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f86265a.post(runnable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.a$b */
    static final class C33251b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33249a f86266a;

        /* renamed from: b */
        final /* synthetic */ List f86267b;

        /* renamed from: c */
        final /* synthetic */ List f86268c;

        /* renamed from: d */
        final /* synthetic */ int f86269d;

        /* renamed from: e */
        final /* synthetic */ C52670a f86270e;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.a.a$b$a */
        public static final class C33253a extends C1210a {

            /* renamed from: a */
            final /* synthetic */ C33251b f86273a;

            /* renamed from: a */
            public final int mo159a() {
                return this.f86273a.f86267b.size();
            }

            /* renamed from: b */
            public final int mo161b() {
                return this.f86273a.f86268c.size();
            }

            C33253a(C33251b bVar) {
                this.f86273a = bVar;
            }

            /* renamed from: a */
            public final Object mo160a(int i, int i2) {
                Object obj = this.f86273a.f86267b.get(i);
                Object obj2 = this.f86273a.f86268c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f86273a.f86266a.f86264e.f86276a.mo3934c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public final boolean mo162b(int i, int i2) {
                Object obj = this.f86273a.f86267b.get(i);
                Object obj2 = this.f86273a.f86268c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f86273a.f86266a.f86264e.f86276a.mo3932a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public final boolean mo163c(int i, int i2) {
                Object obj = this.f86273a.f86267b.get(i);
                Object obj2 = this.f86273a.f86268c.get(i2);
                if (obj != null && obj2 != null) {
                    return this.f86273a.f86266a.f86264e.f86276a.mo3933b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
        }

        C33251b(C33249a aVar, List list, List list2, int i, C52670a aVar2) {
            this.f86266a = aVar;
            this.f86267b = list;
            this.f86268c = list2;
            this.f86269d = i;
            this.f86270e = aVar2;
        }

        public final void run() {
            final C1211b a = C1208c.m3654a(new C33253a(this));
            C52711k.m112236a((Object) a, "DiffUtil.calculateDiff(o…                       })");
            this.f86266a.f86260a.execute(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C33251b f86271a;

                {
                    this.f86271a = r1;
                }

                public final void run() {
                    if (this.f86271a.f86266a.f86261b == this.f86271a.f86269d) {
                        C33249a aVar = this.f86271a.f86266a;
                        List<? extends T> list = this.f86271a.f86268c;
                        C1211b bVar = a;
                        aVar.f86262c = list;
                        bVar.mo3930a((C1216d) aVar.f86263d);
                    }
                    C52670a aVar2 = this.f86271a.f86270e;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            });
        }
    }

    public C33249a(C33264h hVar, C33258d<T> dVar) {
        C52711k.m112240b(hVar, "mUpdateCallback");
        C52711k.m112240b(dVar, "mConfig");
        this.f86263d = hVar;
        this.f86264e = dVar;
        Executor executor = this.f86264e.f86278c;
        if (executor == null) {
            executor = new C33250a();
        }
        this.f86260a = executor;
    }
}
