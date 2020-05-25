package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.service.C30687a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.z */
public final class C30126z extends C30056b {

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.z$a */
    static final class C30127a extends C52712l implements C52671b<C30069bh, VideoViewHolder> {

        /* renamed from: a */
        public static final C30127a f78648a = new C30127a();

        C30127a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30069bh bhVar = (C30069bh) obj;
            C52711k.m112240b(bhVar, "it");
            VideoViewHolder a = C30687a.m71969c().mo60280a(bhVar);
            C52711k.m112236a((Object) a, "FeedComponentServiceUtil…teFeedVideoViewHolder(it)");
            return a;
        }
    }

    /* renamed from: b */
    public final void mo60334b() {
        super.mo60334b();
    }

    /* renamed from: a */
    public final C30071bj mo55769a() {
        if (!TextUtils.equals("homepage_follow", this.f78462m.eventType)) {
            return new C30071bj(null, C30127a.f78648a, 1, null);
        }
        C30071bj a = C30687a.m71969c().mo60283a();
        C52711k.m112236a((Object) a, "FeedComponentServiceUtil…deoViewHolderTypeConfig()");
        return a;
    }

    public C30126z(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
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
