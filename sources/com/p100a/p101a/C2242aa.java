package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.p2377ug.guide.SwipeUpGuideStrengthenLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.aa */
public final class C2242aa implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = new SwipeUpGuideStrengthenLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        swipeUpGuideStrengthenLayout.setId(R.id.cvw);
        swipeUpGuideStrengthenLayout.setAlpha(0.5f);
        swipeUpGuideStrengthenLayout.setBackgroundColor(Color.parseColor("#7f000000"));
        if (viewGroup2 != null) {
            swipeUpGuideStrengthenLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(swipeUpGuideStrengthenLayout);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        MarginLayoutParams a2 = C1522a.m5434a(swipeUpGuideStrengthenLayout, -1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(a2);
        if (linearLayout.getParent() == null) {
            swipeUpGuideStrengthenLayout.addView(linearLayout);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if (relativeLayout.getParent() == null) {
            linearLayout.addView(relativeLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 196.0f, resources.getDisplayMetrics()));
        appCompatImageView.setPadding((int) TypedValue.applyDimension(1, 65.0f, resources.getDisplayMetrics()), appCompatImageView.getPaddingTop(), appCompatImageView.getPaddingRight(), appCompatImageView.getPaddingBottom());
        appCompatImageView.setId(R.id.eew);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageResource(R.drawable.ct3);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            linearLayout2.addView(appCompatImageView);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.b15);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        animationImageView.setLayoutParams(layoutParams3);
        if (animationImageView.getParent() == null) {
            linearLayout2.addView(animationImageView);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), frameLayout.getPaddingBottom());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        }
        frameLayout.setLayoutParams(layoutParams4);
        if (frameLayout.getParent() == null) {
            linearLayout2.addView(frameLayout);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        dmtTextView.setId(R.id.dgt);
        dmtTextView.setGravity(17);
        dmtTextView.setText(R.string.duu);
        dmtTextView.setTextColor(Color.parseColor("#ffffff"));
        dmtTextView.setFontType("bold");
        dmtTextView.setTextSize(2, 24.0f);
        dmtTextView.setLayoutParams(layoutParams5);
        if (dmtTextView.getParent() == null) {
            frameLayout.addView(dmtTextView);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        dmtTextView2.setId(R.id.f4n);
        dmtTextView2.setGravity(17);
        dmtTextView2.setText(R.string.duu);
        dmtTextView2.setVisibility(8);
        dmtTextView2.setFontType("bold");
        dmtTextView2.setTextColor(Color.parseColor("#ffffff"));
        dmtTextView2.setTextSize(2, 24.0f);
        dmtTextView2.setLayoutParams(layoutParams6);
        if (dmtTextView2.getParent() == null) {
            frameLayout.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        dmtTextView3.setMaxLines(2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 1;
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 1;
        } else {
            i = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = i;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(i, 38.0f, resources.getDisplayMetrics());
        }
        dmtTextView3.setId(R.id.f4m);
        dmtTextView3.setGravity(17);
        dmtTextView3.setVisibility(8);
        dmtTextView3.setTextColor(Color.parseColor("#ffffff"));
        dmtTextView3.setText(R.string.ghr);
        dmtTextView3.setTextSize(2, 20.0f);
        dmtTextView3.setLayoutParams(layoutParams7);
        if (dmtTextView3.getParent() == null) {
            frameLayout.addView(dmtTextView3);
        }
        C1522a.m5435a(swipeUpGuideStrengthenLayout);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(linearLayout2);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(animationImageView);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(dmtTextView2);
        dmtTextView3.setLineSpacing(TypedValue.applyDimension(2, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView3);
        return swipeUpGuideStrengthenLayout;
    }
}
