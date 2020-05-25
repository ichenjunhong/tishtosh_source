package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtView */
public final class AVDmtView extends View {
    public AVDmtView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AVDmtView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        Drawable a = C46788b.f118235d.mo94009a(context, attributeSet);
        if (a != null) {
            setBackground(a);
        }
    }

    public /* synthetic */ AVDmtView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
