package com.p683ss.android.ugc.aweme.emoji.utils;

import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29355m;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29381l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.e */
public final class C29475e {

    /* renamed from: a */
    public static final C29475e f77209a = new C29475e();

    private C29475e() {
    }

    /* renamed from: a */
    public static final int m69554a(C29355m mVar, int i) {
        C52711k.m112240b(mVar, "emojiPanelModel");
        C29291g c = mVar.mo59306c(i);
        if (c instanceof C29381l) {
            return 2;
        }
        if (!(c instanceof C29301b)) {
            return 1;
        }
        if (C29301b.m69097c(mVar.mo59310e(i))) {
            return 3;
        }
        return 4;
    }
}
