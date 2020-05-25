package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
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
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.ab */
public final class C2243ab implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout.setId(R.id.bma);
        relativeLayout.setBackgroundColor(Color.parseColor("#57161823"));
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setId(R.id.bmm);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(20, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        appCompatImageView.setId(R.id.bme);
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setImageResource(R.drawable.cs8);
        appCompatImageView.setLayoutParams(layoutParams2);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setId(R.id.bmf);
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setText("合集");
        dmtTextView.setTextColor(resources.getColorStateList(R.color.at0));
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView.setLayoutParams(layoutParams3);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        appCompatImageView2.setImageResource(R.drawable.b4q);
        appCompatImageView2.setLayoutParams(layoutParams4);
        if (appCompatImageView2.getParent() == null) {
            linearLayout.addView(appCompatImageView2);
        }
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        appCompatImageView3.setId(R.id.bm9);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5) && VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.rightMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        appCompatImageView3.setScaleType(ScaleType.CENTER);
        appCompatImageView3.setImageResource(R.drawable.a0p);
        appCompatImageView3.setLayoutParams(layoutParams5);
        if (appCompatImageView3.getParent() == null) {
            relativeLayout.addView(appCompatImageView3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            RelativeLayout.LayoutParams layoutParams7 = layoutParams6;
            i = R.id.bm9;
            layoutParams7.addRule(16, R.id.bm9);
        } else {
            i = R.id.bm9;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(0, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            RelativeLayout.LayoutParams layoutParams8 = layoutParams6;
            i2 = R.id.bmm;
            layoutParams8.addRule(17, R.id.bmm);
        } else {
            i2 = R.id.bmm;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(1, i2);
        }
        linearLayout2.setLayoutParams(layoutParams6);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView2.setTextSize(1, 13.0f);
        dmtTextView2.setId(R.id.bm8);
        dmtTextView2.setEllipsize(TruncateAt.END);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setTextColor(resources.getColorStateList(R.color.at0));
        dmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView2.setLayoutParams(layoutParams9);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(appCompatImageView);
        dmtTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(appCompatImageView2);
        C1522a.m5435a(appCompatImageView3);
        C1522a.m5435a(linearLayout2);
        dmtTextView2.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(dmtTextView2);
        return relativeLayout;
    }
}
