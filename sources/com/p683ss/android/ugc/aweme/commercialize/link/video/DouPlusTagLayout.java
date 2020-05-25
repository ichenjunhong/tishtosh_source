package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout */
public final class DouPlusTagLayout extends FrameLayout {

    /* renamed from: a */
    public DouPlusLinkContent f68588a;

    public DouPlusTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DouPlusTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DouPlusTagLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ DouPlusTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
