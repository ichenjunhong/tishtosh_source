package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.feed.feed.j */
public final class C6949j implements C2888b<C6946g> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C6946g gVar2 = new C6946g();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return gVar2;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                gVar2.f19021a = C2896h.m8234e(gVar);
            }
        }
    }
}
