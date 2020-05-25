package com.p683ss.android.ugc.aweme.discover.hotspot.feed;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack */
public final class SpotCurSpotChangeCallBack extends C0209x {

    /* renamed from: c */
    public static final C28228a f74094c = new C28228a(null);

    /* renamed from: a */
    public final C23275b<C52847n<Aweme, Boolean>> f74095a = new C23275b<>();

    /* renamed from: b */
    public final C23275b<C52847n<Aweme, Boolean>> f74096b = new C23275b<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a */
    public static final class C28228a {

        /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a$a */
        static final class C28229a<T> implements C0199s<C52847n<? extends Aweme, ? extends Boolean>> {

            /* renamed from: a */
            final /* synthetic */ C52682m f74097a;

            C28229a(C52682m mVar) {
                this.f74097a = mVar;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C52847n nVar = (C52847n) obj;
                if (nVar != null) {
                    this.f74097a.invoke(nVar.getFirst(), nVar.getSecond());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack$a$b */
        static final class C28230b<T> implements C0199s<C52847n<? extends Aweme, ? extends Boolean>> {

            /* renamed from: a */
            final /* synthetic */ C52682m f74098a;

            C28230b(C52682m mVar) {
                this.f74098a = mVar;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C52847n nVar = (C52847n) obj;
                if (nVar != null) {
                    this.f74098a.invoke(nVar.getFirst(), nVar.getSecond());
                }
            }
        }

        private C28228a() {
        }

        public /* synthetic */ C28228a(C52707g gVar) {
            this();
        }
    }
}
