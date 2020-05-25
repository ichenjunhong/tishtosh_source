package com.p683ss.android.ugc.aweme.base.p1420ui;

import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.base.ui.f */
final /* synthetic */ class C23692f implements C2205y {

    /* renamed from: a */
    private final FeedTagLayout2 f63195a;

    /* renamed from: b */
    private final int f63196b;

    C23692f(FeedTagLayout2 feedTagLayout2, int i) {
        this.f63195a = feedTagLayout2;
        this.f63196b = i;
    }

    public final void subscribe(C2204x xVar) {
        FeedTagLayout2 feedTagLayout2 = this.f63195a;
        int i = this.f63196b;
        if (i != -1) {
            xVar.mo6282a(Integer.valueOf(i));
        } else {
            xVar.mo6282a(Integer.valueOf(feedTagLayout2.getAnchorType()));
        }
    }
}
