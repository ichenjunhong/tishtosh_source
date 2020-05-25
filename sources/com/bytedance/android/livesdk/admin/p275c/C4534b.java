package com.bytedance.android.livesdk.admin.p275c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.admin.c.b */
final /* synthetic */ class C4534b implements C1710e {

    /* renamed from: a */
    private final C4533a f12471a;

    /* renamed from: b */
    private final long f12472b;

    /* renamed from: c */
    private final boolean f12473c;

    C4534b(C4533a aVar, long j, boolean z) {
        this.f12471a = aVar;
        this.f12472b = j;
        this.f12473c = z;
    }

    public final void accept(Object obj) {
        C4533a aVar = this.f12471a;
        long j = this.f12472b;
        boolean z = this.f12473c;
        C4177d dVar = (C4177d) obj;
        User user = new User();
        user.setId(j);
        aVar.f12469a.mo10362a(z, user);
    }
}
