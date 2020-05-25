package com.p683ss.android.ugc.aweme.network;

import android.app.Application;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.C13295c;
import com.bytedance.ttnet.p884b.C13287a;
import com.p683ss.android.ugc.aweme.net.p1990c.C37750a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.network.b */
public final class C37826b {

    /* renamed from: r */
    public static final C37827a f96308r = new C37827a(null);

    /* renamed from: a */
    public C13295c f96309a;

    /* renamed from: b */
    public C13287a f96310b;

    /* renamed from: c */
    public int f96311c;

    /* renamed from: d */
    public String f96312d;

    /* renamed from: e */
    public String f96313e;

    /* renamed from: f */
    public Executor f96314f;

    /* renamed from: g */
    public String f96315g;

    /* renamed from: h */
    public boolean f96316h;

    /* renamed from: i */
    public List<C12727a> f96317i = new ArrayList();

    /* renamed from: j */
    public C52670a<String> f96318j = C37829c.f96327a;

    /* renamed from: k */
    public C52670a<Boolean> f96319k = C37832f.f96330a;

    /* renamed from: l */
    public C52670a<Integer> f96320l = C37831e.f96329a;

    /* renamed from: m */
    public C52670a<Integer> f96321m = C37828b.f96326a;

    /* renamed from: n */
    public C52670a<Boolean> f96322n = C37833g.f96331a;

    /* renamed from: o */
    public C52670a<Integer> f96323o = C37830d.f96328a;

    /* renamed from: p */
    public C37750a f96324p;

    /* renamed from: q */
    public final Application f96325q;

    /* renamed from: com.ss.android.ugc.aweme.network.b$a */
    public static final class C37827a {
        private C37827a() {
        }

        public /* synthetic */ C37827a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$b */
    static final class C37828b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37828b f96326a = new C37828b();

        C37828b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$c */
    static final class C37829c extends C52712l implements C52670a {

        /* renamed from: a */
        public static final C37829c f96327a = new C37829c();

        C37829c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$d */
    static final class C37830d extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37830d f96328a = new C37830d();

        C37830d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(-1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$e */
    static final class C37831e extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37831e f96329a = new C37831e();

        C37831e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$f */
    static final class C37832f extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C37832f f96330a = new C37832f();

        C37832f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.network.b$g */
    static final class C37833g extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C37833g f96331a = new C37833g();

        C37833g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public final C37826b mo77273a(C12727a aVar) {
        C52711k.m112240b(aVar, "interceptor");
        C37826b bVar = this;
        bVar.f96317i.add(aVar);
        return bVar;
    }

    public C37826b(Application application) {
        C52711k.m112240b(application, "application");
        this.f96325q = application;
    }
}
