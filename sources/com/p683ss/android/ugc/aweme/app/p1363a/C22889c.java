package com.p683ss.android.ugc.aweme.app.p1363a;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C22545ai;
import com.p683ss.android.ugc.aweme.C23342b;
import com.p683ss.android.ugc.aweme.app.services.C23140a;
import com.p683ss.android.ugc.aweme.app.services.C23145aa;
import com.p683ss.android.ugc.aweme.app.services.C23149ae;
import com.p683ss.android.ugc.aweme.app.services.C23151ag;
import com.p683ss.android.ugc.aweme.app.services.C23152ah;
import com.p683ss.android.ugc.aweme.app.services.C23154c;
import com.p683ss.android.ugc.aweme.app.services.C23155d;
import com.p683ss.android.ugc.aweme.app.services.C23156e;
import com.p683ss.android.ugc.aweme.app.services.C23157f;
import com.p683ss.android.ugc.aweme.app.services.C23161i;
import com.p683ss.android.ugc.aweme.app.services.C23167m;
import com.p683ss.android.ugc.aweme.app.services.C23169o;
import com.p683ss.android.ugc.aweme.app.services.C23171q;
import com.p683ss.android.ugc.aweme.app.services.C23173s;
import com.p683ss.android.ugc.aweme.app.services.C23176v;
import com.p683ss.android.ugc.aweme.app.services.C23177w;
import com.p683ss.android.ugc.aweme.app.services.C23180z;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p683ss.android.ugc.aweme.main.service.C36679a;
import com.p683ss.android.ugc.aweme.main.service.C36681c;
import com.p683ss.android.ugc.aweme.main.service.C36683e;
import com.p683ss.android.ugc.aweme.main.service.C36684f;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import com.p683ss.android.ugc.aweme.main.service.C36690k;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import com.p683ss.android.ugc.aweme.main.service.C36694o;
import com.p683ss.android.ugc.aweme.main.service.C36695p;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.main.service.C36702w;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.main.service.C36704y;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.a.c */
public final class C22889c implements C23342b {

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$a */
    static final class C22890a<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22890a f61218a = new C22890a();

        C22890a() {
        }

        public final /* synthetic */ Object get() {
            return new C23167m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$b */
    static final class C22891b<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22891b f61219a = new C22891b();

        C22891b() {
        }

        public final /* synthetic */ Object get() {
            return new C23180z();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$c */
    static final class C22892c<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22892c f61220a = new C22892c();

        C22892c() {
        }

        /* renamed from: a */
        private static IRetrofitService m56363a() {
            if (C27991b.f73465aV == null) {
                synchronized (IRetrofitService.class) {
                    if (C27991b.f73465aV == null) {
                        C27991b.f73465aV = new RetrofitService();
                    }
                }
            }
            return (RetrofitService) C27991b.f73465aV;
        }

        public final /* synthetic */ Object get() {
            return m56363a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$d */
    static final class C22893d<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22893d f61221a = new C22893d();

        C22893d() {
        }

        public final /* synthetic */ Object get() {
            return new C23169o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$e */
    static final class C22894e<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22894e f61222a = new C22894e();

        C22894e() {
        }

        public final /* synthetic */ Object get() {
            return new C23140a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$f */
    static final class C22895f<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22895f f61223a = new C22895f();

        C22895f() {
        }

        public final /* synthetic */ Object get() {
            return new C23151ag();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$g */
    static final class C22896g<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22896g f61224a = new C22896g();

        C22896g() {
        }

        public final /* synthetic */ Object get() {
            return new C23157f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$h */
    static final class C22897h<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22897h f61225a = new C22897h();

        C22897h() {
        }

        public final /* synthetic */ Object get() {
            return new C23154c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$i */
    static final class C22898i<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22898i f61226a = new C22898i();

        C22898i() {
        }

        public final /* synthetic */ Object get() {
            return new C23149ae();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$j */
    static final class C22899j<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22899j f61227a = new C22899j();

        C22899j() {
        }

        public final /* synthetic */ Object get() {
            return new C23156e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$k */
    static final class C22900k<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22900k f61228a = new C22900k();

        C22900k() {
        }

        public final /* synthetic */ Object get() {
            return new C23152ah();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$l */
    static final class C22901l<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22901l f61229a = new C22901l();

        C22901l() {
        }

        public final /* synthetic */ Object get() {
            return new C23145aa();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$m */
    static final class C22902m<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22902m f61230a = new C22902m();

        C22902m() {
        }

        public final /* synthetic */ Object get() {
            return new C23173s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$n */
    static final class C22903n<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22903n f61231a = new C22903n();

        C22903n() {
        }

        public final /* synthetic */ Object get() {
            return new C23155d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$o */
    static final class C22904o<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22904o f61232a = new C22904o();

        C22904o() {
        }

        public final /* synthetic */ Object get() {
            return new C23177w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$p */
    static final class C22905p<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22905p f61233a = new C22905p();

        C22905p() {
        }

        public final /* synthetic */ Object get() {
            return new C23171q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$q */
    static final class C22906q<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22906q f61234a = new C22906q();

        C22906q() {
        }

        public final /* synthetic */ Object get() {
            return new C23176v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.a.c$r */
    static final class C22907r<T> implements ServiceProvider<Object> {

        /* renamed from: a */
        public static final C22907r f61235a = new C22907r();

        C22907r() {
        }

        public final /* synthetic */ Object get() {
            return new C23161i();
        }
    }

    /* renamed from: a */
    public final <T> ServiceProvider<T> mo47683a(Class<T> cls) {
        C52711k.m112240b(cls, "clazz");
        if (C52711k.m112239a((Object) cls, (Object) C36688i.class)) {
            C22890a aVar = C22890a.f61218a;
            if (aVar != null) {
                return aVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36703x.class)) {
            C22900k kVar = C22900k.f61228a;
            if (kVar != null) {
                return kVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36699t.class)) {
            C22901l lVar = C22901l.f61229a;
            if (lVar != null) {
                return lVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36692m.class)) {
            C22902m mVar = C22902m.f61230a;
            if (mVar != null) {
                return mVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36681c.class)) {
            C22903n nVar = C22903n.f61231a;
            if (nVar != null) {
                return nVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36695p.class)) {
            C22904o oVar = C22904o.f61232a;
            if (oVar != null) {
                return oVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36691l.class)) {
            C22905p pVar = C22905p.f61233a;
            if (pVar != null) {
                return pVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36694o.class)) {
            C22906q qVar = C22906q.f61234a;
            if (qVar != null) {
                return qVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36684f.class)) {
            C22907r rVar = C22907r.f61235a;
            if (rVar != null) {
                return rVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36698s.class)) {
            C22891b bVar = C22891b.f61219a;
            if (bVar != null) {
                return bVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) IRetrofitService.class)) {
            C22892c cVar = C22892c.f61220a;
            if (cVar != null) {
                return cVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36690k.class)) {
            C22893d dVar = C22893d.f61221a;
            if (dVar != null) {
                return dVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36679a.class)) {
            C22894e eVar = C22894e.f61222a;
            if (eVar != null) {
                return eVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36704y.class)) {
            C22895f fVar = C22895f.f61223a;
            if (fVar != null) {
                return fVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36683e.class)) {
            C22896g gVar = C22896g.f61224a;
            if (gVar != null) {
                return gVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C22475af.class)) {
            C22897h hVar = C22897h.f61225a;
            if (hVar != null) {
                return hVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (C52711k.m112239a((Object) cls, (Object) C36702w.class)) {
            C22898i iVar = C22898i.f61226a;
            if (iVar != null) {
                return iVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        } else if (!C52711k.m112239a((Object) cls, (Object) C22545ai.class)) {
            return null;
        } else {
            C22899j jVar = C22899j.f61227a;
            if (jVar != null) {
                return jVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
        }
    }
}
