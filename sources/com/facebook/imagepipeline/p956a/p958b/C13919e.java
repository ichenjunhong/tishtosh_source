package com.facebook.imagepipeline.p956a.p958b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.p956a.p957a.C13905a;
import com.facebook.imagepipeline.p956a.p957a.C13911e;
import com.facebook.imagepipeline.p956a.p957a.C13913g;
import com.facebook.imagepipeline.p956a.p957a.C13914h;
import com.facebook.imagepipeline.p956a.p959c.C13924a;
import com.facebook.imagepipeline.p956a.p959c.C13925b;
import com.facebook.imagepipeline.p956a.p959c.C13930d;
import com.facebook.imagepipeline.p956a.p959c.C13930d.C13932a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p970j.C14040a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p970j.C14046g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.a.b.e */
public final class C13919e implements C13918d {

    /* renamed from: a */
    static C13917c f36310a = m28355a("com.facebook.animated.gif.GifImage");

    /* renamed from: b */
    static C13917c f36311b = m28355a("com.facebook.animated.webp.WebPImage");

    /* renamed from: c */
    private final C13925b f36312c;

    /* renamed from: d */
    private final C13946f f36313d;

    /* renamed from: a */
    private static C13917c m28355a(String str) {
        try {
            return (C13917c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C13919e(C13925b bVar, C13946f fVar) {
        this.f36312c = bVar;
        this.f36313d = fVar;
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28353a(int i, int i2, Config config) {
        C13715a<Bitmap> a = this.f36313d.mo26106a(i, i2, config);
        ((Bitmap) a.mo25630a()).eraseColor(0);
        if (VERSION.SDK_INT >= 12) {
            ((Bitmap) a.mo25630a()).setHasAlpha(true);
        }
        return a;
    }

    /* renamed from: a */
    private C13715a<Bitmap> m28354a(C13911e eVar, Config config, int i) {
        C13715a<Bitmap> a = m28353a(eVar.getWidth(), eVar.getHeight(), config);
        new C13930d(this.f36312c.mo26050a(C13913g.m28341a(eVar), null), new C13932a() {
            /* renamed from: a */
            public final C13715a<Bitmap> mo26023a(int i) {
                return null;
            }
        }).mo26099a(i, (Bitmap) a.mo25630a());
        return a;
    }

    /* renamed from: b */
    private List<C13715a<Bitmap>> m28357b(C13911e eVar, Config config, int i) {
        C13905a a = this.f36312c.mo26050a(C13913g.m28341a(eVar), null);
        int a2 = a.mo26072a();
        if (i > a2) {
            i = a2;
        }
        ((C13924a) a).f36319a = 1;
        final ArrayList arrayList = new ArrayList(i);
        C13930d dVar = new C13930d(a, new C13932a() {
            /* renamed from: a */
            public final C13715a<Bitmap> mo26023a(int i) {
                return C13715a.m27751b((C13715a) arrayList.get(i));
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            C13715a a3 = m28353a(a.mo26078c(), a.mo26079d(), config);
            try {
                dVar.mo26099a(i2, (Bitmap) a3.mo25630a());
                arrayList.add(a3);
            } catch (IllegalStateException e) {
                String str = "AnimatedImageFactoryImp";
                String str2 = "preview decode failed";
                Object[] objArr = new Object[0];
                if (C13697a.f35669a.mo25590b(5)) {
                    C13697a.f35669a.mo25589b(str, C13697a.m27670a(str2, objArr), e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private C14042c m28356a(C13950b bVar, C13911e eVar, Config config) {
        List list;
        int i;
        C13715a aVar = null;
        try {
            if (bVar.f36389d) {
                i = eVar.getFrameCount() - 1;
            } else {
                i = 0;
            }
            if (bVar.f36391f) {
                C14043d dVar = new C14043d(m28354a(eVar, bVar.f36393h, i), C14046g.f36711a, 0);
                C13715a.m27752c(null);
                C13715a.m27749a(null);
                return dVar;
            }
            if (bVar.f36390e) {
                Config config2 = bVar.f36393h;
                C13905a a = this.f36312c.mo26050a(C13913g.m28341a(eVar), null);
                final List arrayList = new ArrayList(a.mo26072a());
                C13930d dVar2 = new C13930d(a, new C13932a() {
                    /* renamed from: a */
                    public final C13715a<Bitmap> mo26023a(int i) {
                        return C13715a.m27751b((C13715a) arrayList.get(i));
                    }
                });
                for (int i2 = 0; i2 < a.mo26072a(); i2++) {
                    C13715a a2 = m28353a(a.mo26078c(), a.mo26079d(), config2);
                    dVar2.mo26099a(i2, (Bitmap) a2.mo25630a());
                    arrayList.add(a2);
                }
                try {
                    if (arrayList.size() > i) {
                        aVar = C13715a.m27751b((C13715a) arrayList.get(i));
                    }
                    list = arrayList;
                } catch (Throwable th) {
                    th = th;
                    list = arrayList;
                    C13715a.m27752c(null);
                    C13715a.m27749a((Iterable<? extends C13715a<?>>) list);
                    throw th;
                }
            } else if (bVar.f36388c > 0) {
                list = m28357b(eVar, bVar.f36393h, bVar.f36388c);
                try {
                    if (list.size() > i) {
                        aVar = C13715a.m27751b((C13715a) list.get(i));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C13715a.m27752c(null);
                    C13715a.m27749a((Iterable<? extends C13715a<?>>) list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f36387b && aVar == null) {
                aVar = m28354a(eVar, bVar.f36393h, i);
            }
            C13914h hVar = new C13914h(eVar);
            hVar.f36305b = C13715a.m27751b(aVar);
            hVar.f36307d = i;
            C14040a aVar2 = new C14040a(hVar.mo26089a(list).mo26088a(), bVar);
            C13715a.m27752c(aVar);
            C13715a.m27749a((Iterable<? extends C13715a<?>>) list);
            return aVar2;
        } catch (Throwable th3) {
            th = th3;
            list = null;
            C13715a.m27752c(null);
            C13715a.m27749a((Iterable<? extends C13715a<?>>) list);
            throw th;
        }
    }

    /* renamed from: b */
    public final C14042c mo26091b(C14044e eVar, C13950b bVar, Config config) {
        C13911e eVar2;
        if (f36311b != null) {
            C13715a b = eVar.mo26263b();
            C13689i.m27652a(b);
            try {
                C13709h hVar = (C13709h) b.mo25630a();
                if (hVar.mo25611c() != null) {
                    eVar2 = f36311b.decode(hVar.mo25611c());
                } else {
                    eVar2 = f36311b.decode(hVar.mo25610b(), hVar.mo25608a());
                }
                return m28356a(bVar, eVar2, config);
            } finally {
                C13715a.m27752c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    /* renamed from: a */
    public final C14042c mo26090a(C14044e eVar, C13950b bVar, Config config) {
        C13911e eVar2;
        if (f36310a != null) {
            C13715a b = eVar.mo26263b();
            C13689i.m27652a(b);
            try {
                C13709h hVar = (C13709h) b.mo25630a();
                if (hVar.mo25611c() != null) {
                    eVar2 = f36310a.decode(hVar.mo25611c());
                } else {
                    eVar2 = f36310a.decode(hVar.mo25610b(), hVar.mo25608a());
                }
                return m28356a(bVar, eVar2, config);
            } finally {
                C13715a.m27752c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }
}
