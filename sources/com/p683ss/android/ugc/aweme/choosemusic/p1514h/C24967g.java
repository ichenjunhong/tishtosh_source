package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.g */
public final class C24967g {

    /* renamed from: a */
    public MusicModel f66079a;

    /* renamed from: b */
    public int f66080b;

    /* renamed from: c */
    public boolean f66081c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24967g) {
                C24967g gVar = (C24967g) obj;
                if (C52711k.m112239a((Object) this.f66079a, (Object) gVar.f66079a)) {
                    if (this.f66080b == gVar.f66080b) {
                        if (this.f66081c == gVar.f66081c) {
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
        MusicModel musicModel = this.f66079a;
        int hashCode = (((musicModel != null ? musicModel.hashCode() : 0) * 31) + this.f66080b) * 31;
        boolean z = this.f66081c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayMusicInfo(musicModel=");
        sb.append(this.f66079a);
        sb.append(", pageType=");
        sb.append(this.f66080b);
        sb.append(", isLoop=");
        sb.append(this.f66081c);
        sb.append(")");
        return sb.toString();
    }

    public C24967g(MusicModel musicModel, int i, boolean z) {
        this.f66079a = musicModel;
        this.f66080b = i;
        this.f66081c = z;
    }
}
