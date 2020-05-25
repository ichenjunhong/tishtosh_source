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
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.x */
public final class C2278x implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -2);
        linearLayout.setBackgroundColor(resources.getColor(R.color.a2y));
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.dih);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.csc), dmtTextView.getCompoundDrawablesRelative()[1], dmtTextView.getCompoundDrawablesRelative()[2], dmtTextView.getCompoundDrawablesRelative()[3]);
        dmtTextView.setText(R.string.fd_);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a2d));
        dmtTextView.setLayoutParams(layoutParams);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setId(R.id.a62);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        dmtTextView2.setBackgroundResource(R.drawable.cs1);
        dmtTextView2.setGravity(17);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
        dmtTextView2.setText(R.string.aq6);
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.axp));
        dmtTextView2.setTextSize(2, 15.0f);
        dmtTextView2.setLayoutParams(layoutParams3);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView3.setId(R.id.eo);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1.0f;
        }
        dmtTextView3.setBackgroundResource(R.drawable.cs1);
        dmtTextView3.setGravity(17);
        dmtTextView3.setIncludeFontPadding(false);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
        dmtTextView3.setText(R.string.he);
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.axp));
        dmtTextView3.setTextSize(2, 15.0f);
        dmtTextView3.setLayoutParams(layoutParams4);
        if (dmtTextView3.getParent() == null) {
            linearLayout2.addView(dmtTextView3);
        }
        C1522a.m5435a(linearLayout);
        dmtTextView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.csc), null, null, null);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(linearLayout2);
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView2);
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView3);
        return linearLayout;
    }
}
