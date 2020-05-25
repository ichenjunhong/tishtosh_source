package com.p683ss.android.ugc.aweme.search.p2124d;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.d.a */
public final class C41412a implements Serializable {

    /* renamed from: a */
    private final int f104975a;

    /* renamed from: b */
    private final int f104976b;

    public static /* synthetic */ C41412a copy$default(C41412a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f104975a;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f104976b;
        }
        return aVar.copy(i, i2);
    }

    public final int component1() {
        return this.f104975a;
    }

    public final int component2() {
        return this.f104976b;
    }

    public final C41412a copy(int i, int i2) {
        return new C41412a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41412a) {
                C41412a aVar = (C41412a) obj;
                if (this.f104975a == aVar.f104975a) {
                    if (this.f104976b == aVar.f104976b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getPublishTime() {
        return this.f104976b;
    }

    public final int getSortType() {
        return this.f104975a;
    }

    public final int hashCode() {
        return (this.f104975a * 31) + this.f104976b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterOption(sortType=");
        sb.append(this.f104975a);
        sb.append(", publishTime=");
        sb.append(this.f104976b);
        sb.append(")");
        return sb.toString();
    }

    public C41412a(int i, int i2) {
        this.f104975a = i;
        this.f104976b = i2;
    }
}
