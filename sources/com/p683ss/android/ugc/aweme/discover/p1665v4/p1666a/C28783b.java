package com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4BannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4NewTrendingViewHolder;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.a.b */
public final class C28783b extends C23463c<DiscoverV4NewTrendingStruct> {

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.b$a */
    static final class C28784a extends C52712l implements C52671b<ViewGroup, DiscoverV4BannerViewHolder> {

        /* renamed from: a */
        public static final C28784a f75466a = new C28784a();

        C28784a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4BannerViewHolder(viewGroup, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.b$b */
    static final class C28785b extends C52712l implements C52671b<ViewGroup, DiscoverV4NewTrendingViewHolder> {

        /* renamed from: a */
        public static final C28785b f75467a = new C28785b();

        C28785b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4NewTrendingViewHolder(viewGroup);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (!NewDiscoverV4Experiment.m69618b() || i != 0) {
            return 11;
        }
        return 10;
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(10, null, (C52671b<? super ViewGroup, ? extends VH>) C28784a.f75466a);
        hVar2.mo22697a(11, null, (C52671b<? super ViewGroup, ? extends VH>) C28785b.f75467a);
    }

    public C28783b(C0184k kVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(bVar, "fetcher");
        super(kVar, (C1212c<T>) new C28795f<T>(), bVar);
    }
}
