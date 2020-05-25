package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.following.p1768a.C32001h;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.ConnectedRelationItemView;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.ConnectedRelationContactViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.ConnectedRelationViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendRelationTitleViewHolder;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendContactItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a */
public final class C32105a extends C23463c<Object> {

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a$a */
    static final class C32106a extends C52712l implements C52671b<ViewGroup, ConnectedRelationViewHolder> {

        /* renamed from: a */
        public static final C32106a f83784a = new C32106a();

        C32106a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "it.context");
            ConnectedRelationItemView connectedRelationItemView = new ConnectedRelationItemView(context, null, 0, 6, null);
            return new ConnectedRelationViewHolder(connectedRelationItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a$b */
    static final class C32107b extends C52712l implements C52671b<ViewGroup, ConnectedRelationViewHolder> {

        /* renamed from: a */
        public static final C32107b f83785a = new C32107b();

        C32107b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "it.context");
            RecommendUserItemView recommendUserItemView = new RecommendUserItemView(context, null, 0, 6, null);
            return new ConnectedRelationViewHolder(recommendUserItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a$c */
    static final class C32108c extends C52712l implements C52671b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C32108c f83786a = new C32108c();

        C32108c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sr, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a$d */
    static final class C32109d extends C52712l implements C52671b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C32109d f83787a = new C32109d();

        C32109d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sr, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.a$e */
    static final class C32110e extends C52712l implements C52671b<ViewGroup, ConnectedRelationContactViewHolder> {

        /* renamed from: a */
        public static final C32110e f83788a = new C32110e();

        C32110e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            C32616c cVar = C32616c.f84865a;
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "it.context");
            IRecommendContactItemView createRecommendContactItemView = cVar.createRecommendContactItemView(context);
            createRecommendContactItemView.setEnterFrom("common_relation");
            return new ConnectedRelationContactViewHolder(createRecommendContactItemView);
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        Object a = mo22589a(i, false);
        if (a instanceof C32003j) {
            return ((C32003j) a).f83561a;
        }
        if (a instanceof C32004k) {
            return ((C32004k) a).f83563a;
        }
        if (a instanceof RecommendContact) {
            return 3;
        }
        return 5;
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(5, null, (C52671b<? super ViewGroup, ? extends VH>) C32106a.f83784a);
        hVar2.mo22697a(2, null, (C52671b<? super ViewGroup, ? extends VH>) C32107b.f83785a);
        hVar2.mo22697a(6, null, (C52671b<? super ViewGroup, ? extends VH>) C32108c.f83786a);
        hVar2.mo22697a(4, null, (C52671b<? super ViewGroup, ? extends VH>) C32109d.f83787a);
        hVar2.mo22697a(3, null, (C52671b<? super ViewGroup, ? extends VH>) C32110e.f83788a);
    }

    private C32105a(C0184k kVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        super(kVar, (C1212c<T>) new C32001h<T>(), bVar);
    }

    public /* synthetic */ C32105a(C0184k kVar, C11850b bVar, int i, C52707g gVar) {
        this(kVar, null);
    }
}
