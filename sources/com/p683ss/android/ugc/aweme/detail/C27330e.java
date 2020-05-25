package com.p683ss.android.ugc.aweme.detail;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27496f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.adapter.C30069bh;
import com.p683ss.android.ugc.aweme.feed.adapter.C30071bj;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.detail.e */
public class C27330e extends C30056b {

    /* renamed from: com.ss.android.ugc.aweme.detail.e$a */
    static final class C27331a extends C52712l implements C52671b<C30069bh, C27496f> {

        /* renamed from: a */
        public static final C27331a f72079a = new C27331a();

        C27331a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30069bh bhVar = (C30069bh) obj;
            C52711k.m112240b(bhVar, "it");
            return new C27496f(bhVar);
        }
    }

    /* renamed from: a */
    public C30071bj mo55769a() {
        return new C30071bj(null, C27331a.f72079a, 1, null);
    }

    public C27330e(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
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
