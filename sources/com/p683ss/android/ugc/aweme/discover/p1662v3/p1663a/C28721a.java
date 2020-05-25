package com.p683ss.android.ugc.aweme.discover.p1662v3.p1663a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3CoverViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1662v3.viewholder.DiscoveryV3PlaylistViewHolder;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.a.a */
public final class C28721a extends C23463c<DiscoveryCellStructV3> {

    /* renamed from: c */
    public static final C28722a f75361c = new C28722a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.a.a$a */
    public static final class C28722a {
        private C28722a() {
        }

        public /* synthetic */ C28722a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.a.a$b */
    static final class C28723b extends C52712l implements C52671b<ViewGroup, DiscoveryV3CoverViewHolder> {

        /* renamed from: a */
        public static final C28723b f75362a = new C28723b();

        C28723b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoveryV3CoverViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.a.a$c */
    static final class C28724c extends C52712l implements C52671b<ViewGroup, DiscoveryV3PlaylistViewHolder> {

        /* renamed from: a */
        public static final C28724c f75363a = new C28724c();

        C28724c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoveryV3PlaylistViewHolder(viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(0, null, (C52671b<? super ViewGroup, ? extends VH>) C28723b.f75362a);
        hVar2.mo22697a(1, null, (C52671b<? super ViewGroup, ? extends VH>) C28724c.f75363a);
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) mo22589a(i, false);
        if (discoveryCellStructV3 != null && discoveryCellStructV3.type == 3) {
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            if (C41589c.m91440l() != 2) {
                return 0;
            }
        }
        return 1;
    }

    public C28721a(C0184k kVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(bVar, "fetcher");
        super(kVar, (C1212c<T>) new C28725b<T>(), bVar);
    }
}
