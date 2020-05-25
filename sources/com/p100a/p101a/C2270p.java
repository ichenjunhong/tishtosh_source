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
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.p */
public final class C2270p implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        relativeLayout.setBackgroundColor(resources.getColor(R.color.a4o));
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.aqa);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setImageResource(R.drawable.csh);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        dmtTextView.setTextSize(1, 12.0f);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, R.id.aqa);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(1, R.id.aqa);
        }
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setText(R.string.bar);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.aod));
        dmtTextView.setId(R.id.cmx);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(0, R.id.aao);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, R.id.aao);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setMaxLines(1);
        dmtTextView.setEllipsize(TruncateAt.END);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            relativeLayout.addView(dmtTextView);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        autoRTLImageView.setScaleType(ScaleType.CENTER);
        autoRTLImageView.setImageResource(R.drawable.cwd);
        autoRTLImageView.setId(R.id.aao);
        autoRTLImageView.setLayoutParams(layoutParams3);
        if (autoRTLImageView.getParent() == null) {
            relativeLayout.addView(autoRTLImageView);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(autoRTLImageView);
        return relativeLayout;
    }
}
