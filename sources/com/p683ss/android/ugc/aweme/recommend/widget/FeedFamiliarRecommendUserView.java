package com.p683ss.android.ugc.aweme.recommend.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.recommend.p2111a.C41086a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.FeedFamiliarRecommendUserView */
public final class FeedFamiliarRecommendUserView extends RecommendVerticalUserListView {
    public FeedFamiliarRecommendUserView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FeedFamiliarRecommendUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: b */
    public final boolean mo83667b() {
        return false;
    }

    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    public final boolean canScrollVertically(int i) {
        return false;
    }

    public final int getContentLayoutResId() {
        return R.layout.byq;
    }

    /* renamed from: a */
    public final C41086a mo83666a() {
        return new C41086a(4);
    }

    public FeedFamiliarRecommendUserView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ FeedFamiliarRecommendUserView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
