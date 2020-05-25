package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p100a.p102b.C2283b;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.al */
public final class C2253al implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        MusProfileNavigator musProfileNavigator = new MusProfileNavigator(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        musProfileNavigator.setId(R.id.c5p);
        if (viewGroup != null) {
            musProfileNavigator.setLayoutParams(a);
            if (z) {
                viewGroup.addView(musProfileNavigator);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        MarginLayoutParams a2 = C1522a.m5434a(musProfileNavigator, -1, -1);
        linearLayout.setId(R.id.cwn);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(a2);
        if (linearLayout.getParent() == null) {
            musProfileNavigator.addView(linearLayout);
        }
        View view = new View(context);
        MarginLayoutParams a3 = C1522a.m5434a(musProfileNavigator, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 200.0f, resources.getDisplayMetrics());
        }
        if (MarginLayoutParams.class.isInstance(a3)) {
            a3.bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        view.setId(R.id.el6);
        if (RelativeLayout.LayoutParams.class.isInstance(a3)) {
            ((RelativeLayout.LayoutParams) a3).addRule(12, -1);
        }
        view.setBackgroundColor(Color.parseColor("#161822"));
        view.setLayoutParams(a3);
        if (view.getParent() == null) {
            musProfileNavigator.addView(view);
        }
        View view2 = new View(context);
        MarginLayoutParams a4 = C1522a.m5434a(musProfileNavigator, -1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view2.setBackgroundColor(resources.getColor(R.color.r));
        view2.setLayoutParams(a4);
        if (view2.getParent() == null) {
            musProfileNavigator.addView(view2);
        }
        View view3 = new View(context);
        MarginLayoutParams a5 = C1522a.m5434a(musProfileNavigator, -1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(a5)) {
            ((RelativeLayout.LayoutParams) a5).addRule(12, -1);
        }
        view3.setBackgroundColor(resources.getColor(R.color.r));
        view3.setLayoutParams(a5);
        if (view3.getParent() == null) {
            musProfileNavigator.addView(view3);
        }
        C1522a.m5435a(musProfileNavigator);
        C1522a.m5435a(linearLayout);
        C1522a.m5435a(view);
        C1522a.m5435a(view2);
        C1522a.m5435a(view3);
        return musProfileNavigator;
    }
}
