package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a.C33254b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.j */
public final class C33674j extends C33254b<C33675k, C29366a> {

    /* renamed from: a */
    public C52682m<? super View, ? super Integer, C52860x> f87312a;

    public C33674j() {
        super(null, 1, null);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C33675k(viewGroup);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar != null) {
            C29366a aVar = (C29366a) mo70602b(i);
            if (aVar != null) {
                C33675k kVar = (C33675k) vVar;
                C52711k.m112240b(aVar, "emoji");
                C35234bi.m79644b(kVar.f87313a, aVar.getAnimateUrl());
                kVar.f87314b = this.f87312a;
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.GreetEmojiViewHolder");
    }
}
