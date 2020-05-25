package com.p683ss.android.ugc.aweme.similarvideo.p2268a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.a.b */
public final class C45644b extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "offset")

    /* renamed from: a */
    public int f115422a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public boolean f115423b;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: c */
    public ArrayList<Aweme> f115424c;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: d */
    public LogPbBean f115425d;

    /* renamed from: e */
    String f115426e;

    public final String getRequestId() {
        return this.f115426e;
    }

    public final void setRequestId(String str) {
        this.f115426e = str;
    }
}
