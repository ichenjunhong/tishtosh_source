package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.u */
public final class C30119u {

    /* renamed from: a */
    static final C52671b<C30022am, View> f78638a = C30120a.f78639a;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.u$a */
    static final class C30120a extends C52712l implements C52671b<C30022am, View> {

        /* renamed from: a */
        public static final C30120a f78639a = new C30120a();

        C30120a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30022am amVar = (C30022am) obj;
            C52711k.m112240b(amVar, "params");
            View view = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(amVar.f78372b, R.layout.bac);
            C52711k.m112236a((Object) view, "x2CItemFeed.getView(para…ow_feed_item_feed_follow)");
            return view;
        }
    }
}
