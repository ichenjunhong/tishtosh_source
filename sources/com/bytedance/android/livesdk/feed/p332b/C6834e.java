package com.bytedance.android.livesdk.feed.p332b;

import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.livesdk.feed.C6952h;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.tab.p349b.C7119h;
import com.bytedance.android.livesdk.feed.tab.p349b.C7120i;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import java.util.List;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.feed.b.e */
public final class C6834e implements C6832c {
    /* renamed from: a */
    public final Fragment mo13015a() {
        List c = C7128p.m14812d().mo13185c();
        boolean z = false;
        if (!C3914u.m9892a(c)) {
            C6945f fVar = (C6945f) c.get(0);
            if (fVar != null && fVar.mo13132a() == 4) {
                z = true;
            }
        }
        if (!z) {
            return new C6926k();
        }
        new C6952h();
        return null;
    }

    /* renamed from: b */
    public final void mo13016b() {
        C7128p d = C7128p.m14812d();
        d.f19333b.mo13254b().mo6541d((C1711f<? super T, ? extends R>) new C7119h<Object,Object>(d)).mo6541d((C1711f<? super T, ? extends R>) new C7120i<Object,Object>(d)).mo6505a(C6835f.f18725a, C6836g.f18726a);
    }
}
