package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
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
import android.widget.Space;
import android.widget.TableLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.BindAccountView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.EnterpriseTransformLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.ConnectedRelationView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.ProfileStarRankView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.am */
public final class C2254am implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        View view;
        int i;
        Space space;
        int i2;
        View view2;
        int i3;
        FrameLayout frameLayout;
        RemoteImageView remoteImageView;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        AppCompatImageView appCompatImageView;
        int i9;
        FrameLayout frameLayout2;
        DmtTextView dmtTextView;
        BindAccountView bindAccountView;
        int i10;
        FrameLayout frameLayout3;
        DmtTextView dmtTextView2;
        int i11;
        DmtTextView dmtTextView3;
        int i12;
        DmtTextView dmtTextView4;
        int i13;
        DmtTextView dmtTextView5;
        int i14;
        DmtTextView dmtTextView6;
        int i15;
        char c;
        DmtTextView dmtTextView7;
        ConnectedRelationView connectedRelationView;
        int i16;
        float f;
        int i17;
        AppCompatImageView appCompatImageView2;
        int i18;
        View view3;
        View view4;
        float f2;
        int i19;
        int i20;
        DmtTextView dmtTextView8;
        int i21;
        boolean z2;
        DmtTextView dmtTextView9;
        int i22;
        boolean z3;
        DmtTextView dmtTextView10;
        TranslationStatusView translationStatusView;
        int i23;
        float f3;
        EnterpriseTransformLayout enterpriseTransformLayout;
        LinearLayout linearLayout;
        int i24;
        View view5;
        int i25;
        DmtTextView dmtTextView11;
        int i26;
        float f4;
        int i27;
        DmtTextView dmtTextView12;
        int i28;
        DmtTextView dmtTextView13;
        int i29;
        LinearLayout linearLayout2;
        int i30;
        float f5;
        int i31;
        DmtTextView dmtTextView14;
        int i32;
        DmtTextView dmtTextView15;
        int i33;
        LinearLayout linearLayout3;
        int i34;
        float f6;
        int i35;
        DmtTextView dmtTextView16;
        int i36;
        View view6;
        float f7;
        DmtTextView dmtTextView17;
        float f8;
        int i37;
        ProfileStarRankView profileStarRankView;
        int i38;
        int i39;
        int i40;
        int i41;
        AppCompatImageView appCompatImageView3;
        DmtTextView dmtTextView18;
        int i42;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout4 = new FrameLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -2);
        frameLayout4.setId(R.id.c5j);
        if (viewGroup2 != null) {
            frameLayout4.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout4);
            }
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        constraintLayout.setId(R.id.c5k);
        constraintLayout.setLayoutParams(layoutParams);
        if (constraintLayout.getParent() == null) {
            frameLayout4.addView(constraintLayout);
        }
        View view7 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        view7.setId(R.id.ad9);
        view7.setLayoutParams(layoutParams2);
        if (view7.getParent() == null) {
            constraintLayout.addView(view7);
        }
        View view8 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        view8.setId(R.id.bf);
        view8.setBackgroundResource(R.drawable.go);
        view8.setVisibility(8);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.f866j = R.id.jx;
        }
        view8.setLayoutParams(layoutParams3);
        if (view8.getParent() == null) {
            constraintLayout.addView(view8);
        }
        DmtTextView dmtTextView19 = new DmtTextView(context2);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
        dmtTextView19.setId(R.id.bg);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        dmtTextView19.setEllipsize(TruncateAt.END);
        dmtTextView19.setGravity(8388613);
        dmtTextView19.setMaxLines(1);
        dmtTextView19.setTextColor(resources.getColorStateList(R.color.gr));
        dmtTextView19.setTextSize(2, 12.0f);
        dmtTextView19.setVisibility(8);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f866j = R.id.jx;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.f875s = 0;
        }
        dmtTextView19.setLayoutParams(layoutParams4);
        if (dmtTextView19.getParent() == null) {
            constraintLayout.addView(dmtTextView19);
        }
        AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        appCompatImageView4.setId(R.id.bh);
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        appCompatImageView4.setImageResource(R.drawable.dq3);
        appCompatImageView4.setVisibility(8);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.f866j = R.id.jx;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.f872p = R.id.bg;
        }
        appCompatImageView4.setLayoutParams(layoutParams5);
        if (appCompatImageView4.getParent() == null) {
            constraintLayout.addView(appCompatImageView4);
        }
        AppCompatImageView appCompatImageView5 = new AppCompatImageView(context2);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        appCompatImageView5.setId(R.id.a3e);
        if (MarginLayoutParams.class.isInstance(layoutParams6) && VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView5.setScaleType(ScaleType.FIT_XY);
        appCompatImageView5.setImageResource(R.drawable.dlw);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.f873q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.f865i = R.id.ad9;
        }
        appCompatImageView5.setLayoutParams(layoutParams6);
        if (appCompatImageView5.getParent() == null) {
            constraintLayout.addView(appCompatImageView5);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context2);
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        remoteImageView2.setId(R.id.jx);
        if (MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f867k = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f875s = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f873q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.f864h = R.id.a3e;
        }
        ((C13833a) remoteImageView2.getHierarchy()).mo25898a(C13818b.f36061a);
        remoteImageView2.setLayoutParams(layoutParams7);
        if (remoteImageView2.getParent() == null) {
            constraintLayout.addView(remoteImageView2);
        }
        View view9 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams8 = new ConstraintLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view9.setId(R.id.c5l);
        view9.setAlpha(0.96f);
        view9.setBackgroundColor(resources.getColor(R.color.a2j));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f867k = R.id.jx;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f875s = R.id.c5m;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f873q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.f864h = R.id.jx;
        }
        view9.setLayoutParams(layoutParams8);
        if (view9.getParent() == null) {
            constraintLayout.addView(view9);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        ConstraintLayout.LayoutParams layoutParams9 = new ConstraintLayout.LayoutParams(-1, -2);
        linearLayout4.setId(R.id.c5m);
        if (MarginLayoutParams.class.isInstance(layoutParams9)) {
            view = view9;
            layoutParams9.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            view = view9;
        }
        linearLayout4.setOrientation(1);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i = 0;
            layoutParams9.f875s = 0;
        } else {
            i = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.f873q = i;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.f864h = R.id.a3e;
        }
        linearLayout4.setLayoutParams(layoutParams9);
        if (linearLayout4.getParent() == null) {
            constraintLayout.addView(linearLayout4);
        }
        Space space2 = new Space(context2);
        RemoteImageView remoteImageView3 = remoteImageView2;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        space2.setId(R.id.cqe);
        space2.setLayoutParams(layoutParams10);
        if (space2.getParent() == null) {
            linearLayout4.addView(space2);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
        if (!MarginLayoutParams.class.isInstance(layoutParams11) || VERSION.SDK_INT < 17) {
            space = space2;
            i2 = 1;
        } else {
            space = space2;
            i2 = 1;
            layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.leftMargin = (int) TypedValue.applyDimension(i2, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.rightMargin = (int) TypedValue.applyDimension(i2, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams11) && VERSION.SDK_INT >= 17) {
            layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(layoutParams11);
        if (linearLayout5.getParent() == null) {
            linearLayout4.addView(linearLayout5);
        }
        FrameLayout frameLayout5 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 102.0f, resources.getDisplayMetrics()), -2);
        frameLayout5.setId(R.id.ah0);
        frameLayout5.setLayoutParams(layoutParams12);
        if (frameLayout5.getParent() == null) {
            linearLayout5.addView(frameLayout5);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context2);
        AppCompatImageView appCompatImageView6 = appCompatImageView5;
        AppCompatImageView appCompatImageView7 = appCompatImageView4;
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 96.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 96.0f, resources.getDisplayMetrics()));
        liveCircleView.setId(R.id.bcb);
        if (MarginLayoutParams.class.isInstance(layoutParams13) && VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, -2.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.topMargin = (int) TypedValue.applyDimension(1, -2.5f, resources.getDisplayMetrics());
        }
        liveCircleView.setVisibility(8);
        liveCircleView.setLayoutParams(layoutParams13);
        if (liveCircleView.getParent() == null) {
            frameLayout5.addView(liveCircleView);
        }
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(context2);
        LiveCircleView liveCircleView2 = liveCircleView;
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 92.0f, resources.getDisplayMetrics()));
        smartAvatarBorderView.setId(R.id.ao6);
        if (VERSION.SDK_INT >= 26) {
            smartAvatarBorderView.setDefaultFocusHighlightEnabled(false);
        }
        smartAvatarBorderView.setScaleType(ScaleType.CENTER_INSIDE);
        smartAvatarBorderView.setLayoutParams(layoutParams14);
        if (smartAvatarBorderView.getParent() == null) {
            frameLayout5.addView(smartAvatarBorderView);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        SmartAvatarBorderView smartAvatarBorderView2 = smartAvatarBorderView;
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.i5);
        if (MarginLayoutParams.class.isInstance(layoutParams15) && VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.topMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        animationImageView.setVisibility(8);
        animationImageView.setLayoutParams(layoutParams15);
        if (animationImageView.getParent() == null) {
            frameLayout5.addView(animationImageView);
        }
        AnimationImageView animationImageView2 = new AnimationImageView(context2);
        AnimationImageView animationImageView3 = animationImageView;
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        animationImageView2.setId(R.id.i6);
        if (MarginLayoutParams.class.isInstance(layoutParams16) && VERSION.SDK_INT >= 17) {
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.topMargin = (int) TypedValue.applyDimension(1, -5.0f, resources.getDisplayMetrics());
        }
        animationImageView2.setVisibility(8);
        animationImageView2.setLayoutParams(layoutParams16);
        if (animationImageView2.getParent() == null) {
            frameLayout5.addView(animationImageView2);
        }
        AnimationImageView animationImageView4 = new AnimationImageView(context2);
        AnimationImageView animationImageView5 = animationImageView2;
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 59.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        animationImageView4.setId(R.id.e4);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 8388693;
        }
        animationImageView4.setScaleType(ScaleType.CENTER_CROP);
        animationImageView4.setImageResource(R.drawable.dnt);
        animationImageView4.setVisibility(8);
        animationImageView4.setLayoutParams(layoutParams17);
        if (animationImageView4.getParent() == null) {
            frameLayout5.addView(animationImageView4);
        }
        View view10 = new View(context2);
        AnimationImageView animationImageView6 = animationImageView4;
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.weight = 1.0f;
        }
        view10.setLayoutParams(layoutParams18);
        if (view10.getParent() == null) {
            linearLayout5.addView(view10);
        }
        DmtTextView dmtTextView20 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView20.setId(R.id.ai6);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = 16;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams19) || VERSION.SDK_INT < 17) {
            view2 = view10;
        } else {
            view2 = view10;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView20.setBackgroundResource(R.drawable.ddz);
        dmtTextView20.setGravity(17);
        dmtTextView20.setTextColor(resources.getColorStateList(R.color.ayc));
        dmtTextView20.setTextSize(2, 15.0f);
        dmtTextView20.setVisibility(8);
        dmtTextView20.setLayoutParams(layoutParams19);
        if (dmtTextView20.getParent() == null) {
            linearLayout5.addView(dmtTextView20);
        }
        LinearLayout linearLayout6 = new LinearLayout(context2);
        DmtTextView dmtTextView21 = dmtTextView20;
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        linearLayout6.setId(R.id.cle);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i3 = 16;
            layoutParams20.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            ((FrameLayout.LayoutParams) layoutParams20).gravity = i3;
        }
        linearLayout6.setBackgroundResource(R.drawable.ddz);
        linearLayout6.setGravity(17);
        linearLayout6.setVisibility(8);
        linearLayout6.setLayoutParams(layoutParams20);
        if (linearLayout6.getParent() == null) {
            linearLayout5.addView(linearLayout6);
        }
        RemoteImageView remoteImageView4 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        remoteImageView4.setId(R.id.cld);
        remoteImageView4.setImageResource(R.drawable.doy);
        remoteImageView4.setVisibility(8);
        remoteImageView4.setLayoutParams(layoutParams21);
        if (remoteImageView4.getParent() == null) {
            linearLayout6.addView(remoteImageView4);
        }
        DmtTextView dmtTextView22 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView22.setTextSize(1, 15.0f);
        dmtTextView22.setId(R.id.clc);
        if (MarginLayoutParams.class.isInstance(layoutParams22)) {
            remoteImageView = remoteImageView4;
            frameLayout = frameLayout5;
            layoutParams22.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            frameLayout = frameLayout5;
            remoteImageView = remoteImageView4;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams22) || VERSION.SDK_INT < 17) {
            i4 = 1;
        } else {
            i4 = 1;
            layoutParams22.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        dmtTextView22.setMaxLines(i4);
        dmtTextView22.setText(R.string.dda);
        dmtTextView22.setTextColor(resources.getColorStateList(R.color.a1o));
        dmtTextView22.setVisibility(8);
        dmtTextView22.setLayoutParams(layoutParams22);
        if (dmtTextView22.getParent() == null) {
            linearLayout6.addView(dmtTextView22);
        }
        RemoteImageView remoteImageView5 = new RemoteImageView(context2);
        DmtTextView dmtTextView23 = dmtTextView22;
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        remoteImageView5.setId(R.id.ai7);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i5 = 16;
            layoutParams23.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i5;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23) && VERSION.SDK_INT >= 17) {
            layoutParams23.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        remoteImageView5.setBackgroundResource(R.drawable.ddz);
        remoteImageView5.setScaleType(ScaleType.CENTER_INSIDE);
        remoteImageView5.setImageResource(R.drawable.dn7);
        remoteImageView5.setVisibility(8);
        remoteImageView5.setLayoutParams(layoutParams23);
        if (remoteImageView5.getParent() == null) {
            linearLayout5.addView(remoteImageView5);
        }
        DmtTextView dmtTextView24 = new DmtTextView(context2);
        RemoteImageView remoteImageView6 = remoteImageView5;
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams((int) resources.getDimension(R.dimen.a0t), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView24.setTextSize(1, 15.0f);
        dmtTextView24.setId(R.id.cbq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i6 = 16;
            layoutParams24.gravity = 16;
        } else {
            i6 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = i6;
        }
        dmtTextView24.setBackgroundResource(R.drawable.dm0);
        dmtTextView24.setEllipsize(TruncateAt.END);
        dmtTextView24.setGravity(17);
        dmtTextView24.setMaxLines(1);
        dmtTextView24.setText(R.string.b4y);
        dmtTextView24.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView24.setVisibility(8);
        dmtTextView24.setLayoutParams(layoutParams24);
        if (dmtTextView24.getParent() == null) {
            linearLayout5.addView(dmtTextView24);
        }
        DmtTextView dmtTextView25 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTextView25.setTextSize(1, 15.0f);
        dmtTextView25.setId(R.id.c5e);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            i7 = 16;
            layoutParams25.gravity = 16;
        } else {
            i7 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((FrameLayout.LayoutParams) layoutParams25).gravity = i7;
        }
        dmtTextView25.setBackgroundResource(R.drawable.de7);
        dmtTextView25.setGravity(17);
        dmtTextView25.setMaxLines(1);
        dmtTextView25.setText(R.string.b3w);
        dmtTextView25.setTextColor(resources.getColorStateList(R.color.aso));
        dmtTextView25.setLayoutParams(layoutParams25);
        if (dmtTextView25.getParent() == null) {
            linearLayout5.addView(dmtTextView25);
        }
        FrameLayout frameLayout6 = new FrameLayout(context2);
        DmtTextView dmtTextView26 = dmtTextView25;
        DmtTextView dmtTextView27 = dmtTextView24;
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        frameLayout6.setId(R.id.c5g);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            i8 = 16;
            layoutParams26.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((FrameLayout.LayoutParams) layoutParams26).gravity = i8;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams26)) {
            layoutParams26.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams26) && VERSION.SDK_INT >= 17) {
            layoutParams26.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        frameLayout6.setLayoutParams(layoutParams26);
        if (frameLayout6.getParent() == null) {
            linearLayout5.addView(frameLayout6);
        }
        AppCompatImageView appCompatImageView8 = new AppCompatImageView(context2);
        LinearLayout linearLayout7 = linearLayout6;
        FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        appCompatImageView8.setId(R.id.c5f);
        appCompatImageView8.setContentDescription("");
        appCompatImageView8.setScaleType(ScaleType.CENTER_INSIDE);
        appCompatImageView8.setImageResource(R.drawable.dpk);
        appCompatImageView8.setLayoutParams(layoutParams27);
        if (appCompatImageView8.getParent() == null) {
            frameLayout6.addView(appCompatImageView8);
        }
        DmtTextView dmtTextView28 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView28.setId(R.id.bqr);
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            appCompatImageView = appCompatImageView8;
            layoutParams28.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView = appCompatImageView8;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28) && VERSION.SDK_INT >= 17) {
            layoutParams28.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            i9 = 1;
            layoutParams28.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        } else {
            i9 = 1;
        }
        dmtTextView28.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView28.setTextSize(2, 24.0f);
        dmtTextView28.setTypeface(Typeface.defaultFromStyle(i9));
        dmtTextView28.setLayoutParams(layoutParams28);
        if (dmtTextView28.getParent() == null) {
            linearLayout4.addView(dmtTextView28);
        }
        FrameLayout frameLayout7 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams29 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout7.setId(R.id.bx1);
        frameLayout7.setLayoutParams(layoutParams29);
        if (frameLayout7.getParent() == null) {
            linearLayout4.addView(frameLayout7);
        }
        BindAccountView bindAccountView2 = new BindAccountView(context2);
        FrameLayout.LayoutParams layoutParams30 = new FrameLayout.LayoutParams(-2, -2);
        bindAccountView2.setId(R.id.kw);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams30)) {
            ((LinearLayout.LayoutParams) layoutParams30).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.gravity = 8388693;
        }
        bindAccountView2.setLayoutParams(layoutParams30);
        if (bindAccountView2.getParent() == null) {
            frameLayout7.addView(bindAccountView2);
        }
        LinearLayout linearLayout8 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams31 = new FrameLayout.LayoutParams(-2, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams31)) {
            bindAccountView = bindAccountView2;
            dmtTextView = dmtTextView28;
            frameLayout2 = frameLayout6;
            i10 = 1;
            layoutParams31.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView28;
            bindAccountView = bindAccountView2;
            frameLayout2 = frameLayout6;
            i10 = 1;
        }
        linearLayout8.setOrientation(i10);
        linearLayout8.setLayoutParams(layoutParams31);
        if (linearLayout8.getParent() == null) {
            frameLayout7.addView(linearLayout8);
        }
        DmtTextView dmtTextView29 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView29.setTextSize(i10, 12.0f);
        dmtTextView29.setId(R.id.dmq);
        if (MarginLayoutParams.class.isInstance(layoutParams32)) {
            frameLayout3 = frameLayout7;
            layoutParams32.leftMargin = (int) TypedValue.applyDimension(i10, 16.0f, resources.getDisplayMetrics());
        } else {
            frameLayout3 = frameLayout7;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams32) && VERSION.SDK_INT >= 17) {
            layoutParams32.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        dmtTextView29.setGravity(17);
        dmtTextView29.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView29.setLayoutParams(layoutParams32);
        if (dmtTextView29.getParent() == null) {
            linearLayout8.addView(dmtTextView29);
        }
        DmtTextView dmtTextView30 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams33 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView30.setTextSize(1, 12.0f);
        dmtTextView30.setId(R.id.duq);
        if (!MarginLayoutParams.class.isInstance(layoutParams33) || VERSION.SDK_INT < 17) {
            dmtTextView2 = dmtTextView29;
        } else {
            dmtTextView2 = dmtTextView29;
            layoutParams33.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams33) && VERSION.SDK_INT >= 17) {
            layoutParams33.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams33)) {
            i11 = 1;
            layoutParams33.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i11 = 1;
        }
        dmtTextView30.setCompoundDrawablePadding((int) TypedValue.applyDimension(i11, 5.0f, resources.getDisplayMetrics()));
        dmtTextView30.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.dpt), dmtTextView30.getCompoundDrawablesRelative()[i11], dmtTextView30.getCompoundDrawablesRelative()[2], dmtTextView30.getCompoundDrawablesRelative()[3]);
        dmtTextView30.setEllipsize(TruncateAt.END);
        dmtTextView30.setGravity(17);
        dmtTextView30.setMaxLines(1);
        dmtTextView30.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView30.setVisibility(8);
        dmtTextView30.setLayoutParams(layoutParams33);
        if (dmtTextView30.getParent() == null) {
            linearLayout8.addView(dmtTextView30);
        }
        DmtTextView dmtTextView31 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView31.setTextSize(1, 12.0f);
        dmtTextView31.setId(R.id.bvd);
        if (!MarginLayoutParams.class.isInstance(layoutParams34) || VERSION.SDK_INT < 17) {
            dmtTextView3 = dmtTextView30;
        } else {
            dmtTextView3 = dmtTextView30;
            layoutParams34.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            layoutParams34.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams34) && VERSION.SDK_INT >= 17) {
            layoutParams34.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams34)) {
            i12 = 1;
            layoutParams34.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i12 = 1;
        }
        dmtTextView31.setCompoundDrawablePadding((int) TypedValue.applyDimension(i12, 5.0f, resources.getDisplayMetrics()));
        dmtTextView31.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.dps), dmtTextView31.getCompoundDrawablesRelative()[i12], dmtTextView31.getCompoundDrawablesRelative()[2], dmtTextView31.getCompoundDrawablesRelative()[3]);
        dmtTextView31.setEllipsize(TruncateAt.END);
        dmtTextView31.setGravity(17);
        dmtTextView31.setMaxLines(1);
        dmtTextView31.setText(R.string.asp);
        dmtTextView31.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView31.setVisibility(8);
        dmtTextView31.setLayoutParams(layoutParams34);
        if (dmtTextView31.getParent() == null) {
            linearLayout8.addView(dmtTextView31);
        }
        DmtTextView dmtTextView32 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView32.setTextSize(1, 12.0f);
        dmtTextView32.setId(R.id.ab6);
        if (!MarginLayoutParams.class.isInstance(layoutParams35) || VERSION.SDK_INT < 17) {
            dmtTextView4 = dmtTextView31;
        } else {
            dmtTextView4 = dmtTextView31;
            layoutParams35.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams35) || VERSION.SDK_INT < 17) {
            i13 = 1;
        } else {
            i13 = 1;
            layoutParams35.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams35)) {
            layoutParams35.topMargin = (int) TypedValue.applyDimension(i13, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView32.setCompoundDrawablePadding((int) TypedValue.applyDimension(i13, 5.0f, resources.getDisplayMetrics()));
        dmtTextView32.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.dpq), dmtTextView32.getCompoundDrawablesRelative()[i13], dmtTextView32.getCompoundDrawablesRelative()[2], dmtTextView32.getCompoundDrawablesRelative()[3]);
        dmtTextView32.setEllipsize(TruncateAt.END);
        dmtTextView32.setGravity(17);
        dmtTextView32.setMaxEms(14);
        dmtTextView32.setMaxLines(1);
        dmtTextView32.setText(R.string.ffm);
        dmtTextView32.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView32.setVisibility(8);
        dmtTextView32.setLayoutParams(layoutParams35);
        if (dmtTextView32.getParent() == null) {
            linearLayout8.addView(dmtTextView32);
        }
        DmtTextView dmtTextView33 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView33.setTextSize(1, 12.0f);
        dmtTextView33.setId(R.id.deg);
        if (!MarginLayoutParams.class.isInstance(layoutParams36) || VERSION.SDK_INT < 17) {
            dmtTextView5 = dmtTextView32;
        } else {
            dmtTextView5 = dmtTextView32;
            layoutParams36.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams36) && VERSION.SDK_INT >= 17) {
            layoutParams36.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams36)) {
            i14 = 1;
            layoutParams36.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            i14 = 1;
        }
        dmtTextView33.setCompoundDrawablePadding((int) TypedValue.applyDimension(i14, 2.0f, resources.getDisplayMetrics()));
        dmtTextView33.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.dou), dmtTextView33.getCompoundDrawablesRelative()[i14], dmtTextView33.getCompoundDrawablesRelative()[2], dmtTextView33.getCompoundDrawablesRelative()[3]);
        dmtTextView33.setEllipsize(TruncateAt.END);
        dmtTextView33.setGravity(17);
        dmtTextView33.setMaxEms(14);
        dmtTextView33.setMaxLines(1);
        dmtTextView33.setTextColor(resources.getColorStateList(R.color.a17));
        dmtTextView33.setVisibility(8);
        dmtTextView33.setLayoutParams(layoutParams36);
        if (dmtTextView33.getParent() == null) {
            linearLayout8.addView(dmtTextView33);
        }
        DmtTextView dmtTextView34 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView34.setTextSize(1, 12.0f);
        dmtTextView34.setId(R.id.dvd);
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            dmtTextView6 = dmtTextView33;
            layoutParams37.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView6 = dmtTextView33;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams37) || VERSION.SDK_INT < 17) {
            i15 = 1;
        } else {
            i15 = 1;
            layoutParams37.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.leftMargin = (int) TypedValue.applyDimension(i15, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            layoutParams37.rightMargin = (int) TypedValue.applyDimension(i15, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37) && VERSION.SDK_INT >= 17) {
            layoutParams37.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams37)) {
            c = 1;
            layoutParams37.topMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        } else {
            c = 1;
        }
        dmtTextView34.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.dr5), dmtTextView34.getCompoundDrawablesRelative()[c], dmtTextView34.getCompoundDrawablesRelative()[2], dmtTextView34.getCompoundDrawablesRelative()[3]);
        dmtTextView34.setMaxEms(20);
        dmtTextView34.setMaxLines(1);
        dmtTextView34.setVisibility(8);
        dmtTextView34.setLayoutParams(layoutParams37);
        if (dmtTextView34.getParent() == null) {
            linearLayout8.addView(dmtTextView34);
        }
        ConnectedRelationView connectedRelationView2 = new ConnectedRelationView(context2);
        LinearLayout.LayoutParams layoutParams38 = new LinearLayout.LayoutParams(-1, -2);
        connectedRelationView2.setId(R.id.ys);
        if (!MarginLayoutParams.class.isInstance(layoutParams38) || VERSION.SDK_INT < 17) {
            dmtTextView7 = dmtTextView34;
        } else {
            dmtTextView7 = dmtTextView34;
            layoutParams38.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams38)) {
            layoutParams38.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        connectedRelationView2.setVisibility(8);
        connectedRelationView2.setLayoutParams(layoutParams38);
        if (connectedRelationView2.getParent() == null) {
            linearLayout8.addView(connectedRelationView2);
        }
        RecommendCommonUserView recommendCommonUserView = new RecommendCommonUserView(context2);
        LinearLayout.LayoutParams layoutParams39 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        recommendCommonUserView.setId(R.id.c9v);
        recommendCommonUserView.setVisibility(0);
        recommendCommonUserView.setLayoutParams(layoutParams39);
        if (recommendCommonUserView.getParent() == null) {
            linearLayout4.addView(recommendCommonUserView);
        }
        View view11 = new View(context2);
        RecommendCommonUserView recommendCommonUserView2 = recommendCommonUserView;
        LinearLayout.LayoutParams layoutParams40 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        view11.setId(R.id.a6f);
        if (!MarginLayoutParams.class.isInstance(layoutParams40) || VERSION.SDK_INT < 17) {
            connectedRelationView = connectedRelationView2;
            f = 15.0f;
            i16 = 1;
        } else {
            connectedRelationView = connectedRelationView2;
            f = 15.0f;
            i16 = 1;
            layoutParams40.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.leftMargin = (int) TypedValue.applyDimension(i16, f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.rightMargin = (int) TypedValue.applyDimension(i16, f, resources.getDisplayMetrics());
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams40) || VERSION.SDK_INT < 17) {
            i17 = 1;
        } else {
            i17 = 1;
            layoutParams40.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.topMargin = (int) TypedValue.applyDimension(i17, 12.0f, resources.getDisplayMetrics());
        }
        view11.setBackgroundColor(resources.getColor(R.color.ayd));
        view11.setLayoutParams(layoutParams40);
        if (view11.getParent() == null) {
            linearLayout4.addView(view11);
        }
        LinearLayout linearLayout9 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams41 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout9.setId(R.id.bpk);
        linearLayout9.setOrientation(1);
        View view12 = view11;
        LinearLayout linearLayout10 = linearLayout8;
        linearLayout9.setPadding(linearLayout9.getPaddingLeft(), linearLayout9.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout9.getPaddingBottom());
        linearLayout9.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout9.getPaddingTop(), linearLayout9.getPaddingRight(), linearLayout9.getPaddingBottom());
        linearLayout9.setPadding(linearLayout9.getPaddingLeft(), linearLayout9.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout9.getPaddingBottom());
        linearLayout9.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), linearLayout9.getPaddingTop(), linearLayout9.getPaddingRight(), linearLayout9.getPaddingBottom());
        linearLayout9.setVisibility(8);
        linearLayout9.setLayoutParams(layoutParams41);
        if (linearLayout9.getParent() == null) {
            linearLayout4.addView(linearLayout9);
        }
        LinearLayout linearLayout11 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams42 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        linearLayout11.setGravity(16);
        linearLayout11.setOrientation(0);
        linearLayout11.setLayoutParams(layoutParams42);
        if (linearLayout11.getParent() == null) {
            linearLayout9.addView(linearLayout11);
        }
        AppCompatImageView appCompatImageView9 = new AppCompatImageView(context2);
        LinearLayout linearLayout12 = linearLayout5;
        LinearLayout.LayoutParams layoutParams43 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        appCompatImageView9.setId(R.id.c5u);
        appCompatImageView9.setBackgroundResource(R.drawable.bbk);
        appCompatImageView9.setLayoutParams(layoutParams43);
        if (appCompatImageView9.getParent() == null) {
            linearLayout11.addView(appCompatImageView9);
        }
        DmtTextView dmtTextView35 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams44 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView35.setTextSize(1, 12.0f);
        dmtTextView35.setId(R.id.c5v);
        if (MarginLayoutParams.class.isInstance(layoutParams44)) {
            appCompatImageView2 = appCompatImageView9;
            layoutParams44.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView2 = appCompatImageView9;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams44) || VERSION.SDK_INT < 17) {
            i18 = 1;
        } else {
            i18 = 1;
            layoutParams44.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        DmtTextView dmtTextView36 = dmtTextView19;
        View view13 = view8;
        dmtTextView35.setPadding(dmtTextView35.getPaddingLeft(), dmtTextView35.getPaddingTop(), dmtTextView35.getPaddingRight(), (int) TypedValue.applyDimension(i18, 1.0f, resources.getDisplayMetrics()));
        dmtTextView35.setText(R.string.cyz);
        dmtTextView35.setTextColor(resources.getColorStateList(R.color.a36));
        dmtTextView35.setLayoutParams(layoutParams44);
        if (dmtTextView35.getParent() == null) {
            linearLayout11.addView(dmtTextView35);
        }
        View view14 = new View(context2);
        LinearLayout.LayoutParams layoutParams45 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        view14.setId(R.id.bqi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams45)) {
            ((FrameLayout.LayoutParams) layoutParams45).gravity = 48;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45) && VERSION.SDK_INT >= 17) {
            layoutParams45.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        view14.setBackgroundResource(R.drawable.vz);
        view14.setVisibility(4);
        view14.setLayoutParams(layoutParams45);
        if (view14.getParent() == null) {
            linearLayout11.addView(view14);
        }
        Space space3 = new Space(context2);
        LinearLayout.LayoutParams layoutParams46 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams46)) {
            layoutParams46.weight = 1.0f;
        }
        space3.setLayoutParams(layoutParams46);
        if (space3.getParent() == null) {
            linearLayout11.addView(space3);
        }
        View view15 = new View(context2);
        Space space4 = space3;
        LinearLayout.LayoutParams layoutParams47 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(layoutParams47)) {
            layoutParams47.leftMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams47) && VERSION.SDK_INT >= 17) {
            layoutParams47.setMarginStart((int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics()));
        }
        view15.setBackgroundResource(R.drawable.bbj);
        view15.setLayoutParams(layoutParams47);
        if (view15.getParent() == null) {
            linearLayout11.addView(view15);
        }
        View view16 = new View(context2);
        LinearLayout.LayoutParams layoutParams48 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        view16.setId(R.id.ann);
        view16.setBackgroundColor(resources.getColor(R.color.ayd));
        view16.setLayoutParams(layoutParams48);
        if (view16.getParent() == null) {
            linearLayout9.addView(view16);
        }
        DmtTextView dmtTextView37 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams49 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView37.setTextSize(1, 15.0f);
        dmtTextView37.setId(R.id.dns);
        if (!MarginLayoutParams.class.isInstance(layoutParams49) || VERSION.SDK_INT < 17) {
            view4 = view16;
            view3 = view15;
            i19 = 1;
            f2 = 15.0f;
        } else {
            view4 = view16;
            view3 = view15;
            i19 = 1;
            f2 = 15.0f;
            layoutParams49.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.leftMargin = (int) TypedValue.applyDimension(i19, f2, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.rightMargin = (int) TypedValue.applyDimension(i19, f2, resources.getDisplayMetrics());
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams49) || VERSION.SDK_INT < 17) {
            i20 = 1;
        } else {
            i20 = 1;
            layoutParams49.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams49)) {
            layoutParams49.topMargin = (int) TypedValue.applyDimension(i20, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView37.setGravity(8388611);
        dmtTextView37.setTextColor(resources.getColorStateList(R.color.a1o));
        dmtTextView37.setLayoutParams(layoutParams49);
        if (dmtTextView37.getParent() == null) {
            linearLayout4.addView(dmtTextView37);
        }
        DmtTextView dmtTextView38 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams50 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView38.setTextSize(1, 15.0f);
        dmtTextView38.setId(R.id.dmd);
        if (!MarginLayoutParams.class.isInstance(layoutParams50) || VERSION.SDK_INT < 17) {
            dmtTextView8 = dmtTextView37;
            i21 = 1;
        } else {
            dmtTextView8 = dmtTextView37;
            i21 = 1;
            layoutParams50.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.leftMargin = (int) TypedValue.applyDimension(i21, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.rightMargin = (int) TypedValue.applyDimension(i21, 15.0f, resources.getDisplayMetrics());
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams50) || VERSION.SDK_INT < 17) {
            z2 = true;
        } else {
            z2 = true;
            layoutParams50.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.topMargin = (int) TypedValue.applyDimension(z2 ? 1 : 0, 1.0f, resources.getDisplayMetrics());
        }
        dmtTextView38.setGravity(8388611);
        dmtTextView38.setSingleLine(z2);
        dmtTextView38.setEllipsize(TruncateAt.END);
        dmtTextView38.setTextColor(resources.getColorStateList(R.color.su));
        dmtTextView38.setVisibility(8);
        dmtTextView38.setFontType("medium");
        dmtTextView38.setLayoutParams(layoutParams50);
        if (dmtTextView38.getParent() == null) {
            linearLayout4.addView(dmtTextView38);
        }
        DmtTextView dmtTextView39 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams51 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView39.setTextSize(1, 15.0f);
        dmtTextView39.setId(R.id.dmc);
        if (!MarginLayoutParams.class.isInstance(layoutParams51) || VERSION.SDK_INT < 17) {
            dmtTextView9 = dmtTextView38;
            i22 = 1;
        } else {
            dmtTextView9 = dmtTextView38;
            i22 = 1;
            layoutParams51.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.leftMargin = (int) TypedValue.applyDimension(i22, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.rightMargin = (int) TypedValue.applyDimension(i22, 15.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams51) && VERSION.SDK_INT >= 17) {
            layoutParams51.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams51)) {
            z3 = true;
            layoutParams51.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            z3 = true;
        }
        dmtTextView39.setGravity(8388611);
        dmtTextView39.setSingleLine(z3);
        dmtTextView39.setEllipsize(TruncateAt.END);
        dmtTextView39.setTextColor(resources.getColorStateList(R.color.a64));
        dmtTextView39.setVisibility(8);
        dmtTextView39.setFontType("medium");
        dmtTextView39.setLayoutParams(layoutParams51);
        if (dmtTextView39.getParent() == null) {
            linearLayout4.addView(dmtTextView39);
        }
        TranslationStatusView translationStatusView2 = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams52 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView2.setId(R.id.d4a);
        if (MarginLayoutParams.class.isInstance(layoutParams52)) {
            dmtTextView10 = dmtTextView39;
            layoutParams52.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView10 = dmtTextView39;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams52) && VERSION.SDK_INT >= 17) {
            layoutParams52.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams52)) {
            layoutParams52.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        translationStatusView2.setVisibility(8);
        translationStatusView2.setLayoutParams(layoutParams52);
        if (translationStatusView2.getParent() == null) {
            linearLayout4.addView(translationStatusView2);
        }
        EnterpriseTransformLayout enterpriseTransformLayout2 = new EnterpriseTransformLayout(context2);
        LinearLayout.LayoutParams layoutParams53 = new LinearLayout.LayoutParams(-2, -2);
        enterpriseTransformLayout2.setId(R.id.d42);
        if (!MarginLayoutParams.class.isInstance(layoutParams53) || VERSION.SDK_INT < 17) {
            translationStatusView = translationStatusView2;
            f3 = 15.0f;
            i23 = 1;
        } else {
            translationStatusView = translationStatusView2;
            f3 = 15.0f;
            i23 = 1;
            layoutParams53.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.leftMargin = (int) TypedValue.applyDimension(i23, f3, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.rightMargin = (int) TypedValue.applyDimension(i23, f3, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53) && VERSION.SDK_INT >= 17) {
            layoutParams53.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        enterpriseTransformLayout2.setOrientation(0);
        enterpriseTransformLayout2.setLayoutParams(layoutParams53);
        if (enterpriseTransformLayout2.getParent() == null) {
            linearLayout4.addView(enterpriseTransformLayout2);
        }
        LinearLayout linearLayout13 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams54 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout13.setId(R.id.cxc);
        if (MarginLayoutParams.class.isInstance(layoutParams54)) {
            enterpriseTransformLayout = enterpriseTransformLayout2;
            layoutParams54.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        } else {
            enterpriseTransformLayout = enterpriseTransformLayout2;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams54) && VERSION.SDK_INT >= 17) {
            layoutParams54.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        linearLayout13.setOrientation(0);
        linearLayout13.setLayoutParams(layoutParams54);
        if (linearLayout13.getParent() == null) {
            linearLayout4.addView(linearLayout13);
        }
        LinearLayout linearLayout14 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams55 = new LinearLayout.LayoutParams(-1, -2);
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            linearLayout = linearLayout13;
            i24 = 1;
            layoutParams55.bottomMargin = (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        } else {
            linearLayout = linearLayout13;
            i24 = 1;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams55)) {
            layoutParams55.topMargin = (int) TypedValue.applyDimension(i24, 16.0f, resources.getDisplayMetrics());
        }
        linearLayout14.setGravity(16);
        linearLayout14.setLayoutParams(layoutParams55);
        if (linearLayout14.getParent() == null) {
            linearLayout4.addView(linearLayout14);
        }
        LinearLayout linearLayout15 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams56 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout15.setId(R.id.a8q);
        if (MarginLayoutParams.class.isInstance(layoutParams56)) {
            view5 = view14;
            layoutParams56.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            view5 = view14;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams56) && VERSION.SDK_INT >= 17) {
            layoutParams56.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout15.setOrientation(0);
        linearLayout15.setLayoutParams(layoutParams56);
        if (linearLayout15.getParent() == null) {
            linearLayout14.addView(linearLayout15);
        }
        DmtTextView dmtTextView40 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams57 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView40.setTextSize(1, 17.0f);
        dmtTextView40.setId(R.id.a55);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams57)) {
            i25 = 16;
            layoutParams57.gravity = 16;
        } else {
            i25 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams57)) {
            ((FrameLayout.LayoutParams) layoutParams57).gravity = i25;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams57) || VERSION.SDK_INT < 17) {
            dmtTextView11 = dmtTextView35;
            f4 = 2.0f;
            i26 = 1;
        } else {
            dmtTextView11 = dmtTextView35;
            f4 = 2.0f;
            i26 = 1;
            layoutParams57.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams57)) {
            layoutParams57.rightMargin = (int) TypedValue.applyDimension(i26, f4, resources.getDisplayMetrics());
        }
        dmtTextView40.setGravity(17);
        dmtTextView40.setMaxLines(i26);
        dmtTextView40.setTextColor(resources.getColorStateList(R.color.a1l));
        dmtTextView40.setFontType("regular");
        dmtTextView40.setLayoutParams(layoutParams57);
        if (dmtTextView40.getParent() == null) {
            linearLayout15.addView(dmtTextView40);
        }
        DmtTextView dmtTextView41 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams58 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView41.setTextSize(1, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams58)) {
            i27 = 16;
            layoutParams58.gravity = 16;
        } else {
            i27 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams58)) {
            ((FrameLayout.LayoutParams) layoutParams58).gravity = i27;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams58)) {
            dmtTextView12 = dmtTextView40;
            layoutParams58.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView12 = dmtTextView40;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams58) || VERSION.SDK_INT < 17) {
            i28 = 1;
        } else {
            i28 = 1;
            layoutParams58.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        dmtTextView41.setGravity(17);
        dmtTextView41.setMaxLines(i28);
        dmtTextView41.setText(R.string.b4n);
        dmtTextView41.setTextColor(resources.getColorStateList(R.color.a1a));
        dmtTextView41.setFontType("regular");
        dmtTextView41.setLayoutParams(layoutParams58);
        if (dmtTextView41.getParent() == null) {
            linearLayout15.addView(dmtTextView41);
        }
        LinearLayout linearLayout16 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams59 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout16.setId(R.id.air);
        if (MarginLayoutParams.class.isInstance(layoutParams59)) {
            dmtTextView13 = dmtTextView41;
            layoutParams59.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView13 = dmtTextView41;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams59) && VERSION.SDK_INT >= 17) {
            layoutParams59.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout16.setOrientation(0);
        linearLayout16.setLayoutParams(layoutParams59);
        if (linearLayout16.getParent() == null) {
            linearLayout14.addView(linearLayout16);
        }
        DmtTextView dmtTextView42 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams60 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView42.setTextSize(1, 17.0f);
        dmtTextView42.setId(R.id.aip);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams60)) {
            i29 = 16;
            layoutParams60.gravity = 16;
        } else {
            i29 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams60)) {
            ((FrameLayout.LayoutParams) layoutParams60).gravity = i29;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams60) || VERSION.SDK_INT < 17) {
            linearLayout2 = linearLayout15;
            f5 = 2.0f;
            i30 = 1;
        } else {
            linearLayout2 = linearLayout15;
            f5 = 2.0f;
            i30 = 1;
            layoutParams60.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams60)) {
            layoutParams60.rightMargin = (int) TypedValue.applyDimension(i30, f5, resources.getDisplayMetrics());
        }
        dmtTextView42.setGravity(17);
        dmtTextView42.setMaxLines(i30);
        dmtTextView42.setTextColor(resources.getColorStateList(R.color.a1l));
        dmtTextView42.setFontType("regular");
        dmtTextView42.setLayoutParams(layoutParams60);
        if (dmtTextView42.getParent() == null) {
            linearLayout16.addView(dmtTextView42);
        }
        DmtTextView dmtTextView43 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams61 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView43.setTextSize(1, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams61)) {
            i31 = 16;
            layoutParams61.gravity = 16;
        } else {
            i31 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams61)) {
            ((FrameLayout.LayoutParams) layoutParams61).gravity = i31;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams61)) {
            dmtTextView14 = dmtTextView42;
            layoutParams61.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView14 = dmtTextView42;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams61) || VERSION.SDK_INT < 17) {
            i32 = 1;
        } else {
            i32 = 1;
            layoutParams61.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        dmtTextView43.setGravity(17);
        dmtTextView43.setMaxLines(i32);
        dmtTextView43.setText(R.string.b5d);
        dmtTextView43.setTextColor(resources.getColorStateList(R.color.a1a));
        dmtTextView43.setFontType("regular");
        dmtTextView43.setLayoutParams(layoutParams61);
        if (dmtTextView43.getParent() == null) {
            linearLayout16.addView(dmtTextView43);
        }
        LinearLayout linearLayout17 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams62 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout17.setId(R.id.aim);
        if (MarginLayoutParams.class.isInstance(layoutParams62)) {
            dmtTextView15 = dmtTextView43;
            layoutParams62.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView15 = dmtTextView43;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams62) && VERSION.SDK_INT >= 17) {
            layoutParams62.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout17.setOrientation(0);
        linearLayout17.setLayoutParams(layoutParams62);
        if (linearLayout17.getParent() == null) {
            linearLayout14.addView(linearLayout17);
        }
        DmtTextView dmtTextView44 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams63 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView44.setTextSize(1, 17.0f);
        dmtTextView44.setId(R.id.aik);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams63)) {
            i33 = 16;
            layoutParams63.gravity = 16;
        } else {
            i33 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams63)) {
            ((FrameLayout.LayoutParams) layoutParams63).gravity = i33;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams63) || VERSION.SDK_INT < 17) {
            linearLayout3 = linearLayout16;
            f6 = 1.0f;
            i34 = 1;
        } else {
            linearLayout3 = linearLayout16;
            f6 = 1.0f;
            i34 = 1;
            layoutParams63.setMarginEnd((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams63)) {
            layoutParams63.rightMargin = (int) TypedValue.applyDimension(i34, f6, resources.getDisplayMetrics());
        }
        dmtTextView44.setGravity(17);
        dmtTextView44.setMaxLines(i34);
        dmtTextView44.setTextColor(resources.getColorStateList(R.color.a1l));
        dmtTextView44.setFontType("regular");
        dmtTextView44.setLayoutParams(layoutParams63);
        if (dmtTextView44.getParent() == null) {
            linearLayout17.addView(dmtTextView44);
        }
        DmtTextView dmtTextView45 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams64 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView45.setTextSize(1, 15.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams64)) {
            i35 = 16;
            layoutParams64.gravity = 16;
        } else {
            i35 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams64)) {
            ((FrameLayout.LayoutParams) layoutParams64).gravity = i35;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams64)) {
            dmtTextView16 = dmtTextView44;
            layoutParams64.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView16 = dmtTextView44;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams64) || VERSION.SDK_INT < 17) {
            i36 = 1;
        } else {
            i36 = 1;
            layoutParams64.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        dmtTextView45.setGravity(17);
        dmtTextView45.setMaxLines(i36);
        dmtTextView45.setText(R.string.b57);
        dmtTextView45.setTextColor(resources.getColorStateList(R.color.a1a));
        dmtTextView45.setFontType("regular");
        dmtTextView45.setLayoutParams(layoutParams64);
        if (dmtTextView45.getParent() == null) {
            linearLayout17.addView(dmtTextView45);
        }
        View view17 = new View(context2);
        DmtTextView dmtTextView46 = dmtTextView45;
        LinearLayout.LayoutParams layoutParams65 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams65)) {
            layoutParams65.weight = 1.0f;
        }
        view17.setLayoutParams(layoutParams65);
        if (view17.getParent() == null) {
            linearLayout14.addView(view17);
        }
        DmtTextView dmtTextView47 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams66 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView47.setTextSize(1, 17.0f);
        dmtTextView47.setId(R.id.baj);
        if (!MarginLayoutParams.class.isInstance(layoutParams66) || VERSION.SDK_INT < 17) {
            view6 = view17;
            f7 = 15.0f;
        } else {
            view6 = view17;
            f7 = 15.0f;
            layoutParams66.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams66)) {
            layoutParams66.rightMargin = (int) TypedValue.applyDimension(1, f7, resources.getDisplayMetrics());
        }
        dmtTextView47.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        dmtTextView47.setCompoundDrawablesRelative(context.getResources().getDrawable(R.drawable.doq), dmtTextView47.getCompoundDrawablesRelative()[1], dmtTextView47.getCompoundDrawablesRelative()[2], dmtTextView47.getCompoundDrawablesRelative()[3]);
        dmtTextView47.setTextColor(resources.getColorStateList(R.color.a3c));
        dmtTextView47.setTypeface(Typeface.defaultFromStyle(2));
        dmtTextView47.setVisibility(8);
        dmtTextView47.setLayoutParams(layoutParams66);
        if (dmtTextView47.getParent() == null) {
            linearLayout14.addView(dmtTextView47);
        }
        ProfileStarRankView profileStarRankView2 = new ProfileStarRankView(context2);
        LinearLayout.LayoutParams layoutParams67 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        profileStarRankView2.setId(R.id.c5x);
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            dmtTextView17 = dmtTextView47;
            layoutParams67.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView17 = dmtTextView47;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams67) || VERSION.SDK_INT < 17) {
            i37 = 1;
            f8 = 16.0f;
        } else {
            i37 = 1;
            f8 = 16.0f;
            layoutParams67.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.leftMargin = (int) TypedValue.applyDimension(i37, f8, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67)) {
            layoutParams67.rightMargin = (int) TypedValue.applyDimension(i37, f8, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams67) && VERSION.SDK_INT >= 17) {
            layoutParams67.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        profileStarRankView2.setVisibility(8);
        profileStarRankView2.setLayoutParams(layoutParams67);
        if (profileStarRankView2.getParent() == null) {
            linearLayout4.addView(profileStarRankView2);
        }
        View a2 = C2281a.m6815a(context2, R.layout.bog, linearLayout4, false, 0);
        if (a2 == null || a2 == linearLayout4) {
            profileStarRankView = profileStarRankView2;
        } else {
            LinearLayout.LayoutParams layoutParams68 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
            if (MarginLayoutParams.class.isInstance(layoutParams68)) {
                profileStarRankView = profileStarRankView2;
                layoutParams68.topMargin = (int) TypedValue.applyDimension(1, -10.0f, resources.getDisplayMetrics());
            } else {
                profileStarRankView = profileStarRankView2;
            }
            a2.setLayoutParams(layoutParams68);
            if (a2.getParent() == null) {
                linearLayout4.addView(a2);
            }
        }
        LinearLayout linearLayout18 = new LinearLayout(context2);
        ConstraintLayout.LayoutParams layoutParams69 = new ConstraintLayout.LayoutParams(-1, -2);
        linearLayout18.setId(R.id.ei9);
        linearLayout18.setOrientation(0);
        linearLayout18.setVisibility(8);
        View view18 = a2;
        LinearLayout linearLayout19 = linearLayout17;
        LinearLayout linearLayout20 = linearLayout14;
        linearLayout18.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        linearLayout18.setBackgroundColor(resources.getColor(R.color.a2j));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.f865i = R.id.c5m;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            i38 = 0;
            layoutParams69.f875s = 0;
        } else {
            i38 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams69)) {
            layoutParams69.f873q = i38;
        }
        linearLayout18.setLayoutParams(layoutParams69);
        if (linearLayout18.getParent() == null) {
            constraintLayout.addView(linearLayout18);
        }
        AppCompatImageView appCompatImageView10 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams70 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        appCompatImageView10.setId(R.id.ebe);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams70)) {
            i39 = 16;
            layoutParams70.gravity = 16;
        } else {
            i39 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams70)) {
            ((FrameLayout.LayoutParams) layoutParams70).gravity = i39;
        }
        appCompatImageView10.setLayoutParams(layoutParams70);
        if (appCompatImageView10.getParent() == null) {
            linearLayout18.addView(appCompatImageView10);
        }
        LinearLayout linearLayout21 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams71 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams71)) {
            i40 = 16;
            layoutParams71.gravity = 16;
        } else {
            i40 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams71)) {
            ((FrameLayout.LayoutParams) layoutParams71).gravity = i40;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams71) || VERSION.SDK_INT < 17) {
            i41 = 1;
        } else {
            i41 = 1;
            layoutParams71.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        linearLayout21.setOrientation(i41);
        linearLayout21.setLayoutParams(layoutParams71);
        if (linearLayout21.getParent() == null) {
            linearLayout18.addView(linearLayout21);
        }
        DmtTextView dmtTextView48 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams72 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView48.setTextSize(2, 15.0f);
        dmtTextView48.setId(R.id.f0a);
        dmtTextView48.setTextColor(resources.getColorStateList(R.color.ph));
        dmtTextView48.setLayoutParams(layoutParams72);
        if (dmtTextView48.getParent() == null) {
            linearLayout21.addView(dmtTextView48);
        }
        DmtTextView dmtTextView49 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams73 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView49.setTextSize(2, 13.0f);
        dmtTextView49.setId(R.id.e4x);
        if (MarginLayoutParams.class.isInstance(layoutParams73)) {
            dmtTextView18 = dmtTextView48;
            appCompatImageView3 = appCompatImageView10;
            layoutParams73.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            appCompatImageView3 = appCompatImageView10;
            dmtTextView18 = dmtTextView48;
        }
        dmtTextView49.setTextColor(resources.getColorStateList(R.color.b0k));
        dmtTextView49.setLayoutParams(layoutParams73);
        if (dmtTextView49.getParent() == null) {
            linearLayout21.addView(dmtTextView49);
        }
        TableLayout tableLayout = new TableLayout(context2);
        tableLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        if (tableLayout.getParent() == null) {
            constraintLayout.addView(tableLayout);
        }
        DmtTabLayout dmtTabLayout = new DmtTabLayout(context2);
        TableLayout tableLayout2 = tableLayout;
        ConstraintLayout.LayoutParams layoutParams74 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setId(R.id.cwz);
        dmtTabLayout.setTabBackgroundResId(0);
        dmtTabLayout.setSelectedTabIndicatorColor(resources.getColor(R.color.a11));
        dmtTabLayout.setSelectedTabIndicatorHeight((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMinWidth((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabMode(0);
        dmtTabLayout.setTabPaddingEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        dmtTabLayout.setTabPaddingStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            i42 = 0;
            layoutParams74.f867k = 0;
        } else {
            i42 = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            layoutParams74.f875s = i42;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            layoutParams74.f873q = i42;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams74)) {
            layoutParams74.f865i = R.id.c5m;
        }
        dmtTabLayout.setLayoutParams(layoutParams74);
        if (dmtTabLayout.getParent() == null) {
            constraintLayout.addView(dmtTabLayout);
        }
        View view19 = new View(context2);
        ConstraintLayout.LayoutParams layoutParams75 = new ConstraintLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams75)) {
            ((LinearLayout.LayoutParams) layoutParams75).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams75)) {
            ((FrameLayout.LayoutParams) layoutParams75).gravity = 80;
        }
        view19.setBackgroundColor(resources.getColor(R.color.ayd));
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams75)) {
            layoutParams75.f865i = R.id.cwz;
        }
        view19.setLayoutParams(layoutParams75);
        if (view19.getParent() == null) {
            constraintLayout.addView(view19);
        }
        C1522a.m5435a(frameLayout4);
        C1522a.m5435a(constraintLayout);
        C1522a.m5435a(view7);
        C1522a.m5435a(view13);
        C1522a.m5435a(dmtTextView36);
        C1522a.m5435a(appCompatImageView7);
        C1522a.m5435a(appCompatImageView6);
        C1522a.m5435a(remoteImageView3);
        C1522a.m5435a(view);
        C1522a.m5435a(linearLayout4);
        C1522a.m5435a(space);
        C1522a.m5435a(linearLayout12);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(liveCircleView2);
        C1522a.m5435a(smartAvatarBorderView2);
        C1522a.m5435a(animationImageView3);
        C1522a.m5435a(animationImageView5);
        C1522a.m5435a(animationImageView6);
        C1522a.m5435a(view2);
        C1522a.m5435a(dmtTextView21);
        C1522a.m5435a(linearLayout7);
        C1522a.m5435a(remoteImageView);
        DmtTextView dmtTextView50 = dmtTextView23;
        dmtTextView50.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView50);
        C1522a.m5435a(remoteImageView6);
        DmtTextView dmtTextView51 = dmtTextView27;
        dmtTextView51.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView51);
        DmtTextView dmtTextView52 = dmtTextView26;
        dmtTextView52.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView52);
        C1522a.m5435a(frameLayout2);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(frameLayout3);
        C1522a.m5435a(bindAccountView);
        C1522a.m5435a(linearLayout10);
        DmtTextView dmtTextView53 = dmtTextView2;
        dmtTextView53.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView53);
        DmtTextView dmtTextView54 = dmtTextView3;
        dmtTextView54.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.dpt), null, null, null);
        dmtTextView54.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView54);
        DmtTextView dmtTextView55 = dmtTextView4;
        dmtTextView55.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.dps), null, null, null);
        dmtTextView55.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView55);
        DmtTextView dmtTextView56 = dmtTextView5;
        dmtTextView56.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.dpq), null, null, null);
        dmtTextView56.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView56);
        DmtTextView dmtTextView57 = dmtTextView6;
        dmtTextView57.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView57);
        DmtTextView dmtTextView58 = dmtTextView7;
        dmtTextView58.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.dr5), null, null, null);
        dmtTextView58.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView58);
        C1522a.m5435a(connectedRelationView);
        C1522a.m5435a(recommendCommonUserView2);
        C1522a.m5435a(view12);
        C1522a.m5435a(linearLayout9);
        C1522a.m5435a(linearLayout11);
        C1522a.m5435a(appCompatImageView2);
        DmtTextView dmtTextView59 = dmtTextView11;
        dmtTextView59.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView59);
        C1522a.m5435a(view5);
        C1522a.m5435a(space4);
        C1522a.m5435a(view3);
        C1522a.m5435a(view4);
        DmtTextView dmtTextView60 = dmtTextView8;
        dmtTextView60.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView60);
        DmtTextView dmtTextView61 = dmtTextView9;
        dmtTextView61.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView61);
        DmtTextView dmtTextView62 = dmtTextView10;
        dmtTextView62.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView62);
        C1522a.m5435a(translationStatusView);
        C1522a.m5435a(enterpriseTransformLayout);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(linearLayout20);
        C1522a.m5435a(linearLayout2);
        DmtTextView dmtTextView63 = dmtTextView12;
        dmtTextView63.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView63);
        DmtTextView dmtTextView64 = dmtTextView13;
        dmtTextView64.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView64);
        C1522a.m5435a(linearLayout3);
        DmtTextView dmtTextView65 = dmtTextView14;
        dmtTextView65.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView65);
        DmtTextView dmtTextView66 = dmtTextView15;
        dmtTextView66.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView66);
        C1522a.m5435a(linearLayout19);
        DmtTextView dmtTextView67 = dmtTextView16;
        dmtTextView67.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView67);
        DmtTextView dmtTextView68 = dmtTextView46;
        dmtTextView68.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView68);
        C1522a.m5435a(view6);
        DmtTextView dmtTextView69 = dmtTextView17;
        dmtTextView69.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.doq), null, null, null);
        dmtTextView69.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView69);
        C1522a.m5435a(profileStarRankView);
        C1522a.m5435a(view18);
        C1522a.m5435a(linearLayout18);
        C1522a.m5435a(appCompatImageView3);
        C1522a.m5435a(linearLayout21);
        DmtTextView dmtTextView70 = dmtTextView18;
        dmtTextView70.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView70);
        dmtTextView49.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView49);
        C1522a.m5435a(tableLayout2);
        C1522a.m5435a(dmtTabLayout);
        C1522a.m5435a(view19);
        return frameLayout4;
    }
}
