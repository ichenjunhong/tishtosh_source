package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dj */
public final class C43216dj extends BaseResponse implements Serializable {
    @C23460b
    @C17952c(mo34828a = "is_passed")

    /* renamed from: a */
    private boolean f109300a;
    @C17952c(mo34828a = "reason_title")

    /* renamed from: b */
    private String f109301b;
    @C17952c(mo34828a = "reason_body")

    /* renamed from: c */
    private String f109302c;

    public final String getReasonBody() {
        return this.f109302c;
    }

    public final String getReasonTitle() {
        return this.f109301b;
    }

    public final boolean isPassed() {
        return this.f109300a;
    }

    public final void setPassed(boolean z) {
        this.f109300a = z;
    }

    public final void setReasonBody(String str) {
        this.f109302c = str;
    }

    public final void setReasonTitle(String str) {
        this.f109301b = str;
    }
}
