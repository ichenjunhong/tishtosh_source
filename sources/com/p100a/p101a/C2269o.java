package com.p100a.p101a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C1522a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p100a.p102b.C2283b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.a.a.o */
public final class C2269o implements C2283b {
    /* renamed from: a */
    public final View mo6630a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutParams a = C1522a.m5434a(viewGroup, -1, -1);
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 150.0f, resources.getDisplayMetrics()), -2);
        viewStub.setId(R.id.cu6);
        viewStub.setInflatedId(R.id.b0t);
        viewStub.setLayoutResource(R.layout.b_j);
        viewStub.setLayoutParams(layoutParams);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        ViewStub viewStub2 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setId(R.id.cu5);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        viewStub2.setInflatedId(R.id.bfa);
        viewStub2.setLayoutResource(R.layout.b69);
        viewStub2.setLayoutParams(layoutParams2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2);
        }
        ViewStub viewStub3 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setId(R.id.cu8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 17;
        }
        viewStub3.setInflatedId(R.id.b4q);
        viewStub3.setLayoutResource(R.layout.b67);
        viewStub3.setLayoutParams(layoutParams3);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3);
        }
        ViewStub viewStub4 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        viewStub4.setId(R.id.cu_);
        viewStub4.setInflatedId(R.id.aef);
        viewStub4.setLayoutResource(R.layout.b5u);
        viewStub4.setLayoutParams(layoutParams4);
        if (viewStub4.getParent() == null) {
            frameLayout.addView(viewStub4);
        }
        ViewStub viewStub5 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        viewStub5.setId(R.id.cug);
        viewStub5.setInflatedId(R.id.b3x);
        viewStub5.setLayoutResource(R.layout.b76);
        viewStub5.setLayoutParams(layoutParams5);
        if (viewStub5.getParent() == null) {
            frameLayout.addView(viewStub5);
        }
        ViewStub viewStub6 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        viewStub6.setId(R.id.eyn);
        viewStub6.setInflatedId(R.id.efp);
        viewStub6.setLayoutResource(R.layout.b42);
        viewStub6.setLayoutParams(layoutParams6);
        if (viewStub6.getParent() == null) {
            frameLayout.addView(viewStub6);
        }
        ViewStub viewStub7 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        viewStub7.setId(R.id.cui);
        viewStub7.setInflatedId(R.id.b3x);
        viewStub7.setLayoutResource(R.layout.b78);
        viewStub7.setLayoutParams(layoutParams7);
        if (viewStub7.getParent() == null) {
            frameLayout.addView(viewStub7);
        }
        C1522a.m5435a(frameLayout);
        C1522a.m5435a(viewStub);
        C1522a.m5435a(viewStub2);
        C1522a.m5435a(viewStub3);
        C1522a.m5435a(viewStub4);
        C1522a.m5435a(viewStub5);
        C1522a.m5435a(viewStub6);
        C1522a.m5435a(viewStub7);
        return frameLayout;
    }
}
