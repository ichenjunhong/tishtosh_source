package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.WhiteBgFollowUserBtn */
public class WhiteBgFollowUserBtn extends FollowUserBtn {
    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        return R.drawable.cox;
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.a7x;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.b4u;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.ddx;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.jf;
    }

    public WhiteBgFollowUserBtn(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public WhiteBgFollowUserBtn(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public WhiteBgFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
