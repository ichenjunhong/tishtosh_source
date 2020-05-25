package com.p683ss.android.ugc.aweme.sticker.prop.p2315b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.b.a */
public final class C46362a extends BaseResponse {
    @C23460b
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: a */
    public List<Aweme> f116967a;
    @C17952c(mo34828a = "cursor")

    /* renamed from: b */
    public long f116968b;
    @C17952c(mo34828a = "has_more")

    /* renamed from: c */
    public int f116969c;
    @C17952c(mo34828a = "rid")

    /* renamed from: d */
    public String f116970d;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: e */
    public LogPbBean f116971e;
    @C17952c(mo34828a = "is_top")

    /* renamed from: f */
    public boolean f116972f;

    /* renamed from: a */
    public final boolean mo93091a() {
        if (this.f116969c == 1) {
            return true;
        }
        return false;
    }
}
