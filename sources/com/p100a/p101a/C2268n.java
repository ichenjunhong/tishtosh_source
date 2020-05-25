package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p043v7.widget.AppCompatImageView;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FollowFeedTagGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.n */
public final class C2268n implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        AppCompatImageView appCompatImageView;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        View view;
        AppCompatImageView appCompatImageView2;
        View view2;
        int i10;
        int i11;
        LinearLayout linearLayout;
        int i12;
        int i13;
        DmtTextView dmtTextView;
        int i14;
        float f2;
        AppCompatImageView appCompatImageView3;
        int i15;
        DmtTextView dmtTextView2;
        int i16;
        int i17;
        LinearLayout linearLayout2;
        int i18;
        int i19;
        int i20;
        float f3;
        int i21;
        int i22;
        DmtTextView dmtTextView3;
        int i23;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        linearLayout3.setGravity(80);
        linearLayout3.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout3.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout3);
            }
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout4.setId(R.id.c12);
        linearLayout4.setBackgroundColor(Color.parseColor("#58292929"));
        linearLayout4.setOrientation(1);
        linearLayout4.setLayoutParams(layoutParams);
        if (linearLayout4.getParent() == null) {
            linearLayout3.addView(linearLayout4);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics()));
        linearLayout5.setId(R.id.c11);
        linearLayout5.setGravity(16);
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(layoutParams2);
        if (linearLayout5.getParent() == null) {
            linearLayout4.addView(linearLayout5);
        }
        AvatarImageView avatarImageView = new AvatarImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        avatarImageView.setId(R.id.eex);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        avatarImageView.setBackgroundResource(R.drawable.cms);
        avatarImageView.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView.setVisibility(8);
        avatarImageView.setLayoutParams(layoutParams3);
        if (avatarImageView.getParent() == null) {
            linearLayout5.addView(avatarImageView);
        }
        AvatarImageView avatarImageView2 = new AvatarImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        avatarImageView2.setId(R.id.eey);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        avatarImageView2.setBackgroundResource(R.drawable.cms);
        avatarImageView2.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        avatarImageView2.setVisibility(8);
        avatarImageView2.setLayoutParams(layoutParams4);
        if (avatarImageView2.getParent() == null) {
            linearLayout5.addView(avatarImageView2);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.b27);
        remoteImageView.setScaleType(ScaleType.CENTER_CROP);
        remoteImageView.setImageResource(R.drawable.dfn);
        C13833a aVar = (C13833a) remoteImageView.getHierarchy();
        C13837e eVar = aVar.f36079a;
        aVar.mo25899a(eVar == null ? C13837e.m28113b(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())) : eVar.mo25932a(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        remoteImageView.setLayoutParams(layoutParams5);
        if (remoteImageView.getParent() == null) {
            linearLayout5.addView(remoteImageView);
        }
        FollowFeedTagGroup followFeedTagGroup = new FollowFeedTagGroup(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            i = 16;
            layoutParams6.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((FrameLayout.LayoutParams) layoutParams6).gravity = i;
        }
        followFeedTagGroup.setLayoutParams(layoutParams6);
        if (followFeedTagGroup.getParent() == null) {
            linearLayout5.addView(followFeedTagGroup);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        MarginLayoutParams a2 = C1522a.m5434a(followFeedTagGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        dmtTextView4.setTextSize(1, 13.0f);
        dmtTextView4.setId(R.id.bi8);
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) a2).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = i2;
        }
        dmtTextView4.setEllipsize(TruncateAt.END);
        dmtTextView4.setGravity(17);
        dmtTextView4.setMaxLines(1);
        dmtTextView4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView4.getPaddingTop(), dmtTextView4.getPaddingRight(), dmtTextView4.getPaddingBottom());
        dmtTextView4.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView4.getPaddingTop(), dmtTextView4.getPaddingRight(), dmtTextView4.getPaddingBottom());
        dmtTextView4.setTextColor(resources.getColorStateList(R.color.iu));
        dmtTextView4.setLayoutParams(a2);
        if (dmtTextView4.getParent() == null) {
            followFeedTagGroup.addView(dmtTextView4);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
        MarginLayoutParams a3 = C1522a.m5434a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        appCompatImageView4.setId(R.id.a6n);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            i3 = 16;
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = i3;
        }
        if (!MarginLayoutParams.class.isInstance(a3) || VERSION.SDK_INT < 17) {
            i4 = 1;
        } else {
            i4 = 1;
            a3.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(i4, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.rightMargin = (int) TypedValue.applyDimension(i4, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3) && VERSION.SDK_INT >= 17) {
            a3.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView4.setBackgroundColor(resources.getColor(R.color.a24));
        appCompatImageView4.setLayoutParams(a3);
        if (appCompatImageView4.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView4);
        }
        View view3 = new View(context2);
        MarginLayoutParams a4 = C1522a.m5434a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        view3.setId(R.id.co0);
        if (LinearLayout.LayoutParams.class.isInstance(a4)) {
            i5 = 16;
            ((LinearLayout.LayoutParams) a4).gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a4)) {
            ((FrameLayout.LayoutParams) a4).gravity = i5;
        }
        if (MarginLayoutParams.class.isInstance(a4)) {
            appCompatImageView = appCompatImageView4;
            f = 4.0f;
            i6 = 1;
            a4.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView = appCompatImageView4;
            f = 4.0f;
            i6 = 1;
        }
        if (MarginLayoutParams.class.isInstance(a4)) {
            a4.rightMargin = (int) TypedValue.applyDimension(i6, f, resources.getDisplayMetrics());
        }
        view3.setAlpha(0.34f);
        view3.setBackgroundResource(R.drawable.crq);
        view3.setVisibility(8);
        view3.setLayoutParams(a4);
        if (view3.getParent() == null) {
            followFeedTagGroup.addView(view3);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        MarginLayoutParams a5 = C1522a.m5434a(followFeedTagGroup, -2, -2);
        dmtTextView5.setTextSize(1, 11.0f);
        dmtTextView5.setId(R.id.f5s);
        if (LinearLayout.LayoutParams.class.isInstance(a5)) {
            i7 = 16;
            ((LinearLayout.LayoutParams) a5).gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a5)) {
            ((FrameLayout.LayoutParams) a5).gravity = i7;
        }
        dmtTextView5.setEllipsize(TruncateAt.END);
        dmtTextView5.setMaxLines(1);
        dmtTextView5.setTextColor(resources.getColorStateList(R.color.a1o));
        dmtTextView5.setLayoutParams(a5);
        if (dmtTextView5.getParent() == null) {
            followFeedTagGroup.addView(dmtTextView5);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        MarginLayoutParams a6 = C1522a.m5434a(followFeedTagGroup, -2, -2);
        dmtTextView6.setTextSize(1, 13.0f);
        dmtTextView6.setId(R.id.co1);
        if (LinearLayout.LayoutParams.class.isInstance(a6)) {
            i8 = 16;
            ((LinearLayout.LayoutParams) a6).gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a6)) {
            ((FrameLayout.LayoutParams) a6).gravity = i8;
        }
        dmtTextView6.setEllipsize(TruncateAt.END);
        dmtTextView6.setGravity(17);
        dmtTextView6.setMaxLines(1);
        dmtTextView6.setTextColor(resources.getColorStateList(R.color.iu));
        dmtTextView6.setLayoutParams(a6);
        if (dmtTextView6.getParent() == null) {
            followFeedTagGroup.addView(dmtTextView6);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context2);
        DmtTextView dmtTextView7 = dmtTextView6;
        DmtTextView dmtTextView8 = dmtTextView5;
        MarginLayoutParams a7 = C1522a.m5434a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        appCompatImageView5.setId(R.id.b3p);
        if (LinearLayout.LayoutParams.class.isInstance(a7)) {
            i9 = 16;
            ((LinearLayout.LayoutParams) a7).gravity = 16;
        } else {
            i9 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a7)) {
            ((FrameLayout.LayoutParams) a7).gravity = i9;
        }
        if (!MarginLayoutParams.class.isInstance(a7) || VERSION.SDK_INT < 17) {
            view = view3;
        } else {
            view = view3;
            a7.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView5.setImageResource(R.drawable.dfr);
        appCompatImageView5.setVisibility(8);
        appCompatImageView5.setLayoutParams(a7);
        if (appCompatImageView5.getParent() == null) {
            followFeedTagGroup.addView(appCompatImageView5);
        }
        View view4 = new View(context2);
        MarginLayoutParams a8 = C1522a.m5434a(followFeedTagGroup, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), -1);
        view4.setId(R.id.by7);
        view4.setBackgroundColor(resources.getColor(R.color.a8w));
        view4.setLayoutParams(a8);
        if (view4.getParent() == null) {
            followFeedTagGroup.addView(view4);
        }
        DmtTextView dmtTextView9 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView9.setTextSize(1, 11.0f);
        dmtTextView9.setId(R.id.th);
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            view2 = view4;
            appCompatImageView2 = appCompatImageView5;
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        } else {
            view2 = view4;
            appCompatImageView2 = appCompatImageView5;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams7) || VERSION.SDK_INT < 17) {
            i10 = 1;
        } else {
            i10 = 1;
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        dmtTextView9.setEllipsize(TruncateAt.END);
        dmtTextView9.setGravity(17);
        dmtTextView9.setMaxLines(i10);
        DmtTextView dmtTextView10 = dmtTextView4;
        FollowFeedTagGroup followFeedTagGroup2 = followFeedTagGroup;
        dmtTextView9.setPadding(dmtTextView9.getPaddingLeft(), dmtTextView9.getPaddingTop(), dmtTextView9.getPaddingRight(), (int) TypedValue.applyDimension(i10, 4.0f, resources.getDisplayMetrics()));
        dmtTextView9.setTextColor(resources.getColorStateList(R.color.a1o));
        dmtTextView9.setVisibility(8);
        dmtTextView9.setLayoutParams(layoutParams7);
        if (dmtTextView9.getParent() == null) {
            linearLayout4.addView(dmtTextView9);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        linearLayout6.setId(R.id.c10);
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.bottomMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8) && VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout6.setGravity(16);
        linearLayout6.setOrientation(0);
        linearLayout6.setVisibility(8);
        linearLayout6.setLayoutParams(layoutParams8);
        if (linearLayout6.getParent() == null) {
            linearLayout4.addView(linearLayout6);
        }
        FollowFeedTagGroup followFeedTagGroup3 = new FollowFeedTagGroup(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        followFeedTagGroup3.setId(R.id.c2q);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i11 = 16;
            layoutParams9.gravity = 16;
        } else {
            i11 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i11;
        }
        followFeedTagGroup3.setLayoutParams(layoutParams9);
        if (followFeedTagGroup3.getParent() == null) {
            linearLayout6.addView(followFeedTagGroup3);
        }
        DmtTextView dmtTextView11 = new DmtTextView(context2);
        MarginLayoutParams a9 = C1522a.m5434a(followFeedTagGroup3, -2, -1);
        dmtTextView11.setTextSize(1, 11.0f);
        dmtTextView11.setId(R.id.tg);
        if (!MarginLayoutParams.class.isInstance(a9) || VERSION.SDK_INT < 17) {
            linearLayout = linearLayout6;
            i12 = 1;
        } else {
            linearLayout = linearLayout6;
            i12 = 1;
            a9.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a9)) {
            a9.rightMargin = (int) TypedValue.applyDimension(i12, 7.0f, resources.getDisplayMetrics());
        }
        dmtTextView11.setEllipsize(TruncateAt.END);
        dmtTextView11.setMaxLines(i12);
        dmtTextView11.setTextColor(resources.getColorStateList(R.color.yc));
        dmtTextView11.setLayoutParams(a9);
        if (dmtTextView11.getParent() == null) {
            followFeedTagGroup3.addView(dmtTextView11);
        }
        AppCompatImageView appCompatImageView6 = new AppCompatImageView(context2);
        MarginLayoutParams a10 = C1522a.m5434a(followFeedTagGroup3, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView6.setId(R.id.a6h);
        if (LinearLayout.LayoutParams.class.isInstance(a10)) {
            i13 = 16;
            ((LinearLayout.LayoutParams) a10).gravity = 16;
        } else {
            i13 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a10)) {
            ((FrameLayout.LayoutParams) a10).gravity = i13;
        }
        if (!MarginLayoutParams.class.isInstance(a10) || VERSION.SDK_INT < 17) {
            dmtTextView = dmtTextView11;
            f2 = 7.0f;
            i14 = 1;
        } else {
            dmtTextView = dmtTextView11;
            f2 = 7.0f;
            i14 = 1;
            a10.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a10)) {
            a10.rightMargin = (int) TypedValue.applyDimension(i14, f2, resources.getDisplayMetrics());
        }
        appCompatImageView6.setBackgroundColor(resources.getColor(R.color.yd));
        appCompatImageView6.setLayoutParams(a10);
        if (appCompatImageView6.getParent() == null) {
            followFeedTagGroup3.addView(appCompatImageView6);
        }
        DmtTextView dmtTextView12 = new DmtTextView(context2);
        MarginLayoutParams a11 = C1522a.m5434a(followFeedTagGroup3, -2, (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        dmtTextView12.setTextSize(1, 11.0f);
        dmtTextView12.setId(R.id.avf);
        if (!MarginLayoutParams.class.isInstance(a11) || VERSION.SDK_INT < 17) {
            appCompatImageView3 = appCompatImageView6;
            i15 = 1;
        } else {
            appCompatImageView3 = appCompatImageView6;
            i15 = 1;
            a11.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a11)) {
            a11.rightMargin = (int) TypedValue.applyDimension(i15, 5.0f, resources.getDisplayMetrics());
        }
        dmtTextView12.setEllipsize(TruncateAt.END);
        dmtTextView12.setMaxLines(i15);
        dmtTextView12.setTextColor(resources.getColorStateList(R.color.yc));
        dmtTextView12.setLayoutParams(a11);
        if (dmtTextView12.getParent() == null) {
            followFeedTagGroup3.addView(dmtTextView12);
        }
        LinearLayout linearLayout7 = new LinearLayout(context2);
        MarginLayoutParams a12 = C1522a.m5434a(followFeedTagGroup3, -2, -2);
        linearLayout7.setId(R.id.a1m);
        if (!MarginLayoutParams.class.isInstance(a12) || VERSION.SDK_INT < 17) {
            dmtTextView2 = dmtTextView12;
            i16 = 1;
        } else {
            dmtTextView2 = dmtTextView12;
            i16 = 1;
            a12.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(a12)) {
            a12.rightMargin = (int) TypedValue.applyDimension(i16, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout7.setOrientation(0);
        linearLayout7.setLayoutParams(a12);
        if (linearLayout7.getParent() == null) {
            followFeedTagGroup3.addView(linearLayout7);
        }
        LinearLayout linearLayout8 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        linearLayout8.setId(R.id.e39);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i17 = 16;
            layoutParams10.gravity = 16;
        } else {
            i17 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i17;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            linearLayout2 = linearLayout7;
            i18 = 1;
            layoutParams10.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        } else {
            linearLayout2 = linearLayout7;
            i18 = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.leftMargin = (int) TypedValue.applyDimension(i18, 25.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10) && VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        linearLayout8.setGravity(16);
        linearLayout8.setOrientation(0);
        linearLayout8.setVisibility(8);
        linearLayout8.setLayoutParams(layoutParams10);
        if (linearLayout8.getParent() == null) {
            linearLayout4.addView(linearLayout8);
        }
        DmtTextView dmtTextView13 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView13.setTextSize(1, 11.0f);
        dmtTextView13.setId(R.id.eui);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i19 = 16;
            layoutParams11.gravity = 16;
        } else {
            i19 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((FrameLayout.LayoutParams) layoutParams11).gravity = i19;
        }
        dmtTextView13.setGravity(17);
        dmtTextView13.setTextColor(resources.getColorStateList(R.color.asy));
        dmtTextView13.setVisibility(8);
        dmtTextView13.setLayoutParams(layoutParams11);
        if (dmtTextView13.getParent() == null) {
            linearLayout8.addView(dmtTextView13);
        }
        AppCompatImageView appCompatImageView7 = new AppCompatImageView(context2);
        DmtTextView dmtTextView14 = dmtTextView13;
        FollowFeedTagGroup followFeedTagGroup4 = followFeedTagGroup3;
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        appCompatImageView7.setId(R.id.eud);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i20 = 16;
            layoutParams12.gravity = 16;
        } else {
            i20 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i20;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            i21 = 1;
            f3 = 7.0f;
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        } else {
            i21 = 1;
            f3 = 7.0f;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.rightMargin = (int) TypedValue.applyDimension(i21, f3, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.topMargin = (int) TypedValue.applyDimension(i21, 0.5f, resources.getDisplayMetrics());
        }
        appCompatImageView7.setBackgroundColor(resources.getColor(R.color.a1u));
        appCompatImageView7.setLayoutParams(layoutParams12);
        if (appCompatImageView7.getParent() == null) {
            linearLayout8.addView(appCompatImageView7);
        }
        DmtTextView dmtTextView15 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView15.setTextSize(1, 11.0f);
        dmtTextView15.setId(R.id.euj);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i22 = 16;
            layoutParams13.gravity = 16;
        } else {
            i22 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
            ((FrameLayout.LayoutParams) layoutParams13).gravity = i22;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.weight = 1.0f;
        }
        dmtTextView15.setGravity(17);
        dmtTextView15.setMaxLines(1);
        dmtTextView15.setTextColor(resources.getColorStateList(R.color.asy));
        dmtTextView15.setLayoutParams(layoutParams13);
        if (dmtTextView15.getParent() == null) {
            linearLayout8.addView(dmtTextView15);
        }
        DmtTextView dmtTextView16 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView16.setTextSize(1, 11.0f);
        dmtTextView16.setId(R.id.d_a);
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            dmtTextView3 = dmtTextView15;
            layoutParams14.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView3 = dmtTextView15;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.leftMargin = (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14) && VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginStart((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            i23 = 1;
            layoutParams14.topMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        } else {
            i23 = 1;
        }
        dmtTextView16.setEllipsize(TruncateAt.END);
        dmtTextView16.setMaxLines(i23);
        dmtTextView16.setMaxWidth((int) TypedValue.applyDimension(i23, 215.0f, resources.getDisplayMetrics()));
        dmtTextView16.setPadding((int) TypedValue.applyDimension(i23, 5.0f, resources.getDisplayMetrics()), dmtTextView16.getPaddingTop(), dmtTextView16.getPaddingRight(), dmtTextView16.getPaddingBottom());
        dmtTextView16.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), dmtTextView16.getPaddingTop(), dmtTextView16.getPaddingRight(), dmtTextView16.getPaddingBottom());
        dmtTextView16.setTextColor(resources.getColorStateList(R.color.a36));
        dmtTextView16.setVisibility(8);
        dmtTextView16.setLayoutParams(layoutParams14);
        if (dmtTextView16.getParent() == null) {
            linearLayout4.addView(dmtTextView16);
        }
        C1522a.m5435a(linearLayout3);
        C1522a.m5435a(linearLayout4);
        C1522a.m5435a(linearLayout5);
        C1522a.m5435a(avatarImageView);
        C1522a.m5435a(avatarImageView2);
        C1522a.m5435a(remoteImageView);
        C1522a.m5435a(followFeedTagGroup2);
        DmtTextView dmtTextView17 = dmtTextView10;
        dmtTextView17.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView17);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(view);
        DmtTextView dmtTextView18 = dmtTextView8;
        dmtTextView18.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView18);
        DmtTextView dmtTextView19 = dmtTextView7;
        dmtTextView19.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView19);
        C1522a.m5435a(appCompatImageView2);
        C1522a.m5435a(view2);
        dmtTextView9.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView9);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(followFeedTagGroup4);
        DmtTextView dmtTextView20 = dmtTextView;
        dmtTextView20.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView20);
        C1522a.m5435a(appCompatImageView3);
        DmtTextView dmtTextView21 = dmtTextView2;
        dmtTextView21.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView21);
        C1522a.m5435a(linearLayout2);
        C1522a.m5435a(linearLayout8);
        DmtTextView dmtTextView22 = dmtTextView14;
        dmtTextView22.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView22);
        C1522a.m5435a(appCompatImageView7);
        DmtTextView dmtTextView23 = dmtTextView3;
        dmtTextView23.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView23);
        dmtTextView16.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView16);
        return linearLayout3;
    }
}
