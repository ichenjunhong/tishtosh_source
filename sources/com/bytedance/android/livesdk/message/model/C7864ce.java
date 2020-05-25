package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ce */
public class C7864ce extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21760a;

    public C7864ce() {
        this.type = C8629a.ROOM;
    }

    public boolean canText() {
        if (!C9431p.m18664a(this.f21760a)) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
