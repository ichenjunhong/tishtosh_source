package com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l;

import com.p683ss.android.websocket.internal.C50853a;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.l.c */
public final class C34400c implements C50829b {
    /* renamed from: b */
    private static C34399b m78327b(C50853a aVar) {
        try {
            C34399b bVar = new C34399b();
            bVar.f88770c = aVar.getMethod();
            bVar.f88774g = aVar.getPayload();
            bVar.f88772e = aVar.getPayloadEncoding();
            bVar.f88773f = aVar.getPayloadType();
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo72405a(C50853a aVar) {
        int method = aVar.getMethod();
        int service = aVar.getService();
        if ((method == 1 && service == 5) || (method == 1 && service == 1015)) {
            return m78327b(aVar);
        }
        return null;
    }
}
