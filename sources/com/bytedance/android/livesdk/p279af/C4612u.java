package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import com.airbnb.lottie.C2408e;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.livebuild.C7765a;
import com.bytedance.android.livesdk.livebuild.C7766b;
import com.bytedance.android.livesdk.livebuild.C7767c;
import com.bytedance.android.livesdk.p398n.C8025a;
import com.bytedance.android.livesdk.p399o.C8064d;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2187e;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.bytedance.android.livesdk.af.u */
public final class C4612u {

    /* renamed from: com.bytedance.android.livesdk.af.u$a */
    public static final class C4613a extends C7214j {

        /* renamed from: a */
        final /* synthetic */ C2187e f12586a;

        C4613a(C2187e eVar) {
            this.f12586a = eVar;
        }

        /* renamed from: a */
        public final void mo8667a(long j) {
            this.f12586a.onError(new Exception("operation canceled"));
        }

        /* renamed from: a */
        public final void mo8669a(Throwable th) {
            C2187e eVar = this.f12586a;
            if (th == null) {
                th = new Exception("unknown exception");
            }
            eVar.onError(th);
        }

        /* renamed from: a */
        public final void mo8668a(long j, String str) {
            if (str != null) {
                this.f12586a.onSuccess(str);
            } else {
                this.f12586a.onError(new Exception("result path is null"));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.af.u$b */
    public static final class C4614b<T> implements C1684ah<T> {

        /* renamed from: a */
        final /* synthetic */ C52727e f12587a;

        /* renamed from: b */
        final /* synthetic */ C52670a f12588b;

        public C4614b(C52727e eVar, C52670a aVar) {
            this.f12587a = eVar;
            this.f12588b = aVar;
        }

        /* renamed from: a */
        public final void mo6171a(final C1682af<String> afVar) {
            C52711k.m112240b(afVar, "emitter");
            String str = (String) this.f12587a.element;
            if (str == null) {
                final long longValue = ((Number) this.f12588b.invoke()).longValue();
                C8064d.m16005b();
                StringBuilder sb = new StringBuilder("downloading assets, id=");
                sb.append(longValue);
                C8064d.m9719a("ttlive_gift", sb.toString());
                C2187e d = C2187e.m6550d();
                C52711k.m112236a((Object) d, "SingleSubject.create<String>()");
                C4613a aVar = new C4613a(d);
                C2952b a = C4116c.m10249a(IGiftService.class);
                C52711k.m112236a((Object) a, "ServiceManager.getServic…IGiftService::class.java)");
                ((IGiftService) a).getAssetsManager().mo13428a(longValue, aVar, 4);
                d.mo6152a((C1710e<? super T>) new C1710e<String>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C4614b f12589a;

                    {
                        this.f12589a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        T t = (String) obj;
                        if (t != null) {
                            this.f12589a.f12587a.element = t;
                        }
                        afVar.mo6164a(t);
                    }
                }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) {
                        Throwable th = (Throwable) obj;
                        C1682af afVar = afVar;
                        StringBuilder sb = new StringBuilder("failed to download assets, id=");
                        sb.append(longValue);
                        afVar.mo6166b(new Exception(sb.toString(), th));
                    }
                });
                return;
            }
            afVar.mo6164a(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.af.u$c */
    public static final class C4617c<T> implements C1684ah<T> {

        /* renamed from: a */
        final /* synthetic */ Context f12593a;

        /* renamed from: b */
        final /* synthetic */ C8025a f12594b;

        public C4617c(Context context, C8025a aVar) {
            this.f12593a = context;
            this.f12594b = aVar;
        }

        /* renamed from: a */
        public final void mo6171a(final C1682af<C2408e> afVar) {
            C52711k.m112240b(afVar, "emitter");
            Class<C7767c> cls = C7767c.class;
            if (C7765a.f21349a != null && C7765a.f21349a.containsKey(cls)) {
                C7766b bVar = (C7766b) C7765a.f21349a.get(cls);
                if (bVar != null) {
                    bVar.mo14110a();
                }
            }
            new Object() {
            };
        }
    }

    /* renamed from: com.bytedance.android.livesdk.af.u$d */
    public static final class C4619d<T> implements C1684ah<T> {

        /* renamed from: a */
        final /* synthetic */ String f12596a;

        /* renamed from: b */
        final /* synthetic */ C4564ae f12597b;

        public C4619d(String str, C4564ae aeVar) {
            this.f12596a = str;
            this.f12597b = aeVar;
        }

        /* renamed from: a */
        public final void mo6171a(C1682af<C8025a> afVar) {
            C52711k.m112240b(afVar, "emitter");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12596a);
                sb.append(this.f12597b.getSubFolder());
                Object a = C4561ac.m10954a(sb.toString(), this.f12597b.getOrdinal());
                if (!(a instanceof C8025a)) {
                    a = null;
                }
                C8025a aVar = (C8025a) a;
                if (aVar != null) {
                    afVar.mo6164a(aVar);
                } else {
                    afVar.mo6166b(new Exception("entity is null"));
                }
            } catch (Throwable th) {
                afVar.mo6166b(th);
            }
        }
    }
}
