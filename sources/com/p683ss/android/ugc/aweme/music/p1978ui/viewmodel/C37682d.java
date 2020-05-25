package com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.d */
public final class C37682d {
    @C17952c(mo34828a = "music_info")

    /* renamed from: a */
    public final Music f96090a;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: b */
    public final List<Aweme> f96091b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f96091b, (java.lang.Object) r3.f96091b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.music.ui.viewmodel.d r3 = (com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d) r3
            com.ss.android.ugc.aweme.music.model.Music r0 = r2.f96090a
            com.ss.android.ugc.aweme.music.model.Music r1 = r3.f96090a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.f96091b
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.f96091b
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Music music = this.f96090a;
        int i = 0;
        int hashCode = (music != null ? music.hashCode() : 0) * 31;
        List<Aweme> list = this.f96091b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicStruct(musicInfo=");
        sb.append(this.f96090a);
        sb.append(", awemeList=");
        sb.append(this.f96091b);
        sb.append(")");
        return sb.toString();
    }
}
