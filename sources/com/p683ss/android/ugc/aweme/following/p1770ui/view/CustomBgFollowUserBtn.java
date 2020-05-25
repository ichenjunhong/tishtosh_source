package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.CustomBgFollowUserBtn */
public class CustomBgFollowUserBtn extends FollowUserBtn {

    /* renamed from: f */
    private boolean f84040f;

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

    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        if (this.f84040f) {
            return R.drawable.coy;
        }
        return R.drawable.cox;
    }

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        if (this.f84040f) {
            return R.color.avn;
        }
        return R.color.a7x;
    }

    public CustomBgFollowUserBtn(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public final void setIsBlackMode(boolean z) {
        if (this.f84040f != z) {
            this.f84040f = z;
            setFollowStatus(this.f84042b);
        }
    }

    public CustomBgFollowUserBtn(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public CustomBgFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
