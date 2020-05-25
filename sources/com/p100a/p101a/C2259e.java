package com.p100a.p101a;

import android.content.Context;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.e */
public final class C2259e implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -1);
        adHalfWebPageMaskLayer.setId(R.id.d4);
        if (viewGroup != null) {
            adHalfWebPageMaskLayer.setLayoutParams(a);
            if (z) {
                viewGroup.addView(adHalfWebPageMaskLayer);
            }
        }
        C1522a.m5435a(adHalfWebPageMaskLayer);
        return adHalfWebPageMaskLayer;
    }
}
