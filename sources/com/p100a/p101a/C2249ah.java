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
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ah */
public final class C2249ah implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -2);
        relativeLayout.setId(R.id.cy2);
        relativeLayout.setVisibility(8);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        relativeLayout2.setId(R.id.cy1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.aqa);
        appCompatImageView.setImageResource(R.drawable.czk);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            relativeLayout2.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        dmtTextView.setTextSize(1, 16.0f);
        dmtTextView.setId(R.id.dhb);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(17, R.id.aqa);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(1, R.id.aqa);
        }
        dmtTextView.setGravity(17);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.a4p));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setText(R.string.ahz);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.jg));
        dmtTextView.setFontType("bold");
        dmtTextView.setLayoutParams(layoutParams3);
        if (dmtTextView.getParent() == null) {
            relativeLayout2.addView(dmtTextView);
        }
        AnimatedImageView animatedImageView = new AnimatedImageView(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics()));
        animatedImageView.setId(R.id.ezf);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.setMargins((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        animatedImageView.setScaleType(ScaleType.CENTER_INSIDE);
        animatedImageView.setVisibility(8);
        animatedImageView.setLayoutParams(layoutParams4);
        if (animatedImageView.getParent() == null) {
            relativeLayout.addView(animatedImageView);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(relativeLayout2);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(animatedImageView);
        return relativeLayout;
    }
}
