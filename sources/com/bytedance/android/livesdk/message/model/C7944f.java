package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.f */
public class C7944f extends C7859c implements C7776b {
    @C17952c(mo34828a = "msg")

    /* renamed from: a */
    public C7810ao f21846a;

    /* renamed from: b */
    public final boolean mo14122b() {
        return false;
    }

    public C7944f() {
        this.type = C8629a.BINDING_GIFT_MESSAGE;
    }

    /* renamed from: a */
    public final C7809an mo14121a() {
        if (this.f21846a != null) {
            return this.f21846a.mo14121a();
        }
        return null;
    }
}
