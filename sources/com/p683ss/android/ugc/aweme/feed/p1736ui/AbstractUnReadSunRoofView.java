package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.AbstractUnReadSunRoofView */
public abstract class AbstractUnReadSunRoofView extends FrameLayout {
    public AbstractUnReadSunRoofView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractUnReadSunRoofView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public abstract void mo63278a();

    /* renamed from: a */
    public abstract void mo63279a(String str);

    /* renamed from: a */
    public abstract void mo63280a(String str, C52670a<C52860x> aVar);

    /* renamed from: b */
    public abstract void mo63281b();

    public abstract void setData(List<? extends User> list);

    public AbstractUnReadSunRoofView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AbstractUnReadSunRoofView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
