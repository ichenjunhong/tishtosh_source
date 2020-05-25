package com.p683ss.android.ugc.aweme.network;

import android.app.Application;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.C13295c;
import com.bytedance.ttnet.p884b.C13287a;
import com.p683ss.android.ugc.aweme.net.p1990c.C37750a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.network.a */
public final class C37819a {

    /* renamed from: a */
    public final Application f96285a;

    /* renamed from: b */
    public final C13295c f96286b;

    /* renamed from: c */
    public final C13287a f96287c;

    /* renamed from: d */
    public final int f96288d;

    /* renamed from: e */
    public final String f96289e;

    /* renamed from: f */
    public final String f96290f;

    /* renamed from: g */
    public final Executor f96291g;

    /* renamed from: h */
    public final String f96292h;

    /* renamed from: i */
    public final boolean f96293i;

    /* renamed from: j */
    public final List<C12727a> f96294j;

    /* renamed from: k */
    public final C37750a f96295k;

    /* renamed from: l */
    public final C37835d<String> f96296l;

    /* renamed from: m */
    public final C37835d<Boolean> f96297m;

    /* renamed from: n */
    public final C37835d<Integer> f96298n;

    /* renamed from: o */
    public final C37835d<Integer> f96299o;

    /* renamed from: p */
    public final C37835d<Boolean> f96300p;

    /* renamed from: q */
    public final C37835d<Integer> f96301q;

    /* renamed from: com.ss.android.ugc.aweme.network.a$a */
    public static final class C37820a implements C37835d<Integer> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96302a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (Integer) this.f96302a.f96321m.invoke();
        }

        C37820a(C37826b bVar) {
            this.f96302a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$b */
    public static final class C37821b implements C37835d<String> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96303a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (String) this.f96303a.f96318j.invoke();
        }

        C37821b(C37826b bVar) {
            this.f96303a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$c */
    public static final class C37822c implements C37835d<Integer> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96304a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (Integer) this.f96304a.f96323o.invoke();
        }

        C37822c(C37826b bVar) {
            this.f96304a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$d */
    public static final class C37823d implements C37835d<Integer> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96305a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (Integer) this.f96305a.f96320l.invoke();
        }

        C37823d(C37826b bVar) {
            this.f96305a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$e */
    public static final class C37824e implements C37835d<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96306a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (Boolean) this.f96306a.f96319k.invoke();
        }

        C37824e(C37826b bVar) {
            this.f96306a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.a$f */
    public static final class C37825f implements C37835d<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37826b f96307a;

        /* renamed from: a */
        public final /* synthetic */ Object mo77272a() {
            return (Boolean) this.f96307a.f96322n.invoke();
        }

        C37825f(C37826b bVar) {
            this.f96307a = bVar;
        }
    }

    public C37819a(C37826b bVar) {
        C52711k.m112240b(bVar, "builder");
        this.f96285a = bVar.f96325q;
        this.f96286b = bVar.f96309a;
        this.f96287c = bVar.f96310b;
        this.f96288d = bVar.f96311c;
        this.f96289e = bVar.f96312d;
        this.f96290f = bVar.f96313e;
        Executor executor = bVar.f96314f;
        if (executor == null) {
            ExecutorService executorService = C0013i.f24a;
            C52711k.m112236a((Object) executorService, "Task.BACKGROUND_EXECUTOR");
            executor = executorService;
        }
        this.f96291g = executor;
        this.f96292h = bVar.f96315g;
        this.f96293i = bVar.f96316h;
        this.f96294j = bVar.f96317i;
        this.f96295k = bVar.f96324p;
        this.f96296l = new C37821b(bVar);
        this.f96297m = new C37824e(bVar);
        this.f96298n = new C37823d(bVar);
        this.f96299o = new C37820a(bVar);
        this.f96300p = new C37825f(bVar);
        this.f96301q = new C37822c(bVar);
    }
}
