package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.y */
public final class C2279y implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -2);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.aty));
        if (viewGroup2 != null) {
            constraintLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(constraintLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f873q = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setImageResource(R.drawable.cw8);
        appCompatImageView.setId(R.id.aqa);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            constraintLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f872p = R.id.aqa;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f867k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f874r = R.id.g_;
        }
        dmtTextView.setId(R.id.df3);
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f881y = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f882z = 0.0f;
        }
        dmtTextView.setFontType("medium");
        dmtTextView.setTextColor(resources.getColorStateList(R.color.auk));
        dmtTextView.setMaxLines(2);
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            constraintLayout.addView(dmtTextView);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context2);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((RelativeLayout.LayoutParams) layoutParams3).addRule(15, -1);
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f875s = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        autoRTLImageView.setVisibility(8);
        autoRTLImageView.setScaleType(ScaleType.CENTER);
        autoRTLImageView.setImageResource(R.drawable.cw4);
        autoRTLImageView.setId(R.id.g_);
        autoRTLImageView.setLayoutParams(layoutParams3);
        if (autoRTLImageView.getParent() == null) {
            constraintLayout.addView(autoRTLImageView);
        }
        C1522a.m5435a(constraintLayout);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(autoRTLImageView);
        return constraintLayout;
    }
}
