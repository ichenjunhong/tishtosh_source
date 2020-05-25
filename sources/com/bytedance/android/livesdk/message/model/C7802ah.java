package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ah */
public class C7802ah extends C7859c {
    @C17952c(mo34828a = "duration")

    /* renamed from: a */
    public long f21458a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21459b;
    @C17952c(mo34828a = "avatar_url")

    /* renamed from: c */
    public ImageModel f21460c;
    @C17952c(mo34828a = "gift_id")

    /* renamed from: d */
    public long f21461d;
    @C17952c(mo34828a = "hour_rank_info")

    /* renamed from: e */
    public String f21462e;

    public C7802ah() {
        this.f21458a = 4000;
        this.type = C8629a.FOLLOW_GUIDE;
    }

    public boolean canText() {
        if (!C9431p.m18664a(this.f21459b)) {
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
