package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.d */
public final class C2258d implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -2);
        constraintLayout.setBackgroundColor(resources.getColor(R.color.au0));
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (viewGroup != null) {
            constraintLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(constraintLayout);
            }
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f867k = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f873q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.f860d = 0;
        }
        smartCircleImageView.setId(R.id.dy9);
        smartCircleImageView.setLayoutParams(layoutParams);
        if (smartCircleImageView.getParent() == null) {
            constraintLayout.addView(smartCircleImageView);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f867k = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f873q = R.id.dy9;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.f860d = R.id.dy9;
        }
        smartCircleImageView2.setId(R.id.dy_);
        smartCircleImageView2.setLayoutParams(layoutParams2);
        if (smartCircleImageView2.getParent() == null) {
            constraintLayout.addView(smartCircleImageView2);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f863g = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f875s = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f867k = 0;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        autoRTLImageView.setImageResource(R.drawable.cj8);
        autoRTLImageView.setId(R.id.aao);
        autoRTLImageView.setLayoutParams(layoutParams3);
        if (autoRTLImageView.getParent() == null) {
            constraintLayout.addView(autoRTLImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f861e = R.id.dy_;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f872p = R.id.dy_;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f864h = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f867k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f862f = R.id.aao;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f874r = R.id.aao;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics());
        }
        dmtTextView.setTextColor(resources.getColorStateList(R.color.avn));
        dmtTextView.setTypeface(Typeface.create(C46776g.f118133a, 0));
        dmtTextView.setId(R.id.a4e);
        dmtTextView.setFontType("medium");
        dmtTextView.setLayoutParams(layoutParams4);
        if (dmtTextView.getParent() == null) {
            constraintLayout.addView(dmtTextView);
        }
        C1522a.m5435a(constraintLayout);
        C1522a.m5435a(smartCircleImageView);
        C1522a.m5435a(smartCircleImageView2);
        C1522a.m5435a(autoRTLImageView);
        C1522a.m5435a(dmtTextView);
        return constraintLayout;
    }
}
