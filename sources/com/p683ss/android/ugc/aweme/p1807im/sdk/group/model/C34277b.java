package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.b */
public final class C34277b implements Serializable {
    @C17952c(mo34828a = "update_time")

    /* renamed from: a */
    private long f88502a = -1;
    @C17952c(mo34828a = "update_im_user_id")

    /* renamed from: b */
    private long f88503b = -1;

    public final long getUpdateTime() {
        return this.f88502a;
    }

    public final long getUpdateUserId() {
        return this.f88503b;
    }

    public final boolean isValid() {
        if (this.f88502a <= 0 || this.f88503b <= 0) {
            return false;
        }
        return true;
    }

    public final void setUpdateTime(long j) {
        this.f88502a = j;
    }

    public final void setUpdateUserId(long j) {
        this.f88503b = j;
    }
}
