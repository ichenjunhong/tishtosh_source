package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.data.C5359d;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.be */
public class C7830be extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21589a;

    /* renamed from: b */
    private C5359d f21590b;

    public C7830be() {
        this.type = C8629a.LINK_MIC_SIGNAL;
    }

    /* renamed from: a */
    public final C5359d mo14144a() {
        if (this.f21590b != null) {
            return this.f21590b;
        }
        try {
            this.f21590b = (C5359d) C4514j.m10883j().mo10320a().mo34884a(this.f21589a.replaceAll("\\\\", ""), C5359d.class);
            return this.f21590b;
        } catch (Exception unused) {
            return null;
        }
    }
}
