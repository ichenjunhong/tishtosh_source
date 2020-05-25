package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.feed.m.y */
public final class C30507y extends C26851b<C30505x, C30502u> {
    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            StringBuilder sb = new StringBuilder("onItemDelete ");
            sb.append((String) ((C30505x) this.f70700f).getData());
            C32458a.m75141a(6, "DeleteAweme", sb.toString());
            ((C30502u) this.f70701g).mo55805d((String) ((C30505x) this.f70700f).getData());
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C30502u) this.f70701g).mo55804d(exc);
        }
    }
}
