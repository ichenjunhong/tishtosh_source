package com.p683ss.android.ugc.aweme.music.p1978ui.p1983e;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.e.b */
public final class C37607b {

    /* renamed from: a */
    public final String f95912a;

    /* renamed from: b */
    public final long f95913b;

    /* renamed from: c */
    public final int f95914c;

    /* renamed from: d */
    public final int f95915d;

    public C37607b() {
        this(null, 0, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37607b) {
                C37607b bVar = (C37607b) obj;
                if (C52711k.m112239a((Object) this.f95912a, (Object) bVar.f95912a)) {
                    if (this.f95913b == bVar.f95913b) {
                        if (this.f95914c == bVar.f95914c) {
                            if (this.f95915d == bVar.f95915d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f95912a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f95913b;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f95914c) * 31) + this.f95915d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicListRequestParams(musicId=");
        sb.append(this.f95912a);
        sb.append(", cursor=");
        sb.append(this.f95913b);
        sb.append(", count=");
        sb.append(this.f95914c);
        sb.append(", enter_from=");
        sb.append(this.f95915d);
        sb.append(")");
        return sb.toString();
    }

    public C37607b(String str, long j, int i, int i2) {
        this.f95912a = str;
        this.f95913b = j;
        this.f95914c = i;
        this.f95915d = i2;
    }

    private /* synthetic */ C37607b(String str, long j, int i, int i2, int i3, C52707g gVar) {
        this(null, 0, 10, 1);
    }
}
