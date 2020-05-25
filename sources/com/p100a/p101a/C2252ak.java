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
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p939e.C13803f;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p100a.p102b.C2281a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.views.UserProfileViewPager;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.a.a.ak */
public final class C2252ak implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        View view;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        LinearLayout linearLayout;
        DmtTextView dmtTextView;
        int i12;
        float f;
        float f2;
        int i13;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -1);
        frameLayout.setBackgroundColor(resources.getColor(R.color.ce));
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        SmartImageView smartImageView = new SmartImageView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a0v));
        smartImageView.setId(R.id.azn);
        smartImageView.setBackgroundColor(resources.getColor(R.color.a0a));
        ((C13833a) smartImageView.getHierarchy()).mo25898a(C13818b.f36061a);
        smartImageView.setLayoutParams(layoutParams);
        if (smartImageView.getParent() == null) {
            frameLayout.addView(smartImageView);
        }
        View view2 = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.a0v));
        view2.setId(R.id.a2_);
        view2.setBackgroundResource(R.drawable.dn0);
        view2.setLayoutParams(layoutParams2);
        if (view2.getParent() == null) {
            frameLayout.addView(view2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams3);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        DampScrollableLayout dampScrollableLayout = new DampScrollableLayout(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        dampScrollableLayout.setId(R.id.chv);
        dampScrollableLayout.setOrientation(1);
        dampScrollableLayout.setTabsMarginTop((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        dampScrollableLayout.setLayoutParams(layoutParams4);
        if (dampScrollableLayout.getParent() == null) {
            linearLayout2.addView(dampScrollableLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        MarginLayoutParams a2 = C1522a.m5434a(dampScrollableLayout, -1, -2);
        frameLayout2.setVisibility(8);
        frameLayout2.setLayoutParams(a2);
        if (frameLayout2.getParent() == null) {
            dampScrollableLayout.addView(frameLayout2);
        }
        View a3 = C2281a.m6815a(context2, R.layout.bqa, frameLayout2, false, 0);
        if (!(a3 == null || a3 == frameLayout2)) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
            a3.setId(R.id.c5n);
            a3.setLayoutParams(layoutParams5);
            if (a3.getParent() == null) {
                frameLayout2.addView(a3);
            }
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        viewStub.setId(R.id.ab4);
        viewStub.setLayoutResource(R.layout.boo);
        viewStub.setLayoutParams(layoutParams6);
        if (viewStub.getParent() == null) {
            frameLayout2.addView(viewStub);
        }
        UserProfileViewPager userProfileViewPager = new UserProfileViewPager(context2);
        MarginLayoutParams a4 = C1522a.m5434a(dampScrollableLayout, -1, -1);
        userProfileViewPager.setId(R.id.ci0);
        userProfileViewPager.setBackgroundColor(resources.getColor(R.color.a3i));
        userProfileViewPager.setLayoutParams(a4);
        if (userProfileViewPager.getParent() == null) {
            dampScrollableLayout.addView(userProfileViewPager);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(layoutParams7);
        if (linearLayout3.getParent() == null) {
            frameLayout.addView(linearLayout3);
        }
        View view3 = new View(context2);
        UserProfileViewPager userProfileViewPager2 = userProfileViewPager;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view3.setBackgroundColor(resources.getColor(R.color.wo));
        view3.setId(R.id.csm);
        view3.setLayoutParams(layoutParams8);
        if (view3.getParent() == null) {
            linearLayout3.addView(view3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, (int) resources.getDimension(R.dimen.xo));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            view = view3;
            ((RelativeLayout.LayoutParams) layoutParams9).addRule(3, R.id.csm);
        } else {
            view = view3;
        }
        relativeLayout.setBackgroundColor(resources.getColor(R.color.arz));
        relativeLayout.setLayoutParams(layoutParams9);
        if (relativeLayout.getParent() == null) {
            linearLayout3.addView(relativeLayout);
        }
        View view4 = new View(context2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -1);
        view4.setId(R.id.d16);
        view4.setAlpha(0.0f);
        view4.setBackgroundColor(resources.getColor(R.color.a2j));
        view4.setLayoutParams(layoutParams10);
        if (view4.getParent() == null) {
            relativeLayout.addView(view4);
        }
        View view5 = new View(context2);
        View view6 = view4;
        ViewStub viewStub2 = viewStub;
        View view7 = a3;
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        view5.setId(R.id.il);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(18, R.id.ik);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(5, R.id.ik);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(6, R.id.ik);
        }
        view5.setBackgroundResource(R.drawable.dlx);
        view5.setLayoutParams(layoutParams11);
        if (view5.getParent() == null) {
            relativeLayout.addView(view5);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context2);
        View view8 = view5;
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        autoRTLImageView.setId(R.id.ik);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12) && VERSION.SDK_INT >= 17) {
            layoutParams12.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams12)) {
            i = 1;
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            i = 1;
        }
        FrameLayout frameLayout3 = frameLayout2;
        DampScrollableLayout dampScrollableLayout2 = dampScrollableLayout;
        autoRTLImageView.setPadding((int) TypedValue.applyDimension(i, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i, 4.0f, resources.getDisplayMetrics()));
        autoRTLImageView.setImageResource(R.drawable.dpf);
        autoRTLImageView.setLayoutParams(layoutParams12);
        if (autoRTLImageView.getParent() == null) {
            relativeLayout.addView(autoRTLImageView);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setTextSize(1, 17.0f);
        dmtTextView2.setId(R.id.title);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(13, -1);
        }
        dmtTextView2.setEllipsize(TruncateAt.END);
        dmtTextView2.setGravity(17);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.a1l));
        dmtTextView2.setLayoutParams(layoutParams13);
        if (dmtTextView2.getParent() == null) {
            relativeLayout.addView(dmtTextView2);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 19.0f, resources.getDisplayMetrics()));
        ((C13833a) remoteImageView.getHierarchy()).mo25902b((int) R.drawable.doy);
        remoteImageView.setId(R.id.ae6);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14) && VERSION.SDK_INT >= 17) {
            layoutParams14.setMarginEnd((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.rightMargin = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(16, R.id.d14);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.addRule(0, R.id.d14);
        }
        remoteImageView.setVisibility(8);
        ((C13833a) remoteImageView.getHierarchy()).mo25898a(C13818b.f36063c);
        ((C13833a) remoteImageView.getHierarchy()).mo25907c((int) R.drawable.doy);
        C13833a aVar = (C13833a) remoteImageView.getHierarchy();
        Field declaredField = C13833a.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        aVar.mo25905b(((C13803f) declaredField.get(aVar)).mo25779a(5), C13818b.f36063c);
        C13833a aVar2 = (C13833a) remoteImageView.getHierarchy();
        Field declaredField2 = C13833a.class.getDeclaredField("b");
        declaredField2.setAccessible(true);
        aVar2.mo25897a(((C13803f) declaredField2.get(aVar2)).mo25779a(1), C13818b.f36063c);
        remoteImageView.setLayoutParams(layoutParams14);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        RemoteImageView remoteImageView2 = remoteImageView;
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        dmtTextView3.setTextSize(1, 13.0f);
        dmtTextView3.setId(R.id.ae7);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            RelativeLayout.LayoutParams layoutParams16 = layoutParams15;
            i2 = R.id.d14;
            layoutParams16.addRule(16, R.id.d14);
        } else {
            i2 = R.id.d14;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.addRule(0, i2);
        }
        dmtTextView3.setBackgroundResource(R.drawable.de7);
        dmtTextView3.setGravity(17);
        dmtTextView3.setMaxWidth((int) TypedValue.applyDimension(1, 66.0f, resources.getDisplayMetrics()));
        dmtTextView3.setMaxLines(1);
        if (TextView.class.isInstance(dmtTextView3)) {
            dmtTextView3.setMinWidth((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        } else {
            dmtTextView3.setMinimumWidth((int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        dmtTextView3.setSingleLine(true);
        dmtTextView3.setText(R.string.b3w);
        dmtTextView3.setTextColor(resources.getColorStateList(R.color.aso));
        dmtTextView3.setLayoutParams(layoutParams15);
        if (dmtTextView3.getParent() == null) {
            relativeLayout.addView(dmtTextView3);
        }
        View view9 = new View(context2);
        DmtTextView dmtTextView4 = dmtTextView3;
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        view9.setId(R.id.bn3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            RelativeLayout.LayoutParams layoutParams18 = layoutParams17;
            i3 = R.id.d14;
            layoutParams18.addRule(18, R.id.d14);
        } else {
            i3 = R.id.d14;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.addRule(5, i3);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.addRule(6, i3);
        }
        view9.setBackgroundResource(R.drawable.dlx);
        view9.setVisibility(8);
        view9.setLayoutParams(layoutParams17);
        if (view9.getParent() == null) {
            relativeLayout.addView(view9);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        View view10 = view9;
        RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.d14);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i4 = -1;
            layoutParams19.addRule(21, -1);
        } else {
            i4 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.addRule(11, i4);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.addRule(15, i4);
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams19) || VERSION.SDK_INT < 17) {
            i5 = 1;
        } else {
            i5 = 1;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.rightMargin = (int) TypedValue.applyDimension(i5, 15.0f, resources.getDisplayMetrics());
        }
        DmtTextView dmtTextView5 = dmtTextView2;
        AutoRTLImageView autoRTLImageView2 = autoRTLImageView;
        appCompatImageView.setPadding((int) TypedValue.applyDimension(i5, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i5, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i5, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i5, 4.0f, resources.getDisplayMetrics()));
        appCompatImageView.setImageResource(R.drawable.dqz);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setLayoutParams(layoutParams19);
        if (appCompatImageView.getParent() == null) {
            relativeLayout.addView(appCompatImageView);
        }
        FrameLayout frameLayout4 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -1);
        frameLayout4.setId(R.id.dna);
        frameLayout4.setLayoutParams(layoutParams20);
        if (frameLayout4.getParent() == null) {
            linearLayout3.addView(frameLayout4);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 54.0f, resources.getDisplayMetrics()));
        linearLayout4.setId(R.id.ba);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((LinearLayout.LayoutParams) layoutParams21).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.gravity = 80;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.bottomMargin = (int) TypedValue.applyDimension(1, -55.0f, resources.getDisplayMetrics());
        }
        linearLayout4.setBackgroundColor(Color.parseColor("#cc000000"));
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(layoutParams21);
        if (linearLayout4.getParent() == null) {
            frameLayout.addView(linearLayout4);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView2.setId(R.id.b9);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams22)) {
            i6 = 17;
            layoutParams22.gravity = 17;
        } else {
            i6 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams22)) {
            ((FrameLayout.LayoutParams) layoutParams22).gravity = i6;
        }
        FrameLayout frameLayout5 = frameLayout4;
        AppCompatImageView appCompatImageView3 = appCompatImageView;
        RelativeLayout relativeLayout2 = relativeLayout;
        appCompatImageView2.setPadding((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        appCompatImageView2.setImageResource(R.drawable.dri);
        appCompatImageView2.setLayoutParams(layoutParams22);
        if (appCompatImageView2.getParent() == null) {
            linearLayout4.addView(appCompatImageView2);
        }
        AvatarImageView avatarImageView = new AvatarImageView(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()));
        avatarImageView.setId(R.id.b8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i7 = 17;
            layoutParams23.gravity = 17;
        } else {
            i7 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i7;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23) && VERSION.SDK_INT >= i7) {
            layoutParams23.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        avatarImageView.setVisibility(8);
        avatarImageView.setLayoutParams(layoutParams23);
        if (avatarImageView.getParent() == null) {
            linearLayout4.addView(avatarImageView);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        linearLayout5.setId(R.id.b_);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i8 = 17;
            layoutParams24.gravity = 17;
        } else {
            i8 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = i8;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            layoutParams24.weight = 1.0f;
        }
        linearLayout5.setOrientation(1);
        linearLayout5.setVisibility(8);
        linearLayout5.setLayoutParams(layoutParams24);
        if (linearLayout5.getParent() == null) {
            linearLayout4.addView(linearLayout5);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -1);
        dmtTextView6.setTextSize(1, 15.0f);
        dmtTextView6.setId(R.id.bc);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.gravity = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((FrameLayout.LayoutParams) layoutParams25).gravity = 8388627;
        }
        dmtTextView6.setEllipsize(TruncateAt.END);
        dmtTextView6.setGravity(8388627);
        dmtTextView6.setMaxLines(1);
        dmtTextView6.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView6.setLayoutParams(layoutParams25);
        if (dmtTextView6.getParent() == null) {
            linearLayout5.addView(dmtTextView6);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -1);
        dmtTextView7.setTextSize(1, 12.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams26)) {
            i9 = 8388627;
            layoutParams26.gravity = 8388627;
        } else {
            i9 = 8388627;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((FrameLayout.LayoutParams) layoutParams26).gravity = i9;
        }
        dmtTextView7.setEllipsize(TruncateAt.END);
        dmtTextView7.setGravity(i9);
        dmtTextView7.setMaxLines(1);
        dmtTextView7.setText(R.string.db);
        dmtTextView7.setTextColor(resources.getColorStateList(R.color.a1o));
        dmtTextView7.setLayoutParams(layoutParams26);
        if (dmtTextView7.getParent() == null) {
            linearLayout5.addView(dmtTextView7);
        }
        DmtTextView dmtTextView8 = new DmtTextView(context2);
        DmtTextView dmtTextView9 = dmtTextView6;
        DmtTextView dmtTextView10 = dmtTextView7;
        LinearLayout.LayoutParams layoutParams27 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        dmtTextView8.setTextSize(1, 13.0f);
        dmtTextView8.setId(R.id.dki);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams27)) {
            i10 = 17;
            layoutParams27.gravity = 17;
        } else {
            i10 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams27)) {
            ((FrameLayout.LayoutParams) layoutParams27).gravity = i10;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.weight = 1.0f;
        }
        dmtTextView8.setEllipsize(TruncateAt.END);
        dmtTextView8.setGravity(16);
        dmtTextView8.setMaxLines(1);
        dmtTextView8.setText(R.string.db);
        dmtTextView8.setTextColor(resources.getColorStateList(R.color.a1l));
        dmtTextView8.setLayoutParams(layoutParams27);
        if (dmtTextView8.getParent() == null) {
            linearLayout4.addView(dmtTextView8);
        }
        DmtTextView dmtTextView11 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView11.setTextSize(1, 13.0f);
        dmtTextView11.setId(R.id.bb);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams28)) {
            i11 = 17;
            layoutParams28.gravity = 17;
        } else {
            i11 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams28)) {
            ((FrameLayout.LayoutParams) layoutParams28).gravity = i11;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams28) || VERSION.SDK_INT < i11) {
            linearLayout = linearLayout5;
            dmtTextView = dmtTextView8;
            f = 15.0f;
            i12 = 1;
        } else {
            linearLayout = linearLayout5;
            dmtTextView = dmtTextView8;
            f = 15.0f;
            i12 = 1;
            layoutParams28.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams28)) {
            layoutParams28.rightMargin = (int) TypedValue.applyDimension(i12, f, resources.getDisplayMetrics());
        }
        dmtTextView11.setBackgroundResource(R.drawable.dlo);
        dmtTextView11.setGravity(17);
        dmtTextView11.setPadding((int) TypedValue.applyDimension(i12, 14.0f, resources.getDisplayMetrics()), dmtTextView11.getPaddingTop(), dmtTextView11.getPaddingRight(), dmtTextView11.getPaddingBottom());
        dmtTextView11.setPadding(dmtTextView11.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView11.getPaddingRight(), dmtTextView11.getPaddingBottom());
        AvatarImageView avatarImageView2 = avatarImageView;
        dmtTextView11.setPadding(dmtTextView11.getPaddingLeft(), dmtTextView11.getPaddingTop(), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), dmtTextView11.getPaddingBottom());
        AppCompatImageView appCompatImageView4 = appCompatImageView2;
        dmtTextView11.setPadding(dmtTextView11.getPaddingLeft(), dmtTextView11.getPaddingTop(), dmtTextView11.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView11.setText(R.string.dc);
        dmtTextView11.setTextColor(resources.getColorStateList(R.color.a1k));
        dmtTextView11.setLayoutParams(layoutParams28);
        if (dmtTextView11.getParent() == null) {
            linearLayout4.addView(dmtTextView11);
        }
        AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = new AdHalfWebPageMaskLayer(context2);
        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams(-1, -1);
        adHalfWebPageMaskLayer.setId(R.id.l8);
        adHalfWebPageMaskLayer.setVisibility(8);
        adHalfWebPageMaskLayer.setLayoutParams(layoutParams29);
        if (adHalfWebPageMaskLayer.getParent() == null) {
            frameLayout.addView(adHalfWebPageMaskLayer);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context2);
        FrameLayout.LayoutParams layoutParams30 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 138.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(R.id.bu);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams30)) {
            ((LinearLayout.LayoutParams) layoutParams30).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.gravity = 8388691;
        }
        if (!MarginLayoutParams.class.isInstance(layoutParams30) || VERSION.SDK_INT < 17) {
            i13 = 1;
            f2 = 15.0f;
        } else {
            i13 = 1;
            f2 = 15.0f;
            layoutParams30.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.leftMargin = (int) TypedValue.applyDimension(i13, f2, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.bottomMargin = (int) TypedValue.applyDimension(i13, 58.0f, resources.getDisplayMetrics());
        }
        adHalfWebPageContainer.setLayoutParams(layoutParams30);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout.addView(adHalfWebPageContainer);
        }
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(smartImageView);
        C1522a.m5435a(view2);
        C1522a.m5435a(linearLayout2);
        C1522a.m5435a(dampScrollableLayout2);
        C1522a.m5435a(frameLayout3);
        C1522a.m5435a(view7);
        ViewStub viewStub3 = viewStub2;
        viewStub3.setInflatedId(-1);
        C1522a.m5435a(viewStub3);
        C1522a.m5435a(userProfileViewPager2);
        C1522a.m5435a(linearLayout3);
        C1522a.m5435a(view);
        C1522a.m5435a(relativeLayout2);
        C1522a.m5435a(view6);
        C1522a.m5435a(view8);
        C1522a.m5435a(autoRTLImageView2);
        DmtTextView dmtTextView12 = dmtTextView5;
        dmtTextView12.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView12);
        C1522a.m5435a(remoteImageView2);
        DmtTextView dmtTextView13 = dmtTextView4;
        dmtTextView13.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView13);
        C1522a.m5435a(view10);
        C1522a.m5435a(appCompatImageView3);
        C1522a.m5435a(frameLayout5);
        C1522a.m5435a(linearLayout4);
        C1522a.m5435a(appCompatImageView4);
        C1522a.m5435a(avatarImageView2);
        C1522a.m5435a(linearLayout);
        DmtTextView dmtTextView14 = dmtTextView9;
        dmtTextView14.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView14);
        DmtTextView dmtTextView15 = dmtTextView10;
        dmtTextView15.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView15);
        DmtTextView dmtTextView16 = dmtTextView;
        dmtTextView16.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView16);
        dmtTextView11.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView11);
        C1522a.m5435a(adHalfWebPageMaskLayer);
        C1522a.m5435a(adHalfWebPageContainer);
        return frameLayout;
    }
}
