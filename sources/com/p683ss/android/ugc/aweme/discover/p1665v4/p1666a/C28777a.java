package com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4BannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4ListViewHolder;
import com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4TopicViewHolder;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a */
public final class C28777a extends C23463c<DiscoverCategoryStructV4> {

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a$a */
    static final class C28778a extends C52712l implements C52671b<ViewGroup, DiscoverV4BannerViewHolder> {

        /* renamed from: a */
        public static final C28778a f75461a = new C28778a();

        C28778a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4BannerViewHolder(viewGroup, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a$b */
    static final class C28779b extends C52712l implements C52671b<ViewGroup, DiscoverV4TopicViewHolder> {

        /* renamed from: a */
        public static final C28779b f75462a = new C28779b();

        C28779b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4TopicViewHolder(viewGroup, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a$c */
    static final class C28780c extends C52712l implements C52671b<ViewGroup, DiscoverV4TopicViewHolder> {

        /* renamed from: a */
        public static final C28780c f75463a = new C28780c();

        C28780c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4TopicViewHolder(viewGroup, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a$d */
    static final class C28781d extends C52712l implements C52671b<ViewGroup, DiscoverV4ListViewHolder> {

        /* renamed from: a */
        public static final C28781d f75464a = new C28781d();

        C28781d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4ListViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.a.a$e */
    static final class C28782e extends C52712l implements C52671b<ViewGroup, DiscoverV4ListViewHolder> {

        /* renamed from: a */
        public static final C28782e f75465a = new C28782e();

        C28782e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            return new DiscoverV4ListViewHolder(viewGroup);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return ((DiscoverCategoryStructV4) mo48637d().get(i)).type;
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(0, null, (C52671b<? super ViewGroup, ? extends VH>) C28778a.f75461a);
        hVar2.mo22697a(1, null, (C52671b<? super ViewGroup, ? extends VH>) C28779b.f75462a);
        hVar2.mo22697a(3, null, (C52671b<? super ViewGroup, ? extends VH>) C28780c.f75463a);
        hVar2.mo22697a(2, null, (C52671b<? super ViewGroup, ? extends VH>) C28781d.f75464a);
        hVar2.mo22697a(4, null, (C52671b<? super ViewGroup, ? extends VH>) C28782e.f75465a);
    }

    public C28777a(C0184k kVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(bVar, "fetcher");
        super(kVar, (C1212c<T>) new C28794e<T>(), bVar);
    }
}
