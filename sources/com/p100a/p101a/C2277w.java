package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.w */
public final class C2277w implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -2, -2);
        linearLayout.setId(R.id.bos);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.bo7);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setAlpha(0.9f);
        appCompatImageView.setImageResource(R.drawable.dfb);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setId(R.id.boc);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.a4p));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), 0.0f, dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setText(R.string.cmb);
        dmtTextView.setMaxWidth((int) TypedValue.applyDimension(1, 149.0f, resources.getDisplayMetrics()));
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setMaxLines(1);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.je));
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView.setVisibility(8);
        dmtTextView.setFontType("bold");
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        MarqueeView marqueeView = new MarqueeView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        marqueeView.setId(R.id.bot);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        marqueeView.setSpeed((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        marqueeView.setTextColor(resources.getColor(R.color.jf));
        marqueeView.setTextShadow(resources.getColor(R.color.n5));
        marqueeView.setTextSize((int) TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics()));
        marqueeView.setLayoutParams(layoutParams3);
        if (marqueeView.getParent() == null) {
            linearLayout.addView(marqueeView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(marqueeView);
        return linearLayout;
    }
}
