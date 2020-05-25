package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.b.c */
public final class C34146c implements Serializable {
    @C17952c(mo34828a = "expire_time")

    /* renamed from: a */
    private long f88245a;
    @C17952c(mo34828a = "share_data")

    /* renamed from: b */
    private List<C34145b> f88246b;

    public final long getExpireTime() {
        return this.f88245a;
    }

    public final List<C34145b> getGroupPasswordDetailList() {
        return this.f88246b;
    }

    public final void setExpireTime(long j) {
        this.f88245a = j;
    }

    public final void setGroupPasswordDetailList(List<C34145b> list) {
        this.f88246b = list;
    }
}
