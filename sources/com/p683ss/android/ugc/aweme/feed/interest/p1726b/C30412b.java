package com.p683ss.android.ugc.aweme.feed.interest.p1726b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.journey.C35791v;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.b.b */
public final class C30412b implements C22982e {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public Integer f79487a = Integer.valueOf(0);
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public String f79488b = "";
    @C17952c(mo34828a = "interest_list")

    /* renamed from: c */
    public C35791v f79489c;
    @C17952c(mo34828a = "aweme")

    /* renamed from: d */
    public Aweme f79490d;
    @C17952c(mo34828a = "is_active_device")

    /* renamed from: e */
    public Integer f79491e = Integer.valueOf(0);
    @C17952c(mo34828a = "rid")

    /* renamed from: f */
    public String f79492f = "";
    @C17952c(mo34828a = "log_pb")

    /* renamed from: g */
    public LogPbBean f79493g;

    public final String getRequestId() {
        return this.f79492f;
    }

    public final void setRequestId(String str) {
        this.f79492f = str;
    }
}
