package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.i */
public final class C26127i implements C22982e {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public final int f68982a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public final String f68983b;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: c */
    public final List<C26123g> f68984c;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f68985d;
    @C17952c(mo34828a = "extra")

    /* renamed from: e */
    public final C26128a f68986e;

    /* renamed from: f */
    private String f68987f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.i$a */
    public static final class C26128a {
        @C17952c(mo34828a = "now")

        /* renamed from: a */
        public final long f68988a;
        @C17952c(mo34828a = "fatal_item_ids")

        /* renamed from: b */
        public final List<String> f68989b;
        @C17952c(mo34828a = "logid")

        /* renamed from: c */
        public final String f68990c;
    }

    public final String getRequestId() {
        boolean z;
        String str = this.f68987f;
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f68987f;
            }
        }
        LogPbBean logPbBean = this.f68985d;
        if (logPbBean != null) {
            String imprId = logPbBean.getImprId();
            if (imprId != null) {
                if (imprId.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    return this.f68985d.getImprId();
                }
            }
        }
        return null;
    }

    public final void setRequestId(String str) {
        this.f68987f = str;
    }
}
