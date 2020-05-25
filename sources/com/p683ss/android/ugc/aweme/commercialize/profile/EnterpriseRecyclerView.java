package com.p683ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26992b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView */
public final class EnterpriseRecyclerView extends RecyclerView implements C26992b {

    /* renamed from: N */
    private C26183d f69127N;

    public EnterpriseRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C26183d getEnterTabManager() {
        return this.f69127N;
    }

    /* renamed from: o */
    public final boolean mo49162o() {
        return this.f69127N.f69149a;
    }

    public final void setEnterTabManager(C26183d dVar) {
        C52711k.m112240b(dVar, "<set-?>");
        this.f69127N = dVar;
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f69127N = new C26183d();
    }

    public /* synthetic */ EnterpriseRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
