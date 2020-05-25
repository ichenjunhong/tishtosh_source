package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.account.p1270c.C20940a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;

/* renamed from: com.ss.android.ugc.aweme.feed.m.aa */
public final class C30472aa extends C20940a<C30508z, C30503v> {
    /* renamed from: e */
    public final int mo60890e() {
        if (this.f70700f == null) {
            return 0;
        }
        return ((C30508z) this.f70700f).f79722a;
    }

    /* renamed from: b */
    public final void mo44838b() {
        C0794k kVar;
        if (this.f70700f == null) {
            kVar = null;
        } else {
            kVar = (C0794k) ((C30508z) this.f70700f).getData();
        }
        if (kVar != null) {
            C23324d.m57378a().updateUserDigg((String) kVar.f2711a, ((Integer) kVar.f2712b).intValue());
        }
        if (this.f70701g != null) {
            ((C30503v) this.f70701g).mo60919a(kVar);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C30503v) this.f70701g).mo60920a(exc);
        }
    }
}
