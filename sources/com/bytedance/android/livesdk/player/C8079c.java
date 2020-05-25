package com.bytedance.android.livesdk.player;

import android.content.Context;
import com.bytedance.android.live.livepullstream.p249a.C4134a.C4135a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.p672e.C10753b;

/* renamed from: com.bytedance.android.livesdk.player.c */
final /* synthetic */ class C8079c implements Runnable {

    /* renamed from: a */
    private final C8072a f22064a;

    /* renamed from: b */
    private final String f22065b;

    C8079c(C8072a aVar, String str) {
        this.f22064a = aVar;
        this.f22065b = str;
    }

    public final void run() {
        C8072a aVar = this.f22064a;
        String str = this.f22065b;
        if (str != null && str.length() != 0) {
            C8072a.f22053a = str;
            Context context = ((IHostContext) C4116c.m10249a(IHostContext.class)).context();
            if (context != null) {
                C10753b.m21793a(context).mo19441a("hardware_info_cpu_soc", (Object) str).mo19443a();
            }
            if (aVar.f22054b != null) {
                C4135a aVar2 = (C4135a) aVar.f22054b.get();
                if (!(aVar2 == null || C8072a.f22053a == null)) {
                    aVar2.mo8814a(C8072a.f22053a);
                }
            }
        }
    }
}
