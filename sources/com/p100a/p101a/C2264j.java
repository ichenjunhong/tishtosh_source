package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.j */
public final class C2264j implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        if (viewGroup2 != null) {
            LinearLayout linearLayout = new LinearLayout(context2);
            MarginLayoutParams a = C1522a.m5434a(viewGroup2, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout.setId(R.id.d2x);
            if (LayoutParams.class.isInstance(a)) {
                ((LayoutParams) a).gravity = 48;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a)) {
                ((FrameLayout.LayoutParams) a).gravity = 48;
            }
            linearLayout.setOrientation(1);
            if (viewGroup2 != null) {
                linearLayout.setLayoutParams(a);
                viewGroup2.addView(linearLayout);
            }
            View view = new View(context2);
            LayoutParams layoutParams = new LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view.setId(R.id.d2w);
            view.setBackgroundColor(resources.getColor(R.color.ip));
            view.setLayoutParams(layoutParams);
            if (view.getParent() == null) {
                linearLayout.addView(view);
            }
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.setLayoutParams(new LayoutParams(-1, -2));
            if (frameLayout.getParent() == null) {
                linearLayout.addView(frameLayout);
            }
            AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams2)) {
                ((LayoutParams) layoutParams2).gravity = 51;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                layoutParams2.gravity = 51;
            }
            appCompatImageView.setImageResource(R.drawable.df1);
            appCompatImageView.setLayoutParams(layoutParams2);
            if (appCompatImageView.getParent() == null) {
                frameLayout.addView(appCompatImageView);
            }
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams3)) {
                ((LayoutParams) layoutParams3).gravity = 53;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                layoutParams3.gravity = 53;
            }
            appCompatImageView2.setImageResource(R.drawable.df2);
            appCompatImageView2.setLayoutParams(layoutParams3);
            if (appCompatImageView2.getParent() == null) {
                frameLayout.addView(appCompatImageView2);
            }
            LinearLayout linearLayout2 = new LinearLayout(context2);
            MarginLayoutParams a2 = C1522a.m5434a(viewGroup2, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout2.setId(R.id.lw);
            if (LayoutParams.class.isInstance(a2)) {
                ((LayoutParams) a2).gravity = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a2)) {
                ((FrameLayout.LayoutParams) a2).gravity = 80;
            }
            linearLayout2.setOrientation(1);
            if (viewGroup2 != null) {
                linearLayout2.setLayoutParams(a2);
                viewGroup2.addView(linearLayout2);
            }
            FrameLayout frameLayout2 = new FrameLayout(context2);
            frameLayout2.setLayoutParams(new LayoutParams(-1, -2));
            if (frameLayout2.getParent() == null) {
                linearLayout2.addView(frameLayout2);
            }
            AppCompatImageView appCompatImageView3 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams4)) {
                ((LayoutParams) layoutParams4).gravity = 83;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
                layoutParams4.gravity = 83;
            }
            appCompatImageView3.setImageResource(R.drawable.df3);
            appCompatImageView3.setLayoutParams(layoutParams4);
            if (appCompatImageView3.getParent() == null) {
                frameLayout2.addView(appCompatImageView3);
            }
            AppCompatImageView appCompatImageView4 = new AppCompatImageView(context2);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            if (LayoutParams.class.isInstance(layoutParams5)) {
                ((LayoutParams) layoutParams5).gravity = 85;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
                layoutParams5.gravity = 85;
            }
            appCompatImageView4.setImageResource(R.drawable.df4);
            appCompatImageView4.setLayoutParams(layoutParams5);
            if (appCompatImageView4.getParent() == null) {
                frameLayout2.addView(appCompatImageView4);
            }
            View view2 = new View(context2);
            LayoutParams layoutParams6 = new LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view2.setId(R.id.lv);
            view2.setBackgroundColor(resources.getColor(R.color.ip));
            view2.setLayoutParams(layoutParams6);
            if (view2.getParent() == null) {
                linearLayout2.addView(view2);
            }
            C1522a.m5435a(linearLayout);
            C1522a.m5435a(view);
            C1522a.m5435a(frameLayout);
            C1522a.m5435a(appCompatImageView);
            C1522a.m5435a(appCompatImageView2);
            C1522a.m5435a(linearLayout2);
            C1522a.m5435a(frameLayout2);
            C1522a.m5435a(appCompatImageView3);
            C1522a.m5435a(appCompatImageView4);
            C1522a.m5435a(view2);
            return viewGroup2;
        }
        throw new IllegalStateException("merge标签 container不得为null attach不得为false");
    }
}
