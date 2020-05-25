package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.MixRefreshLayout */
public final class MixRefreshLayout extends FeedSwipeRefreshLayout {
    public MixRefreshLayout(Context context) {
        this(context, null, 2, null);
    }

    public final void setRefreshHeader(C37096y yVar) {
        C52711k.m112240b(yVar, "head");
    }

    public MixRefreshLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public /* synthetic */ MixRefreshLayout(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
