package com.p683ss.android.ugc.aweme.account.login;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.account.login.InsRecoverSetting */
public final class InsRecoverSetting {
    @C17952c(mo34828a = "forbid_ins_login")
    public boolean forbid;
    @C17952c(mo34828a = "url")
    public String url = "";

    public final boolean getForbid() {
        return this.forbid;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setForbid(boolean z) {
        this.forbid = z;
    }

    public final void setUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.url = str;
    }
}
