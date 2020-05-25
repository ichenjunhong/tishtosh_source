package com.p683ss.android.ugc.aweme.comment.list;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.list.ICommerceComtEggLayout */
public abstract class ICommerceComtEggLayout extends FrameLayout {
    /* renamed from: a */
    public abstract void mo51531a();

    /* renamed from: a */
    public abstract void mo51532a(String str, Aweme aweme, String str2);

    public ICommerceComtEggLayout(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public ICommerceComtEggLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
    }

    public ICommerceComtEggLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }
}
