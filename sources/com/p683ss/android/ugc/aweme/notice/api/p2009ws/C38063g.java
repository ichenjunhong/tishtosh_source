package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import com.alibaba.fastjson.JSON;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.p683ss.android.websocket.internal.C50853a;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.g */
public final class C38063g implements C50829b {
    /* renamed from: a */
    public final Object mo72405a(C50853a aVar) {
        try {
            return JSON.parseObject(new String(aVar.getPayload()), CouponMessage.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
