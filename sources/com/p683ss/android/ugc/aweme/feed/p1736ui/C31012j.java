package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.widget.ListView;
import com.p683ss.android.ugc.aweme.feed.helper.C30388l;
import com.p683ss.android.ugc.aweme.feed.helper.C30390n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.j */
public final class C31012j extends ListView implements C30388l {

    /* renamed from: a */
    private C30390n f81206a;

    public final C30390n getOptionClickListener() {
        return this.f81206a;
    }

    public final void setOptionListener(C30390n nVar) {
        C52711k.m112240b(nVar, "mOptionClickListener");
        this.f81206a = nVar;
    }

    public C31012j(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }
}
