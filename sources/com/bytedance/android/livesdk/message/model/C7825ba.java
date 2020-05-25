package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.model.live.C8695b;
import com.bytedance.android.livesdkapi.depend.model.live.C8699e;
import com.bytedance.android.livesdkapi.depend.model.live.C8701g;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ba */
public class C7825ba extends C7859c {
    @C17952c(mo34828a = "battle_settings")

    /* renamed from: a */
    public C8699e f21539a;
    @C17952c(mo34828a = "battle_mode")

    /* renamed from: b */
    public C8695b f21540b;
    @C17952c(mo34828a = "battle_task")

    /* renamed from: c */
    public C8701g f21541c;

    public C7825ba() {
        this.type = C8629a.LINK_MIC_BATTLE;
    }
}
