package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
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
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.s */
public final class C2273s implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -1, -2);
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        frameLayout.setId(R.id.a4h);
        if (MarginLayoutParams.class.isInstance(layoutParams) && VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        linearLayout2.setId(R.id.a4n);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams2);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        MentionTextView mentionTextView = new MentionTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        mentionTextView.setId(R.id.a4e);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3) && VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) resources.getDimension(R.dimen.yy));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) resources.getDimension(R.dimen.yy);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        mentionTextView.setEllipsize(TruncateAt.END);
        mentionTextView.setGravity(8388611);
        mentionTextView.setIncludeFontPadding(false);
        mentionTextView.setMaxLines(4);
        mentionTextView.setPadding(mentionTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), mentionTextView.getPaddingRight(), mentionTextView.getPaddingBottom());
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), resources.getColor(R.color.n5));
        mentionTextView.setShadowLayer(mentionTextView.getShadowRadius(), mentionTextView.getShadowDx(), 1.0f, mentionTextView.getShadowColor());
        mentionTextView.setShadowLayer(1.0f, mentionTextView.getShadowDx(), mentionTextView.getShadowDy(), mentionTextView.getShadowColor());
        mentionTextView.setTextAlignment(5);
        mentionTextView.setTextColor(resources.getColorStateList(R.color.v6));
        mentionTextView.setTextSize(2, 15.0f);
        mentionTextView.setLayoutParams(layoutParams3);
        if (mentionTextView.getParent() == null) {
            linearLayout2.addView(mentionTextView);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        appCompatImageView.setId(R.id.axs);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 16;
        }
        if (MarginLayoutParams.class.isInstance(layoutParams4) && VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        }
        appCompatImageView.setPadding(appCompatImageView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()), appCompatImageView.getPaddingRight(), appCompatImageView.getPaddingBottom());
        appCompatImageView.setImageResource(R.drawable.cse);
        appCompatImageView.setVisibility(8);
        if (MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        appCompatImageView.setLayoutParams(layoutParams4);
        if (appCompatImageView.getParent() == null) {
            linearLayout2.addView(appCompatImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        dmtTextView.setId(R.id.dhm);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 8388693;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 8388693;
        }
        dmtTextView.setText(R.string.b1o);
        dmtTextView.setTextColor(resources.getColorStateList(R.color.v6));
        dmtTextView.setTextSize(2, 15.0f);
        dmtTextView.setTypeface(Typeface.defaultFromStyle(1));
        dmtTextView.setVisibility(8);
        dmtTextView.setLayoutParams(layoutParams5);
        if (dmtTextView.getParent() == null) {
            frameLayout.addView(dmtTextView);
        }
        TranslationStatusView translationStatusView = new TranslationStatusView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        translationStatusView.setId(R.id.d4a);
        if (!MarginLayoutParams.class.isInstance(layoutParams6) || VERSION.SDK_INT < 17) {
            i = R.dimen.yy;
        } else {
            MarginLayoutParams marginLayoutParams = layoutParams6;
            i = R.dimen.yy;
            marginLayoutParams.setMarginStart((int) resources.getDimension(R.dimen.yy));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.leftMargin = (int) resources.getDimension(i);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        translationStatusView.setVisibility(8);
        translationStatusView.setLayoutParams(layoutParams6);
        if (translationStatusView.getParent() == null) {
            linearLayout.addView(translationStatusView);
        }
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(linearLayout2);
        mentionTextView.setLineSpacing(TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), 1.0f);
        C1522a.m5435a(mentionTextView);
        C1522a.m5435a(appCompatImageView);
        C1522a.m5435a(dmtTextView);
        C1522a.m5435a(translationStatusView);
        return linearLayout;
    }
}
