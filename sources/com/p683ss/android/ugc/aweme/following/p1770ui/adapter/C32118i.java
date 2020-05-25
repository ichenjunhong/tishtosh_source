package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.i */
final /* synthetic */ class C32118i implements C1710e {

    /* renamed from: a */
    private final ViewHolder f83806a;

    C32118i(ViewHolder viewHolder) {
        this.f83806a = viewHolder;
    }

    public final void accept(Object obj) {
        ViewHolder viewHolder = this.f83806a;
        Throwable a = C22971a.m56490a((Throwable) obj);
        if (a instanceof C23459a) {
            C22971a.m56491a(viewHolder.itemView.getContext(), (C23459a) a);
        } else {
            C32458a.m75148a(a);
        }
    }
}
