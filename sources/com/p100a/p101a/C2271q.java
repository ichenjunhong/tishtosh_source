package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.AppCompatImageView;
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

/* renamed from: com.a.a.q */
public final class C2271q implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -2, -2);
        linearLayout.setId(R.id.xn);
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
        frameLayout.setBackgroundResource(R.drawable.ke);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.x2);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.x9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        appCompatImageView.setFocusable(false);
        appCompatImageView.setFocusableInTouchMode(false);
        appCompatImageView.setImageResource(R.drawable.df7);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.n5));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.v6));
        dmtTextView.setId(R.id.x3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, -3.4f, resources.getDisplayMetrics());
        }
        dmtTextView.setFocusable(false);
        dmtTextView.setFocusableInTouchMode(false);
        dmtTextView.setImportantForAccessibility(2);
        dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), dmtTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        dmtTextView.setVisibility(0);
        dmtTextView.setLayoutParams(layoutParams3);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(dmtTextView);
        return linearLayout;
    }
}
