package com.bytedance.ies.ugc.p694a;

import android.app.Application;
import com.bytedance.ies.ugc.p694a.C11016e.C11019c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.a.d */
public final class C11014d {

    /* renamed from: m */
    public static final C11015a f29581m = new C11015a(null);

    /* renamed from: a */
    public Application f29582a;

    /* renamed from: b */
    public boolean f29583b;

    /* renamed from: c */
    public C11019c f29584c;

    /* renamed from: d */
    public String f29585d;

    /* renamed from: e */
    public Integer f29586e;

    /* renamed from: f */
    public String f29587f;

    /* renamed from: g */
    public String f29588g;

    /* renamed from: h */
    public String f29589h;

    /* renamed from: i */
    public long f29590i;

    /* renamed from: j */
    public String f29591j;

    /* renamed from: k */
    public int f29592k;

    /* renamed from: l */
    public int f29593l;

    /* renamed from: com.bytedance.ies.ugc.a.d$a */
    public static final class C11015a {
        private C11015a() {
        }

        public /* synthetic */ C11015a(C52707g gVar) {
            this();
        }
    }

    private C11014d() {
        this.f29590i = -1;
        this.f29592k = -1;
    }

    /* renamed from: a */
    public final Application mo19903a() {
        Application application = this.f29582a;
        if (application == null) {
            C52711k.m112237a("context");
        }
        return application;
    }

    public C11014d(Application application, C52671b<? super C11014d, C52860x> bVar) {
        C52711k.m112240b(application, "context");
        C52711k.m112240b(bVar, "init");
        this();
        this.f29582a = application;
        bVar.invoke(this);
    }
}
