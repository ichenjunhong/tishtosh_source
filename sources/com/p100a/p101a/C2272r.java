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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.facebook.drawee.p940f.C13833a;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.r */
public final class C2272r implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        LayoutParams a = C1522a.m5434a(viewGroup2, -2, -2);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        View view = new View(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        view.setId(R.id.eme);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(12, -1);
        }
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            relativeLayout.addView(view);
        }
        PeriscopeLayout periscopeLayout = new PeriscopeLayout(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        periscopeLayout.setId(R.id.bro);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2) && VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, -22.0f, resources.getDisplayMetrics());
        }
        periscopeLayout.setLayoutParams(layoutParams2);
        if (periscopeLayout.getParent() == null) {
            relativeLayout.addView(periscopeLayout);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        frameLayout.setId(R.id.bo3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(0, R.id.eme);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(16, R.id.eme);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(12, -1);
        }
        if (MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setLayoutParams(layoutParams3);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout);
        }
        SmartCircleImageView smartCircleImageView = new SmartCircleImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) resources.getDimension(R.dimen.yo), (int) resources.getDimension(R.dimen.yo));
        ((C13833a) smartCircleImageView.getHierarchy()).mo25902b((int) R.drawable.dfe);
        smartCircleImageView.setId(R.id.bo2);
        smartCircleImageView.setFocusable(false);
        smartCircleImageView.setFocusableInTouchMode(false);
        smartCircleImageView.setLayoutParams(layoutParams4);
        if (smartCircleImageView.getParent() == null) {
            frameLayout.addView(smartCircleImageView);
        }
        SmartCircleImageView smartCircleImageView2 = new SmartCircleImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()));
        smartCircleImageView2.setId(R.id.bvb);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 17;
        }
        smartCircleImageView2.setFocusable(false);
        smartCircleImageView2.setFocusableInTouchMode(false);
        smartCircleImageView2.setVisibility(8);
        smartCircleImageView2.setLayoutParams(layoutParams5);
        if (smartCircleImageView2.getParent() == null) {
            frameLayout.addView(smartCircleImageView2);
        }
        C1522a.m5435a(relativeLayout);
        C1522a.m5435a(view);
        C1522a.m5435a(periscopeLayout);
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(smartCircleImageView);
        C1522a.m5435a(smartCircleImageView2);
        return relativeLayout;
    }
}
