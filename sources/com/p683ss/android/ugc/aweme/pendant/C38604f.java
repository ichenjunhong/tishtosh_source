package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.C10174a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.f */
public abstract class C38604f extends C38571a {

    /* renamed from: p */
    private final SmartImageView f98186p;

    /* renamed from: q */
    private final SmartImageView f98187q;

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$a */
    static final class C38605a<T> implements C2205y<String> {

        /* renamed from: a */
        final /* synthetic */ C38604f f98188a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f98189b;

        /* renamed from: c */
        final /* synthetic */ SmartImageView f98190c;

        C38605a(C38604f fVar, UrlModel urlModel, SmartImageView smartImageView) {
            this.f98188a = fVar;
            this.f98189b = urlModel;
            this.f98190c = smartImageView;
        }

        public final void subscribe(final C2204x<String> xVar) {
            C52711k.m112240b(xVar, "emitter");
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(this.f98189b));
            C38604f fVar = this.f98188a;
            C52711k.m112236a((Object) a, "builder");
            fVar.mo78535a(a);
            a.mo23116a((C12197k) this.f98190c).mo23118a("NewPendant").mo23122a((C12175j) new C12168c() {
                /* renamed from: a */
                public final void mo23086a(Uri uri, View view) {
                    C52711k.m112240b(uri, "uri");
                }

                /* renamed from: a */
                public final void mo23095a(Uri uri, View view, Throwable th) {
                    C52711k.m112240b(uri, "uri");
                    C2204x xVar = xVar;
                    if (th == null) {
                        C52711k.m112234a();
                    }
                    xVar.mo6274a(th);
                }

                /* renamed from: a */
                public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                    xVar.mo6282a("");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$b */
    static final class C38607b<T1, T2, R> implements C1707b<String, String, String> {

        /* renamed from: a */
        public static final C38607b f98192a = new C38607b();

        C38607b() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6200a(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C52711k.m112240b(str, "t1");
            C52711k.m112240b(str2, "t2");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.f$c */
    public static final class C38608c implements C1674ab<String> {

        /* renamed from: a */
        final /* synthetic */ C38604f f98193a;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C38608c(C38604f fVar) {
            this.f98193a = fVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            C52711k.m112240b((String) obj, "t");
            this.f98193a.f98089g = true;
            C52670a<C52860x> aVar = this.f98193a.f98096n.f98198e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    public void mo78535a(C12208t tVar) {
        C52711k.m112240b(tVar, "builer");
    }

    /* renamed from: a */
    public void mo78531a(C38622k kVar) {
        C52711k.m112240b(kVar, "resConfigure");
        com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel = kVar.f98235d;
        com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel2 = kVar.f98236e;
        if (urlModel != null && urlModel2 != null) {
            C2201v a = m85934a(this.f98186p, urlModel);
            C2201v a2 = m85934a(this.f98187q, urlModel2);
            if (a != null && a2 != null) {
                C2201v.m6603a((C2206z<? extends T1>) a, (C2206z<? extends T2>) a2, (C1707b<? super T1, ? super T2, ? extends R>) C38607b.f98192a).mo6314a((C1674ab<? super T>) new C38608c<Object>(this));
                this.f98186p.getDrawable().setVisible(true, false);
                this.f98187q.getDrawable().setVisible(true, false);
            }
        }
    }

    /* renamed from: a */
    private final C2201v<String> m85934a(SmartImageView smartImageView, com.p683ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        try {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(urlModel.getUrlList());
            C2201v<String> a = C2201v.m6601a((C2205y<T>) new C38605a<T>(this, urlModel2, smartImageView)).mo6510a(3, C1723a.m6041c());
            C52711k.m112236a((Object) a, "Observable.create(Observ…   })\n        }).retry(3)");
            return a;
        } catch (C10174a unused) {
            return null;
        }
    }

    public C38604f(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, C38609g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, C42311c.f106865i);
        C52711k.m112240b(smartImageView, "bigImageView");
        C52711k.m112240b(smartImageView2, "smallImageView");
        C52711k.m112240b(view2, "closeBtn");
        C52711k.m112240b(gVar, "configure");
        super(context, view, smartImageView, smartImageView2, view2, gVar);
        this.f98186p = smartImageView;
        this.f98187q = smartImageView2;
    }
}
