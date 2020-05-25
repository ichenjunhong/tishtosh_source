package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
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

/* renamed from: com.a.a.g */
public final class C2261g implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        linearLayout.setId(R.id.dp);
        linearLayout.setBackgroundColor(resources.getColor(R.color.aty));
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, -48.0f, resources.getDisplayMetrics());
        }
        linearLayout.setOrientation(0);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.axv);
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setImageResource(R.drawable.cst);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.d6m);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setText(R.string.b1l);
        dmtTextView.setGravity(16);
        dmtTextView.setFontType("medium");
        dmtTextView.setTextColor(resources.getColorStateList(R.color.vc));
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        return linearLayout;
    }
}
