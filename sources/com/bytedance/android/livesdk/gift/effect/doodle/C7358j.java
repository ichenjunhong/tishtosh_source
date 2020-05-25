package com.bytedance.android.livesdk.gift.effect.doodle;

import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.p376f.C7449a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.j */
final /* synthetic */ class C7358j implements C1710e {

    /* renamed from: a */
    private final C7330a f20068a;

    C7358j(C7330a aVar) {
        this.f20068a = aVar;
    }

    public final void accept(Object obj) {
        C7330a aVar = this.f20068a;
        Throwable th = (Throwable) obj;
        aVar.f20013t = false;
        if (th instanceof Exception) {
            Exception exc = (Exception) th;
            if (!(exc instanceof C7449a)) {
                boolean z = exc instanceof C2949a;
                if (!z || ((C2949a) exc).getErrorCode() != 40001) {
                    if (z) {
                        C4575an.m10987a(((C2949a) exc).getPrompt());
                    } else {
                        C4575an.m10981a((int) R.string.f12);
                    }
                    C7647s.m15649a(998, aVar.f20001g.getId(), th);
                }
            }
            C4575an.m10981a((int) R.string.f0x);
            aVar.mo13602c();
            C7647s.m15649a(998, aVar.f20001g.getId(), th);
        }
    }
}
