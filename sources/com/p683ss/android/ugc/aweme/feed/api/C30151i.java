package com.p683ss.android.ugc.aweme.feed.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.api.i */
public final class C30151i implements Serializable {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    private final User f78695a;
    @C17952c(mo34828a = "is_show_blue_point")

    /* renamed from: b */
    private boolean f78696b;

    /* renamed from: c */
    private LogPbBean f78697c;

    public final LogPbBean getLogPbBean() {
        return this.f78697c;
    }

    public final boolean getShowBluePoint() {
        return this.f78696b;
    }

    public final User getUser() {
        return this.f78695a;
    }

    public final void setLogPbBean(LogPbBean logPbBean) {
        this.f78697c = logPbBean;
    }

    public final void setShowBluePoint(boolean z) {
        this.f78696b = z;
    }

    public C30151i(User user, boolean z, LogPbBean logPbBean) {
        C52711k.m112240b(user, "user");
        this.f78695a = user;
        this.f78696b = z;
        this.f78697c = logPbBean;
    }

    public /* synthetic */ C30151i(User user, boolean z, LogPbBean logPbBean, int i, C52707g gVar) {
        if ((i & 4) != 0) {
            logPbBean = null;
        }
        this(user, z, logPbBean);
    }
}
