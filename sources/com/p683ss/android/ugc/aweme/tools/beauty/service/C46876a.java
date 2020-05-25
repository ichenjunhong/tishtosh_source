package com.p683ss.android.ugc.aweme.tools.beauty.service;

import android.app.Application;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46867g.C46868a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c.C46895a;
import com.p683ss.android.ugc.aweme.utils.C47861es;
import java.util.List;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a */
public final class C46876a implements C46894c {

    /* renamed from: c */
    public static final C46880b f118422c = new C46880b(null);

    /* renamed from: a */
    public String f118423a = this.f118426e;

    /* renamed from: b */
    public final C46897e f118424b;

    /* renamed from: d */
    private boolean f118425d;

    /* renamed from: e */
    private final String f118426e;

    /* renamed from: f */
    private final C46867g f118427f;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$a */
    public static final class C46877a {

        /* renamed from: a */
        public C46897e f118428a;

        /* renamed from: b */
        public String f118429b = "default";

        /* renamed from: c */
        public BeautyFilterConfig f118430c;

        /* renamed from: d */
        public C17971f f118431d;

        /* renamed from: e */
        public C52670a<? extends C29252f> f118432e = C46879b.f118434a;

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$a$a */
        public static final class C46878a extends C52712l implements C52670a<C29252f> {

            /* renamed from: a */
            final /* synthetic */ C46877a f118433a;

            public C46878a(C46877a aVar) {
                this.f118433a = aVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return (C29252f) this.f118433a.f118432e.invoke();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$a$b */
        static final class C46879b extends C52712l implements C52670a<C29252f> {

            /* renamed from: a */
            public static final C46879b f118434a = new C46879b();

            C46879b() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                return C29242c.m68869a(b, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a$b */
    public static final class C46880b {
        private C46880b() {
        }

        public /* synthetic */ C46880b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo94156b() {
        return this.f118423a;
    }

    /* renamed from: f */
    public final C46867g mo94160f() {
        return this.f118427f;
    }

    /* renamed from: a */
    public final boolean mo94155a() {
        return this.f118425d;
    }

    /* renamed from: c */
    public final void mo94157c() {
        mo94160f().mo94109h();
    }

    /* renamed from: d */
    public final C47861es<List<ComposerInfo>> mo94158d() {
        if (!mo94155a()) {
            return new C47861es<>();
        }
        return mo94160f().mo94098c();
    }

    /* renamed from: e */
    public final C47861es<List<ComposerInfo>> mo94159e() {
        if (!mo94155a()) {
            return new C47861es<>();
        }
        return mo94160f().mo94111j();
    }

    /* renamed from: a */
    public final void mo94153a(boolean z) {
        this.f118425d = z;
    }

    /* renamed from: a */
    public final void mo94152a(String str, C46895a aVar) {
        C52711k.m112240b(str, "panel");
        mo94160f().mo94090a(str, aVar);
    }

    /* renamed from: a */
    public final void mo94154a(boolean z, C46814a aVar) {
        C52711k.m112240b(aVar, "gender");
        if (mo94155a()) {
            if (this.f118424b.mo94127b() >= 3) {
                aVar = C46814a.FEMALE;
            }
            if (aVar != C46814a.CUR) {
                mo94160f().mo94092a(z, aVar);
            } else {
                C46868a.m101785a(mo94160f(), z, null, 2, null);
            }
        }
    }

    public C46876a(String str, C46867g gVar, C46897e eVar) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(gVar, "beautySource");
        C52711k.m112240b(eVar, "beautyPersistenceManager");
        this.f118426e = str;
        this.f118427f = gVar;
        this.f118424b = eVar;
    }
}
