package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.a.a.b */
public final class C2256b implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        linearLayout.setBackgroundColor(resources.getColor(R.color.aso));
        linearLayout.setOrientation(0);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setGravity(16);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), -1);
        view.setId(R.id.e6n);
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        FadeImageView fadeImageView = new FadeImageView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        fadeImageView.setId(R.id.erw);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        fadeImageView.setScaleType(ScaleType.FIT_XY);
        fadeImageView.setImageResource(R.drawable.cip);
        fadeImageView.setVisibility(8);
        fadeImageView.setLayoutParams(layoutParams2);
        if (fadeImageView.getParent() == null) {
            linearLayout.addView(fadeImageView);
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        ((C13833a) smartCircleImageView.getHierarchy()).mo25902b(2131953301);
        smartCircleImageView.setId(R.id.e2r);
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        smartCircleImageView.setVisibility(8);
        smartCircleImageView.setLayoutParams(layoutParams3);
        if (smartCircleImageView.getParent() == null) {
            linearLayout.addView(smartCircleImageView);
        }
        MentionEditText mentionEditText = new MentionEditText(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -1);
        mentionEditText.setId(R.id.x4);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1.0f;
        }
        mentionEditText.setBackgroundResource(0);
        mentionEditText.setGravity(8388627);
        mentionEditText.setHint(context.getResources().getString(R.string.a8s));
        mentionEditText.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingTop(), mentionEditText.getPaddingRight(), mentionEditText.getPaddingBottom());
        mentionEditText.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingTop(), mentionEditText.getPaddingRight(), mentionEditText.getPaddingBottom());
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), mentionEditText.getPaddingTop(), (int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingBottom());
        mentionEditText.setPadding(mentionEditText.getPaddingLeft(), mentionEditText.getPaddingTop(), (int) TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics()), mentionEditText.getPaddingBottom());
        mentionEditText.setTextAlignment(5);
        mentionEditText.setTextColor(resources.getColorStateList(R.color.ji));
        mentionEditText.setHintTextColor(resources.getColor(R.color.jl));
        Object obj = mentionEditText;
        Object valueOf = Integer.valueOf(R.drawable.cia);
        Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
        declaredField.setAccessible(true);
        declaredField.set(obj, valueOf);
        mentionEditText.setTextDirection(3);
        mentionEditText.setTextSize(1, 15.0f);
        mentionEditText.setLayoutParams(layoutParams4);
        if (mentionEditText.getParent() == null) {
            linearLayout.addView(mentionEditText);
        }
        FadeImageView fadeImageView2 = new FadeImageView(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        fadeImageView2.setId(R.id.gg);
        fadeImageView2.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        fadeImageView2.setScaleType(ScaleType.CENTER);
        fadeImageView2.setImageResource(R.drawable.a9p);
        fadeImageView2.setLayoutParams(layoutParams5);
        if (fadeImageView2.getParent() == null) {
            linearLayout.addView(fadeImageView2);
        }
        FadeImageView fadeImageView3 = new FadeImageView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        fadeImageView3.setId(R.id.b0c);
        fadeImageView3.setContentDescription(context.getResources().getString(R.string.c3));
        fadeImageView3.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        fadeImageView3.setScaleType(ScaleType.CENTER);
        fadeImageView3.setImageResource(R.drawable.a9s);
        fadeImageView3.setLayoutParams(layoutParams6);
        if (fadeImageView3.getParent() == null) {
            linearLayout.addView(fadeImageView3);
        }
        FadeImageView fadeImageView4 = new FadeImageView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -1);
        fadeImageView4.setId(R.id.xi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            i = 16;
            layoutParams7.gravity = 16;
        } else {
            i = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = i;
        }
        fadeImageView4.setContentDescription(null);
        FadeImageView fadeImageView5 = fadeImageView3;
        fadeImageView4.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        fadeImageView4.setScaleType(ScaleType.CENTER);
        fadeImageView4.setImageResource(R.drawable.cjd);
        fadeImageView4.setVisibility(8);
        fadeImageView4.setLayoutParams(layoutParams7);
        if (fadeImageView4.getParent() == null) {
            linearLayout.addView(fadeImageView4);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(R.id.e2u);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            i2 = 16;
            layoutParams8.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = i2;
        }
        remoteImageView.setContentDescription(null);
        FadeImageView fadeImageView6 = fadeImageView4;
        remoteImageView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        remoteImageView.setScaleType(ScaleType.CENTER_INSIDE);
        remoteImageView.setImageResource(R.drawable.cjd);
        remoteImageView.setVisibility(8);
        ((C13833a) remoteImageView.getHierarchy()).mo25898a(C13818b.f36066f);
        remoteImageView.setLayoutParams(layoutParams8);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView);
        }
        FadeImageView fadeImageView7 = new FadeImageView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -1);
        fadeImageView7.setId(R.id.cbm);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            i3 = 16;
            layoutParams9.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = i3;
        }
        fadeImageView7.setPadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), fadeImageView7.getPaddingTop(), fadeImageView7.getPaddingRight(), fadeImageView7.getPaddingBottom());
        fadeImageView7.setPadding(fadeImageView7.getPaddingLeft(), fadeImageView7.getPaddingTop(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), fadeImageView7.getPaddingBottom());
        fadeImageView7.setVisibility(8);
        fadeImageView7.setImageResource(R.drawable.cj2);
        fadeImageView7.setLayoutParams(layoutParams9);
        if (fadeImageView7.getParent() == null) {
            linearLayout.addView(fadeImageView7);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(view);
        C1522a.m5435a(fadeImageView);
        C1522a.m5435a(smartCircleImageView);
        C1522a.m5435a(mentionEditText);
        C1522a.m5435a(fadeImageView2);
        C1522a.m5435a(fadeImageView5);
        C1522a.m5435a(fadeImageView6);
        C1522a.m5435a(remoteImageView);
        C1522a.m5435a(fadeImageView7);
        return linearLayout;
    }
}
