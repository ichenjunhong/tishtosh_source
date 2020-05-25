package com.p683ss.android.ugc.aweme.notice.api.bean;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.NoticeCount */
public final class NoticeCount {
    @C17952c(mo34828a = "count")
    private int count;
    @C17952c(mo34828a = "extra")
    private C38038e extra;
    @C17952c(mo34828a = "group")
    private int group;

    public static /* synthetic */ NoticeCount copy$default(NoticeCount noticeCount, int i, int i2, C38038e eVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = noticeCount.count;
        }
        if ((i3 & 2) != 0) {
            i2 = noticeCount.group;
        }
        if ((i3 & 4) != 0) {
            eVar = noticeCount.extra;
        }
        return noticeCount.copy(i, i2, eVar);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.group;
    }

    public final C38038e component3() {
        return this.extra;
    }

    public final NoticeCount copy(int i, int i2, C38038e eVar) {
        return new NoticeCount(i, i2, eVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoticeCount) {
                NoticeCount noticeCount = (NoticeCount) obj;
                if (this.count == noticeCount.count) {
                    if (!(this.group == noticeCount.group) || !C52711k.m112239a((Object) this.extra, (Object) noticeCount.extra)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.count;
    }

    public final C38038e getExtra() {
        return this.extra;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int hashCode() {
        int i = ((this.count * 31) + this.group) * 31;
        C38038e eVar = this.extra;
        return i + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoticeCount(count=");
        sb.append(this.count);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(")");
        return sb.toString();
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setExtra(C38038e eVar) {
        this.extra = eVar;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public NoticeCount(int i, int i2, C38038e eVar) {
        this.count = i;
        this.group = i2;
        this.extra = eVar;
    }
}
