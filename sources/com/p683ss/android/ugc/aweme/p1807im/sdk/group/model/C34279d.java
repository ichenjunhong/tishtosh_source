package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.d */
public final class C34279d implements Serializable {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    private Integer f88505a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    private String f88506b;
    @C17952c(mo34828a = "invalid_members")

    /* renamed from: c */
    private List<? extends IMUser> f88507c;

    public final List<IMUser> getInvalidMembers() {
        return this.f88507c;
    }

    public final Integer getStatusCode() {
        return this.f88505a;
    }

    public final String getStatusMsg() {
        return this.f88506b;
    }

    public final void setInvalidMembers(List<? extends IMUser> list) {
        this.f88507c = list;
    }

    public final void setStatusCode(Integer num) {
        this.f88505a = num;
    }

    public final void setStatusMsg(String str) {
        this.f88506b = str;
    }
}
