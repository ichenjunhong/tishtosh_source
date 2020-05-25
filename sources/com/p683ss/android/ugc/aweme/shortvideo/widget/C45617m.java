package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import java.util.concurrent.atomic.AtomicInteger;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p094l.C2182c;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.m */
public final class C45617m {

    /* renamed from: b */
    public static final C45620a f115387b = new C45620a(null);

    /* renamed from: a */
    public final int f115388a;

    /* renamed from: c */
    private final C42542c f115389c;

    /* renamed from: d */
    private final C2201v<C52847n<Integer, Bitmap>> f115390d;

    /* renamed from: e */
    private final C2182c<C52847n<Integer, Bitmap>> f115391e;

    /* renamed from: f */
    private boolean f115392f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.m$a */
    public static final class C45620a {
        private C45620a() {
        }

        public /* synthetic */ C45620a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final C2201v<C52847n<Integer, Bitmap>> mo92001a() {
        if (!this.f115392f) {
            this.f115390d.mo6314a((C1674ab<? super T>) this.f115391e);
            this.f115392f = true;
        }
        return this.f115391e;
    }

    public C45617m(final C42542c cVar, final int i, final int i2, final int i3) {
        C52711k.m112240b(cVar, "generator");
        C2182c<C52847n<Integer, Bitmap>> l = C2182c.m6538l();
        C52711k.m112236a((Object) l, "ReplaySubject.create()");
        this.f115391e = l;
        this.f115389c = cVar;
        C2201v<C52847n<Integer, Bitmap>> a = C2201v.m6601a((C2205y<T>) new C2205y<T>() {
            public final void subscribe(final C2204x<C52847n<Integer, Bitmap>> xVar) {
                C52711k.m112240b(xVar, "emitter");
                final AtomicInteger atomicInteger = new AtomicInteger();
                cVar.mo78727a(i, i2, new C42543a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C456181 f115397a;

                    {
                        this.f115397a = r1;
                    }

                    /* renamed from: a */
                    public final void mo86764a(int i, Bitmap bitmap) {
                        xVar.mo6282a(new C52847n(Integer.valueOf(i), bitmap));
                        if (atomicInteger.incrementAndGet() == i3) {
                            xVar.mo6273a();
                        }
                    }
                });
            }
        });
        C52711k.m112236a((Object) a, "Observable.create { emit…}\n            }\n        }");
        this.f115390d = a;
        this.f115388a = i3;
    }
}
