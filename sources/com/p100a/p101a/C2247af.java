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
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.CustomInterceptTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.af */
public final class C2247af implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        LinearLayout linearLayout;
        int i;
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        frameLayout.setId(R.id.ahd);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        swipeRefreshLayout.setId(R.id.crb);
        swipeRefreshLayout.setLayoutParams(layoutParams);
        if (swipeRefreshLayout.getParent() == null) {
            frameLayout.addView(swipeRefreshLayout);
        }
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout = new CustomInterceptTouchEventFrameLayout(context2);
        MarginLayoutParams a2 = C1522a.m5434a(swipeRefreshLayout, -1, -1);
        customInterceptTouchEventFrameLayout.setId(R.id.agx);
        customInterceptTouchEventFrameLayout.setLayoutParams(a2);
        if (customInterceptTouchEventFrameLayout.getParent() == null) {
            swipeRefreshLayout.addView(customInterceptTouchEventFrameLayout);
        }
        FlippableViewPager flippableViewPager = new FlippableViewPager(context2);
        MarginLayoutParams a3 = C1522a.m5434a(customInterceptTouchEventFrameLayout, -1, -1);
        flippableViewPager.setId(R.id.ds2);
        flippableViewPager.setLayoutParams(a3);
        if (flippableViewPager.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(flippableViewPager);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        MarginLayoutParams a4 = C1522a.m5434a(customInterceptTouchEventFrameLayout, -1, -2);
        appCompatImageView.setId(R.id.d1i);
        appCompatImageView.setImageResource(R.drawable.cyq);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setLayoutParams(a4);
        if (appCompatImageView.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(appCompatImageView);
        }
        ViewStub viewStub = new ViewStub(context2);
        MarginLayoutParams a5 = C1522a.m5434a(customInterceptTouchEventFrameLayout, (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        viewStub.setId(R.id.dt9);
        if (MarginLayoutParams.class.isInstance(a5)) {
            a5.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.adq, typedValue, true);
        viewStub.setLayoutResource(typedValue.resourceId);
        viewStub.setLayoutParams(a5);
        if (viewStub.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(viewStub);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        MarginLayoutParams a6 = C1522a.m5434a(customInterceptTouchEventFrameLayout, -1, -1);
        linearLayout2.setId(R.id.d12);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(a6);
        if (linearLayout2.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(linearLayout2);
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(R.id.csm);
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            linearLayout2.addView(view);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        frameLayout3.setLayoutParams(layoutParams3);
        if (frameLayout3.getParent() == null) {
            frameLayout2.addView(frameLayout3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context2);
        View view2 = view;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        frameLayout4.setId(R.id.ejm);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 8388627;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams4) || VERSION.SDK_INT < 17) {
            linearLayout = linearLayout2;
            i = 1;
        } else {
            linearLayout = linearLayout2;
            i = 1;
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(i, 16.0f, resources.getDisplayMetrics());
        }
        frameLayout4.setVisibility(8);
        frameLayout4.setLayoutParams(layoutParams4);
        if (frameLayout4.getParent() == null) {
            frameLayout3.addView(frameLayout4);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        ViewStub viewStub2 = viewStub;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setId(R.id.ejn);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = i2;
        }
        appCompatImageView2.setScaleType(ScaleType.CENTER_INSIDE);
        appCompatImageView2.setImageResource(R.drawable.d1r);
        appCompatImageView2.setLayoutParams(layoutParams5);
        if (appCompatImageView2.getParent() == null) {
            frameLayout4.addView(appCompatImageView2);
        }
        FrameLayout frameLayout5 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout5.setId(R.id.ce3);
        frameLayout5.setLayoutParams(layoutParams6);
        if (frameLayout5.getParent() == null) {
            frameLayout3.addView(frameLayout5);
        }
        MainTabStrip mainTabStrip = new MainTabStrip(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        mainTabStrip.setId(R.id.bvy);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = i3;
        }
        mainTabStrip.setBackgroundColor(resources.getColor(R.color.arz));
        mainTabStrip.setLayoutParams(layoutParams7);
        if (mainTabStrip.getParent() == null) {
            frameLayout5.addView(mainTabStrip);
        }
        View view3 = new View(context2);
        MainTabStrip mainTabStrip2 = mainTabStrip;
        AppCompatImageView appCompatImageView3 = appCompatImageView2;
        FrameLayout frameLayout6 = frameLayout4;
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        view3.setId(R.id.el7);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((LinearLayout.LayoutParams) layoutParams8).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.bottomMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        view3.setBackgroundResource(R.drawable.cyn);
        view3.setVisibility(8);
        view3.setLayoutParams(layoutParams8);
        if (view3.getParent() == null) {
            frameLayout5.addView(view3);
        }
        ViewStub viewStub3 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setId(R.id.bjv);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 8388629;
        }
        viewStub3.setLayoutParams(layoutParams9);
        if (viewStub3.getParent() == null) {
            frameLayout5.addView(viewStub3);
        }
        View a7 = C2281a.m6815a(context2, R.layout.bbs, frameLayout2, false, 0);
        if (!(a7 == null || a7 == frameLayout2)) {
            a7.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (a7.getParent() == null) {
                frameLayout2.addView(a7);
            }
        }
        FrameLayout frameLayout7 = new FrameLayout(context2);
        View view4 = a7;
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout7.setId(R.id.agv);
        frameLayout7.setLayoutParams(layoutParams10);
        if (frameLayout7.getParent() == null) {
            frameLayout.addView(frameLayout7);
        }
        View view5 = new View(context2);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a05));
        view5.setId(R.id.do7);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i4 = 80;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 80;
        } else {
            i4 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i4;
        }
        view5.setBackgroundColor(resources.getColor(R.color.a49));
        view5.setVisibility(8);
        view5.setLayoutParams(layoutParams11);
        if (view5.getParent() == null) {
            frameLayout.addView(view5);
        }
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(swipeRefreshLayout);
        C1522a.m5435a(customInterceptTouchEventFrameLayout);
        C1522a.m5435a(flippableViewPager);
        C1522a.m5435a(appCompatImageView);
        ViewStub viewStub4 = viewStub2;
        viewStub4.setInflatedId(-1);
        C1522a.m5435a(viewStub4);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(view2);
        C1522a.m5435a(frameLayout2);
        C1522a.m5435a(frameLayout3);
        C1522a.m5435a(frameLayout6);
        C1522a.m5435a(appCompatImageView3);
        C1522a.m5435a(frameLayout5);
        C1522a.m5435a(mainTabStrip2);
        C1522a.m5435a(view3);
        viewStub3.setInflatedId(-1);
        C1522a.m5435a(viewStub3);
        C1522a.m5435a(view4);
        C1522a.m5435a(frameLayout7);
        C1522a.m5435a(view5);
        return frameLayout;
    }
}
