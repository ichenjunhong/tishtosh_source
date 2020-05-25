package com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.b */
public final class C37680b extends BaseResponse {
    @C17952c(mo34828a = "cursor")

    /* renamed from: a */
    public final int f96085a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public final boolean f96086b;
    @C17952c(mo34828a = "music_list")

    /* renamed from: c */
    public final List<C37682d> f96087c;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f96088d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37680b) {
                C37680b bVar = (C37680b) obj;
                if (this.f96085a == bVar.f96085a) {
                    if (!(this.f96086b == bVar.f96086b) || !C52711k.m112239a((Object) this.f96087c, (Object) bVar.f96087c) || !C52711k.m112239a((Object) this.f96088d, (Object) bVar.f96088d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f96085a * 31;
        boolean z = this.f96086b;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        List<C37682d> list = this.f96087c;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.f96088d;
        if (logPbBean != null) {
            i3 = logPbBean.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicListResponse(cursor=");
        sb.append(this.f96085a);
        sb.append(", hasMore=");
        sb.append(this.f96086b);
        sb.append(", musicList=");
        sb.append(this.f96087c);
        sb.append(", logPb=");
        sb.append(this.f96088d);
        sb.append(")");
        return sb.toString();
    }
}
