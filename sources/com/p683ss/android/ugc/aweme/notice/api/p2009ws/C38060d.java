package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import com.alibaba.fastjson.JSON;
import com.p683ss.android.websocket.internal.C50853a;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.d */
public final class C38060d implements C50829b {
    /* renamed from: a */
    public final Object mo72405a(C50853a aVar) {
        Object obj;
        Class cls = null;
        for (C38058b a : C38061e.m85129a().f96833a) {
            cls = a.mo77496a(aVar.getMethod());
            if (cls != null) {
                break;
            }
        }
        if (cls == null) {
            return null;
        }
        try {
            obj = JSON.parseObject(new String(aVar.getPayload()), cls);
        } catch (Throwable unused) {
            obj = null;
        }
        return obj;
    }
}
