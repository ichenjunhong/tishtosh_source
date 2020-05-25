package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.l */
public class C8000l extends C7859c {
    @C17952c(mo34828a = "items")

    /* renamed from: a */
    public List<C7876cp> f21866a;
    @C17952c(mo34828a = "max_push_delay_time")

    /* renamed from: b */
    public long f21867b;

    public C8000l() {
        this.type = C8629a.CEREMONY_MESSAGE;
    }
}
