package com.p683ss.android.ugc.aweme.feed.unread;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofRecyclerView */
public final class UnReadSunRoofRecyclerView extends RecyclerView {
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public UnReadSunRoofRecyclerView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public UnReadSunRoofRecyclerView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet);
    }

    public UnReadSunRoofRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet, i);
    }
}
