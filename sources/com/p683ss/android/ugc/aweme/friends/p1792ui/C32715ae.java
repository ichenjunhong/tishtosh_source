package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ae */
public final class C32715ae extends C32773t {

    /* renamed from: a */
    private final IRecommendContactItemView f85219a;

    /* renamed from: a */
    public final String mo66303a() {
        return this.f85219a.getEnterFrom();
    }

    public C32715ae(IRecommendContactItemView iRecommendContactItemView) {
        C52711k.m112240b(iRecommendContactItemView, "recommendView");
        super(iRecommendContactItemView);
        this.f85219a = iRecommendContactItemView;
    }

    /* renamed from: a */
    public final void mo66304a(RecommendContact recommendContact, int i) {
        C52711k.m112240b(recommendContact, "contact");
        this.f85219a.mo66180a(recommendContact, i);
    }
}
