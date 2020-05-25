package com.p683ss.android.ugc.aweme.movie.p1968b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.movie.b.b */
public final class C37178b extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: a */
    public ArrayList<Aweme> f94900a;
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public long f94901b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public Boolean f94902c;
    @C17952c(mo34828a = "rid")

    /* renamed from: d */
    public String f94903d;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: e */
    public LogPbBean f94904e;

    public final String getRequestId() {
        return this.f94903d;
    }

    public final void setRequestId(String str) {
        this.f94903d = str;
    }
}
