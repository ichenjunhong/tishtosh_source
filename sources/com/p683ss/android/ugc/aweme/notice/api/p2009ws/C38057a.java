package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import com.p683ss.android.ugc.aweme.p1434bg.C23793b;
import com.p683ss.android.websocket.internal.C50853a;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.a */
public final class C38057a implements C50829b {
    /* renamed from: a */
    public final Object mo72405a(C50853a aVar) {
        return m85124b(aVar);
    }

    /* renamed from: b */
    private static C23793b m85124b(C50853a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            C23793b bVar = new C23793b();
            bVar.f63399a = aVar.getMethod();
            bVar.f63400b = aVar.getService();
            bVar.f63401c = aVar.getPayload();
            bVar.f63402d = aVar.getPayloadType();
            bVar.f63403e = aVar.getPayloadEncoding();
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
