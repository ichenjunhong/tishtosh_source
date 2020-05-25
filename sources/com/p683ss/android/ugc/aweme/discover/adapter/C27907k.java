package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.k */
public final class C27907k extends SearchMusic {

    /* renamed from: a */
    private boolean f73300a;

    /* renamed from: b */
    private final List<Music> f73301b;

    public C27907k() {
        this(false, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.music.model.Music>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.adapter.C27907k copy$default(com.p683ss.android.ugc.aweme.discover.adapter.C27907k r0, boolean r1, java.util.List<com.p683ss.android.ugc.aweme.music.model.Music> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            boolean r1 = r0.f73300a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r2 = r0.f73301b
        L_0x000c:
            com.ss.android.ugc.aweme.discover.adapter.k r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27907k.copy$default(com.ss.android.ugc.aweme.discover.adapter.k, boolean, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.adapter.k");
    }

    public final boolean component1() {
        return this.f73300a;
    }

    public final List<Music> component2() {
        return this.f73301b;
    }

    public final C27907k copy(boolean z, List<Music> list) {
        C52711k.m112240b(list, "clusterList");
        return new C27907k(z, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27907k) {
                C27907k kVar = (C27907k) obj;
                if (!(this.f73300a == kVar.f73300a) || !C52711k.m112239a((Object) this.f73301b, (Object) kVar.f73301b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final List<Music> getClusterList() {
        return this.f73301b;
    }

    public final int hashCode() {
        boolean z = this.f73300a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<Music> list = this.f73301b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final boolean isMobShowSent() {
        return this.f73300a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClusterButtonData(isMobShowSent=");
        sb.append(this.f73300a);
        sb.append(", clusterList=");
        sb.append(this.f73301b);
        sb.append(")");
        return sb.toString();
    }

    public final void setMobShowSent(boolean z) {
        this.f73300a = z;
    }

    public C27907k(boolean z, List<Music> list) {
        C52711k.m112240b(list, "clusterList");
        this.f73300a = z;
        this.f73301b = list;
    }

    public /* synthetic */ C27907k(boolean z, List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        this(z, list);
    }
}
