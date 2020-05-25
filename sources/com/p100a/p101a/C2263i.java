package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.i */
public final class C2263i implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -1);
        feedSwipeRefreshLayout.setId(R.id.caw);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        if (viewGroup != null) {
            feedSwipeRefreshLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(feedSwipeRefreshLayout);
            }
        }
        LoadMoreFrameLayout loadMoreFrameLayout = new LoadMoreFrameLayout(context);
        MarginLayoutParams a2 = C1522a.m5434a(feedSwipeRefreshLayout, -1, -1);
        loadMoreFrameLayout.setId(R.id.bhz);
        loadMoreFrameLayout.setLayoutParams(a2);
        if (loadMoreFrameLayout.getParent() == null) {
            feedSwipeRefreshLayout.addView(loadMoreFrameLayout);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        MarginLayoutParams a3 = C1522a.m5434a(loadMoreFrameLayout, -1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(a3);
        if (linearLayout.getParent() == null) {
            loadMoreFrameLayout.addView(linearLayout);
        }
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(R.id.d3i);
        view.setBackgroundColor(resources.getColor(R.color.ip));
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        VerticalViewPager verticalViewPager = new VerticalViewPager(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        verticalViewPager.setId(R.id.ds2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 48;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        verticalViewPager.setLayoutParams(layoutParams2);
        if (verticalViewPager.getParent() == null) {
            linearLayout.addView(verticalViewPager);
        }
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view2.setId(R.id.ma);
        view2.setBackgroundColor(resources.getColor(R.color.ip));
        view2.setLayoutParams(layoutParams3);
        if (view2.getParent() == null) {
            linearLayout.addView(view2);
        }
        ViewStub viewStub = new ViewStub(context);
        MarginLayoutParams a4 = C1522a.m5434a(loadMoreFrameLayout, -1, -1);
        viewStub.setId(R.id.dxn);
        viewStub.setInflatedId(R.id.dxm);
        viewStub.setLayoutResource(R.layout.b5m);
        viewStub.setLayoutParams(a4);
        if (viewStub.getParent() == null) {
            loadMoreFrameLayout.addView(viewStub);
        }
        View a5 = C2281a.m6815a(context, R.layout.b5s, loadMoreFrameLayout, false, 0);
        if (!(a5 == null || a5 == loadMoreFrameLayout)) {
            a5.setLayoutParams(C1522a.m5434a(loadMoreFrameLayout, -1, -2));
            if (a5.getParent() == null) {
                loadMoreFrameLayout.addView(a5);
            }
        }
        DiggLayout diggLayout = new DiggLayout(context);
        MarginLayoutParams a6 = C1522a.m5434a(loadMoreFrameLayout, -1, -1);
        diggLayout.setId(R.id.a5q);
        if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
            ((RelativeLayout.LayoutParams) a6).addRule(13, -1);
        }
        diggLayout.setLayoutParams(a6);
        if (diggLayout.getParent() == null) {
            loadMoreFrameLayout.addView(diggLayout);
        }
        C1522a.m5435a(feedSwipeRefreshLayout);
        C1522a.m5435a(loadMoreFrameLayout);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(view);
        C1522a.m5435a(verticalViewPager);
        C1522a.m5435a(view2);
        C1522a.m5435a(viewStub);
        C1522a.m5435a(a5);
        C1522a.m5435a(diggLayout);
        return feedSwipeRefreshLayout;
    }
}
