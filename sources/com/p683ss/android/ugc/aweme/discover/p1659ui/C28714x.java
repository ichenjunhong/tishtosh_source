package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.detail.C27330e;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27496f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30069bh;
import com.p683ss.android.ugc.aweme.feed.adapter.C30071bj;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.x */
public final class C28714x extends C27330e {

    /* renamed from: a */
    public String f75348a;

    /* renamed from: b */
    public String f75349b;

    /* renamed from: c */
    public String f75350c;

    /* renamed from: d */
    public String f75351d;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.x$a */
    static final class C28715a extends C52712l implements C52671b<C30069bh, C27496f> {

        /* renamed from: a */
        final /* synthetic */ C28714x f75352a;

        C28715a(C28714x xVar) {
            this.f75352a = xVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30069bh bhVar = (C30069bh) obj;
            C52711k.m112240b(bhVar, "it");
            C27496f fVar = new C27496f(bhVar);
            String str = this.f75352a.f75348a;
            String str2 = this.f75352a.f75349b;
            String str3 = this.f75352a.f75350c;
            String str4 = this.f75352a.f75351d;
            fVar.f78516h.mo48228a("playlist_id", (Object) str3);
            fVar.f78516h.mo48228a("playlist_type", (Object) str);
            fVar.f78516h.mo48228a("playlist_id_key", (Object) str2);
            fVar.f78516h.mo48228a("tab_name", (Object) str4);
            return fVar;
        }
    }

    /* renamed from: a */
    public final C30071bj mo55769a() {
        return new C30071bj(null, new C28715a(this), 1, null);
    }

    public C28714x(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(aeVar, "listener");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        C52711k.m112240b(baseFeedPageParams, "baseFeedPageParams");
        C52711k.m112240b(mVar, "iHandlePlay");
        super(context, layoutInflater, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar);
    }
}
