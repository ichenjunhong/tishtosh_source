package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.o */
public final class C30103o {

    /* renamed from: a */
    static final C52671b<C30063bb, Boolean> f78598a = C30104a.f78600a;

    /* renamed from: b */
    private static final C52671b<C30022am, View> f78599b = C30105b.f78601a;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.o$a */
    static final class C30104a extends C52712l implements C52671b<C30063bb, Boolean> {

        /* renamed from: a */
        public static final C30104a f78600a = new C30104a();

        C30104a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C30063bb) obj, "it");
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.o$b */
    static final class C30105b extends C52712l implements C52671b<C30022am, View> {

        /* renamed from: a */
        public static final C30105b f78601a = new C30105b();

        C30105b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C30022am amVar = (C30022am) obj;
            C52711k.m112240b(amVar, "params");
            View view = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(amVar.f78372b, R.layout.b5v);
            C52711k.m112236a((Object) view, "x2CItemFeed.getView(para…ut.common_feed_item_feed)");
            return view;
        }
    }

    /* renamed from: a */
    public static final C52671b<C30022am, View> m70650a() {
        return f78599b;
    }
}
