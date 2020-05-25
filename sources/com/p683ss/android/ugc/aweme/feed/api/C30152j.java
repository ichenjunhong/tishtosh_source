package com.p683ss.android.ugc.aweme.feed.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.api.j */
public final class C30152j implements Serializable {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    private final int f78698a;
    @C17952c(mo34828a = "user_list")

    /* renamed from: b */
    private final List<C30151i> f78699b;
    @C17952c(mo34828a = "video_num")

    /* renamed from: c */
    private final int f78700c;
    @C17952c(mo34828a = "first_vid")

    /* renamed from: d */
    private final long f78701d;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: e */
    private final LogPbBean f78702e;

    public C30152j() {
        this(0, null, 0, 0, null, 31, null);
    }

    public final int getCode() {
        return this.f78698a;
    }

    public final long getFirstVid() {
        return this.f78701d;
    }

    public final List<C30151i> getFollowingInterestUsers() {
        return this.f78699b;
    }

    public final LogPbBean getLogPbBean() {
        return this.f78702e;
    }

    public final int getVideoNum() {
        return this.f78700c;
    }

    public C30152j(int i, List<C30151i> list, int i2, long j, LogPbBean logPbBean) {
        this.f78698a = i;
        this.f78699b = list;
        this.f78700c = i2;
        this.f78701d = j;
        this.f78702e = logPbBean;
    }

    public /* synthetic */ C30152j(int i, List list, int i2, long j, LogPbBean logPbBean, int i3, C52707g gVar) {
        int i4;
        int i5 = 0;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            list = new ArrayList();
        }
        List list2 = list;
        if ((i3 & 4) == 0) {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 16) != 0) {
            logPbBean = null;
        }
        this(i4, list2, i5, j2, logPbBean);
    }
}
