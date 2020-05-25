package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.p683ss.android.websocket.internal.C50853a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.q */
public final class C38078q implements C50853a {

    /* renamed from: a */
    public final WsChannelMsg f96872a;

    public final int getMethod() {
        return this.f96872a.f25952e;
    }

    public final long getSeqId() {
        return this.f96872a.f25949b;
    }

    public final int getService() {
        return this.f96872a.f25951d;
    }

    public final byte[] getPayload() {
        byte[] a = this.f96872a.mo17289a();
        C52711k.m112236a((Object) a, "wsChannelMsg.payload");
        return a;
    }

    public final String getPayloadEncoding() {
        String str = this.f96872a.f25954g;
        C52711k.m112236a((Object) str, "wsChannelMsg.payloadEncoding");
        return str;
    }

    public final String getPayloadType() {
        String str = this.f96872a.f25955h;
        C52711k.m112236a((Object) str, "wsChannelMsg.payloadType");
        return str;
    }

    public C38078q(WsChannelMsg wsChannelMsg) {
        C52711k.m112240b(wsChannelMsg, "wsChannelMsg");
        this.f96872a = wsChannelMsg;
    }
}
