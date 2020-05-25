package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dl */
public final class C43218dl {

    /* renamed from: a */
    private final Object f109304a;

    public C43218dl(Object obj) {
        C52711k.m112240b(obj, "publisher");
        this.f109304a = obj;
    }

    /* renamed from: a */
    public final void mo87871a(String str) {
        C52711k.m112240b(str, "text");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f109304a);
        sb.append(' ');
        sb.append(str);
        C50203g.m108363d(sb.toString());
    }
}
