package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.FeedTagLayout2;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ai */
public final class C2250ai implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -2, -2);
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        FeedTagLayout2 feedTagLayout2 = new FeedTagLayout2(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        feedTagLayout2.setId(R.id.aep);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) resources.getDimension(R.dimen.vv));
        }
        feedTagLayout2.setVisibility(8);
        feedTagLayout2.setLayoutParams(layoutParams);
        if (feedTagLayout2.getParent() == null) {
            linearLayout.addView(feedTagLayout2);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(feedTagLayout2);
        return linearLayout;
    }
}
