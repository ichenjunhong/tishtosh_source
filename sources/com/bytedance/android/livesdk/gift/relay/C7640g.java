package com.bytedance.android.livesdk.gift.relay;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.p376f.C7449a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.relay.g */
final /* synthetic */ class C7640g implements C1710e {

    /* renamed from: a */
    private final C7634b f21037a;

    /* renamed from: b */
    private final long f21038b;

    C7640g(C7634b bVar, long j) {
        this.f21037a = bVar;
        this.f21038b = j;
    }

    public final void accept(Object obj) {
        C7634b bVar = this.f21037a;
        long j = this.f21038b;
        Throwable th = (Throwable) obj;
        bVar.f21016m = false;
        if (!(th instanceof C7449a)) {
            boolean z = th instanceof C2949a;
            if (!z || ((C2949a) th).getErrorCode() != 40001) {
                if (z) {
                    C4575an.m10987a(((C2949a) th).getPrompt());
                } else {
                    C4575an.m10981a((int) R.string.f12);
                }
                C7647s.m15649a(j, bVar.f21008d.getId(), th);
            }
        }
        bVar.mo13994a();
        C7647s.m15649a(j, bVar.f21008d.getId(), th);
    }
}
