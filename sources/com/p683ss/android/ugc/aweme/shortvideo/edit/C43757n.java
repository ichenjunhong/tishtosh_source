package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.n */
public final class C43757n implements Serializable {
    @C17952c(mo34828a = "code")

    /* renamed from: a */
    private Integer f110797a = Integer.valueOf(0);
    @C17952c(mo34828a = "type")

    /* renamed from: b */
    private String f110798b = "highlight";
    @C17952c(mo34828a = "status")

    /* renamed from: c */
    private String f110799c = "draft";

    public final Integer getCode() {
        return this.f110797a;
    }

    public final String getStatus() {
        return this.f110799c;
    }

    public final String getType() {
        return this.f110798b;
    }

    public final void setCode(Integer num) {
        this.f110797a = num;
    }

    public final void setStatus(String str) {
        this.f110799c = str;
    }

    public final void setType(String str) {
        this.f110798b = str;
    }
}
