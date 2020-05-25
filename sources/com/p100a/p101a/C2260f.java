package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
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
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.f */
public final class C2260f implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, (int) resources.getDimension(R.dimen.yh));
        linearLayout.setBackgroundColor(resources.getColor(R.color.w));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setImageResource(R.drawable.cs6);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.aeb);
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setMaxLines(1);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a4h));
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(dmtTextView);
        return linearLayout;
    }
}
