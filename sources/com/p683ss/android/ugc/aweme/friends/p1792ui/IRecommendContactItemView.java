package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IRecommendContactItemView */
public abstract class IRecommendContactItemView extends RelativeLayout {

    /* renamed from: a */
    private String f84951a = "";

    /* renamed from: a */
    public abstract void mo66180a(RecommendContact recommendContact, int i);

    public final String getEnterFrom() {
        return this.f84951a;
    }

    public abstract void setDislikeListener(C52682m<? super RecommendContact, ? super Integer, C52860x> mVar);

    public final void setEnterFrom(String str) {
        this.f84951a = str;
    }

    public IRecommendContactItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }
}
