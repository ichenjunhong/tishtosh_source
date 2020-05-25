package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
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
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceComtEggLayout;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.c */
public final class C2257c implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        DmtTextView dmtTextView;
        int i;
        int i2;
        AppCompatImageView appCompatImageView;
        int i3;
        LinearLayout linearLayout;
        int i4;
        DmtTextView dmtTextView2;
        View view;
        float f;
        int i5;
        int i6;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        CommentNestedLayout commentNestedLayout = new CommentNestedLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        commentNestedLayout.setId(R.id.cfg);
        commentNestedLayout.setTranslationY(TypedValue.applyDimension(1, 500.0f, resources.getDisplayMetrics()));
        commentNestedLayout.setOrientation(1);
        if (viewGroup2 != null) {
            commentNestedLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(commentNestedLayout);
            }
        }
        View view2 = new View(context2);
        MarginLayoutParams a2 = C1522a.m5434a(commentNestedLayout, -1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view2.setId(R.id.xe);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).weight = 1.0f;
        }
        view2.setLayoutParams(a2);
        if (view2.getParent() == null) {
            commentNestedLayout.addView(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        MarginLayoutParams a3 = C1522a.m5434a(commentNestedLayout, -1, -2);
        frameLayout.setId(R.id.ags);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 80;
        }
        frameLayout.setBackgroundResource(R.drawable.chp);
        frameLayout.setLayoutParams(a3);
        if (frameLayout.getParent() == null) {
            commentNestedLayout.addView(frameLayout);
        }
        CommerceComtEggLayout commerceComtEggLayout = new CommerceComtEggLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        commerceComtEggLayout.setId(R.id.yl);
        commerceComtEggLayout.setLayoutParams(layoutParams);
        if (commerceComtEggLayout.getParent() == null) {
            frameLayout.addView(commerceComtEggLayout);
        }
        CommerceEggLayout commerceEggLayout = new CommerceEggLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        commerceEggLayout.setId(R.id.e3c);
        commerceEggLayout.setLayoutParams(layoutParams2);
        if (commerceEggLayout.getParent() == null) {
            frameLayout.addView(commerceEggLayout);
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(R.id.e38);
        viewStub.setLayoutParams(layoutParams3);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        linearLayout2.setId(R.id.ekg);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams4);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout2.setId(R.id.z7);
        frameLayout2.setLayoutParams(layoutParams5);
        if (frameLayout2.getParent() == null) {
            linearLayout2.addView(frameLayout2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView3.setTextSize(2, 12.0f);
        dmtTextView3.setId(R.id.title);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView3.setGravity(17);
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.ji));
        dmtTextView3.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView3.setFontType("medium");
        dmtTextView3.setLayoutParams(layoutParams6);
        if (dmtTextView3.getParent() == null) {
            linearLayout2.addView(dmtTextView3);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView4.setTextSize(2, 12.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = 1;
        }
        dmtTextView4.setGravity(17);
        if (!MarginLayoutParams.class.isInstance(layoutParams7) || VERSION.SDK_INT < 17) {
            dmtTextView = dmtTextView3;
        } else {
            dmtTextView = dmtTextView3;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7) && VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            i = 1;
            layoutParams7.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        dmtTextView4.setTextColor(resources.getColorStateList(R.color.a80));
        dmtTextView4.setTypeface(Typeface.defaultFromStyle(i));
        dmtTextView4.setText(R.string.fw8);
        dmtTextView4.setVisibility(8);
        dmtTextView4.setId(R.id.e2w);
        dmtTextView4.setLayoutParams(layoutParams7);
        if (dmtTextView4.getParent() == null) {
            linearLayout2.addView(dmtTextView4);
        }
        View a4 = C2281a.m6815a(context2, R.layout.b20, linearLayout2, false, 0);
        if (!(a4 == null || a4 == linearLayout2)) {
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            a4.setId(R.id.e5n);
            a4.setVisibility(8);
            a4.setLayoutParams(layoutParams8);
            if (a4.getParent() == null) {
                linearLayout2.addView(a4);
            }
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.xs));
        frameLayout3.setId(R.id.e93);
        frameLayout3.setLayoutParams(layoutParams9);
        if (frameLayout3.getParent() == null) {
            linearLayout2.addView(frameLayout3);
        }
        FpsRecyclerView fpsRecyclerView = new FpsRecyclerView(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
        fpsRecyclerView.setId(R.id.ca3);
        fpsRecyclerView.setOverScrollMode(2);
        fpsRecyclerView.setLayoutParams(layoutParams10);
        if (fpsRecyclerView.getParent() == null) {
            frameLayout3.addView(fpsRecyclerView);
        }
        DmtStatusView dmtStatusView = new DmtStatusView(context2);
        FpsRecyclerView fpsRecyclerView2 = fpsRecyclerView;
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
        dmtStatusView.setId(R.id.csv);
        dmtStatusView.setLayoutParams(layoutParams11);
        if (dmtStatusView.getParent() == null) {
            frameLayout3.addView(dmtStatusView);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        View view3 = a4;
        DmtStatusView dmtStatusView2 = dmtStatusView;
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
        linearLayout3.setId(R.id.aix);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParams12).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.gravity = i2;
        }
        linearLayout3.setGravity(i2);
        linearLayout3.setOrientation(1);
        linearLayout3.setVisibility(8);
        linearLayout3.setLayoutParams(layoutParams12);
        if (linearLayout3.getParent() == null) {
            frameLayout3.addView(linearLayout3);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        DmtTextView dmtTextView5 = dmtTextView4;
        FrameLayout frameLayout4 = frameLayout2;
        ViewStub viewStub2 = viewStub;
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setImageResource(R.drawable.cj_);
        appCompatImageView2.setLayoutParams(layoutParams13);
        if (appCompatImageView2.getParent() == null) {
            linearLayout3.addView(appCompatImageView2);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            appCompatImageView = appCompatImageView2;
            layoutParams14.topMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView = appCompatImageView2;
        }
        dmtTextView6.setText(R.string.dd);
        dmtTextView6.setLayoutParams(layoutParams14);
        if (dmtTextView6.getParent() == null) {
            linearLayout3.addView(dmtTextView6);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -1);
        dmtTextView7.setId(R.id.x1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i3 = 17;
            ((LinearLayout.LayoutParams) layoutParams15).gravity = 17;
        } else {
            i3 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = i3;
        }
        dmtTextView7.setGravity(i3);
        dmtTextView7.setText(R.string.a9r);
        dmtTextView7.setVisibility(8);
        dmtTextView7.setLayoutParams(layoutParams15);
        if (dmtTextView7.getParent() == null) {
            frameLayout3.addView(dmtTextView7);
        }
        View view4 = new View(context2);
        DmtTextView dmtTextView8 = dmtTextView7;
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        view4.setId(R.id.e2t);
        view4.setBackgroundColor(resources.getColor(R.color.j4));
        view4.setLayoutParams(layoutParams16);
        if (view4.getParent() == null) {
            linearLayout2.addView(view4);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        View view5 = view4;
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        linearLayout4.setId(R.id.bw2);
        linearLayout4.setOrientation(1);
        linearLayout4.setVisibility(8);
        linearLayout4.setLayoutParams(layoutParams17);
        if (linearLayout4.getParent() == null) {
            linearLayout2.addView(linearLayout4);
        }
        View a5 = C2281a.m6815a(context2, R.layout.b1f, linearLayout2, false, 0);
        if (a5 == null || a5 == linearLayout2) {
            linearLayout = linearLayout4;
        } else {
            linearLayout = linearLayout4;
            LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
            a5.setId(R.id.x2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
                i6 = 80;
                layoutParams18.gravity = 80;
            } else {
                i6 = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
                ((FrameLayout.LayoutParams) layoutParams18).gravity = i6;
            }
            a5.setBackgroundResource(R.drawable.chs);
            a5.setLayoutParams(layoutParams18);
            if (a5.getParent() == null) {
                linearLayout2.addView(a5);
            }
        }
        FrameLayout frameLayout5 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout5.setId(R.id.yx);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i4 = 80;
            ((LinearLayout.LayoutParams) layoutParams19).gravity = 80;
        } else {
            i4 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.gravity = i4;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            dmtTextView2 = dmtTextView6;
            view = a5;
            layoutParams19.bottomMargin = (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView2 = dmtTextView6;
            view = a5;
        }
        frameLayout5.setLayoutParams(layoutParams19);
        if (frameLayout5.getParent() == null) {
            frameLayout.addView(frameLayout5);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        appCompatImageView3.setId(R.id.ik);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = 8388613;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams20) || VERSION.SDK_INT < 17) {
            i5 = 1;
            f = 4.0f;
        } else {
            i5 = 1;
            f = 4.0f;
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.rightMargin = (int) TypedValue.applyDimension(i5, f, resources.getDisplayMetrics());
        }
        appCompatImageView3.setScaleType(ScaleType.CENTER);
        appCompatImageView3.setImageResource(R.drawable.cj4);
        appCompatImageView3.setLayoutParams(layoutParams20);
        if (appCompatImageView3.getParent() == null) {
            frameLayout.addView(appCompatImageView3);
        }
        C1522a.m5435a(commentNestedLayout);
        C1522a.m5435a(view2);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(commerceComtEggLayout);
        C1522a.m5435a(commerceEggLayout);
        ViewStub viewStub3 = viewStub2;
        viewStub3.setInflatedId(-1);
        C1522a.m5435a(viewStub3);
        C1522a.m5435a(linearLayout2);
        C1522a.m5435a(frameLayout4);
        DmtTextView dmtTextView9 = dmtTextView;
        dmtTextView9.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView9);
        DmtTextView dmtTextView10 = dmtTextView5;
        dmtTextView10.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView10);
        C1522a.m5435a(view3);
        C1522a.m5435a(frameLayout3);
        C1522a.m5435a(fpsRecyclerView2);
        C1522a.m5435a(dmtStatusView2);
        C1522a.m5435a(linearLayout3);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(dmtTextView2);
        C1522a.m5435a(dmtTextView8);
        C1522a.m5435a(view5);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(view);
        C1522a.m5435a(frameLayout5);
        C1522a.m5435a(appCompatImageView3);
        return commentNestedLayout;
    }
}
