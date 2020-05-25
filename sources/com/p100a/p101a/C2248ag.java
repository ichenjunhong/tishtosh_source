package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
import android.support.p043v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.VideoSeekBar;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainBottomTabView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ag */
public final class C2248ag implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        ViewStub viewStub;
        int i;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        boolean z2;
        ViewStub viewStub2;
        boolean z3;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        fragmentTabHost.setId(R.id.bjx);
        if (viewGroup2 != null) {
            fragmentTabHost.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(fragmentTabHost);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        MarginLayoutParams a2 = C1522a.m5434a(fragmentTabHost, -1, -1);
        frameLayout.setBackgroundDrawable(null);
        frameLayout.setId(R.id.bjt);
        frameLayout.setLayoutParams(a2);
        if (frameLayout.getParent() == null) {
            fragmentTabHost.addView(frameLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(R.id.cwo);
        frameLayout2.setLayoutParams(layoutParams);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view.setId(R.id.mb);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        view.setBackgroundColor(resources.getColor(R.color.vr));
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            frameLayout.addView(view);
        }
        ViewStub viewStub3 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setId(R.id.a1k);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.aby, typedValue, true);
        viewStub3.setLayoutResource(typedValue.resourceId);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388693;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        }
        viewStub3.setLayoutParams(layoutParams3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3);
        }
        MainBottomTabView mainBottomTabView = new MainBottomTabView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a05));
        mainBottomTabView.setId(R.id.bjs);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        mainBottomTabView.setLayoutParams(layoutParams4);
        if (mainBottomTabView.getParent() == null) {
            frameLayout.addView(mainBottomTabView);
        }
        VideoSeekBar videoSeekBar = new VideoSeekBar(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        videoSeekBar.setId(R.id.dq2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        videoSeekBar.setVisibility(8);
        videoSeekBar.setLayoutParams(layoutParams5);
        if (videoSeekBar.getParent() == null) {
            frameLayout.addView(videoSeekBar);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        linearLayout.setId(R.id.dq3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 81;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        linearLayout.setLayoutParams(layoutParams6);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView2.setId(R.id.a2s);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.at0));
        appCompatTextView2.setTextSize(1, 24.0f);
        appCompatTextView2.setLayoutParams(layoutParams7);
        if (appCompatTextView2.getParent() == null) {
            linearLayout.addView(appCompatTextView2);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        AppCompatTextView appCompatTextView3 = appCompatTextView2;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        appCompatImageView2.setImageResource(R.drawable.dg2);
        appCompatImageView2.setLayoutParams(layoutParams8);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2);
        }
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView4.setId(R.id.d3w);
        appCompatTextView4.setTextColor(resources.getColorStateList(R.color.ass));
        appCompatTextView4.setTextSize(1, 24.0f);
        appCompatTextView4.setLayoutParams(layoutParams9);
        if (appCompatTextView4.getParent() == null) {
            linearLayout.addView(appCompatTextView4);
        }
        ViewStub viewStub4 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        viewStub4.setId(R.id.cug);
        viewStub4.setInflatedId(R.id.b3x);
        viewStub4.setLayoutResource(R.layout.b76);
        viewStub4.setLayoutParams(layoutParams10);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4);
        }
        ViewStub viewStub5 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
        viewStub5.setId(R.id.pm);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            viewStub = viewStub4;
            i = 81;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 81;
        } else {
            viewStub = viewStub4;
            i = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            appCompatTextView = appCompatTextView4;
            appCompatImageView = appCompatImageView2;
            z2 = true;
            layoutParams11.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        } else {
            appCompatTextView = appCompatTextView4;
            appCompatImageView = appCompatImageView2;
            z2 = true;
        }
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ad_, typedValue2, z2);
        viewStub5.setLayoutResource(typedValue2.resourceId);
        viewStub5.setLayoutParams(layoutParams11);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5);
        }
        ViewStub viewStub6 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
        viewStub6.setId(R.id.pl);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = 8388691;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams12) || VERSION.SDK_INT < 17) {
            viewStub2 = viewStub5;
            z3 = true;
        } else {
            viewStub2 = viewStub5;
            z3 = true;
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(z3, 40.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.bottomMargin = (int) TypedValue.applyDimension(z3 ? 1 : 0, 44.0f, resources.getDisplayMetrics());
        }
        TypedValue typedValue3 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ada, typedValue3, z3);
        viewStub6.setLayoutResource(typedValue3.resourceId);
        viewStub6.setLayoutParams(layoutParams12);
        if (viewStub6.getParent() == null) {
            frameLayout.addView(viewStub6);
        }
        View a3 = C2281a.m6815a(context2, R.layout.bv1, frameLayout, false, 0);
        if (!(a3 == null || a3 == frameLayout)) {
            FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
                i2 = 80;
                ((LinearLayout.LayoutParams) layoutParams13).gravity = 80;
            } else {
                i2 = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
                layoutParams13.gravity = i2;
            }
            a3.setVisibility(8);
            a3.setLayoutParams(layoutParams13);
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        View view2 = new View(context2);
        MarginLayoutParams a4 = C1522a.m5434a(fragmentTabHost, -1, -1);
        view2.setId(R.id.dtd);
        view2.setAlpha(0.0f);
        view2.setBackgroundColor(Color.parseColor("#111111"));
        view2.setVisibility(8);
        view2.setLayoutParams(a4);
        if (view2.getParent() == null) {
            fragmentTabHost.addView(view2);
        }
        C1522a.m5435a(fragmentTabHost);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(frameLayout2);
        C1522a.m5435a(view);
        viewStub3.setInflatedId(-1);
        C1522a.m5435a(viewStub3);
        C1522a.m5435a(mainBottomTabView);
        C1522a.m5435a(videoSeekBar);
        C1522a.m5435a(linearLayout);
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        appCompatTextView5.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(appCompatTextView5);
        C1522a.m5435a(appCompatImageView);
        AppCompatTextView appCompatTextView6 = appCompatTextView;
        appCompatTextView6.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(appCompatTextView6);
        C1522a.m5435a(viewStub);
        ViewStub viewStub7 = viewStub2;
        viewStub7.setInflatedId(-1);
        C1522a.m5435a(viewStub7);
        viewStub6.setInflatedId(-1);
        C1522a.m5435a(viewStub6);
        C1522a.m5435a(a3);
        C1522a.m5435a(view2);
        return fragmentTabHost;
    }
}
