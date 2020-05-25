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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.u */
public final class C2275u implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        DmtTextView dmtTextView = new DmtTextView(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -2, -2);
        dmtTextView.setId(R.id.ddv);
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).leftMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a) && VERSION.SDK_INT >= 17) {
            ((MarginLayoutParams) a).setMarginStart((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 16;
        }
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.n5));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setTextSize(2, 15.0f);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.o9));
        dmtTextView.setTextAlignment(5);
        dmtTextView.setTextDirection(5);
        dmtTextView.setIncludeFontPadding(false);
        if (viewGroup != null) {
            dmtTextView.setLayoutParams(a);
            if (z) {
                viewGroup.addView(dmtTextView);
            }
        }
        C1522a.m5435a(dmtTextView);
        return dmtTextView;
    }
}
