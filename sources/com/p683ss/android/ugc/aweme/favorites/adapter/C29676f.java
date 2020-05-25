package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.f */
public final class C29676f extends C23466e<MixStruct> {

    /* renamed from: c */
    public int f77569c;

    public C29676f(C0184k kVar) {
        C52711k.m112240b(kVar, "parent");
        super(kVar, null, null, 6, null);
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, MixStruct> mo48638a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        return new MediaMixViewHolder<>(viewGroup);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (this.f77569c == 2 && (vVar instanceof MediaMixViewHolder)) {
            ((MediaMixViewHolder) vVar).f77706g = 2;
        }
    }
}
