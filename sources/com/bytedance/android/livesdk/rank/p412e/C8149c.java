package com.bytedance.android.livesdk.rank.p412e;

import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.e.c */
final /* synthetic */ class C8149c implements C1710e {

    /* renamed from: a */
    private final C8147a f22254a;

    C8149c(C8147a aVar) {
        this.f22254a = aVar;
    }

    public final void accept(Object obj) {
        ((CurrentRankListResponse) this.f22254a.f22245a.data).ranks = (List) obj;
    }
}
