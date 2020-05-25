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
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AvatarImageWithLive;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.m */
public final class C2267m implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), -2);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        SmartAvatarBorderView smartAvatarBorderView = new SmartAvatarBorderView(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        smartAvatarBorderView.setId(R.id.dm3);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        smartAvatarBorderView.setVisibility(0);
        smartAvatarBorderView.setLayoutParams(layoutParams);
        if (smartAvatarBorderView.getParent() == null) {
            relativeLayout.addView(smartAvatarBorderView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.eer);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(18, R.id.dm3);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(6, R.id.dm3);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(19, R.id.dm3);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(8, R.id.dm3);
        }
        appCompatImageView.setScaleType(ScaleType.FIT_XY);
        appCompatImageView.setImageResource(R.drawable.cwk);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        AvatarImageWithLive avatarImageWithLive = new AvatarImageWithLive(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        avatarImageWithLive.setId(R.id.dm9);
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        avatarImageWithLive.setVisibility(4);
        avatarImageWithLive.setLayoutParams(layoutParams3);
        if (avatarImageWithLive.getParent() == null) {
            relativeLayout.addView(avatarImageWithLive);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()));
        liveCircleView.setId(R.id.dm5);
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        liveCircleView.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        liveCircleView.setVisibility(8);
        liveCircleView.setStrokeWidth((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        liveCircleView.setLayoutParams(layoutParams4);
        if (liveCircleView.getParent() == null) {
            relativeLayout.addView(liveCircleView);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 51.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.hs);
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        remoteImageView.setScaleType(ScaleType.FIT_CENTER);
        remoteImageView.setImageResource(R.drawable.icon);
        remoteImageView.setVisibility(8);
        remoteImageView.setLayoutParams(layoutParams5);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout2.setId(R.id.ai3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(14, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        relativeLayout2.setLayoutParams(layoutParams6);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        animationImageView.setId(R.id.ai0);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(14, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = 17;
        }
        animationImageView.setLayoutParams(layoutParams7);
        if (animationImageView.getParent() == null) {
            relativeLayout2.addView(animationImageView);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(smartAvatarBorderView);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(avatarImageWithLive);
        C1522a.m5435a(liveCircleView);
        C1522a.m5435a(remoteImageView);
        C1522a.m5435a(relativeLayout2);
        C1522a.m5435a(animationImageView);
        return relativeLayout;
    }
}
