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
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PressFadeFrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.aj */
public final class C2251aj implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        PressFadeFrameLayout pressFadeFrameLayout = new PressFadeFrameLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        pressFadeFrameLayout.setId(R.id.b92);
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).bottomMargin = (int) TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a)) {
            ((MarginLayoutParams) a).topMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        pressFadeFrameLayout.setVisibility(8);
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding(pressFadeFrameLayout.getPaddingLeft(), pressFadeFrameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingBottom());
        pressFadeFrameLayout.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), pressFadeFrameLayout.getPaddingTop(), pressFadeFrameLayout.getPaddingRight(), pressFadeFrameLayout.getPaddingBottom());
        if (viewGroup != null) {
            pressFadeFrameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(pressFadeFrameLayout);
            }
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        MarginLayoutParams a2 = C1522a.m5434a(pressFadeFrameLayout, -1, -1);
        ((C13833a) remoteImageView.getHierarchy()).mo25904b(resources.getDrawable(R.color.a0u));
        remoteImageView.setId(R.id.asr);
        remoteImageView.setBackgroundColor(resources.getColor(R.color.a0u));
        ((C13833a) remoteImageView.getHierarchy()).mo25898a(C13818b.f36067g);
        remoteImageView.setLayoutParams(a2);
        if (remoteImageView.getParent() == null) {
            pressFadeFrameLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        MarginLayoutParams a3 = C1522a.m5434a(pressFadeFrameLayout, -2, -2);
        dmtTextView.setTextSize(1, 14.0f);
        dmtTextView.setId(R.id.de1);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setTextColor(resources.getColorStateList(R.color.a17));
        dmtTextView.setLayoutParams(a3);
        if (dmtTextView.getParent() == null) {
            pressFadeFrameLayout.addView(dmtTextView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        MarginLayoutParams a4 = C1522a.m5434a(pressFadeFrameLayout, -2, -2);
        appCompatImageView.setId(R.id.asq);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            ((LinearLayout.LayoutParams) a4).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = 8388629;
        }
        if (MarginLayoutParams.class.isInstance(a4) && VERSION.SDK_INT >= 17) {
            a4.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setImageResource(R.drawable.b7c);
        appCompatImageView.setLayoutParams(a4);
        if (appCompatImageView.getParent() == null) {
            pressFadeFrameLayout.addView(appCompatImageView);
        }
        C1522a.m5435a(pressFadeFrameLayout);
        C1522a.m5435a(remoteImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(appCompatImageView);
        return pressFadeFrameLayout;
    }
}
