package com.p683ss.android.ugc.aweme.discover.helper;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.p */
public final class C28208p {

    /* renamed from: a */
    public final String f74052a;

    /* renamed from: b */
    public final MusicModel f74053b;

    public C28208p() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f74053b, (java.lang.Object) r3.f74053b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.helper.C28208p
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.helper.p r3 = (com.p683ss.android.ugc.aweme.discover.helper.C28208p) r3
            java.lang.String r0 = r2.f74052a
            java.lang.String r1 = r3.f74052a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r2.f74053b
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.f74053b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.helper.C28208p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f74052a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicModel musicModel = this.f74053b;
        if (musicModel != null) {
            i = musicModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToVideoProgress(musicFilePath=");
        sb.append(this.f74052a);
        sb.append(", musicModel=");
        sb.append(this.f74053b);
        sb.append(")");
        return sb.toString();
    }

    public C28208p(String str, MusicModel musicModel) {
        this.f74052a = str;
        this.f74053b = musicModel;
    }

    private /* synthetic */ C28208p(String str, MusicModel musicModel, int i, C52707g gVar) {
        this(null, null);
    }
}
