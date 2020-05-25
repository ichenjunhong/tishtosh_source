package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice */
public final class FollowRequestNotice {
    @C17952c(mo34828a = "count")
    private final int requestCount;

    public FollowRequestNotice() {
        this(0, 1, null);
    }

    public static /* synthetic */ FollowRequestNotice copy$default(FollowRequestNotice followRequestNotice, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followRequestNotice.requestCount;
        }
        return followRequestNotice.copy(i);
    }

    public final int component1() {
        return this.requestCount;
    }

    public final FollowRequestNotice copy(int i) {
        return new FollowRequestNotice(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowRequestNotice) {
                if (this.requestCount == ((FollowRequestNotice) obj).requestCount) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public final int hashCode() {
        return this.requestCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowRequestNotice(requestCount=");
        sb.append(this.requestCount);
        sb.append(")");
        return sb.toString();
    }

    public FollowRequestNotice(int i) {
        this.requestCount = i;
    }

    public /* synthetic */ FollowRequestNotice(int i, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        this(i);
    }
}
