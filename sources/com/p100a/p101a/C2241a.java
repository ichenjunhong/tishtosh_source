package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.a */
public final class C2241a implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context);
        LayoutParams a = C1522a.m5434a(viewGroup, (int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(R.id.d3);
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 81;
        }
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        if (viewGroup != null) {
            adHalfWebPageContainer.setLayoutParams(a);
            if (z) {
                viewGroup.addView(adHalfWebPageContainer);
            }
        }
        C1522a.m5435a(adHalfWebPageContainer);
        return adHalfWebPageContainer;
    }
}
