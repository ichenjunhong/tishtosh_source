package com.p683ss.android.ugc.aweme.follow.recommend.follow.view;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.ConnectedRelationItemView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.a */
public final class C31921a extends C23466e<C31907e> {
    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, C31907e> mo48638a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C52711k.m112236a((Object) context, "parent.context");
        ConnectedRelationItemView connectedRelationItemView = new ConnectedRelationItemView(context, null, 0, 6, null);
        return new RecommendFollowViewHolder<>(connectedRelationItemView);
    }

    private C31921a(C0184k kVar, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        super(kVar, (C1212c<T>) new C31922b<T>(), bVar);
    }

    public /* synthetic */ C31921a(C0184k kVar, C11850b bVar, int i, C52707g gVar) {
        this(kVar, null);
    }
}
