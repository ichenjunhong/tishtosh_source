package com.bytedance.android.livesdk.rank.p412e;

import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.e.l */
final /* synthetic */ class C8158l implements C1710e {

    /* renamed from: a */
    private final C8156j f22281a;

    C8158l(C8156j jVar) {
        this.f22281a = jVar;
    }

    public final void accept(Object obj) {
        ((CurrentRankListResponse) this.f22281a.f22272a.data).ranks = (List) obj;
    }
}
