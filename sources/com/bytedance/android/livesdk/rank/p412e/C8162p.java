package com.bytedance.android.livesdk.rank.p412e;

import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.e.p */
final /* synthetic */ class C8162p implements C1710e {

    /* renamed from: a */
    private final C8160n f22293a;

    C8162p(C8160n nVar) {
        this.f22293a = nVar;
    }

    public final void accept(Object obj) {
        ((CurrentRankListResponse) this.f22293a.f22283a.data).ranks = (List) obj;
    }
}
