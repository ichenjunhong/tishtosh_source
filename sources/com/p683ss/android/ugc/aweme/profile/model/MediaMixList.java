package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.model.MediaMixList */
public final class MediaMixList extends BaseResponse {
    @C17952c(mo34828a = "cursor")
    public final long cursor;
    @C17952c(mo34828a = "has_more")
    public final int hasMore;
    @C17952c(mo34828a = "mix_infos")
    public final List<MixStruct> mixInfos;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.MixStruct>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.profile.model.MediaMixList copy$default(com.p683ss.android.ugc.aweme.profile.model.MediaMixList r0, java.util.List<com.p683ss.android.ugc.aweme.feed.model.MixStruct> r1, long r2, int r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.feed.model.MixStruct> r1 = r0.mixInfos
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            long r2 = r0.cursor
        L_0x000c:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0012
            int r4 = r0.hasMore
        L_0x0012:
            com.ss.android.ugc.aweme.profile.model.MediaMixList r0 = r0.copy(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.model.MediaMixList.copy$default(com.ss.android.ugc.aweme.profile.model.MediaMixList, java.util.List, long, int, int, java.lang.Object):com.ss.android.ugc.aweme.profile.model.MediaMixList");
    }

    public final MediaMixList copy(List<? extends MixStruct> list, long j, int i) {
        return new MediaMixList(list, j, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaMixList) {
                MediaMixList mediaMixList = (MediaMixList) obj;
                if (C52711k.m112239a((Object) this.mixInfos, (Object) mediaMixList.mixInfos)) {
                    if (this.cursor == mediaMixList.cursor) {
                        if (this.hasMore == mediaMixList.hasMore) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<MixStruct> list = this.mixInfos;
        return ((((list != null ? list.hashCode() : 0) * 31) + Long.hashCode(this.cursor)) * 31) + Integer.hashCode(this.hasMore);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaMixList(mixInfos=");
        sb.append(this.mixInfos);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(")");
        return sb.toString();
    }

    public MediaMixList(List<? extends MixStruct> list, long j, int i) {
        this.mixInfos = list;
        this.cursor = j;
        this.hasMore = i;
    }
}
