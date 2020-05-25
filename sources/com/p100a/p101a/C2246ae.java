package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ae */
public final class C2246ae implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        frameLayout.setId(R.id.am3);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        scrollableViewPager.setId(R.id.ds2);
        scrollableViewPager.setLayoutParams(layoutParams);
        if (scrollableViewPager.getParent() == null) {
            frameLayout.addView(scrollableViewPager);
        }
        DisLikeAwemeLayout disLikeAwemeLayout = new DisLikeAwemeLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        disLikeAwemeLayout.setId(R.id.a6b);
        disLikeAwemeLayout.setVisibility(8);
        disLikeAwemeLayout.setLayoutParams(layoutParams2);
        if (disLikeAwemeLayout.getParent() == null) {
            frameLayout.addView(disLikeAwemeLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout2.setId(R.id.cu7);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 51;
        }
        appCompatImageView.setImageResource(R.drawable.df1);
        appCompatImageView.setLayoutParams(layoutParams4);
        if (appCompatImageView.getParent() == null) {
            frameLayout.addView(appCompatImageView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 53;
        }
        appCompatImageView2.setImageResource(R.drawable.df2);
        appCompatImageView2.setLayoutParams(layoutParams5);
        if (appCompatImageView2.getParent() == null) {
            frameLayout.addView(appCompatImageView2);
        }
        View a2 = C2281a.m6815a(context2, R.layout.b3h, frameLayout, false, R.layout.bbk);
        if (!(a2 == null || a2 == frameLayout)) {
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
            a2.setVisibility(8);
            a2.setLayoutParams(layoutParams6);
            if (a2.getParent() == null) {
                frameLayout.addView(a2);
            }
        }
        View a3 = C2281a.m6815a(context2, R.layout.axo, frameLayout, false, R.layout.bbk);
        if (!(a3 == null || a3 == frameLayout)) {
            a3.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics())));
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(R.id.dwq);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ab1, typedValue, true);
        viewStub.setLayoutResource(typedValue.resourceId);
        viewStub.setLayoutParams(layoutParams7);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(scrollableViewPager);
        C1522a.m5435a(disLikeAwemeLayout);
        C1522a.m5435a(frameLayout2);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(appCompatImageView2);
        C1522a.m5435a(a2);
        C1522a.m5435a(a3);
        viewStub.setInflatedId(-1);
        C1522a.m5435a(viewStub);
        return frameLayout;
    }
}
