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
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.v */
public final class C2276v implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), -2);
        linearLayout.setId(R.id.a5t);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.ahq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setVisibility(8);
        appCompatImageView.setLayoutParams(layoutParams);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.ahr);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setVisibility(8);
        appCompatImageView2.setLayoutParams(layoutParams2);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setId(R.id.ahs);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, -36.0f, resources.getDisplayMetrics());
        }
        appCompatImageView3.setVisibility(8);
        appCompatImageView3.setLayoutParams(layoutParams3);
        if (appCompatImageView3.getParent() == null) {
            linearLayout.addView(appCompatImageView3);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.ht), (int) resources.getDimension(R.dimen.hq));
        frameLayout.setBackgroundResource(R.drawable.ke);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.cmz);
        frameLayout.setLayoutParams(layoutParams4);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -1);
        remoteImageView.setId(R.id.cn8);
        remoteImageView.setImageResource(R.drawable.dfc);
        remoteImageView.setLayoutParams(layoutParams5);
        if (remoteImageView.getParent() == null) {
            frameLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), -2);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(R.color.n5));
        dmtTextView.setTextColor(resources.getColorStateList(R.color.v6));
        dmtTextView.setId(R.id.cn1);
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, -1.4f, resources.getDisplayMetrics());
        }
        dmtTextView.setGravity(17);
        dmtTextView.setLayoutParams(layoutParams6);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(appCompatImageView2);
        C1522a.m5435a(appCompatImageView3);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(remoteImageView);
        C1522a.m5435a(dmtTextView);
        return linearLayout;
    }
}
